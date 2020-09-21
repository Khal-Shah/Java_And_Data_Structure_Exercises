package ch14exercises;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

/* Chapter 14 - Exercise 4:
    (Color and font) Write a program that displays five texts vertically, as shown in Figure 14.44a.
    Set a random color and opacity for each text and set the font of each text to Times Roman, bold,
    italic, and 22 pixels.
 */
    //By Khaled Shah

public class Ch14_04_Vertical_Text extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        Random rgb = new Random();

        //Use loop: Texts will be next to each other so we can use HBox
        HBox parent = new HBox();

        for(int i = 1; i <= 5; i++)
        {
            Label label = new Label("Java");
            label.setTextFill(new Color(rgb.nextDouble(), rgb.nextDouble(), rgb.nextDouble(), rgb.nextDouble()));
            label.setRotate(90);
            parent.getChildren().add(label);
        }

        //parent.setRotate(90);
        parent.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-weight: bold;" +
                        "-fx-font-size: 22px; -fx-font-style: italic");
        parent.setAlignment(Pos.CENTER);

        //Scene
        Scene showLabels = new Scene(parent, 220, 150);

        //stage
        stage.setScene(showLabels);
        stage.show();

    }
}
