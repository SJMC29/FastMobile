/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Interfaces.Register;

import JavaFX.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author Sara Maradiago
 */
public class Login_InterfaceController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Pane centerPanel;
    @FXML
    private Rectangle menuWhite;
    @FXML
    private Button loginButton;
    @FXML
    private Rectangle blueCircle;
    @FXML
    private Label bienvenido;
    @FXML
    private TextField userName;
    @FXML
    private TextField userPassword;
    @FXML
    private CheckBox rememberMe;
    @FXML
    private Hyperlink forgotPasword;
    @FXML
    private Pane topPane;
    @FXML
    private Rectangle rectangleWhite;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginBTN(ActionEvent event) {
    }
    
}
