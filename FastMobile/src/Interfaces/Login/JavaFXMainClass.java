/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Interfaces.Login;

import JavaFX.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Sara Maradiago
 */
public class JavaFXMainClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Login_Interface.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(JavaFXMainClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Fast Mobile");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
