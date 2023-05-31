package baskin31.repository;

import java.util.ArrayList;
import java.util.List;

import baskin31.domain.IceCream;
import baskin31.domain.Rating;

public class BaskinRepository {
	public static List<IceCream> iceCreamList = new ArrayList<>();

	public void initIceCreamList() {
		String[] str = { "딸기", "아몬드봉봉", "사빠딸", "초코", "민트초코", "다크초코", "무화과"};
		for (int i = 0; i < str.length; i++) {
			IceCream iceCream = new IceCream(str[i], Rating.NORMAL, 3);
			iceCreamList.add(iceCream);
		}
	}

	public void addIceCreamMenu(IceCream iceCream) {
		iceCreamList.add(iceCream);
	}

	public void removeIceCreamMenu(IceCream iceCream) {
		iceCreamList.remove(iceCream);
	}

	public IceCream getIceCream(int index) {
		return iceCreamList.get(index);
	}

	public String[] getIceCreamName() {
		String[] result = new String[iceCreamList.size()];
		for (int i = 0; i < iceCreamList.size(); i++) {
			result[i] = iceCreamList.get(i).getName();
		}
		return result;
	}
	
	public List<IceCream> getIceCreamList() {
		return this.iceCreamList;
	}	
}
