/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.UserController;
import Interface.ConsumeLoad;
import Interface.ListClients;
import Interface.ListUsers;
import Interface.GenerateReceipt;
import Interface.Login;
import Interface.Menu;
import Interface.PaymentLoad;
import Interface.PaymentRegister;
import Interface.ProfileUsers;
import Interface.RegisterClient;
import Interface.RegisterUser;
import Models.User;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
/**
 *
 * @author Sara Maradiago
 */
public class MenuController {
    UserController user_controller = new UserController();
    
    public void logOut(Menu menu){
            new Login().setVisible(true);
            menu.dispose();
    }
    public void goToProfile(Menu menu, User user){                       
            new ProfileUsers(user).setVisible(true);
            menu.dispose();
    }
    public void goToRegisterClient(Menu menu, User user){                       
            new RegisterClient(user).setVisible(true);
            menu.dispose();
    }
    public void goToListClients(Menu menu, User user){                       
            new ListClients(user).setVisible(true);
            menu.dispose();    
    }
    public void goToRegisterUser(Menu menu, User user){                       
            new RegisterUser(user).setVisible(true);
            menu.dispose();    
    }
    public void goToPaymentRegister(Menu menu, User user){                       
            new PaymentRegister(user).setVisible(true);
            menu.dispose();    
    }
    
    public void goToListUsers(Menu menu, User user){                        
            new ListUsers(user).setVisible(true); 
            menu.dispose();     
    }
    
    public void goToConsumeLoad(Menu menu, User user){
        new ConsumeLoad(user).setVisible(true); 
            menu.dispose(); 
    }

    public void goToPaymentsLoad(Menu menu, User usuario) {
        new PaymentLoad(usuario).setVisible(true);
        menu.dispose();
    }
    
    public void goToGenerateReceipt(Menu menu, User usuario) {
        new GenerateReceipt(usuario).setVisible(true);
        menu.dispose();
    }
    
    public void goToDashboard() {//GEN-FIRST:event_VerDashboardMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://app.powerbi.com/view?r=eyJrIjoiZTE4YjYwMjQtNDE0OC00NDZjLThlMWMtNGFmNjQyYjc1M2MwIiwidCI6IjhjMDdhNTExLTZjZTYtNDIzYy1iMDllLWRhYmU5ZDgyNjVjMyIsImMiOjR9"));
        } catch (URISyntaxException ex) {
            System.out.println(ex);
        }catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_VerDashboardMouseClicked
}
