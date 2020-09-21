package ch14notes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class Ch14_07_08_09_Color_Font_Img extends Application
{
    @Override
    public void start(Stage stage) throws Exception
    {
        //For color, we can use Color.COLORNAME, or Color.web("#HEX")
        //Or Color color = new Color(R, G, B, Opacity) all between 0 and 1

        Font labelFont = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 25);
        //Notice no new^

        Label circleText = new Label("JavaFX");
        //circleText.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 25));
        //^Works but can also do:
        circleText.setFont(labelFont);

        //We have the circleText, next make the circle
        Circle circle = new Circle();
        circle.setRadius(80);
        circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
        circle.setStroke(Color.BLACK);

        //Now the layout: we'll want the nodes (circle and circleText) on top of each other so StackPane
        StackPane parent = new StackPane();
        //attach nodes to it

        //Temp: Image
        //ImageView background = new ImageView("https://thumbs.dreamstime.com/z/white-square-empty-picture-frame-transparent-background-blank-mockup-poster-isolated-neutral-vec-vector-illustration-109850740.jpg");
        //parent.getChildren().add(background); //works but if you want the img to be background add it 1st
        parent.getChildren().addAll(circle, circleText);


        //Bind
//        circle.centerXProperty().bind(parent.widthProperty().divide(2));
//        circle.centerYProperty().bind(parent.heightProperty().divide(2));
//        parent.getChildren().addAll(circle, circleText);

        //Scene:
        Scene circleScene = new Scene(parent);

        //Stage
        stage.setTitle("Font Demo");
        stage.setScene(circleScene);
        //stage.show();

        //IMAGES
        Image us = new Image("https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_10/book/image/us.gif");
        ImageView us1 = new ImageView(us);
        HBox imgRoot = new HBox();
        imgRoot.getChildren().add(us1);

        ImageView us2 = new ImageView(us);
        us2.setRotate(270);
        imgRoot.getChildren().add(us2);
        imgRoot.setStyle("-fx-alignment: center");
//        imgRoot.setPadding(new Insets(0, 15, 0, 0));
        us2.setFitHeight(200);
        us2.setFitWidth(150);
        //imgRoot.setStyle("-fx-padding-right: 5");
        Scene imgScene = new Scene(imgRoot, 720, 480);
        stage.setScene(imgScene);
        stage.setTitle("Image Demo");
        stage.show();

    }
}
