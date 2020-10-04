package ch14notes.Ch14_10_LayoutPanes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ch14_10_1_FlowPane extends Application
{
    //add labels and textfields to a FlowPane

    @Override
    public void start(Stage primaryStage)
    {
        //Flowpane layout
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        /*
        Insets object specifies the size of the border of a pane
        (top to left here in the constructor)
         */
        pane.setHgap(5);
        pane.setVgap(5);
        //To specify the horizontal and vertical gaps between 2 nodes
        //in the pane.

        //We have the pane/layout, now place the nodes in the pane
        Label fnLabel = new Label("First Name:");
        TextField fnField = new TextField();
        pane.getChildren().addAll(fnLabel, fnField);

        Label miLabel = new Label("MI:");
        TextField miField = new TextField();
        miField.setPrefColumnCount(1); //make this box smaller

        pane.getChildren().addAll(miLabel, miField);

        Label lnLabel = new Label("Last Name:");
        TextField lnField = new TextField();
        pane.getChildren().addAll(lnLabel, lnField);

        //pane.setOrientation(Orientation.VERTICAL);

        //Scene;
        Scene scene = new Scene(pane, 200, 250);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Show FlowPane");
        primaryStage.show();

        Label p = new Label("PATRICIA");

        FlowPane pane1 = new FlowPane();
        pane.setHgap(5);
        pane.setAlignment(Pos.CENTER);
        p.setStyle("-fx-text-fill: linear-gradient(to right, blueviolet, orangered); -fx-font-size: 6em; -fx-font-family: Broadway");
        //-fx-background-color: linear-gradient(to top,-color-amber, transparent);
        pane.setStyle("-fx-background-color: linear-gradient(to left, pink, navajowhite)");
        pane.getChildren().add(p);

        //scene
        Scene scene1 = new Scene(pane1);
        //stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello There Bella Princesa");
        primaryStage.show();
    }
}
