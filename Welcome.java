import java.util.Scanner;

public class Welcome{
      public static void main(String[] args) {
            System.out.println("Welcome to Shopping Mall");
            System.out.println("Welcome to Book Maeket!");
            Scanner input = new Scanner(System.in);

            System.out.print("당신의 이름을 입력하세요:");
            String username = input.next();

            System.out.print("연락처를 입력하세요 :");
            int userMobile = input.nextInt();

            String greeting = "Welcome to Shopping Mall";
            String tagline = "Welcome to Book Maeket!";

            System.out.println("***********************");
            System.out.println("\t"+greeting);
            System.out.println("\t\"+tagline");
            System.out.println("***********************");
            System.out.println("1.고객 정보 확인하기 \4. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
            System.out.println("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
            System.out.println("7. 장바구니 비우기 \t8. 종료");
            System.out.println("***********************");
            
            System.out.print("메뉴 번호를 선택해주세요 ");
            int n = input.nextInt();
            System.out.println(n +"번을 선택했습니다");

      }
}