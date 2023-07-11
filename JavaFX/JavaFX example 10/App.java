// 47- FlowPane text inputs that takes these inputs and displays them to the user

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    FlowPane pane = new FlowPane();
    pane.setPadding(new Insets(11, 12, 13, 14));
    pane.setHgap(5);
    pane.setVgap(5);
    pane.setOrientation(Orientation.VERTICAL);

    // Create input fields
    TextField firstNameField = new TextField();
    TextField middleNameField = new TextField();
    TextField lastNameField = new TextField();

    // Create a label to display the user's name
    Label nameLabel = new Label();

    // Create a button
    Button okButton = new Button("OK");
    okButton.setOnAction(event -> {
      String firstName = firstNameField.getText();
      String middleName = middleNameField.getText();
      String lastName = lastNameField.getText();

      // Display the user's name
      nameLabel.setText("User's Name: " + firstName + " " + middleName + " " + lastName);

      // Clear the input fields
      firstNameField.clear();
      middleNameField.clear();
      lastNameField.clear();
    });

    // Add nodes to the pane
    pane.getChildren().addAll(
      new Label("First Name:"),
      firstNameField,
      new Label("Middle Name:"),
      middleNameField,
      new Label("Last Name:"),
      lastNameField,
      okButton,
      nameLabel
    );

    // Create a scene and place it in the stage
    primaryStage.setTitle("ShowFlowPane");
    primaryStage.setScene(new Scene(pane, 250, 250));
    primaryStage.show();
  }
}
