// 48- JavaFX: we have 3 input text fields with 3 labelsfirst, middle and last name
// each one of them is nullable and there a button called add name when pressed displays the name of the user in the GUI then clears the fields

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    GridPane gridPane = new GridPane();
    gridPane.setPadding(new Insets(10));
    gridPane.setHgap(10);
    gridPane.setVgap(10);

    // Labels
    Label lblFirstName = new Label("First Name:");
    Label lblMiddleName = new Label("Middle Name:");
    Label lblLastName = new Label("Last Name:");

    // TextFields
    TextField txtFirstName = new TextField();
    TextField txtMiddleName = new TextField();
    TextField txtLastName = new TextField();

    // Name Label
    Label lblUserName = new Label();

    // Add Name Button
    Button btnAddName = new Button("Add Name");
    btnAddName.setOnAction(event -> {
        String firstName = txtFirstName.getText();
        String middleName = txtMiddleName.getText();
        String lastName = txtLastName.getText();

        lblUserName.setText("User Name: " + firstName + " " + middleName + " " + lastName);

        // Clear input fields
        txtFirstName.setText("");
        txtMiddleName.setText("");
        txtLastName.setText("");
    });

    // Add nodes to the grid pane
    gridPane.addColumn(0, lblFirstName, lblMiddleName, lblLastName);
    gridPane.addColumn(1, txtFirstName, txtMiddleName, txtLastName);
    gridPane.add(btnAddName, 0, 3, 2, 1);
    gridPane.add(lblUserName, 0, 4, 2, 1);

    // Create a scene and place it in the stage
    Scene scene = new Scene(gridPane);
    primaryStage.setTitle("User Details");
    primaryStage.setScene(scene);
    primaryStage.show();
    }

  }