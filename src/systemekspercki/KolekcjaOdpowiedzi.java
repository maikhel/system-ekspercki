/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;

import java.util.ArrayList;

public class KolekcjaOdpowiedzi {
    private ArrayList opcje;
    private String wybranaOdpowiedz;
    
    public KolekcjaOdpowiedzi(ArrayList odpowiedzi){
        opcje = odpowiedzi;
    }
    
    public void wyswietl(){
         for(int i = 0; i< opcje.size(); i++){
             String odp = (String) opcje.get(i);
             System.out.println(i+1 + ". " +odp);         
         }
    }
        
    public ArrayList getOpcje(){
        return opcje;
    }
    
    public boolean odpowiedz(int ktora){
        ktora--;
        if (ktora < opcje.size()){
            String opcja = (String) opcje.get(ktora);
            setOdpowiedz(opcja);
            return true;
        }
        return false;

    }
    public boolean odpowiedz(String odp){
        for(int i = 0; i< opcje.size(); i++){
            String opcja = (String) opcje.get(i);
            if (opcja.equals(odp)){
                setOdpowiedz(odp);
                return true;
            }           
         }
        return false;
    }
    
    public void setOdpowiedz(String odp){
        wybranaOdpowiedz = odp;
    }
    
    public void setOdpowiedz(int index){
        wybranaOdpowiedz = (String) opcje.get(index);
    }
    
    public String getOdpowiedz(){
        return wybranaOdpowiedz;
    }
}
