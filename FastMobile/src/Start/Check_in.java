package Start;


import Controllers.UserController;
import Interface.Login;
import Interface.Menu;
import Models.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fanfo
 */
public class Check_in {
    
    UserController user_controller = new UserController();
    User u;
    
    public void decide(){ 
     if(remember()){
        new Menu(u).setVisible(true);
        }
     else{new Login().setVisible(true);}
    }
    
    public Boolean remember(){
        String line = "";
        String delim = ",";
        String passBD = "a";
        String passInterface = "b";
        try{
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
            String path = "./src/Log/RememberMe.txt";
            FileReader filereader = new FileReader(path);
            BufferedReader reader = new BufferedReader(filereader);
                        
            if((line = reader.readLine()) != null){                
                String[] user = line.split(delim);
                //System.out.println(user[0]);
                if(!user[0].trim().equals("") && !user[1].trim().equals("")){
                u = user_controller.getUser(user[0].trim());
                passBD = u.getPassword();
                passInterface = user[1].trim();         
                }       
            }            
        }
        catch (IOException e){
        }
        if(passBD.equals(passInterface)){
                    return true;
        }else return false;
    }
}
