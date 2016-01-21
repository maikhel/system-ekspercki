/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;

import java.util.ArrayList;
import java.util.Arrays;

public class KolekcjaPytan {
    ArrayList pytania  = new ArrayList();
    
    public KolekcjaPytan(){
        stworzPytania();
    }
    
    public void zadawajPytania(){
        
        for(int i = 0; i< pytania.size(); i++){
            Pytanie p = (Pytanie) pytania.get(i);
            p.wyswietlTresc();
            p.wyswietlOdpwiedzi();
            
        }
    }
    
    private void stworzPytania(){
        ArrayList<String> odpTakNie = new ArrayList<>(
        Arrays.asList("tak", "nie"));
        Odpowiedz odpowiedz1 = new Odpowiedz(odpTakNie);
        String tresc1 = "Aparat jakiego producenta posiadasz?";
        Pytanie pytanie1 = new Pytanie(tresc1, odpowiedz1);
        pytania.add(pytanie1);

         ArrayList<String> odpOgniskowe = new ArrayList<>(
                Arrays.asList("stalo ogniskowy", "zmienno ogniskowy"));
        Odpowiedz odpowiedz2 = new Odpowiedz(odpOgniskowe);
        String tresc2 = "Obiektyw ma być stało czy zmienno ogniskowy?";
        Pytanie pytanie2 = new Pytanie(tresc2, odpowiedz2);
        pytania.add(pytanie2);
    
        ArrayList<Integer> odpZakresOgniskowych = new ArrayList<>(
            Arrays.asList(35,70,200,1000));
        Odpowiedz odpowiedz3 = new Odpowiedz(odpZakresOgniskowych);
        String tresc3 = "Jaki zakres ogniskowych w obiektywie?";
        Pytanie pytanie3 = new Pytanie(tresc3, odpowiedz3);
        pytania.add(pytanie3);

        ArrayList<String> odpTypFoto = new ArrayList<>(
                Arrays.asList("krajobrazy", "portrety", "makro",
                "sport", "reportaż", "uniwersalny"));
        Odpowiedz odpowiedz4 = new Odpowiedz(odpTypFoto);
        String tresc4 = "Do jakiego typu fotografii obiektyw bedzie najczęściej używany?";
        Pytanie pytanie4 = new Pytanie(tresc4, odpowiedz4);
        pytania.add(pytanie4);
    
        Odpowiedz odpowiedz5 = new Odpowiedz(odpTakNie);
        String tresc5 = "Czy obiektyw ma być uszczelniony?";
        Pytanie pytanie5 = new Pytanie(tresc5, odpowiedz5);
        pytania.add(pytanie5);

        ArrayList<Integer> odpZakresCen = new ArrayList<>(
            Arrays.asList(300,500,1000,1500,3000,100000));
        Odpowiedz odpowiedz6 = new Odpowiedz(odpZakresCen);
        String tresc6 = "Podaj zakres cenowy";
        Pytanie pytanie6 = new Pytanie(tresc6, odpowiedz6);
        pytania.add(pytanie6);

        Odpowiedz odpowiedz7 = new Odpowiedz(odpTakNie);
        String tresc7 = "Czy obiektyw może być spoza systemu (producenta niezależnego)?";
        Pytanie pytanie7 = new Pytanie(tresc7, odpowiedz7);
        pytania.add(pytanie7);
    }
}
