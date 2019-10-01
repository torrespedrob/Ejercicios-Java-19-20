public class Ej02 {
  public static void main(String[] args) {
    System.out.print("Introduce una hora del dia (de 0 a 23): ");
    int horaIntroducida = Integer.parseInt(System.console().readLine());
    
    //Respuesta segun el tramo horario
    if ((horaIntroducida >= 6) && (horaIntroducida <= 12)) {
      System.out.println("Buenos días.");
    }
    if ((horaIntroducida >= 13) && (horaIntroducida <= 20)) {
      System.out.println("Buenas tardes.");
    }
    if (((horaIntroducida <= 5) && (horaIntroducida >= 0)) || ((horaIntroducida >= 21) && (horaIntroducida < 24))) {
      System.out.println("Buenas noches. Por favor, acuéstate");
    }
    if ((horaIntroducida >= 24) || (horaIntroducida < 0)) {
      System.out.println("Ha ocurrido un error.");
    }
  }
}
