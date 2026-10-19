import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 0;
        String MenuName = "";
        int totalAmount = 0;

        String ERR001 = "없는 메뉴입니다.";
        String ERR002 = "잘못된 메뉴 개수입니다.";

        System.out.println(
                """
                메뉴
                1.메뉴이름 :아메리카노 가격 : 3000원
                2.메뉴이름 :카페라떼   가격 : 4000원
                3.메뉴이름 :바닐라라떼 가격 : 4500원
                4.메뉴이름 :초코라떼   가격 : 5000원
                """);
        //메뉴 번호 입력
        System.out.print("원하시는 메뉴 번호를 입력해주세요 :");
        int Number = sc.nextInt();
        if(Number > 4 || Number < 1)
        {
            System.out.println(ERR001);
            return;
        }
        //메뉴 개수 입력
        System.out.print("메뉴의 개수를 입력해주세요(최대 99개) :");
        int Quantity = sc.nextInt();
        if(Quantity > 99|| Quantity < 0)
        {
            System.out.println(ERR002);
            return;
        }
        //메뉴 번호 치환
        switch (Number)
        {
            case 1 :
                price = 3000;
                MenuName = "아메리카노";
                break;
            case 2 :
                price = 4000;
                MenuName = "카페라떼";
                break;
            case 3 :
                price = 4000;
                MenuName = "바닐라라떼";
                break;
            case 4 :
                price = 4000;
                MenuName = "초코라떼";
                break;
            default:
                System.out.println(ERR002);
                return;
        }
        //최종 가격 계산
        totalAmount = price * Quantity;

        System.out.println("메뉴 번호 :"+ Number);
        System.out.println("수랑: "+ Quantity);
        System.out.println("주문 메뉴: "+ MenuName);
        System.out.println("총 금액: "+ totalAmount);
    }
}