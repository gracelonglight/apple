import java.util.Scanner;
import java.util.Random;

public class Ex05_1 {
  public static void main(String[] args) {

    Random r = new Random();
    Scanner scanner = new Scanner(System.in);

    int user, com, count = 0;

    while (true){
      System.out.print("숫자 몇개 외칠꺼얌? :");
      user = scanner.nextInt();

      if( user > 3 || user <1 ){
        System.out.println("1~3까지 입력하세요");
        continue;
      }
      else{
        for(int i=1; i<=user; i++){
          count += 1;
          System.out.print(count + " ");
        }
        if(count >= 31){
          System.out.println();
          System.out.println("컴퓨터가 이겼습니다.");
          break;  
        }

        com = r.nextInt(3)+1;
        System.out.println();
        System.out.println("컴퓨터의 숫자 : " + com);
        for(int i=1; i<=com; i++){
          count += 1;
          System.out.print(count + " ");
        }
        if(count >= 31){
          System.out.println();
          break;
        }
      }
    }
  }
}
        