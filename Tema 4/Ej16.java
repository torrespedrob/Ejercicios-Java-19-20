public class Ej16 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Test de fidelidad");
    System.out.println("Responde a las siguientes preguntas para comprobar el posible estado de tu relación");
    int puntos = 0;
    String respuesta;
    
    //Preguntas
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("2. Ha aumentado sus gastos de vestuario.(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil.(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado.(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("9. Has notado que últimamente se perfuma más.(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.(v/n): ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }
    
    //Final
    if (puntos <= 10) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if (puntos <= 22) {
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if (puntos > 22) {
      System.out.println("Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
    
    
  }
}
