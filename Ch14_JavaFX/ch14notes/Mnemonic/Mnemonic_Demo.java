package ch14notes.Mnemonic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Mnemonic_Demo extends Application
{

    @Override
    public void start(Stage stage) throws Exception
    {
        //Try Mnemonic
        //with button
        Button button = new Button("Press alt + _c to click");
        button.setMinSize(60, 30);
        //allow mnemonic
        button.mnemonicParsingProperty();

        //Layout
        VBox parent = new VBox();
        parent.getChildren().add(button);

        //check if it worked.
        //increment counter

        //label
        Label showCount = new Label();
        showCount.setAlignment(Pos.CENTER);
        parent.getChildren().add(showCount);
        parent.setAlignment(Pos.CENTER);

        button.setOnAction(new EventHandler<ActionEvent>()
        {
            int count = 1;

            @Override
            public void handle(ActionEvent actionEvent)
            {
                showCount.setText(String.valueOf(count++));
                button.setTextFill(Color.DARKORANGE);
                showCount.setStyle("-fx-background-color: lightblue; -fx-font-size: 2em; -fx-border-color: orange");


                //System.out.println(count++);
            }

        });

        //Scene
        Scene mnemonicScene = new Scene(parent, 1200, 600);

        //stage
        stage.setScene(mnemonicScene);
        stage.show();

    }
}
