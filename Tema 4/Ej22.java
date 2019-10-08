public class Ej22 {
  public static void main(String[] args) {
    //Entrada
    System.out.print("Introduce un dia de la semana(lunes a viernes): ");
    String dia = System.console().readLine();
    int unidad = 0;

    switch(dia) {
      case "lunes":
        unidad = 0;
        break;
      case "martes":
        unidad = 1;
        break;
      case "miércoles":
      case "miercoles":
        unidad = 2;
        break;
      case "jueves":
        unidad = 3;
        break;
      case "viernes":
        unidad = 4;
        break;
      default:
        System.out.print("Ha ocurrido un error");
    }
    
    System.out.println("Introduce la hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    //Cálculo
    int numeroMinutos = (4 * 24 * 60) + (15 * 60);
    int minutosActuales = (unidad * 24 * 60) + (horas * 60) + minutos;
    System.out.print("Quedan " + (numeroMinutos - minutosActuales) + " minutos para el fin de semana.");
  }
}
