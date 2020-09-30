package ch14exercises;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Random;

/* Chapter 14 - Exercise 2:
(Tic-tac-toe board) Write a program that displays a tic-tac-toe board, as shown in Figure 14.43b.
A cell may be X, O, or empty. What to display at each cell is randomly decided. The X and O are images in
the files x.gif and o.gif.
 */
    //By Khaled Shah

public class Ch14_02_TicTacToe_Board extends Application
{

    static Image X = new Image("/images/x.gif");
    static Image O = new Image("/images/o.gif");

    @Override
    public void start(Stage stage) throws Exception
    {

        //GridPane: is 2D so we CAN'T do a 3x3 tictactoe board with it? Nope, turns out we can. (see nested for)
        GridPane grid = new GridPane();
        grid.setVgap(20);
        grid.setHgap(20);
        grid.setAlignment(Pos.CENTER);

        Random random = new Random();
//
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int r = -1 + random.nextInt(3);

                grid.add(getNode(r), i, j);         //still a 2d board (row and col)
            }
        }
//          we can't add the same ImageView multiple times, have to create a new ImageView if we wanna add same pic


        //Scene
        Scene showBoard = new Scene(grid);

        //Stage
        stage.setTitle("Exercise 14_02");
        stage.setScene(showBoard);
        stage.show();
    }

    static ImageView getNode(int r)
    {
        return switch (r)
        {
          case 0 -> new ImageView(O);
          case 1 -> new ImageView(X);
          default -> new ImageView();
        };
    }
}
