import java.util.Scanner;

public class Ex06_2 {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String prind[] = new String [3];

    System.out.println("3개 문자열을 입력하세요.");

    for(String i:prind){
      for(int k=0;k<3;k++){
        prind[k]=scanner.next();
      }
      System.out.print("Hello Java Program");
    }
  }
}
