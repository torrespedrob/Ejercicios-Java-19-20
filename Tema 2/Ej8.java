public class Ej8 {
  public static void main(String[] args) {
    char caracter1 = 'a';
    char caracter2 = 'b';
    char caracter3 = 'c';
    char caracter4 = 'd';
    char caracter5 = 'e';
    
    String cadena = "" + caracter1 + caracter2 + caracter3 + caracter4 + caracter5;
    /*Al poner "" evitamos que se almacene el valor numerico en el String,
     * en su lugar se almacenan los caracteres como tal.*/
    System.out.println(cadena);
  }
}
