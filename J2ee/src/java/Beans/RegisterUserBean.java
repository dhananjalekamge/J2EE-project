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
public class RegisterUserBean implements Serializable {
   
   String type;
   String name;
   String em;
   String uname;
   String pass;
    
    public RegisterUserBean(){
        
    }
    
    public RegisterUserBean(String type,String name,String em,String uname,String pass){
        
        this.setType(type);
        this.setName(name);
        this.setEm(em);
        this.setUname(uname);
        this.setPass(pass);
        
    }
    
     public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}