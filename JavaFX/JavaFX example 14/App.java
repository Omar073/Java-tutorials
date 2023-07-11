// 52- JavaFX:
// we add the ability to have the “U” and “D” keys to take the radius up and down by having the CirclePane handle KeyPress events 
// We also let the left / right mouse buttons do the same thing
// Note:
// When you click on a button, it (the button) receives the focus
// So,if we click on the “Enlarge” button, the button will get (and keep) the focus
// That means that a “D” or a “U” won’t GO to the CirclePane – it will go to the last button that was pressed!
// To fix this, we use circlePane.requestFocus() to the end of both button-click handlers
// I also added an option so that if you hold down either enlarge or shrink button the circle will keep enlarging or shrinking
// I implemented this using the concept of multithreading which you will find a full explanation on it in its dedicated folder

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {
    private CirclePane circlePane = new CirclePane();
    private boolean enlargeButtonPressed = false;
    private boolean shrinkButtonPressed = false;

    @Override
    public void start(Stage primaryStage) {
        // Hold two buttons in an HBox
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().addAll(btEnlarge, btShrink);

        // Create and register the handlers
        btEnlarge.setOnAction(e -> {
            circlePane.enlarge();
            circlePane.requestFocus();
        });
        btShrink.setOnAction(e -> {
            circlePane.shrink();
            circlePane.requestFocus();
        });

        btEnlarge.setOnMousePressed(e -> {
            enlargeButtonPressed = true;
            startAutoEnlarge();
        });

        btEnlarge.setOnMouseReleased(e -> {
            enlargeButtonPressed = false;
        });

        btShrink.setOnMousePressed(e -> {
            shrinkButtonPressed = true;
            startAutoShrink();
        });

        btShrink.setOnMouseReleased(e -> {
            shrinkButtonPressed = false;
        });

        circlePane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                circlePane.enlarge();
            } else if (e.getButton() == MouseButton.SECONDARY) {
                circlePane.shrink();
            }
        });

        circlePane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.U) {
                circlePane.enlarge();
            } else if (e.getCode() == KeyCode.D) {
                circlePane.shrink();
            } else if (e.getCode() == KeyCode.LEFT) {
                circlePane.decreaseRadius();
            } else if (e.getCode() == KeyCode.RIGHT) {
                circlePane.increaseRadius();
            }
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        // Create a scene and place it in the stage
        primaryStage.setTitle("Control Circle"); // Set the stage title
        primaryStage.setScene(new Scene(borderPane, 300, 300)); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        circlePane.requestFocus(); // Request focus on circlePane
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void startAutoEnlarge() {
        Thread thread = new Thread(() -> {
            while (enlargeButtonPressed) {
                circlePane.enlarge();
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }

    private void startAutoShrink() {
        Thread thread = new Thread(() -> {
            while (shrinkButtonPressed) {
                circlePane.shrink();
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}

class CirclePane extends javafx.scene.layout.StackPane {
    private Circle circle = new Circle(50);

    public CirclePane() {
        getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }

    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }

    public void shrink() {
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
    }

    public void increaseRadius() {
        circle.setRadius(circle.getRadius() + 10);
    }

    public void decreaseRadius() {
        circle.setRadius(circle.getRadius() - 10 > 0 ? circle.getRadius() - 10 : circle.getRadius());
    }
}
