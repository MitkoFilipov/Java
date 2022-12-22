package com.example.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 1000, 800);

        ImageView us = new ImageView(new Image("C:\\Users\\pcc\\Desktop\\протоколи java 375381\\javaFxBMICalculator\\src\\main\\resources\\image\\workout.gif"));
        grid.add(us, 1, 5);

        Label lbTitle = new Label("Body Mass Index Calculator");
        grid.add(lbTitle, 0, 0);

        Label ageLabel = new Label("Age:");
        grid.add(ageLabel, 0, 2);

        TextField ageField = new TextField();
        grid.add(ageField, 1, 2);

        Label weightLabel = new Label("Weight:");
        grid.add(weightLabel, 0, 3);

        TextField weightField = new TextField();
        grid.add(weightField, 1, 3);

        Label heightLabel= new Label("Height:");
        grid.add(heightLabel, 0, 4);

        TextField heightField = new TextField();
        grid.add(heightField, 1, 4);



        Button btn = new Button("Calculate");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 6);

        btn.setOnAction(e -> {
            int userAge = Integer.parseInt(ageField.getText());
            double userWeight = Double.parseDouble(weightField.getText());
            double userHeight = Double.parseDouble(heightField.getText());
            System.out.println(userWeight);
            Bmi bmi = new Bmi(userAge, userWeight, userHeight);

            Label bmiField = new Label("BMI: " + bmi.getBmi() + "\nStatus: " + bmi.getStatus());
            grid.add(bmiField, 1, 7);
        });

        stage.setTitle("BMI");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}