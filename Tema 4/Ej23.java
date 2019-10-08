public class Ej23 {
  public static void main(String[] args) {
    //Entrada
    System.out.print("Puedo calcular el precio final de un producto");
    System.out.print("Introduzce la base imponible: ");
    double baseImponible = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el tipo de iva (general, reducido o superreducido): ");
    String tipoIVA = System.console().readLine();
    System.out.print("Introduzce el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigo = System.console().readLine();
    //Switch iva seleccionado
    int idTipoIva = 0;
    switch(tipoIVA) {
      case "general":
        idTipoIva = 21;
        break;
      case "reducido":
        idTipoIva = 10;
        break;
      case "superreducido":
        idTipoIva = 4;
        break;
      default:
        System.out.println("Error al introducir el tipo de IVA.");
    }
    
    double iva = baseImponible * idTipoIva / 100;
    double precioOriginal = baseImponible + iva;
    double descuento = 0;
    
    //Lista de códigos
    switch(codigo) {
      case "nopro":
        break;
      case "mitad": 
        descuento = precioOriginal / 2;
        break;
      case "meno5": 
        descuento = 5;
        break;
      case "5porc": 
        descuento = precioOriginal * 0.05;
        break;
      default:
        System.out.println("El código promocional introducido no es correcto.");
    }
    
    //Salida de factura
    double total = precioOriginal - descuento;
    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA (%2d%%) %8.2f\n", idTipoIva, iva);
    System.out.printf("Precio con IVA %8.2f\n", precioOriginal);
    System.out.printf("Cód. promo. (%5s) -%8.2f\n", codigo, descuento);
    System.out.printf("TOTAL %8.2f", total);
  }
}
