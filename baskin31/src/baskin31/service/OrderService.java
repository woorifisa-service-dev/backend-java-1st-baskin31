package baskin31.service;

import java.util.Scanner;

import baskin31.ScannerContainer;
import baskin31.domain.IceCream;
import baskin31.repository.BaskinRepository;
import baskin31.service.utils.IceCreamValidator;
import baskin31.view.InputView;
import baskin31.view.OutputView;

public class OrderService {
	InputView inputView = new InputView();
	OutputView outputView = new OutputView();
	BaskinRepository baskinRepository = new BaskinRepository();
	IceCreamValidator iceCreamValidator = new IceCreamValidator();
	Scanner sc = ScannerContainer.getInstance();

	public void order() {
		IceCream[] cart = inputView.getBoxSize(); // 선택한 박스 크기 가져온다
		cart = selectIceCream(cart); // 아이스크림이 담겨있다!
		completeOrder(cart);
	}

	public void completeOrder(IceCream[] cart) {
		outputView.showOrderStatus(cart);
	}

	public IceCream[] selectIceCream(IceCream[] cart) {
		outputView.printFlavor(baskinRepository.getIceCreamList());
		for (int i = 0; i < cart.length; i++) {
			int num = sc.nextInt();
			IceCream iceCream = baskinRepository.getIceCream(num);
			if (!iceCreamValidator.checkIceCreamStock(iceCream)) {
				i--;
				continue;
			}
			iceCream.decreseStock();
			cart[i] = iceCream;
		}

		return cart;
	}
}
