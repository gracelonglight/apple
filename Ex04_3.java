import java.util.Scanner;

public class Ex04_3 {
  public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.print("점수 입력 받음:");
    int a = Scanner.nextInt();
    int score = Scanner.nextInt();
    if(score > 90){
      System.out.printf("금메달",score);
    } else if(score > 80){
      System.out.printf("은메달",score);
    }
      else if(score > 70){
      System.out.printf("동메달",score);
      }
      else if(score < 60){
      System.out.printf("메달이 없습니다",score);
      }
    }
  }

