/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemekspercki;


public class Obiektyw {
    public String producent;
    public String matryca;
    public String ogniskowa;
    public String zakresOgniskowej;
    public String czyFishEye;
    public String czyUszczelniony;
    public String czyStabilizacja;
    public String czySpozaSystemu;
    public String zakresCeny;
    
    
//    private int dolnaGranicaOgniskowej;
//    private int gornaGranicaOgniskowej;
//    private boolean czyFisheye;
//    private TypFotografii fotografie[];
//    private boolean czyUszczelniony;
//    private double cenaMin;
//    private double cenaMax;
//    private boolean czySpozaSystemu;
    
    interface SetAttribute {
        void set(String arg);
    }
    
    private SetAttribute[] setters = new SetAttribute[] {
        new SetAttribute() { public void set(String arg) { setProducent(arg); } },
        new SetAttribute() { public void set(String arg) { setMatryca(arg); } },
        new SetAttribute() { public void set(String arg) { setOgniskowa(arg); } },
        new SetAttribute() { public void set(String arg) { setZakresOgniskowej(arg); } },
        new SetAttribute() { public void set(String arg) { setCzyFishEye(arg); } },
//        new SetAttribute() { public void set(String arg) { setTypFotografii(arg); } },
        new SetAttribute() { public void set(String arg) { setCzyUszczelniony(arg); } },
        new SetAttribute() { public void set(String arg) { setCzyStabilizacja(arg); } },
        new SetAttribute() { public void set(String arg) { setZakresCeny(arg); } },
        new SetAttribute() { public void set(String arg) { setCzySpozaSystemu(arg); } },
    };
    
    public void set(int index, String arg) {
        setters[index].set(arg);
    }
    public void setProducent(String producent){
        this.producent = producent;   
    }
    public void setMatryca(String matryca){
        this.matryca = matryca;
    }
    public void setOgniskowa(String ogniskowa){
        this.ogniskowa = ogniskowa;    
    }
    public void setZakresOgniskowej(String zakresOgniskowej) {
        this.zakresOgniskowej = zakresOgniskowej;
    }
    public void setCzyFishEye(String czyFishEye) {
        this.czyFishEye = czyFishEye;
    }
//    public void setTypFotografii(String typFotografii) {
//        this.typFotografii = typFotografii;
//    }
    public void setCzyUszczelniony(String czyUszczelniony) {
        this.czyUszczelniony = czyUszczelniony;
    }
    public void setCzyStabilizacja(String czyStabilizacja) {
        this.czyStabilizacja = czyStabilizacja;
    }
    public void setCzySpozaSystemu(String czySpozaSystemu) {
        this.czySpozaSystemu = czySpozaSystemu;
    }
    public void setZakresCeny(String zakresCeny) {
        this.zakresCeny = zakresCeny;
    }
    
    public void wysietl(){
        System.out.println("OBIEKTYW:");
        System.out.println("producent: " + producent);
        System.out.println("matryca: " + matryca);
        System.out.println("ogniskowa: " + ogniskowa);
        System.out.println("zakres: " + zakresOgniskowej);
        System.out.println("fish-eye: " + czyFishEye);
//        System.out.println("typ foto: " + typFotografii);
        System.out.println("uszczelniony: " + czyUszczelniony);
        System.out.println("stabilizacja: " + czyStabilizacja);
        System.out.println("cena: " + zakresCeny);
        System.out.println("spoza: " + czySpozaSystemu);
    }
    
    public String generujSQL(){
        String SQL = "";
        String poczatek = "SELECT * FROM OBIEKTYWY WHERE";
        
        SQL += poczatek;
        
        String producentString = "";
        if (czySpozaSystemu.equals("tak")){
            String inni = " OR PRODUCENT = 'Tamron' OR PRODUCENT = 'Sigma' OR PRODUCENT = 'Samyang'";
            producentString =" (" + "PRODUCENT = " + "'" + this.producent + "'" + inni + ")";
            
        }else{
            producentString = " PRODUCENT= " + "'" + this.producent + "'";
        }
        SQL += producentString;
        
        
        String ogniskowaString ="";
        if(ogniskowa.equals("stalo ogniskowy")){
            ogniskowaString = " AND DOLNA_OGNISKOWA = GORNA_OGNISKOWA ";
        }else{
            ogniskowaString = " AND DOLNA_OGNISKOWA != GORNA_OGNISKOWA ";
        }
        SQL += ogniskowaString;
        
        String zakresOgniskowejString = "";
        switch(zakresOgniskowej){
            case "do 35mm":
                zakresOgniskowejString = " AND GORNA_OGNISKOWA < 35";
                break;
            case "36-70mm":
                zakresOgniskowejString = " AND ((DOLNA_OGNISKOWA > 36 AND DOLNA_OGNISKOWA < 70) OR (GORNA_OGNISKOWA > 36 AND GORNA_OGNISKOWA < 70)) ";
                break;
            case "71-200mm":
                zakresOgniskowejString = " AND ((DOLNA_OGNISKOWA >= 70 AND DOLNA_OGNISKOWA <= 200) OR (GORNA_OGNISKOWA >= 70 AND GORNA_OGNISKOWA <= 200)) ";
                break;
            case "ponad 200mm":
                zakresOgniskowejString = "AND (DOLNA_OGNISKOWA > 200 OR GORNA_OGNISKOWA > 200)";
                break;
        }
        
         SQL += zakresOgniskowejString;
        
        String czyFishEyeString = "";
        if(czyFishEye.equals("tak")){
            czyFishEyeString = " AND FISHEYE = 1";
            return poczatek + producentString + ogniskowaString + czyFishEyeString;
        }else{
            czyFishEyeString = " AND FISHEYE = 0";
        }
        
        SQL += czyFishEyeString;
            
        String czyUszczelnionyString = "";
        if(czyUszczelniony.equals("tak")){
            czyUszczelnionyString = " AND USZCZELNIONY = 1";
            SQL += czyUszczelnionyString;
        }
        
        String czyStabilizacjaString = "";
        if(czyStabilizacja.equals("tak")){
            czyStabilizacjaString = " AND REDUKCJA_DRGAN = 1";
             SQL += czyStabilizacjaString;
        }
        
        String zakresCenyString = "";
        switch(zakresCeny){
            case "50-300zl":
                zakresCenyString = " AND CENA < 300";
                break;
            case "300-500zl":
                zakresCenyString = " AND (CENA >= 300 AND CENA < 500)";
                break;
            case "500-1000zl":
            	zakresCenyString = " AND (CENA >= 500 AND CENA < 1000)";
                break;
            case "1000-1500zl":
                zakresCenyString = " AND (CENA >= 1000 AND CENA < 1500)";
                break;
            case "1500-3000zl":
            	zakresCenyString = " AND (CENA >= 1500 AND CENA < 3000)";
                break;
            case "ponad 3000zl":
            	zakresCenyString = " AND  CENA >= 3000";
                break;
            case "bez znaczenia":
                zakresCenyString = "";
        }
        
        return SQL;
    }
    
}
