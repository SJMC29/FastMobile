package Start;

import Function.LoginController;


public class Main {
    
    LoginController login_controller = new LoginController();
     public static void main(String args[]) {
        // Aqui puedes probar las interfaces que quieras
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Check_in().decide();
                
            }
        });
    }
    
     
}