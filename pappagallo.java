package animals;

public class Pappagallo extends Animali implements Volante{
    
    public Pappagallo(String nome) {
        super(nome);
    }
    
    //@override
    
    public void verso() {
        System.out.println("Il pappagallo parla!");
    }
   public void vola() {
       System.out.println("Il pappagallo vola.");
   }
}
