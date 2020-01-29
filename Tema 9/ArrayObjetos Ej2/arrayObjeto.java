package arrayObjeto;

public class arrayObjeto {

    public static void main(String[] args) {

        //Crea el array y variables
        Gato[] gato = new Gato[4];
        int i;

        //Rellena el array con objetos
        gato[0] = new Gato("Garfield", "naranja", "mestizo");
        gato[1] = new Gato("Snowflake", "gris", "persa");
        gato[2] = new Gato("Luna", "negro", "mestizo");
        gato[3] = new Gato("Bonjovi", "marrón", "anjora");

        //Muestra los datos de los gatos
        System.out.println("\nDatos de los gatos:");

        for (i = 0; i < 4; i++) {
            System.out.println("\nGato nº" + (i + 1));
            System.out.println("Nombre: " + gato[i].getNombre());
            System.out.println("Color: " + gato[i].getColor());
            System.out.println("Raza: " + gato[i].getRaza());
        }
    }

}
