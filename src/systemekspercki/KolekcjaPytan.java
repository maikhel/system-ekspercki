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
    
    public void zadawajPytania(Obiektyw obiektyw){
        for(int i = 0; i< pytania.size(); i++){
            System.out.println("I: >>>" + i);
            if(i == 1 && obiektyw.producent.equals("Pentax")) i=2;
            if(i == 4 && !obiektyw.zakresOgniskowej.equals("do 35mm")) i=5;
            if(i == 5 && obiektyw.czyFishEye != null && obiektyw.czyFishEye.equals("tak")) i = 8;
            if(i == 6 && obiektyw.producent.equals("Pentax")) i++;
            
            Pytanie p = (Pytanie) pytania.get(i);
            p.wyswietlTresc();
            p.wyswietlOdpwiedzi();
            p.getOdpowiedz();
            p.wyswietlWybranaOdpowiedz();
            obiektyw.set(i, p.wybranaOdpowiedz());
        }
    }
    
    private void stworzPytania(){
        ArrayList<String> odpTakNie = new ArrayList<>(
        Arrays.asList("tak", "nie"));
        
        //pytanie 1, i = 0
        ArrayList<String> odpProducent = new ArrayList<>(
        Arrays.asList("Canon", "Nikon", "Pentax"));
        KolekcjaOdpowiedzi odpowiedz1 = new KolekcjaOdpowiedzi(odpProducent);
        String tresc1 = "Aparat jakiego producenta posiadasz?";
        Pytanie pytanie1 = new Pytanie(tresc1, odpowiedz1);
        pytania.add(pytanie1);
        
        //pytanie 1.5, i = 1
        ArrayList<String> odpMatryca = new ArrayList<>(
        Arrays.asList("APS-C", "Pelna klatka"));
        KolekcjaOdpowiedzi odpowiedz11 = new KolekcjaOdpowiedzi(odpMatryca);
        String tresc11 = "W jaką matrycę wyposażony jest aparat?";
        Pytanie pytanie11 = new Pytanie(tresc11, odpowiedz11);
        pytania.add(pytanie11);

        //pytanie 2, i = 2
        ArrayList<String> odpOgniskowe = new ArrayList<>(
                Arrays.asList("stalo ogniskowy", "zmienno ogniskowy"));
        KolekcjaOdpowiedzi odpowiedz2 = new KolekcjaOdpowiedzi(odpOgniskowe);
        String tresc2 = "Obiektyw ma być stało czy zmienno ogniskowy?";
        Pytanie pytanie2 = new Pytanie(tresc2, odpowiedz2);
        pytania.add(pytanie2);
        
        //pytanie 3, i = 3
        ArrayList<String> odpZakresOgniskowych = new ArrayList<>(
                Arrays.asList("do 35mm", "36-70mm", "71-200mm", "ponad 200mm"));
        KolekcjaOdpowiedzi odpowiedz3 = new KolekcjaOdpowiedzi(odpZakresOgniskowych);
        String tresc3 = "Jaki zakres ogniskowych w obiektywie?";
        Pytanie pytanie3 = new Pytanie(tresc3, odpowiedz3);
        pytania.add(pytanie3);
        
        //pytanie 3.5, i = 4
        KolekcjaOdpowiedzi odpowiedz33 = new KolekcjaOdpowiedzi(odpTakNie);
        String tresc33 = "Czy obiektyw typu Fish-Eye?";
        Pytanie pytanie33 = new Pytanie(tresc33, odpowiedz33);
        pytania.add(pytanie33);
        
        //pytanie 4 - USUNIETE
//        ArrayList<String> odpTypFoto = new ArrayList<>(
//                Arrays.asList("krajobrazy", "portrety", "makro",
//                "sport", "reportaż", "uniwersalny"));
//        KolekcjaOdpowiedzi odpowiedz4 = new KolekcjaOdpowiedzi(odpTypFoto);
//        String tresc4 = "Do jakiego typu fotografii obiektyw bedzie najczęściej używany?";
//        Pytanie pytanie4 = new Pytanie(tresc4, odpowiedz4);
//        pytania.add(pytanie4);
        
        //pytanie 5, i = 5
        KolekcjaOdpowiedzi odpowiedz5 = new KolekcjaOdpowiedzi(odpTakNie);
        String tresc5 = "Czy obiektyw musi być uszczelniony?";
        Pytanie pytanie5 = new Pytanie(tresc5, odpowiedz5);
        pytania.add(pytanie5);
        
        //pytanie 5.5, i = 6
        KolekcjaOdpowiedzi odpowiedz55 = new KolekcjaOdpowiedzi(odpTakNie);
        String tresc55 = "Czy obiektyw musi mieć funkcję redukcji drgań?";
        Pytanie pytanie55 = new Pytanie(tresc55, odpowiedz55);
        pytania.add(pytanie55);
        
       //pytanie 6, i = 7
        ArrayList<String> odpZakresCen = new ArrayList<>(
                Arrays.asList("50-300zl", "300-500zl", "500-1000zl",
                        "1000-1500zl", "1500-3000zl", "ponad 3000zl", "bez znaczenia"));
        KolekcjaOdpowiedzi odpowiedz6 = new KolekcjaOdpowiedzi(odpZakresCen);
        String tresc6 = "Podaj zakres cenowy";
        Pytanie pytanie6 = new Pytanie(tresc6, odpowiedz6);
        pytania.add(pytanie6);
        
        
        //pytanie 7, i = 8
        KolekcjaOdpowiedzi odpowiedz7 = new KolekcjaOdpowiedzi(odpTakNie);
        String tresc7 = "Czy obiektyw może być spoza systemu (producenta niezależnego)?";
        Pytanie pytanie7 = new Pytanie(tresc7, odpowiedz7);
        pytania.add(pytanie7);
    }
}