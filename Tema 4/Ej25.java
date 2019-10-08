public class Ej25 {
  public static void main(String[] args) {
    //Entrada
    System.out.print("Venta de Banderas: ");
    System.out.print("Introduce la altura de la bandera en cm: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduce la anchura: ");
    int anchura = Integer.parseInt(System.console().readLine());
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    boolean conEscudo = (System.console().readLine().toLowerCase()).equals("s");
    String escudoCadena;
    float precioEscudo;
    
    if (conEscudo) {
      escudoCadena = "Tiene escudo";
      precioEscudo = 2.50f;
    } else {
      escudoCadena = "Sin escudo";
      precioEscudo = 0;
    }

    //Desglose
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.printf("Bandera de %5d cm2: %8.2f €\n", anchura * altura, (float)anchura * altura / 100);
    System.out.printf("%s: %8.2f €\n", escudoCadena, precioEscudo);
    System.out.printf("Gastos de envío: %8.2f €\n", 3.25);
    System.out.printf("Total: %8.2f €\n", (float)anchura * altura / 100 + precioEscudo + 3.25);
  }
}
