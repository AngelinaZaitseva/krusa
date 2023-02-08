package com.example.demo3434;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button FIOButton;

    @FXML
    private Button PlanButton;

    @FXML
    private Button obrazecButton;

    @FXML
    private Button raspisanieButton;

    @FXML
    void initialize() {
        raspisanieButton.setOnAction(event -> {
            System.out.println("Вы выбрали узнать расписание");
        });
    }

}
