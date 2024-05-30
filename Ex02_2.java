import java.util.Scanner;

public class Ex02_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("19세 이상이면");
    int s = sc.nextInt();
    int c = 30;
    int ch =(s>19)? c: 21;
    System.out.printf("%s,%d", s,ch);

  }
}
