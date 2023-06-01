package baskin31.domain;

public enum Rating {
	BEST("베스트"), NEW("신메뉴"),NORMAL("일반");
	
	private String status;
	
	Rating(String status){
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	
}
