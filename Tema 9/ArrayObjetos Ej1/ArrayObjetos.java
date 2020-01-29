package arrayobjetos;

import java.util.Scanner;

public class ArrayObjetos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Creación de array y variables
        Gato[] gato = new Gato[4];
        int i;
        System.out.println("\nVaya introduciendo la informacion de los gatos.");

        for (i = 0; i < 4; i++) { //Informacion de 4 gatos
            gato[i] = new Gato();
            System.out.println("  \nGato nº " + (i + 1));
            System.out.print("Nombre: ");
            gato[i].setNombre(s.nextLine());
            System.out.print("Color: ");
            gato[i].setColor(s.nextLine());
            System.out.print("Raza: ");
            gato[i].setRaza(s.nextLine());
        }
        
        //Muestra la informacion introducida
        System.out.println("\n\nDatos de los gatos.");

        for (i = 0; i < 4; i++) {
            System.out.println("\nGato nº" + (i + 1));
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Color: " + gato[i].getColor());
            System.out.println("Raza: " + gato[i].getRaza());
        }
    }
}
