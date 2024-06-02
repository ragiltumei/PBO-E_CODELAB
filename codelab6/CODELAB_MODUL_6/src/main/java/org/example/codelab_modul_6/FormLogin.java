package org.example.codelab_modul_6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class FormLogin extends Application {

    private Scene loginScene;
    private Scene welcomeScene;

    @Override
    public void start(Stage primaryStage) {

        Label sLogin = new Label("Silahkan login");
        sLogin.setStyle("-fx-font-size: 30px;-fx-font-weight: bold;");

        // Untuk useranme dan password saya : "Ragil"
        Label usernamemenu = new Label("Username :");
        TextField usernameField = new TextField();
        usernameField.setPromptText("Masukkan username");

        Label passwordmenu = new Label("Password  :");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Masukkan password");


        Button login = new Button("Login");


        login.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if ("Ragil".equals(username) && "Ragil".equals(password)) {
                primaryStage.setScene(welcomeScene);
            } else {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Login Error");
                alert.setHeaderText(null);
                alert.setContentText("Username / Password salah. 'Username dan Password saya = Ragil' ");
                alert.showAndWait();
            }
        });


        HBox usernameHBox = new HBox(10, usernamemenu, usernameField);


        HBox passwordHBox = new HBox(10, passwordmenu, passwordField);


        VBox vbox = new VBox(10,sLogin, usernameHBox, passwordHBox, login);


        vbox.setStyle("-fx-padding: 10; -fx-alignment: center;");


        loginScene = new Scene(vbox, 300, 150);


        StackPane myMenu = new StackPane();
        Label hello = new Label("Hallo Bro");
        hello.setStyle("-fx-font-size: 30px;-fx-font-weight: bold;");
        Button kembali = new Button("Kembali");


        kembali.setOnAction(e -> primaryStage.setScene(loginScene));

        VBox welcomeVBox = new VBox(10, hello, kembali);
        welcomeVBox.setStyle("-fx-padding: 10; -fx-alignment: center;");
        myMenu.getChildren().add(welcomeVBox);

        welcomeScene = new Scene(myMenu, 300, 150);

        primaryStage.setScene(loginScene);
        primaryStage.setTitle("Login Form");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
