/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Carlos
 */
public class SingleObject {
    private static SingleObject Instance=null;
    String mensage;
    private  SingleObject() {
    }
    
    public static SingleObject getInstance()
    {
        if (Instance==null)
            Instance=new SingleObject();
        return Instance;
    }

    public String getMensage() {
        return mensage;
    }

    public void setMensage(String mensage) {
        this.mensage = mensage;
    }
    
}
