package baskin31.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import baskin31.domain.IceCream;
import baskin31.domain.Rating;
import baskin31.repository.BaskinRepository;
import baskin31.service.OrderService;
import baskin31.service.StoreInfoService;
import baskin31.view.InputView;
import baskin31.view.OutputView;

public class Baskin31Controller {

	InputView inputView = new InputView();
	OutputView outputView = new OutputView();
	StoreInfoService storeInfoService = new StoreInfoService();
	OrderService orderService = new OrderService();
	BaskinRepository baskinRepository = new BaskinRepository();
	Scanner sc = new Scanner(System.in);

	public void openStore() {
		// 아이스크림 모두 10개로 초기화
		initStore();

		// 리모컨
		while (true) {
			int remoteConNumber = inputView.showMenu();
			runMenu(remoteConNumber);
			if (remoteConNumber == 5) {
				outputView.exit();
				break;
			}
		}

	}

	public void initStore() {
		baskinRepository.initIceCreamList();
	}

	public void runMenu(int remoteConNumber) {
		if (remoteConNumber == 1) {
			// 주문하기
			orderService.order();
		} else if (remoteConNumber == 2) {
			// 재고 확인
			storeInfoService.printIceStock();
		} else if (remoteConNumber == 3) {
			storeInfoService.printStoreInfo(); // 가게 정보 확인
		} else if (remoteConNumber == 4) { // 설정
			System.out.println("1: 메뉴 추가 2: rating 수정");
			int selectedNumber = sc.nextInt();
			if (selectedNumber == 1) {
				storeInfoService.addMenu();
			} else if (selectedNumber == 2) {
				storeInfoService.updateRating();
			} else {
				System.out.println("ㅎㅇ 다시 누르게 해야됨");
			}

		}
	}

}
