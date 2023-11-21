package com.example.unijui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    protected void onHelloButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensagem de aviso!");
        alert.setContentText("Mensagem ao clicar no botão");
        alert.show();
    }
}