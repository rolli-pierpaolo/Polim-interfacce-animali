package animals;

public abstract class Animali {
    String specie;
    public Animali(String specie) {
        this.specie=specie;
    }
    String getSpecie() {
        return specie;
    }
    public void stampaInfo() {
        System.out.println("L'animale é un :"+ getSpecie());
    }
    public abstract void verso();
     
  
    
}
