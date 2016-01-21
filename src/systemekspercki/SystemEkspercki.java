/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;


public class SystemEkspercki {
    public static int postep;
   
   
    
    public static void main(String[] args) {
//        KlientBazy klient = new KlientBazy();
//        klient.printTest();
    
       KolekcjaPytan pytania = new KolekcjaPytan();
       
       pytania.zadawajPytania();
       
    }
    
}
//TODO
// dodac pobieranie odpowiedzi z konsoli
// dodac workflow z wyszukiwaniem odpowiedzi
// dodac wszystkie opcje odpowiedzi
// dodac obiektywy PENTAX
// dodac obiektywy CANON
// dodac obiektywy NIKON
// dodac obiektywy SIGMA
// dodac obiektywy TAMRON
// dodac obiektywy SAMYANG