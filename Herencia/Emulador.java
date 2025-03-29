import java.util.List;
import java.util.Scanner;

public class Emulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear marcas y juegos
        Marca nintendo = new Marca("Nintendo");
        Marca sega = new Marca("Sega");
        Marca mame = new Marca("Mame");
        
        Juego mario = new Juego("Super Mario Bros 1");
        mario.agregarPersonaje(new Personaje("Mario"));
        mario.agregarPersonaje(new Personaje("Luigi"));
        mario.agregarItem(new Item("Hongo"));
        mario.agregarItem(new Item("Flor de fuego"));
        mario.agregarEscenario(new Escenario("Mundo 1-1"));
        mario.agregarEscenario(new Escenario("Castillo de Bowser"));
        nintendo.agregarJuego(mario);
        
        Juego donkeyKong = new Juego("Donkey Kong");
        donkeyKong.agregarPersonaje(new Personaje("Donkey Kong"));
        donkeyKong.agregarPersonaje(new Personaje("Jumpman"));
        donkeyKong.agregarItem(new Item("Barril"));
        donkeyKong.agregarItem(new Item("Martillo"));
        donkeyKong.agregarEscenario(new Escenario("Fábrica"));
        donkeyKong.agregarEscenario(new Escenario("Construcción"));
        nintendo.agregarJuego(donkeyKong);
        
        Juego goldenAxe = new Juego("Golden Axe");
        goldenAxe.agregarPersonaje(new Personaje("Ax Battler"));
        goldenAxe.agregarPersonaje(new Personaje("Tyris Flare"));
        goldenAxe.agregarItem(new Item("Poción mágica"));
        goldenAxe.agregarItem(new Item("Espada"));
        goldenAxe.agregarEscenario(new Escenario("Aldea saqueada"));
        goldenAxe.agregarEscenario(new Escenario("Castillo de Death Adder"));
        sega.agregarJuego(goldenAxe);
        
        Juego pacman = new Juego("Pacman");
        pacman.agregarPersonaje(new Personaje("Pac-Man"));
        pacman.agregarPersonaje(new Personaje("Blinky"));
        pacman.agregarItem(new Item("Cereza"));
        pacman.agregarItem(new Item("Píldora de poder"));
        pacman.agregarEscenario(new Escenario("Laberinto Clásico"));
        pacman.agregarEscenario(new Escenario("Nivel de bonus"));
        mame.agregarJuego(pacman);
        
        List<Marca> marcas = List.of(nintendo, sega, mame);
        
        while (true) {
            System.out.println("\nMenú Principal");
            System.out.println("1. Nintendo");
            System.out.println("2. Sega");
            System.out.println("3. Mame");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            if (opcion == 4) break;
            
            if (opcion >= 1 && opcion <= 3) {
                Marca seleccionada = marcas.get(opcion - 1);
                seleccionada.mostrarJuegos();
                System.out.print("Seleccione un juego para ver detalles o 0 para volver: ");
                int juegoOpcion = scanner.nextInt();
                if (juegoOpcion > 0 && juegoOpcion <= seleccionada.juegos.size()) {
                    seleccionada.juegos.get(juegoOpcion - 1).mostrarDetalles();
                }
            }
        }
        scanner.close();
    }
}
