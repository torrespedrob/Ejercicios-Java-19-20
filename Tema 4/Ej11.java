public class Ej11 {
  public static void main(String[] args) {
    //Entrada
    System.out.println("Puedo calcular cuanto tiempo falta hasta medianoche");
    System.out.print("Introduce la hora: ");
    int hora = Integer.parseInt(System.console().readLine());  
    System.out.print("Introduce los minutos: ");
    int minuto = Integer.parseInt(System.console().readLine());

    //Cálculo
    int segundosPasados = (hora * 3600) + (minuto * 60);
    int segundosNecesarios = (24 * 3600) - segundosPasados;
    
    //Salida
    System.out.println("Desde las " + hora + ":" + minuto + " hasta medianoche quedan " + segundosNecesarios + " segundos.");
  }
}
