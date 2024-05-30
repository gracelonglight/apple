import java.util.Scanner;

public class cho_02{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int cho1 = scanner.nextInt();
    int a = 0;
    int b = 0;
for (int i = 2; i < 10; i++){
     for(int j = 1; j < 10; j++)
  System.out.printf("%d *  %d = %d\n", i , j, i*j);
}
System.out.println("무한 반복문 탈출");
  }
} 