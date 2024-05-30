import java.util.Scanner;

public class Ex04_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("상세를 입력하세요");
    int a = sc.nextInt();
    String d = sc.next();
    if (d >=19) {
        a="성인";
      System.out.printf("성인입니다");
    else { 
      System.out.printf("청소년 입니다");
    }

    }
  }
}
