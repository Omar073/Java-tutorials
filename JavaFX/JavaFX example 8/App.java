// 45- JavaFX to center a circle or a button to the middle of the pane

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Hello world!");
    Button btn = new Button("Say 'Hello World'");
    // btn.setOnAction(new EventHandler<ActionEvent>() {
    //   @Override
    //   public void handle(ActionEvent event) {
    //     System.out.println("Hello World!");
    //   }
    // });
    btn.setOnAction(event -> System.out.println("Hello World!")); // Lambda expression

    StackPane pane = new StackPane();
    pane.getChildren().add(btn);
    primaryStage.setScene(new Scene(pane, 300, 250));
    //primaryStage.show();

    Stage stage2 = new Stage(); // Create a new stage
    StackPane pane2 = new StackPane();
    stage2.setTitle("Second Stage"); // Set the stage title
    Circle circle = new Circle(); // Create a circle
    circle.centerXProperty().bind(pane.widthProperty().divide(2));
    circle.centerYProperty().bind(pane.heightProperty().divide(2));
    circle.setRadius(80); // Set the circle radius
    circle.setStroke(Color.BLACK); // Set the circle stroke color
    circle.setFill(Color.RED); // Set the circle fill color
    pane2.getChildren().addAll(circle, btn);
    stage2.setScene(new Scene(pane2, 300, 250));
    stage2.show(); 
  }
}