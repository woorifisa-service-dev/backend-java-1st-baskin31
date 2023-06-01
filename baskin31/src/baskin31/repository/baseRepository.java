package baskin31.repository;

import baskin31.domain.IceCream;

public interface baseRepository {
	void addIceCreamMenu(IceCream iceCream);

	void removeIceCreamMenu(IceCream iceCream);

	IceCream getIceCream(int index);
}
