package animals;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animali> animali = new ArrayList<>();
        ArrayList<Volante> volanti = new ArrayList<>();
        
        animali.add(new Cane("Cane"));
        
        Pappagallo p = new Pappagallo("Pappagallo");
        animali.add(p);
        volanti.add(p);

        for (Animali a : animali) {
            a.stampaInfo();
            a.verso();
        }

        for (Volante v : volanti) {
            v.vola();
            v.sbatteali();
            v.atterra();
        } 
    }
}
