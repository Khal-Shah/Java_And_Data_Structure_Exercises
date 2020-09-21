package ch14exercises;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/* Chapter 14 - Exercise 1:
    (Display images) Write a program that displays four images in a grid pane, as shown in Figure 14.43a.
 */
    //By Khaled Shah

public class Ch14_01_Display_Img_Grid extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        //the 4 images are: UK, Canada, China, US
        ImageView UK = new ImageView("/images/UK.jpg");
        ImageView CAN = new ImageView("/images/4.jpg");
        ImageView CHN = new ImageView("/images/china.jpg");
        ImageView US = new ImageView("/images/us.jpg");

        //GridPane
        //Places the nodes in the cells in a two-dimensional grid.
        GridPane parent = new GridPane();
        //parent.setStyle("-fx-start-margin: 2em");
        parent.setHgap(10);
        //parent.setVgap(20);
//        GridPane.setConstraints(UK, 0, 0);
//        GridPane.setConstraints(CAN, 0, 1);
//        GridPane.setConstraints(CHN, 1, 0);
//        GridPane.setConstraints(US, 1, 1);
        //parent.getChildren().addAll(UK, CAN, CHN, US);

        //^That works but so does this:
        parent.add(UK, 0, 0);
        parent.add(CAN, 0, 1);
        parent.add(CHN, 1, 0);
        parent.add(US, 1, 1);

        Scene flags = new Scene(parent);

        stage.setScene(flags);
        stage.show();
    }

    @Override
    public void stop() throws Exception
    {
        System.out.println("Program terminated.");
        super.stop();
    }
}
