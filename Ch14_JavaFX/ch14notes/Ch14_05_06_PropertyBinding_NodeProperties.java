package ch14notes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import javafx.scene.paint.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javafx.scene.control.Button;


public class Ch14_05_06_PropertyBinding_NodeProperties extends Application
{
    public static void main(String[] args)
    {
        //We can run other classes from this class' main method:
        //Application.launch(Ch14_03_04_Basics_Panes.class);
        launch();
    }

    //14.5: Property Binding
    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Circle Binded to Pane");
        //Make Pane first so that we can bind Circle object to it
        Pane pane = new Pane();

        //Circle:
        Circle circle = new Circle();

//        circle.centerXProperty().bind(pane.widthProperty().divide(2));
//        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        circle.setRadius(50);
//        circle.setFill(Color.RED);
        pane.getChildren().add(circle);
        //pane.autosize();
        //Scene
        Scene scene = new Scene(pane, 200, 200);
        scene.setFill(Color.GREEN);

        //binding circle (node) to scene also works
        circle.centerXProperty().bind(scene.widthProperty().divide(2));
        circle.centerYProperty().bind(scene.heightProperty().divide(2));

        //Styling:
//        circle.setStyle("-fx-shape: inherit; -fx-fill: red");

        //Custom color:
        //Color specialColor = new Color(23.3, 34.2, 56.0, 50);
        Color specialColor = new Color(0.25, 0.14, 0.333, 0.51);
        circle.setFill(specialColor);

        //circle.setRotate(90); //won't make a difference for circles


        stage.setScene(scene);
        stage.show();
//
//        //Example of a rotated button.

        StackPane paneB = new StackPane();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: blue;");
        paneB.setRotate(45);
        paneB.getChildren().add(btOK);

        //btOK.setRotate(135);
        //paneB.setStyle("-fx-border-color: red; -fx-background-color:" + specialColor.darker() + ";");
        Scene sceneB = new Scene(paneB, 200, 250);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("NodeStyleRotateDemo"); // Set the stage title
        primaryStage.setScene(sceneB);
        //primaryStage.show();
    }
}
