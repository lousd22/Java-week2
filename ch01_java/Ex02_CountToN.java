import java.util.Scanner;

public class Ex02_CountToN{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number to count to: ");

        int max = reader.nextInt();
        System.out.println("Now Counting...");

        for (int i=0; i<=max; i++){
            System.out.println(i);
        }
         reader.close();
    }
   
  
}
