package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label label1 = new Label("Main menu");

        Button button2 = new Button("Play");
        Button button3 = new Button("Configurations");
        Button button4 = new Button("High Scores");
        Button button5 = new Button("Exit");

        label1.setTranslateY(-100);
        button2.setTranslateY(-50);
        button3.setTranslateY(0);
        button4.setTranslateY(50);
        button5.setTranslateY(100);

        StackPane root1 = new StackPane(
                label1,
                button2,
                button3,
                button4,
                button5
        );

        Scene scene1 = new Scene(root1, 400, 300);

        Label label2 = new Label("Play");
        Button backButton2 = new Button("Back");

        label2.setTranslateY(-30);
        backButton2.setTranslateY(30);

        StackPane root2 = new StackPane(label2, backButton2);
        Scene scene2 = new Scene(root2, 400, 300);

        Label label3 = new Label("Configurations");
        Button backButton3 = new Button("Back");

        label3.setTranslateY(-30);
        backButton3.setTranslateY(30);

        StackPane root3 = new StackPane(label3, backButton3);
        Scene scene3 = new Scene(root3, 400, 300);

        Label label4 = new Label("High Scores");
        Button backButton4 = new Button("Back");

        label4.setTranslateY(-30);
        backButton4.setTranslateY(30);

        StackPane root4 = new StackPane(label4, backButton4);
        Scene scene4 = new Scene(root4, 400, 300);

        Label label5 = new Label("Are you sure you want to quit playing?");

        Button backButton5 = new Button("No");
        Button closeButton5 = new Button("Yes");

        label5.setTranslateY(-50);

        backButton5.setTranslateX(-40);
        backButton5.setTranslateY(30);

        closeButton5.setTranslateX(40);
        closeButton5.setTranslateY(30);

        StackPane root5 = new StackPane(
                label5,
                backButton5,
                closeButton5
        );

        Scene scene5 = new Scene(root5, 300, 150);

        Stage exitStage = new Stage();
        exitStage.setScene(scene5);
        exitStage.setTitle("Exit");

        button2.setOnAction(e -> {
            primaryStage.setScene(scene2);
        });

        button3.setOnAction(e -> {
            primaryStage.setScene(scene3);
        });

        button4.setOnAction(e -> {
            primaryStage.setScene(scene4);
        });

        button5.setOnAction(e -> {
            exitStage.show();
        });

        backButton2.setOnAction(e -> {
            primaryStage.setScene(scene1);
        });

        backButton3.setOnAction(e -> {
            primaryStage.setScene(scene1);
        });

        backButton4.setOnAction(e -> {
            primaryStage.setScene(scene1);
        });

        backButton5.setOnAction(e -> {
            exitStage.close();
        });

        closeButton5.setOnAction(e -> {
            exitStage.close();
            primaryStage.close();
        });

        primaryStage.setScene(scene1);
        primaryStage.setTitle("OOSD Assignment");
        primaryStage.show();
    }
}