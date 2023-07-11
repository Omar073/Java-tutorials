// 36- same code as above but I made the rectangle and line change length depending on text  ps. when I change the text font size by more than 10 pixels بتبوظ so further research is necessary بس مش فاضي والله JAVAFX

import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage pStage) {
    
    Image icon = new Image("download.jpg");
    pStage.getIcons().add(icon);  // SETTING THE ICON OF THE STAGE
    Group root = new Group();
    Scene scene = new Scene(root, 600, 600, Color.LIGHTSKYBLUE); // WE NEED TO ADD A ROOT NODE TO THE SCENE, with parameters width height and color

    Text text = new Text("BAAANG!!!!!!!!!"); // CREATING A TEXT NODE
    text.setX(50); // SETTING THE X COORDINATE OF THE TEXT
    text.setY(50); // SETTING THE Y COORDINATE OF THE TEXT
    text.setFont(Font.font("Courier New", FontWeight.BOLD, 50)); // SETTING THE FONT and size OF THE TEXT
    text.setFill(Color.RED); // SETTING THE FILL COLOR OF THE TEXT
    Reflection r = new Reflection(); // CREATING A REFLECTION EFFECT
    r.setFraction(0.7f); // SETTING THE FRACTION OF THE REFLECTION
    text.setEffect(r); // APPLYING THE REFLECTION EFFECT TO THE TEXT
    r.setTopOffset(5); // set the top offset to 10 pixels
    text.setTranslateY(100); // SETTING THE Y TRANSLATE OF THE TEXT

    Bounds textBounds = text.getLayoutBounds(); // GETTING THE BOUND OF THE TEXT
    double textWidth = textBounds.getWidth(); // GETTING THE WIDTH OF THE TEXT
    double textHeight = textBounds.getHeight(); // GETTING THE HEIGHT OF THE TEXT
    System.out.println("textHeight: " + textHeight);

    Line line = new Line(); // CREATING A LINE NODE
    line.setStartX(45);
    line.setStartY(text.getY() + textHeight + 60);
    line.setEndX(45 + textWidth);
    line.setEndY(text.getY() + textHeight + 60);
    line.setStrokeWidth(5);
    line.setStroke(Color.RED);
    line.setOpacity(0.5);

    Rectangle rect = new Rectangle(); // CREATING A RECTANGLE NODE
    rect.setX(35);
    rect.setY(text.getY() + 55);
    rect.setWidth(textWidth + 20);
    rect.setHeight(textHeight + 15);
    rect.setArcWidth(20); // SETTING THE ARC WIDTH OF THE RECTANGLE
    rect.setArcHeight(20); // SETTING THE ARC HEIGHT OF THE RECTANGLE
    rect.setFill(Color.LIGHTGRAY);
    rect.setStroke(Color.BLACK);
    rect.setStrokeWidth(3);
    rect.setOpacity(0.5);

    Group group = new Group();
    group.getChildren().addAll(rect, text); // ADDING THE TEXT TO THE GROUP

    root.getChildren().add(rect); // ADDING THE RECTANGLE NODE TO THE ROOT NODE
    root.getChildren().add(line); // ADDING THE LINE NODE TO THE ROOT NODE
    root.getChildren().add(group); // ADDING THE GROUP NODE TO THE ROOT NODE
    pStage.setScene(scene); // SETTING THE SCENE TO THE STAGE
    pStage.show();
  }
}