package baskin31.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IceCream {
	private String name;
	private Enum Rating;
	private int stock;

	public void decreseStock() {
		this.stock = this.stock - 1;
	}

}
