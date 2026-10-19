import java.util.*;

//메뉴판
String[] screenTypes = {"일반 2D", "3D 입체", "IMAX", "4DX"};

int[] basePrices = {14000, 16000, 22000, 20000};

        //에러
        final int ERROR = -9;
        final String ERROR001 = "ERROR001 : 잘못된 상영관을 입력하셨습니다. 다시 입력해주세요";
        final String ERROR002 = "ERROR002 : 잘못된 옵션을 입력하셨습니다. 다시 입력해주세요.";

        //인덱스 기본 가격 반환
        int getBasePrice(int screenNumber)
        {
            return basePrices[screenNumber];
        }

        //숫자로 변환
        int getScreenNumber(String selectedScreen)
        {
            if(selectedScreen == "일반 2D")
                return 0;
            if(selectedScreen == "3D 입체")
                return 1;
            if(selectedScreen == "IMAX")
                return 2;
            if(selectedScreen == "4DX")
                return 3;
            else
                return -9;
        }

        //시간대 옵션
        int getTimeOptionPrice(int timeCode)
        {
            switch(timeCode)
            {
                case 1:
                    return -3000;
                case 2:
                    return 2000;
                case 3:
                    return -2000;
                case 4:
                    return 0;
                default :
                    return ERROR;
            }
        }

        //시간대 출력
        String getTimeOptionName(int timeCode)
        {
            switch(timeCode)
            {
                case 1:
                    return "조조 할인";
                case 2:
                    return "프라임 타임";
                case 3:
                    return "심야 할인";
                case 4:
                    return "일반";
                default :
                    return ERROR002;
            }
        }

        //영수증 출력
        void printTicketReciept(String screenType, String timeOption, int basePrice, int optionPrice, int count)
        {
            System.out.println("=== \uD83C\uDFAC CG-BOX 예매 확인증 ===");
            System.out.println("상영 종류 : "+screenType);
            System.out.println("관람 시간 : "+timeOption);
            System.out.println("예매 매수 : "+count+"매");
            System.out.println("-------------------------");
            System.out.println("총 결제 금액 : "+ (basePrice + optionPrice) * count +"원");
            System.out.println("=========================");
        }

        void main()
        {
            String selectedScreen = "IMAX";
            int timeCode = 1;
            int count = 2;

            int screenNumber = getScreenNumber(selectedScreen);
            if(screenNumber == -9) {
                System.out.println(ERROR001);
                return;
            }

            int basePrice = getBasePrice(screenNumber);
            int optionPrice = getTimeOptionPrice(timeCode);
            String timeOption = getTimeOptionName(timeCode);
            printTicketReciept(selectedScreen, timeOption, basePrice, optionPrice, count);
        }
