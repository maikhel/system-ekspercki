/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;

import java.util.ArrayList;

public class Odpowiedz {
    private int ile;
    private ArrayList opcje;
    
    public Odpowiedz(ArrayList odpowiedzi){
        opcje = odpowiedzi;
    }
    
    public void wyswietl(){
         for(int i = 0; i< opcje.size(); i++){
            try{
                String odp = (String) opcje.get(i);
                System.out.println(odp);
            }catch(ClassCastException e){
                int odp = (int) opcje.get(i);
                System.out.println(odp);
            }           
         }
    }
        
    public ArrayList getOpcje(){
        return opcje;
    }
    
}
