package animals;

public interface Volante {
void vola();//metodo
default void sbatteali() {
    System.out.println("Sbatte le ali!");
}
default void atterra() {
    System.out.println("Sto atterrando...");
}
}
