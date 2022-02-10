/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Function;

import Controllers.UserController;
import Interface.Login;
import Interface.Menu;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Fanfo
 */
public class LoginController {
    UserController user_controller = new UserController();
    public void letIngreso(Login login) throws IOException{
        //System.out.println(user_controller.getUser(login.getUser()).getPassword());
        String passBD = "";
        String passInterface = "";   
        
        int error = 0;
        
        if(login.getUser().equals("") || login.getPassword().equals("")){
            error = 1;
            login.showError(error); 
        }else{
            if(user_controller.getUser(login.getUser().trim()) != null){
                passBD = user_controller.getUser(login.getUser().trim()).getPassword();
                passInterface = login.getPassword().trim();                
                    if (passBD.equals(passInterface)) {
                        new Menu().setVisible(true);
                        login.dispose();
                        //Guardar en archivo si le dan al checkbox
                            FileWriter filereader = null;
                            PrintWriter writer = null;
                            String path = "./src/Log/RememberMe.txt";
                        if(login.getRemember()){                                                    
                            try {
                                filereader = new FileWriter(path);
                                writer = new PrintWriter(filereader);
                                
                                writer.println(login.getUser()+","+login.getPassword());
                                
                            } catch (Exception e){
                            } finally {
                                filereader.close();
                            }
                        }else{//Sino borrar lo que hay en el archivo
                            try {
                                filereader = new FileWriter(path);
                                writer = new PrintWriter(filereader);
                                
                                writer.println("");                                
                            } catch (Exception e){
                            } finally {
                                filereader.close();
                            }
                        }
                    } else {
                        error = 2;
                        login.showError(error); 
                    }
                }  else {
                    error = 3;
                    login.showError(error); 
            }
        }             
    }
}
