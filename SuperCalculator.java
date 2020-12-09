package com.case03.view;

import com.case03.controller.CalculateController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class SuperCalculator extends Application {

    CalculateController calculateController = new CalculateController();

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        int sceneWidth = 260;
        int sceneHeight = 300;
        Scene scene = new Scene(pane,sceneWidth,sceneHeight);

        // create new label and buttons
        Label label = new Label();
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnPoint = new Button(".");
        Button btnAdd = new Button("+");
        Button btnMinus = new Button("-");
        Button btnTimes = new Button("*");
        Button btnDivide = new Button("/");
        Button btnClear = new Button("C");
        Button btnEqual = new Button("=");

        //set layout
        int margin = 10;
        int labelHeight = 50;
        int buttonHeight = 40;

        //label layout
        label.setLayoutX(margin);
        label.setLayoutY(margin);
        label.setPrefWidth(sceneWidth - 2 * margin );
        label.setPrefHeight(labelHeight);
        label.setTextAlignment(TextAlignment.RIGHT);


        //button layout
        // the first row
        btn7.setLayoutX(margin);
        btn7.setLayoutY(labelHeight + 2 * margin);
        btn7.setPrefWidth(buttonHeight);
        btn7.setPrefHeight(buttonHeight);

        btn8.setLayoutX(btn7.getPrefWidth() + 2 * margin);
        btn8.setLayoutY(labelHeight + 2 * margin);
        btn8.setPrefWidth(buttonHeight);
        btn8.setPrefHeight(buttonHeight);

        btn9.setLayoutX(btn7.getPrefWidth() + btn8.getPrefWidth() + 3 * margin);
        btn9.setLayoutY(labelHeight + 2 * margin);
        btn9.setPrefWidth(buttonHeight);
        btn9.setPrefHeight(buttonHeight);

        btnDivide.setLayoutX(btn7.getPrefWidth() + btn8.getPrefWidth() + btn9.getPrefWidth() + 4 * margin);
        btnDivide.setLayoutY(labelHeight + 2 * margin);
        btnDivide.setPrefWidth(buttonHeight);
        btnDivide.setPrefHeight(buttonHeight);

        // the second row
        btn4.setLayoutX(margin);
        btn4.setLayoutY(labelHeight + btn7.getPrefHeight() + 3 * margin);
        btn4.setPrefWidth(buttonHeight);
        btn4.setPrefHeight(buttonHeight);

        btn5.setLayoutX(btn4.getPrefWidth() + 2 * margin);
        btn5.setLayoutY(labelHeight + btn8.getPrefHeight() + 3 * margin);
        btn5.setPrefWidth(buttonHeight);
        btn5.setPrefHeight(buttonHeight);

        btn6.setLayoutX(btn4.getPrefWidth() + btn5.getPrefWidth() + 3 * margin);
        btn6.setLayoutY(labelHeight + btn9.getPrefHeight() + 3 * margin);
        btn6.setPrefWidth(buttonHeight);
        btn6.setPrefHeight(buttonHeight);

        btnTimes.setLayoutX(btn4.getPrefWidth() + btn5.getPrefWidth() + btn6.getPrefWidth() + 4 * margin);
        btnTimes.setLayoutY(labelHeight + btnDivide.getPrefHeight() + 3 * margin);
        btnTimes.setPrefWidth(buttonHeight);
        btnTimes.setPrefHeight(buttonHeight);

        btnClear.setLayoutX(btn4.getPrefWidth() + btn5.getPrefWidth() + btn6.getPrefWidth() + btnTimes.getPrefWidth() + 5 * margin);
        btnClear.setLayoutY(labelHeight + btnDivide.getPrefHeight() + 3 * margin);
        btnClear.setPrefWidth(buttonHeight);
        btnClear.setPrefHeight(buttonHeight);

        // the third row
        btn1.setLayoutX(margin);
        btn1.setLayoutY(labelHeight + btn7.getPrefHeight() + btn4.getPrefHeight() + 4 * margin);
        btn1.setPrefWidth(buttonHeight);
        btn1.setPrefHeight(buttonHeight);

        btn2.setLayoutX(btn1.getPrefWidth() + 2 * margin);
        btn2.setLayoutY(labelHeight + btn7.getPrefHeight() + btn4.getPrefHeight() + 4 * margin);
        btn2.setPrefWidth(buttonHeight);
        btn2.setPrefHeight(buttonHeight);

        btn3.setLayoutX(btn1.getPrefWidth() + btn2.getPrefWidth() + 3 * margin);
        btn3.setLayoutY(labelHeight + btn7.getPrefHeight() + btn4.getPrefHeight() + 4 * margin);
        btn3.setPrefWidth(buttonHeight);
        btn3.setPrefHeight(buttonHeight);

        btnMinus.setLayoutX(btn1.getPrefWidth() + btn2.getPrefWidth() + btn3.getPrefWidth() + 4 * margin);
        btnMinus.setLayoutY(labelHeight + btn7.getPrefHeight() + btn4.getPrefHeight() + 4 * margin);
        btnMinus.setPrefWidth(buttonHeight);
        btnMinus.setPrefHeight(buttonHeight);

        btnEqual.setLayoutX(btn1.getPrefWidth() + btn2.getPrefWidth() + btn3.getPrefWidth() + btnMinus.getPrefWidth() + 5 * margin);
        btnEqual.setLayoutY(labelHeight + btn7.getPrefHeight() + btn4.getPrefHeight() + 4 * margin);
        btnEqual.setPrefWidth(buttonHeight);
        btnEqual.setPrefHeight(margin + 2 * buttonHeight);

        // the fourth row
        btn0.setLayoutX(margin);
        btn0.setLayoutY(labelHeight + btn7.getPrefHeight() + btn4.getPrefHeight() + btn1.getPrefHeight() + 5 * margin);
        btn0.setPrefWidth(margin + 2 * buttonHeight);
        btn0.setPrefHeight(buttonHeight);

        btnPoint.setLayoutX(btn0.getPrefWidth() + 2 * margin);
        btnPoint.setLayoutY(labelHeight + btn7.getPrefHeight() + btn4.getPrefHeight() + btn1.getPrefHeight() + 5 * margin);
        btnPoint.setPrefWidth(buttonHeight);
        btnPoint.setPrefHeight(buttonHeight);

        btnAdd.setLayoutX(btn0.getPrefWidth() + btnPoint.getPrefWidth() + 3 * margin);
        btnAdd.setLayoutY(labelHeight + btn7.getPrefHeight() + btn4.getPrefHeight() + btn1.getPrefHeight() + 5 * margin);
        btnAdd.setPrefWidth(buttonHeight);
        btnAdd.setPrefHeight(buttonHeight);

        //add to the pane
        pane.getChildren().add(label);
        pane.getChildren().add(btn1);
        pane.getChildren().add(btn2);
        pane.getChildren().add(btn3);
        pane.getChildren().add(btn4);
        pane.getChildren().add(btn5);
        pane.getChildren().add(btn6);
        pane.getChildren().add(btn7);
        pane.getChildren().add(btn8);
        pane.getChildren().add(btn9);
        pane.getChildren().add(btn0);
        pane.getChildren().add(btnAdd);
        pane.getChildren().add(btnMinus);
        pane.getChildren().add(btnTimes);
        pane.getChildren().add(btnDivide);
        pane.getChildren().add(btnClear);
        pane.getChildren().add(btnPoint);
        pane.getChildren().add(btnEqual);


        primaryStage.setTitle("SuperCalculator");
        primaryStage.setScene(scene);
        primaryStage.show();

        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("0"));
            }
        });

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("1"));
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("2"));
            }
        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("3"));
            }
        });

        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("4"));
            }
        });

        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("5"));
            }
        });

        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("6"));
            }
        });

        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("7"));
            }
        });

        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("8"));
            }
        });

        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("9"));
            }
        });

        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calculateController.handle("+");
            }
        });

        btnMinus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calculateController.handle("-");
            }
        });

        btnTimes.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calculateController.handle("*");
            }
        });

        btnDivide.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calculateController.handle("/");
            }
        });

        btnClear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("C"));
            }
        });

        btnPoint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("."));
            }
        });

        btnEqual.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(calculateController.handle("="));
            }
        });

    }
}
