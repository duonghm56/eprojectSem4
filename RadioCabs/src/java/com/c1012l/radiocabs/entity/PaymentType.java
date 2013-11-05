package com.c1012l.radiocabs.entity;
// Generated Nov 5, 2013 10:05:47 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * PaymentType generated by hbm2java
 */
public class PaymentType  implements java.io.Serializable {


     private int paymentTypeId;
     private Serializable paymentTypeName;
     private Set<Payment> payments = new HashSet<Payment>(0);

    public PaymentType() {
    }

	
    public PaymentType(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }
    public PaymentType(int paymentTypeId, Serializable paymentTypeName, Set<Payment> payments) {
       this.paymentTypeId = paymentTypeId;
       this.paymentTypeName = paymentTypeName;
       this.payments = payments;
    }
   
    public int getPaymentTypeId() {
        return this.paymentTypeId;
    }
    
    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }
    public Serializable getPaymentTypeName() {
        return this.paymentTypeName;
    }
    
    public void setPaymentTypeName(Serializable paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }
    public Set<Payment> getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }




}


