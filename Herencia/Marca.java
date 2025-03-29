import java.util.ArrayList;
import java.util.List;

public class Marca {
    protected String nombre;
    protected List<Juego> juegos = new ArrayList<>();

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarJuego(Juego juego) {
        juegos.add(juego);
    }

    public void mostrarJuegos() {
        System.out.println("\nJuegos de " + nombre + ":");
        for (int i = 0; i < juegos.size(); i++) {
            System.out.println((i + 1) + ". " + juegos.get(i).nombre);
        }
    }
}