public class Ej03 {
  public static void main(String[] args) {
    System.out.print("Introduce un numero del 1 al 7: ");
    String dia;
    int numero = Integer.parseInt(System.console().readLine());
    
    switch(numero) {
      case 1:
        dia = "lunes";
        break;
      case 2:
        dia = "martes";
        break;
      case 3:
        dia = "miércoles";
        break;
      case 4:
        dia = "jueves";
        break;
      case 5:
        dia = "viernes";
        break;
      case 6:
        dia = "sábado";
        break;
      case 7:
        dia = "domingo";
        break;
      default:
        dia = "Tienes que introducir un numero del 1 al 7.";
    }
    System.out.println(dia);
  }
}
