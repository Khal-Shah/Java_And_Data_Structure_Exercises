package ch14notes.Ch14_10_LayoutPanes;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ch14_10_2_GridPane extends Application
{

    @Override
    public void start(Stage primaryStage)
    {
        //Components: 8 x 2
        Label l1 = new Label("R0-C0");
        Label l2 = new Label("R1-C0");
        Label l3 = new Label("R2-C0");
        Label l4 = new Label("R3-C0");
        Label l5 = new Label("R0-C1");
        Label l6 = new Label("R1-C1");
        Label l7 = new Label("R2-C1");
        Label l8 = new Label("R3-C1");

        //Gridpane
        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(15);
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color: linear-gradient(to left, pink, navajowhite)");

        //if you wanna do it by add.Row/Col, then stick with either
        //one of them. Don't mix/match (will get error trying to add the same component)
        grid.addColumn(0, l1, l2, l3, l4);  //add all the first col components
        grid.addColumn(1, l5, l6, l7, l8);  //add all the second col components
//        grid.setColumnIndex(l8, 0);
//        grid.setRowIndex(l8, 5);

        grid.setColumnIndex(l1, 4);
        grid.setRowIndex(l1, 3);
        //Scene
        Scene scene = new Scene(grid, 720, 600);

        //stage
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
