// 34- JAVAFX stages

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage pStage) {
    
    Group root = new Group();
    Scene scene = new Scene(root, Color.BLUE); // WE NEED TO ADD A ROOT NODE TO THE SCENE

    Image icon = new Image("download.jpg"); // CREATE AN IMAGE OBJECT
    pStage.getIcons().add(icon); // SET THE IMAGE TO THE STAGE (WINDOW)
    pStage.setTitle("this is my stage"); // SET THE TITLE OF THE STAGE (WINDOW)
    pStage.setWidth(500); // SET THE WIDTH OF THE STAGE (WINDOW)
    pStage.setHeight(500); // SET THE HEIGHT OF THE STAGE (WINDOW)
    // pStage.setResizable(false); // SET THE STAGE (WINDOW) TO BE RESIZABLE OR NOT
    // pStage.setX(50); // SET THE X POSITION OF THE STAGE (WINDOW)
    // pStage.setY(50); // SET THE Y POSITION OF THE STAGE (WINDOW)
    // pStage.setFullScreen(true); // SET THE STAGE (WINDOW) TO BE FULLSCREEN OR NOT
    // pStage.setFullScreenExitHint("YOU CANT ESCAAAAAPE\n well maybe if you press O"); // SET THE FULLSCREEN EXIT HINT
    // pStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("O")); // SET THE KEY COMBINATION TO EXIT FULLSCREEN

    pStage.setScene(scene);
    pStage.show();
  }
}