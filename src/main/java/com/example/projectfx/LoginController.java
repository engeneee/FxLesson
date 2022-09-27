package com.example.projectfx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginController {

    @FXML
    Button loginButton, registrationButton;

    @FXML
    TextField emailTextField, passwordTextField;


    public void loginButtonClicked(ActionEvent event) {
        if (emailTextField.getText().equals("zhuldyzairashidova@gmail.com") && passwordTextField.getText().equals("buklyadina")){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("welcome.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 370, 574);
                Stage stage = new Stage();
                stage.setTitle("WELCOME PAGE");
                stage.setScene(scene);
                stage.show();
                ((Node) (event.getSource())).getScene().getWindow().hide();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }

    public void registrationButtonClicked (ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("registration.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("Registration form");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }


}