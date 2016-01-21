/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;


public class Pytanie {
    private int ileOdpowiedzi;
    private int numer;
    private String tresc;
    private Pytanie nastepnePytanie;
    private Odpowiedz mozliwaOdpowiedz;
    
    public Pytanie(String tresc, Odpowiedz odpowiedz){
        this.tresc = tresc;
        mozliwaOdpowiedz = odpowiedz;
    }
    
    public void wyswietlTresc(){
        System.out.println(tresc);
    }
    public void wyswietlOdpwiedzi(){
         mozliwaOdpowiedz.wyswietl();
    }
    public void odpowiedz(){
        
    }
}
