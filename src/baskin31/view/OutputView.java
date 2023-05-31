package baskin31.view;

import java.util.List;

import baskin31.domain.IceCream;
import baskin31.domain.Rating;

public class OutputView {

	public void printIceCreamBox(IceCream[] box) {
		
	}
	public void showMenu() {
		System.out.println("1: 주문하기  2: 재고확인  3: 상점정보  4: 설정  5: 나가기");
	}
	public void showBoxSize() {
		System.out.println("1: 파인트  2: 쿼터  3: 패밀리");
	}
	
	public void exit() {
		System.out.println("포스기가 종료되었습니다.");
	}
	
	public void printFlavor(List<IceCream> iceCreamList) {
		System.out.println("==============================[맛을 골라주세요]=================================");
		String tag = "";
		for (int i = 0; i < iceCreamList.size(); i++) {
		
			if(iceCreamList.get(i).getRating()==Rating.BEST) {
				tag="*";
			}else {
				tag="";
			}
			
			if ((i % 7) == 0) {
				System.out.println();
				System.out.print("[");
			}
			if ((i % 7) == 6) {
				System.out.print((i) + ". " +tag +iceCreamList.get(i).getName());
			} else {
				System.out.print((i) + ". " +tag +iceCreamList.get(i).getName() + " | ");
			}
			if ((i % 7) == 6) {
				System.out.print(" ]");
			}
		}
		System.out.println();
	}
}
