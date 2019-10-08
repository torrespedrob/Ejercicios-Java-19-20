public class Ej15 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo dibujar pirámides de diferentes maneras");
    System.out.println("Introduce un caracter para rellenar la pirámide: ");
    String c = System.console().readLine();
    System.out.println("Ahora seleccione una opcion (1,2,3,4):");
    System.out.println("1.Vértice hacia arriba\n2.Vértice hacia abajo\n3.Vértice hacia la izquierda\n4.Vértice hacia la derecha");
    int vertice = Integer.parseInt(System.console().readLine());
    
    //Operaciones
    switch (vertice) {
      case 1:
      System.out.println("  " + c);
      System.out.println(" " + c + c + c);
      System.out.println(c + c + c + c +c);
      break;
      case 2:
      System.out.println(c + c + c + c +c);
      System.out.println(" " + c + c + c);
      System.out.println("  " + c);
      break;
      case 3:
        System.out.println("    " + c);
        System.out.println("  " + c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println("  " + c + " " + c);
        System.out.println("    " + c);
      break;
      case 4:
        System.out.println(c);
        System.out.println(c + " " + c);
        System.out.println(c + " " + c + " " + c);
        System.out.println(c + " " + c);
        System.out.println(c);
      break;
      default:
      System.out.println("Ha ocurrido un error");
    }
  }
}
