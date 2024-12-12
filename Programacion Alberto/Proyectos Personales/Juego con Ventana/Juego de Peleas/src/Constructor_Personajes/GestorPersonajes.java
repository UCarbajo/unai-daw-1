package Constructor_Personajes;

import java.util.ArrayList;

public class GestorPersonajes {

    private ArrayList<Personaje> clases;

    public GestorPersonajes() {
        clases = new ArrayList<Personaje>();
        
        clases.add(new Personaje("Guerrero", 180, 10, 20, 25, 3));
        clases.add(new Personaje("Mago", 100, 20, 40, 5, 3));
        clases.add(new Personaje("Asesino", 120, 15, 35, 10, 3));
        clases.add(new Personaje("Paladín", 150, 12, 25, 20, 3));
        clases.add(new Personaje("Clérigo", 200, 5, 15, 30, 3));
    }

    public ArrayList<Personaje> getClases() {
        return clases;
    }
}