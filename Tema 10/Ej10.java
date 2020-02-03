package Ej10;

import java.util.HashMap;
import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        //Crea variables e inicia el scaner
        boolean running = true;
        Scanner s = new Scanner(System.in);
        String entrada;
        //Diccionario
        HashMap<String, String> m = new HashMap<>();
        m.put("agua", "water");
        m.put("sol", "sun");
        m.put("hierba", "grass");
        m.put("piscina", "pool");
        m.put("ascensor", "elevator");
        m.put("mascota", "pet");
        m.put("sombra", "shadow");
        m.put("fuego", "fire");
        m.put("oreja", "ear");
        m.put("funda", "case");
        m.put("piel", "skin");
        m.put("papel", "paper");
        m.put("cuaderno", "notebook");
        m.put("microondas", "microwave");
        m.put("mesa", "table");
        m.put("puerta", "door");
        m.put("terremoto", "earthquake");
        m.put("coche", "car");
        m.put("zapatos", "shoes");
        m.put("ordenador", "computer");

        System.out.println("Diccionario: \n" + m);

        while (running) {
            System.out.print("Introduce una palabra en espanol: ");
            entrada = s.nextLine();
            if (m.containsKey(entrada)) {
                System.out.println(entrada + " en inglés es " + m.get(entrada));
            } else if (entrada.equals("salir")) {
                running = false;
            }

        }
    }

}
