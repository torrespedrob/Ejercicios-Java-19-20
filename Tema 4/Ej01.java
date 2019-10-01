public class Ej01 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduce un dia de la semana para saber que asignatura toca (en minusculas): ");
    String dia = System.console().readLine();
    String asignatura;
    
    switch (dia) {
      case "lunes":
      asignatura = "programacion";
      break;
      case "martes":
      asignatura = "entornos de desarrollo";
      break;
      case "miercoles":
      asignatura = "programacion";
      break;
      case "jueves":
      asignatura = "programacion";
      break;
      case "viernes":
      asignatura = "sistemas informaticos";
      break;
      default:
      dia = "error";
      asignatura = "error";
    }
    if (dia.equals("error")) {
      System.out.println("Ha ocurrido un error");
    } else {
      System.out.println("El " + dia + " toca " + asignatura);
    }
  }
}
