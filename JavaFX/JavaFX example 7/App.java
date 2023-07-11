// 39- Lambda expressions in JavaFX 

// In JavaFX, a lambda expression is a concise way to represent an anonymous function or method that can be used as a callback or event handler. It allows you to define inline implementations of functional interfaces without the need to create separate classes or anonymous inner classes.

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class App extends Application {

  @Override
  public void start(Stage primaryStage) {


    Button button = new Button("Click me");

    // Using a lambda expression as the event handler
    button.setOnAction(event -> {
        System.out.println("Button clicked!");
        // Perform additional actions or logic here
    });

    StackPane root = new StackPane();
    root.getChildren().add(button);
    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();

  }
  public static void main(String[] args) { 
    launch(args);
  }
}

// In the example above, the setOnAction method of the Button class takes an EventHandler as its argument. Instead of creating a separate class or anonymous inner class to implement the EventHandler interface, we can directly provide a lambda expression that represents the implementation of the handle method.

// The lambda expression event -> { System.out.println("Button clicked!"); } defines the behavior that should be executed when the button is clicked. In this case, it prints "Button clicked!" to the console. You can replace this line with any other actions or logic that you want to perform when the button is clicked.

// Using lambda expressions in JavaFX can make your code more concise and readable, especially when dealing with simple event handling or callbacks. It allows you to define behavior directly inline without the need for extra classes or interfaces.
