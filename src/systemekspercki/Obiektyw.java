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
    public String typFotografii;
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
        new SetAttribute() { public void set(String arg) { setTypFotografii(arg); } },
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
    public void setTypFotografii(String typFotografii) {
        this.typFotografii = typFotografii;
    }
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
        System.out.println("typ foto: " + typFotografii);
        System.out.println("uszczelniony: " + czyUszczelniony);
        System.out.println("stabilizacja: " + czyStabilizacja);
        System.out.println("cena: " + zakresCeny);
        System.out.println("spoza: " + czySpozaSystemu);
    }
    
    public String generujSQL(){
        return "SQL";
    }
    
}
