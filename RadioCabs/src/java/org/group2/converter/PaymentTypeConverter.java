/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.group2.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.group2.entity.PaymentType;
import org.group2.model.AbstractModel;

/**
 *
 * @author DUONGHM
 */
@FacesConverter("paymentTypeConverter")
public class PaymentTypeConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        //return new PaymentType(Integer.parseInt(string));
        return new AbstractModel(PaymentType.class){}.search("paymentTypeId = " + string).get(0);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        int v = ((PaymentType)o).getPaymentTypeId();
        return String.valueOf(v);
    }
    
}