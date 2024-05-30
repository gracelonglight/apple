import java.util.Scanner;

public class Ex03_01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("숫자를 입력하세요");
    int d = sc.nextInt();
    if (d%2 == 0) {
      System.out.printf("짝수","홀수",d);
  }
}
}

