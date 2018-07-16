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
public class IdeaBean implements Serializable {
    
  // String nme;
   String comment;
  
    
    public IdeaBean(){
        
    }
    
    public IdeaBean(String comment){
         
       // this.setNme(nme);
        this.setComment(comment);
       
    }
    
    /* public String getNme() {
        return nme;
    }

    public void setNme(String nme) {
        this.nme = nme;
    } */
    

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    
    
}
