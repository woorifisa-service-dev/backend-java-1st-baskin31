package baskin31;

import baskin31.controller.Baskin31Controller;

public class Baskin31Application {
	
	public static void main(String[] args) {
		//상점 시작
		Baskin31Controller storeController = new Baskin31Controller();
		storeController.openStore();
	}

}
