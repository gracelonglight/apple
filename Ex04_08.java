import java.util.Scanner;

public class Ex04_08 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int gunhee = scanner.nextInt();
    int gunhee2 = scanner.nextInt();

    while(gunhee2<10){
      System.out.printf("%d * %d = %d\n", gunhee , gunhee2 , gunhee*gunhee2);
      gunhee2++;
  }
}
}