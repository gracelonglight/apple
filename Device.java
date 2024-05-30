import java.util.ArrayList;
import java.util.Scanner;

public class Device {
    private Order order = new Order();
    private ArrayList<Menu> categoryMenu = new ArrayList<Menu>();
    private ArrayList<Product> allProducts = new ArrayList<Product>();
    private ArrayList<Product> categoryProduct = new ArrayList<Product>();
    private double revenue;

    public void LoadMenu(){
        Menu coffeeMenu = new Menu("Coffee","아메리카노");
        Menu lotteMenu = new Menu("Lotte","라떼");
        Menu beverageMenu = new Menu("Beverage","음료");
        Menu teaMenu = new Menu("Tea","티");
        Menu bakeryMenu = new Menu("Bakery","빵");
        categoryMenu.add(coffeeMenu);
        categoryMenu.add(lotteMenu);
        categoryMenu.add(beverageMenu);
        categoryMenu.add(teaMenu);
        categoryMenu.add(bakeryMenu);

        Product americano = new Product("Americano","아메리카노",2.0,"Coffee");
        Product amondeamericano = new Product("amonde Americano","아몬드아메리카노",2.5,"Coffee");
        Product cafemocha = new Product("cafe mocha","카페모카",3.5,"Coffee");
        Product hazelnut = new Product("hazelnut","헤이즐넛",4.0,"Coffee");
        allProducts.add(americano);
        allProducts.add(amondeamericano);
        allProducts.add(cafemocha);
        allProducts.add(hazelnut);

        Product cafelatte = new Product("cafe latte","카페라떼",2.5,"Lotte");
        Product vanillalatte = new Product("vanilla latte","바닐라라떼",3.0,"Lotte");
        Product caramelmacchiato = new Product("caramel macchiato","카라멜마키아또",3.5,"Lotte");
        Product condensedmilklatte = new Product("condensedmilk latte","연유라떼",4.0,"Lotte");
        allProducts.add(cafelatte);
        allProducts.add(vanillalatte);
        allProducts.add(caramelmacchiato);
        allProducts.add(condensedmilklatte);

        Product chocolatelatte = new Product("chocolate latte","초콜릿라떼",4.5,"Beverage");
        Product mintchocolatelatte = new Product("mintchocolate latte","민트초콜릿라떼",4.5,"Beverage");
        Product sweetpotatolatte = new Product("sweetpotato latte","고구마라떼",4.5,"Beverage");
        Product greentealatte = new Product("greentea latte","녹차라떼",4.8,"Beverage");
        Product eartgreymiltea = new Product("eartgreymil tea","얼그레이밀크티",4.8,"Beverage");
        Product peachlcedtea = new Product("peachlced tea","복숭아아이스티",4.0,"Beverage");
        Product tomatojuice = new Product("tomato juice","토마토주스",4.8,"Beverage");
        Product grapefruit = new Product("grape fruit","자몽주스",4.8,"Beverage");
        Product watermelonjuice = new Product("watermelon juice","수박주스",4.8,"Beveragee");
        Product greengrapejuice = new Product("greengrape juice","청포도주스",4.8,"Beverage");
        allProducts.add(chocolatelatte);
        allProducts.add(mintchocolatelatte);
        allProducts.add(sweetpotatolatte);
        allProducts.add(greentealatte);
        allProducts.add(eartgreymiltea);
        allProducts.add(peachlcedtea);
        allProducts.add(tomatojuice);
        allProducts.add(grapefruit);
        allProducts.add(watermelonjuice);
        allProducts.add(greengrapejuice);

        Product cltrontea = new Product("cltrontea","유자차",4.0,"Tea");
        Product grapefruittea = new Product("grapefruittea","자몽차",4.0,"Tea");
        Product lemontea = new Product("lemontea","레몬차",4.0,"Tea");
        Product asianapricottea = new Product("asianapricottea","매실차",4.0,"Tea");
        Product chamomile = new Product("chamomile","캐모마일",4.0,"Tea");
        Product pepperimint = new Product("pepperimint","페퍼민트",4.0,"Tea");
        Product earlgrey = new Product("earlgrey","얼그레이",4.0,"Tea");
        Product muscat = new Product("muscat","머스켓",4.2,"Tea");
        Product peachtea = new Product("peachtea","복숭아티",4.5,"Tea");
        Product jadooast = new Product("jadooast","자두에이스티",4.5,"Tea");
        allProducts.add(cltrontea);
        allProducts.add(grapefruittea);
        allProducts.add(lemontea);
        allProducts.add(asianapricottea);
        allProducts.add(chamomile);
        allProducts.add(pepperimint);
        allProducts.add(earlgrey);
        allProducts.add(muscat);
        allProducts.add(peachtea);
        allProducts.add(jadooast);

        Product saltbread = new Product("salt bread","소금빵",4.0,"Bakery");
        Product eggbread = new Product("egg bread","계란빵",4.0,"Bakery");
        Product sandwich = new Product("sand wich","샌드위치",4.0,"Bakery");
        Product milksandwichbread = new Product("milk sandwich bread","우유식빵",4.0,"Bakery");
        allProducts.add(saltbread);
        allProducts.add(eggbread);
        allProducts.add(sandwich);
        allProducts.add(milksandwichbread);
    }

