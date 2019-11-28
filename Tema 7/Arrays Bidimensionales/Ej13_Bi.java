public class Ej13_Bi {
  public static void main(String[] args) {

  	//Crea los arrays necesarios
  	String[] pais = {"España", "Rusia", "Japón", "Australia"};
  	int[][] estatura = new int [4][10];
    System.out.println("Calculo la estatura media, mínima y máxima de varios paises");

    //Rellena el array bidimensional
    for (int i = 0; i < 4; i++) {
    	for (int x = 0; x < 10; x++) {
    		estatura[i][x] = (int) (Math.random() * (210 - 140 + 1)) + 140;
    	}
    }

    //Muestra el resultado y calcula la media
    System.out.printf("%64s\n", "MED MIN MAX");

    for (int i = 0; i < 4; i++) {
      int minimo = 210;
      int maximo = 140;
      int suma = 0;

      System.out.printf("%9s:", pais[i]);
      
      for (int medEstatura : estatura[i]) {
        System.out.printf("%4d", medEstatura);
        maximo = medEstatura > maximo ? medEstatura : maximo;
        minimo = medEstatura < minimo ? medEstatura : minimo;
        suma += medEstatura;
     	}
      
      System.out.printf(" |%4d%4d%4d\n", suma / 10, minimo, maximo);
  	}
  }
}