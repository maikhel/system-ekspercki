/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;

import java.util.Arrays;


public class Obiektyw {
    private String producent;
    private String ogniskowa;
    private int dolnaGranicaOgniskowej;
    private int gornaGranicaOgniskowej;
    private boolean czyFisheye;
    private TypFotografii fotografie[];
    private boolean czyUszczelniony;
    private double cenaMin;
    private double cenaMax;
    private boolean czySpozaSystemu;
    
    interface SetAttribute {
        void set(String arg);
    }
    
    private SetAttribute[] setters = new SetAttribute[] {
        new SetAttribute() { public void set(String arg) { setProducent(arg); } },
        new SetAttribute() { public void set(String arg) { setTypOgniskowej(arg); } }
    };
    
    public void set(int index, String arg) {
        setters[index].set(arg);
    }
    public boolean setProducent(String nazwa){
        String[] producenci = {"Canon", "Nikon", "Pentax"};
        if (Arrays.asList(producenci).contains(nazwa)){
           this.producent = nazwa;
           return true;
        }
        return false;        
    }
    public String getProducent(){
        return producent;
    }
   
    public boolean setTypOgniskowej(String nazwa){
        String[] typy = {"stalo ogniskowy", "zmienno ogniskowy"};
        if (Arrays.asList(typy).contains(nazwa)){
           this.ogniskowa = nazwa;
           return true;
        }
        return false;        
    }
    
    
}
