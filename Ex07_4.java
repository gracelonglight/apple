import java.util.Scanner;

public class Ex07_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a,b,c;
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    if(a == b && a == c){
      System.out.println(2);
    }
  }
}
