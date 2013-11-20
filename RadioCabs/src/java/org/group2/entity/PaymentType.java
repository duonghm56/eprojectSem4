package org.group2.entity;
// Generated Nov 14, 2013 6:33:44 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * PaymentType generated by hbm2java
 */
public class PaymentType  implements java.io.Serializable {


     private int paymentTypeId;
     private String paymentTypeName;
     private Set<Billing> billings = new HashSet<Billing>(0);

    public PaymentType() {
    }

	
    public PaymentType(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }
    public PaymentType(int paymentTypeId, String paymentTypeName, Set<Billing> billings) {
       this.paymentTypeId = paymentTypeId;
       this.paymentTypeName = paymentTypeName;
       this.billings = billings;
    }
   
    public int getPaymentTypeId() {
        return this.paymentTypeId;
    }
    
    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }
    public String getPaymentTypeName() {
        return this.paymentTypeName;
    }
    
    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }
    public Set<Billing> getBillings() {
        return this.billings;
    }
    
    public void setBillings(Set<Billing> billings) {
        this.billings = billings;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null){
            return false;
        }
        if(obj instanceof PaymentType){
            return ((PaymentType)obj).paymentTypeId == this.paymentTypeId;
        }else{
            return false;
        }
    }

    


}


