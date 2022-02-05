/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package JavaFX;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Sara Maradiago
 */
public class LoginFXMLController implements Initializable {

    @FXML
    private Button boton1;
    @FXML
    private Button boton2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BTN(ActionEvent event) {
        System.out.println("TATAKAE :P");
    }

    @FXML
    private void BTN2(ActionEvent event) {
        System.out.println("EREN TE AMO <3 puto");
    }
    
}
