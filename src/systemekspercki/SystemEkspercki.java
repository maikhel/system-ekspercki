/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;

public class SystemEkspercki {
    
    public static void main(String[] args) {
        KlientBazy klient = new KlientBazy();
        //klient.printTest();
        
       Obiektyw obiektyw = new Obiektyw();
       
       KolekcjaPytan pytania = new KolekcjaPytan();
       pytania.zadawajPytania(obiektyw);
       obiektyw.wysietl();
       String sql = obiektyw.generujSQL();
       System.out.println("SQL::");
       System.out.println(sql);

       klient.znajdzObiektyw(sql);
       
       klient.zakoncz();
    }
    
}
//TODO
// zadawanie wszystkich pytan i pobieranie odpowiedzi
// tworzenie sql
// wyszukiwanie i prezentacja wynikow
//dokumentacja

// komunikacja z bazą danych
// http://www.java2s.com/Tutorial/Java/0340__Database/ConnecttoDerbydatabase.htm
