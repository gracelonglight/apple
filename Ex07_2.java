import java.util.Random;
import java.util.Scanner;

public class Ex07_2 {
  public static void main(String[] args) {
    
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    String ran[] = {"가위" , "바위" ,"보"};

    while (true){
    System.out.println("나의 가위/바위/보:");
    String me = scanner.next();

    int com = (int)(Math.random() * 3);
    System.out.println("컴퓨터의 가위/바위/보 : " + ran[com]);

     if (me.equals("가위")){
      if(com==0){
        System.out.println("비겼습니다-.-");
      }else if(com==1){
        System.out.println("졌습니다");
      }else{
        System.out.println("이겼습니다^^");
        break;
      }
      if (me.equals("바위")){
        if(com==0){
          System.out.println("이겼습니다^^");
          break;
        }else if(com==1){
          System.out.println("비겼습니다-.-");
        }else
          System.out.println("졌습니다");
    }
      if (me.equals("보")){
       if(com==0){
          System.out.println("졌습니다");
         }else if(com==1){
          System.out.println("이겼습니다^^");
          break;
      }else{
        System.out.println("비겼습니다-.-");
      }
    }
  }
}
}
}

  