    public void Display() throws InterruptedException{
        while (true){
            int numbering;
            int selectCategoryNum;
            int selectProductNum;

            numbering = ShowMenu();
            ShowOption(numbering);
            selectCategoryNum = getResponse(numbering, categoryMenu);

            if (selectCategoryNum >= numbering || selectCategoryNum == 0){
                continue;
            }
            numbering = ShowMenu(selectCategoryNum);
            ShowOption(numbering);
            selectProductNum = getResponse(numbering, categoryProduct);

            if (selectProductNum >= numbering || selectCategoryNum == 0){
                continue;
            }
            order.AddOrder(categoryProduct.get(selectProductNum -1));
        }
    }

    public int ShowMenu(){
        int numbering = 1;
        System.out.println("\"Americano에 오신 걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴에 골라 입력해주세요.");
        System.out.println("[COFFEE MENU]");
        for (Menu item : categoryMenu){
            System.out.print(numbering + ".");
            item.Show();
            numbering++;
        }
        return numbering;
    }
    

    public int ShowMenu(int selectCategoryNum){
        int numbering = 1;
        String menuName;
        categoryProduct.clear();
        System.out.println("\"Americano에 오신 걸 환영합니다.\"");
        System.out.println("아래 상품 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        menuName = categoryMenu.get(selectCategoryNum - 1).getName();
        System.out.println("[" + menuName +" MENU ]");
        for (Product item : allProducts){
            if (menuName.equals(item.getCategory())){
                categoryProduct.add(item);
                System.out.print(numbering + ". ");
                numbering++;
            }
        }
        return numbering;
    }
    
    public void ShowOption(int numbering){
        System.out.println("[ORDER MENU]");
        System.out.printf(numbering + ".%-15s | %s\n", "Order","장바구니를 확인 후 주문을 완료합니다.");
        System.out.printf(numbering +  1 + ".%-15s | %s\n", "Cancel","진행중인 주문을 취소합니다.");
    }

    public <T extends Menu> int getResponse(int numbering, ArrayList<T> list) throws InterruptedException{
            int input;
            int optionInput;
            double totalPrice;
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            if (1 <= input && input < numbering){
                System.out.println(list.get(input -1).getName() + "선택하셨습니다.");
            }  else if (input == numbering){
                System.out.println("아래와 같이 주문하시겠습니까?");
                System.out.println("[ Orders ]");
                totalPrice = order.getShoppingBag();
                System.out.println("[ Total ]");
                System.out.println("W " + totalPrice + "\n");
                System.out.println("1. 주문 2.메뉴판");
                optionInput = sc.nextInt();
                if (optionInput == 1 && totalPrice !=0){
                    System.out.println("주문이 완료되었습니다!");
                    System.out.println("대기번호는 [ " + order.CompleteOrder() + "]번 입니다.");
                    revenue +=totalPrice;
                    System.out.println("(3초 후 초기 메뉴판으로 돌아갑니다.)");
                    Thread.sleep(1000);
                    System.out.println("(2초 후 초기 메뉴판으로 돌아갑니다.)");
                    Thread.sleep(1000);
                    System.out.println("(1초 후 초기 메뉴판으로 돌아갑니다.)");
                    Thread.sleep(1000);
                } else if (optionInput == 2){
                    System.out.println("주문이 완료되지 않았습니다.");
                    System.out.println("(초기 메뉴판으로 돌아갑니다.)");
                    Thread.sleep(500);
                }         
                else  if(totalPrice==0){
                    System.out.println("주문하신 내용이 없습니다.");
                    System.out.println("(초기 메뉴판으로 돌아갑니다.)");
                    Thread.sleep(500);
                }
            } else if (input == numbering + 1){
                System.out.println("진행하던 주문을 취소하겠습니까?");
                System.out.println("1. 확인 2.취소");
                optionInput = sc.nextInt();
                if (optionInput == 1){
                    order.CancelOrder();
                    System.out.println("진행하던 주문이 취소되었습니다. 이전 화면으로 돌아갑니다.");
                    Thread.sleep(500);
                }
            }
        else if (input == 0){
            System.out.println("[ 총 판매금액 현황]");
            System.out.println("현재까지 총 판매된 금액은 [ W "+Math.round((revenue*100))/100.0 +"] 입니다.\n");
            order.SoldList();
            while(true){
                System.out.println("1. 돌아가기");
                optionInput = sc.nextInt();
                if (optionInput == 1){
                    System.out.println("이전 화면으로 돌아갑니다.");
                    break;
                }
                else{
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
        }

        return input;
    }
}
