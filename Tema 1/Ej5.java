public class Ej5 { // Clase principal
  public static void main(String[] args) {
    System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES");
    System.out.println("\033[33mPRO        \033[31mEDD        \033[33mPRO        \033[33mPRO        \033[34mSINF   ");
    System.out.println("\033[33mPRO        \033[35mLM         \033[33mPRO        \033[33mPRO        \033[34mSINF   ");
    System.out.println("\033[33mPRO        \033[35mLM         \033[33mPRO        \033[31mEED        \033[34mSINF   ");
    System.out.println("\033[37m");
    System.out.printf("%28s\n", "RECREO");
    System.out.println();
    System.out.println("\033[32mBBDD       \033[34mSINF       \033[32mBBDD       \033[31mEED        \033[37mFOL    ");
    System.out.println("\033[32mBBDD       \033[34mSINF       \033[32mBBDD       \033[35mLM         \033[37mFOL    ");
    System.out.println("\033[32mBBDD       \033[34mSINF       \033[32mBBDD       \033[35mLM         \033[37mFOL    ");
  }
}
