package com.example.demo9.task2;

import com.example.demo9.task2.List.SimpleArrayList;
import com.example.demo9.task2.List.SimpleList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private TextField tf = new TextField();
    private SimpleList simpleList = new SimpleArrayList();

    @Override
    public void start(Stage s) throws IOException {

        Button button = new Button("Add value");
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);
        button.setOnAction(new ButtonListener());
        StackPane stackPane1 = new StackPane();
        stackPane1.getChildren().add(tf);
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(stackPane1);
        borderPane.setBottom(stackPane);
        Scene scene = new Scene(borderPane, 300, 200);
        s.setScene(scene);
        s.show();
    }


    public static void main(String[] args) {
        launch();
    }

    class ButtonListener implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent actionEvent) {
            simpleList.add(tf.getText());
        }
    }

}
