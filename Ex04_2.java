import java.util.Scanner;

public class Ex04_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String e = scanner.next();
    
    System.out.print("입장료를 입력하세요");
    int userInput = scanner.nextInt();

    System.out.print("나이를 입력하세요");
    

    String result = ( "남자","여자");
    if (userInput >= 20){
      System.out.printf("%d",userInput);
    } else if (userInput <=30){
      System.out.printf("%d", userInput);

    }

  }
}
