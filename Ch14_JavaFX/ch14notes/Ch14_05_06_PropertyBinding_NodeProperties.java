package ch14notes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

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

        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        circle.setRadius(50);
        circle.setFill(Color.RED);
        pane.getChildren().add(circle);
        pane.autosize();
        //Scene
        Scene scene = new Scene(pane, 200, 200);
        scene.setFill(Color.GREEN);
//        pane.layoutXProperty().bind(scene.widthProperty());
//        pane.layoutYProperty().bind(scene.heightProperty());
//        circle.centerXProperty().bind(scene.widthProperty().divide(2));
//        circle.centerYProperty().bind(scene.heightProperty().divide(2));

        stage.setScene(scene);
        stage.show();

    }
}
