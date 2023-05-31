package baskin31;

import java.util.Scanner;

public class ScannerContainer {
	private static final Scanner instance = new Scanner(System.in);

	// private constructor to avoid client applications to use constructor
	private ScannerContainer(){}

	public static Scanner getInstance() {
		return instance;
	}

	
}
