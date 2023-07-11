// 37- adding an Image to the root JAVAFX

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
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
    Scene scene = new Scene(root, 600, 600, Color.RED); // WE NEED TO ADD A ROOT NODE TO THE SCENE, with parameters width height and color

    Image image = new Image("test.jpg"); // CREATING AN IMAGE OBJECT
    ImageView imageview = new ImageView(image); // CREATING AN IMAGE VIEW OBJECT
    imageview.setX(50); // SETTING THE X COORDINATE OF THE IMAGE
    imageview.setY(300); // SETTING THE Y COORDINATE OF THE IMAGE

    root.getChildren().add(imageview); // ADDING THE IMAGEVIEW TO THE ROOT NODE
    pStage.setScene(scene); // SETTING THE SCENE TO THE STAGE
    pStage.show();
  }
}