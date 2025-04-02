
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
     Scanner losowe = new Scanner(System.in);
     System.out.print("Wpisz co chcesz (aby zakończyć naciśnij 'q'): ");

     while (true) {
      String input = losowe.nextLine();  
       if (input.equals("q"))  
         
      
        break;  
       {
         System.out.println("Wpisane losowe: " + input );
       }
       
       
    
     }
      System.out.println("Miłego dnia mordo");
    losowe.close();  
  }
}
