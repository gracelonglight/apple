import java.util.Scanner;

public class Ex07_3 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int year;

    System.out.print("출생연도를 입력하세요:");
    year = scanner.nextInt();

    switch(year%12) {
      case 0:
      System.out.print("원숭이");
      break;
      case 1:
      System.out.print("닭");
      break;
      case 2:
      System.out.print("개");
      break;
      case 3:
      System.out.print("돼지");
      break;
      case 4:
      System.out.print("쥐");
      break;
      case 5:
      System.out.print("소");
      break;
      case 6:
      System.out.print("호랑이");
      break;
      case 7:
      System.out.print("토끼");
      break;
      case 8:
      System.out.print("용");
      break;
      case 9:
      System.out.print("뱀");
      break;
      case 10:
      System.out.print("말");
      break;
      case 11:
      System.out.print("양");
      break;
      }
  }
}
