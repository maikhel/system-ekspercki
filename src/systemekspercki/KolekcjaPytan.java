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
    Obiektyw obiektyw;
    
    public KolekcjaPytan(){
        stworzPytania();
        obiektyw = new Obiektyw();
    }
    
    public void zadawajPytania(){
        
        for(int i = 0; i< pytania.size(); i++){
            Pytanie p = (Pytanie) pytania.get(i);
            p.wyswietlTresc();
            p.wyswietlOdpwiedzi();
            p.getOdpowiedz();
            p.wyswietlWybranaOdpowiedz();
            System.out.println("Producent przed: " + obiektyw.getProducent());
            obiektyw.set(i, p.wybranaOdpowiedz());
            System.out.println("Producent PO: " + obiektyw.getProducent());

                       
            if(i == 1) break;
            
        }
    }
    
    private void stworzPytania(){
        ArrayList<String> odpTakNie = new ArrayList<>(
        Arrays.asList("tak", "nie"));
        
        ArrayList<String> odpProducent = new ArrayList<>(
        Arrays.asList("Canon", "Nikon", "Pentax"));
        KolekcjaOdpowiedzi odpowiedz1 = new KolekcjaOdpowiedzi(odpProducent);
        String tresc1 = "Aparat jakiego producenta posiadasz?";
        Pytanie pytanie1 = new Pytanie(tresc1, odpowiedz1);
        pytania.add(pytanie1);
        
        ArrayList<String> odpMatryca = new ArrayList<>(
        Arrays.asList("APS-C", "Pełna klatka"));
        KolekcjaOdpowiedzi odpowiedz11 = new KolekcjaOdpowiedzi(odpMatryca);
        String tresc11 = "W jaką matrycę wyposażony jest aparat?";
        Pytanie pytanie11 = new Pytanie(tresc11, odpowiedz11);
        pytania.add(pytanie11);

         ArrayList<String> odpOgniskowe = new ArrayList<>(
                Arrays.asList("stalo ogniskowy", "zmienno ogniskowy"));
        KolekcjaOdpowiedzi odpowiedz2 = new KolekcjaOdpowiedzi(odpOgniskowe);
        String tresc2 = "Obiektyw ma być stało czy zmienno ogniskowy?";
        Pytanie pytanie2 = new Pytanie(tresc2, odpowiedz2);
        pytania.add(pytanie2);
    
        ArrayList<Integer> odpZakresOgniskowych = new ArrayList<>(
            Arrays.asList(35,70,200,1000));
        KolekcjaOdpowiedzi odpowiedz3 = new KolekcjaOdpowiedzi(odpZakresOgniskowych);
        String tresc3 = "Jaki zakres ogniskowych w obiektywie?";
        Pytanie pytanie3 = new Pytanie(tresc3, odpowiedz3);
        pytania.add(pytanie3);

        ArrayList<String> odpTypFoto = new ArrayList<>(
                Arrays.asList("krajobrazy", "portrety", "makro",
                "sport", "reportaż", "uniwersalny"));
        KolekcjaOdpowiedzi odpowiedz4 = new KolekcjaOdpowiedzi(odpTypFoto);
        String tresc4 = "Do jakiego typu fotografii obiektyw bedzie najczęściej używany?";
        Pytanie pytanie4 = new Pytanie(tresc4, odpowiedz4);
        pytania.add(pytanie4);
    
        KolekcjaOdpowiedzi odpowiedz5 = new KolekcjaOdpowiedzi(odpTakNie);
        String tresc5 = "Czy obiektyw ma być uszczelniony?";
        Pytanie pytanie5 = new Pytanie(tresc5, odpowiedz5);
        pytania.add(pytanie5);
        
        KolekcjaOdpowiedzi odpowiedz55 = new KolekcjaOdpowiedzi(odpTakNie);
        String tresc55 = "Czy obiektyw musi mieć funkcję redukcji drgań?";
        Pytanie pytanie55 = new Pytanie(tresc55, odpowiedz55);
        pytania.add(pytanie55);
        
        ArrayList<Integer> odpZakresCen = new ArrayList<>(
            Arrays.asList(300,500,1000,1500,3000,100000));
        KolekcjaOdpowiedzi odpowiedz6 = new KolekcjaOdpowiedzi(odpZakresCen);
        String tresc6 = "Podaj zakres cenowy";
        Pytanie pytanie6 = new Pytanie(tresc6, odpowiedz6);
        pytania.add(pytanie6);

        KolekcjaOdpowiedzi odpowiedz7 = new KolekcjaOdpowiedzi(odpTakNie);
        String tresc7 = "Czy obiektyw może być spoza systemu (producenta niezależnego)?";
        Pytanie pytanie7 = new Pytanie(tresc7, odpowiedz7);
        pytania.add(pytanie7);
    }
}