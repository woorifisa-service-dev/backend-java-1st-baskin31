package baskin31.service;

import java.util.List;
import java.util.Scanner;

import baskin31.ScannerContainer;
import baskin31.domain.IceCream;
import baskin31.domain.Owner;
import baskin31.domain.Rating;
import baskin31.repository.BaskinRepository;
import baskin31.view.OutputView;

public class StoreInfoService {

	BaskinRepository baskinRepository = new BaskinRepository();
	OutputView outputView = new OutputView();
	Scanner sc = ScannerContainer.getInstance();
	Owner owner = new Owner("조윤나",25,"010-0000-0000"); //이름 나이 폰넘버
	String[] str = {"사장님 이름 : "+owner.getName(),
					"사장님 나이 : "+owner.getAge(),
					"긴급 연락처 : "+owner.getPhoneNumber()};

	public void printStoreInfo() {
		for(int i=0;i<3;i++) {
			System.out.println(str[i]);
		}
	}
	
	public void printIceStock() {
		List<IceCream> list = baskinRepository.getIceCreamList();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName()+"의 남은 재고 : "+ list.get(i).getStock());
		}
	}
	
	public void addMenu() {
		System.out.print("메뉴명을 입력해주세요: ");
		String menuName = sc.next();
		IceCream iceCream = new IceCream(menuName, Rating.NORMAL, 10);
		baskinRepository.addIceCreamMenu(iceCream);
	}
	
	public void updateRating() {
		outputView.printFlavor(baskinRepository.getIceCreamList());
		
		int selectedMenuIdx = sc.nextInt();
		IceCream selectedItem = BaskinRepository.iceCreamList.get(selectedMenuIdx); // 어떤 메뉴명이 담겨있음
		
		System.out.print("Rating 입력하시오(BEST, NEW, NORMAL): ");
		String inputedRating = sc.next();
		
		if(inputedRating.equals("BEST")) {
			selectedItem.setRating(Rating.BEST);
		}else if(inputedRating.equals("NEW")){
			selectedItem.setRating(Rating.NEW);
		}else {
			selectedItem.setRating(Rating.NORMAL);
		}
	}
	
}
