import java.io.IOException;
import java.util.Scanner;


public class desafio {

    public static void main(String[] args) throws IOException {
      Scanner leitor = new Scanner(System.in);
      int n = leitor.nextInt();
      if( n <= 0){
        System.out.println("E");
      }
      if( n > 0 && n < 36){
        System.out.println("D");
      }
      if( n > 35 && n < 61){
        System.out.println("C");
      }
      if( n > 60 && n < 86){
        System.out.println("B");
      }
      if( n > 85 && n < 101){
        System.out.println("A");
    }
  }
}
