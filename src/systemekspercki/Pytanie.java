/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;

import java.util.Scanner;


public class Pytanie {
    private int numer;
    private String tresc;
    private KolekcjaOdpowiedzi mozliweOdpowiedzi;
    
    public Pytanie(String tresc, KolekcjaOdpowiedzi odpowiedzi){
        this.tresc = tresc;
        mozliweOdpowiedzi = odpowiedzi;
    }
    
    public void wyswietlTresc(){
        System.out.println(tresc);
    }
    public void wyswietlOdpwiedzi(){
         mozliweOdpowiedzi.wyswietl();
    }

    public void getOdpowiedz(){
        System.out.println("-----");
        Scanner reader = new Scanner(System.in); 
        int input = reader.nextInt();
//        mozliweOdpowiedzi.odpowiedz(input);
        
        while (!mozliweOdpowiedzi.odpowiedz(input)){
            System.out.println("Podaj poprawną cyfrę:");
            input = reader.nextInt();
            //System.out.println("INPUT: " + input);
        }
    }
    public String wybranaOdpowiedz(){
        return mozliweOdpowiedzi.getOdpowiedz();
    }
    public void wyswietlWybranaOdpowiedz(){
        System.out.println("Wybrana odpowiedz: " + wybranaOdpowiedz());
    }
}
