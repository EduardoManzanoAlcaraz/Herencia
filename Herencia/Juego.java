import java.util.ArrayList;
import java.util.List;

public class Juego {
    protected String nombre;
    protected List<Personaje> personajes = new ArrayList<>();
    protected List<Item> items = new ArrayList<>();
    protected List<Escenario> escenarios = new ArrayList<>();

    public Juego(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public void agregarItem(Item item) {
        items.add(item);
    }

    public void agregarEscenario(Escenario escenario) {
        escenarios.add(escenario);
    }

    public void mostrarDetalles() {
        System.out.println("\nDetalles del juego: " + nombre);
        System.out.println("Personajes:");
        personajes.forEach(p -> System.out.println("- " + p.nombre));
        System.out.println("Items:");
        items.forEach(i -> System.out.println("- " + i.nombre));
        System.out.println("Escenarios:");
        escenarios.forEach(e -> System.out.println("- " + e.nombre));
    }
}