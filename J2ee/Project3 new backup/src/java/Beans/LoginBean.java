/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author sanda
 */
public class LoginBean implements Serializable{
    
    String type;
    String un;
    String ps;
    
    public LoginBean(){
    
  
}
    
     public LoginBean(String type,String un,String ps){
        
        this.setType(type);
        this.setUn(un);
        this.setPs(ps);
        
        
    }
     public String getType(){
         return type;
     }
     
     public void setType(String type){
         this.type=type;
     }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }
    
    
    
}
