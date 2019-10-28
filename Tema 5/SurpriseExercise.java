import java.util.Scanner;

public class SurpriseExercise {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int height;
    String character; 
    int heightIncrement;
    int numberOfHourglass;
    
    do {
      System.out.print("Enter a starting height: ");
      height = sc.nextInt();
      sc.nextLine();
      if ((height < 3) || (height % 2 == 0)) {
        System.out.println("Wrong input... It should be odd and larger or equal than 3");
      }
      
    } while (height < 3 || height % 2 == 0);
    
    System.out.print("Enter a character for drawing: ");
    character = sc.nextLine();
    
    do {
      System.out.print("Enter the increment of the height: ");
      heightIncrement = sc.nextInt();
      
      if (heightIncrement % 2 != 0) {
        System.out.println("Only even numbers allowed");
      }
    } while (heightIncrement % 2 != 0);
    
    
    System.out.print("Enter the number of hourglass that you want: ");
    numberOfHourglass = sc.nextInt();
    
    for (int y = 0; y < numberOfHourglass; y++) {
    
      for (int i = 0; i < height / 2 + 1; i++) {
       
       
        for (int k = 0; k < i; k++) {
          System.out.print(" ");
         
        }
       
        for (int j = 1; j <= height - 2 * i; j++) {
          System.out.print(character);
         
         
        }
       
        System.out.println();
       
      }
     
      for (int i = 0; i < height / 2; i++) {
       
       
        for (int k = height / 2 - 1; k > i; k--) {
          System.out.print(" ");
         
        }
       
        for (int j = 0; j <= 2 + i * 2; j++) {    
          System.out.print(character);
         
         
        }
       
        System.out.println();
       
      }
     
      System.out.println();
      height += heightIncrement;
    
    }
    
   
    
  }
}
