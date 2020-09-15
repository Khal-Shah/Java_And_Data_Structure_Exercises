package ch14notes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Ch14_03_04_Basics_Panes extends Application
{
    public static void main(String[] args)
    {
        launch();
    }

    @Override
    public void init() throws Exception
    {
        System.out.println("Before running the program...");
    }

    @Override
    public void start(Stage stage) throws Exception
    {
//        stage.setTitle("My JavaFX");
//        Button okButton = new Button("OK");
//        Scene scene = new Scene(okButton, 200, 250);
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.show();
//
//        Stage newStage = new Stage();
//        Button secondButton = new Button("New Stage");
//        secondButton.applyCss();
//        secondButton.snapSpaceY(40);
//        Scene secondScene = new Scene(secondButton, 100, 100);
//        newStage.setTitle("Second Stage");
//        newStage.setScene(secondScene);
//        newStage.show();


//        Using Pane and appending it to Scene.
//        Stage mainStage = new Stage();
//        mainStage.setTitle("Button in a pane");

//        //Now create a pane containing a button and place it onto a scene
//        StackPane pane = new StackPane();
//        Button ok = new Button("OK");
//        pane.getChildren().add(ok);
//
//        Scene paneScene = new Scene(pane, 600, 400);
//        mainStage.setScene(paneScene);
//        mainStage.show();

        //Circle: (Node)
        stage.setTitle("Show Circle");
        Circle circle = new Circle();
//        circle.setCenterX(200);
//        circle.setCenterY(200);
//        circle.setRadius(100);

        //colors:
        //circle.setStroke(Color.RED);
        //circle.setFill(Color.RED);

        Color color = new Color(0.95, 0.04, 0.06, 0.91);
        circle.setFill(color);

        //Pane
        Pane pane = new Pane();
        //pane.getChildren().add(circle);
        //Bind circle's centerX and Y to pane's width/2 and height/2 so that it resizes along with the window
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.setRadius(100);
        pane.getChildren().add(circle);
        //Scene
        Scene circleScene = new Scene(pane, 400, 400);
        //circleScene.setFill(Color.GREEN);
        circleScene.setFill(new Color(0.02, 0.92, 0.1, 0.91));
        stage.setScene(circleScene);
        //stage.setResizable(false);
        stage.show();
    }

    @Override
    public void stop() throws Exception
    {
        System.out.println("Program has stopped.");
    }
}

