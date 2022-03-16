/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Payment;
import Persistence.PaymentJpaController;
import java.util.List;

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
    
}
