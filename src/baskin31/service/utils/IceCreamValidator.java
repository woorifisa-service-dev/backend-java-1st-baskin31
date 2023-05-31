package baskin31.service.utils;

import baskin31.domain.IceCream;

public class IceCreamValidator {

	public boolean checkIceCreamStock(IceCream iceCream) {
		if (iceCream.getStock() == 0) {
			System.out.println("재고가 없습니다 다른거 선택해주세요");
			return false;
		}
		
		return true;
	}
}
