/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Payment;
import Persistence.PaymentJpaController;
import Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EDITH
 */
public class PaymentConroller {
    
    PaymentJpaController paymentJPA = new PaymentJpaController();
    
    public void createPayment(Payment p){
        paymentJPA.create(p);
    }
    
    public List<Payment> getPayments(){
        return paymentJPA.findPaymentEntities();
    }
    
    public void deletePayment(Integer id){
        try {
            paymentJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PaymentConroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
