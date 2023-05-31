package baskin31.view;

import java.util.List;
import java.util.Scanner;

import baskin31.ScannerContainer;
import baskin31.controller.Baskin31Controller;
import baskin31.domain.IceCream;
import baskin31.repository.BaskinRepository;

public class InputView {
	Scanner sc = ScannerContainer.getInstance();
//	List<IceCream> iceCreamList = Baskin31Controller.iceCreamList;
	BaskinRepository baskinRepository = new BaskinRepository();
	OutputView output = new OutputView();
	
	public int showMenu() {
		output.showMenu();
		return sc.nextInt();	
	}
	
	public IceCream[] getBoxSize() {
		output.showBoxSize();
		int num = sc.nextInt();
		IceCream[] iceBox;
		if(num==1) {
			iceBox = new IceCream[3];
		}else if(num==2) {
			iceBox = new IceCream[4];
		}else if(num==3) {
			iceBox = new IceCream[5];
		}else {
			iceBox = new IceCream[3];
		}
		
		return iceBox;
	}
	
	
}
