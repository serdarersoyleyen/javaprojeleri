package javaCampIntro;

public class Category {
	private int id;
	private String isim;
	
	public Category() {
		
	}
	
	public Category(int id, String isim) {
		this.id = id;
		this.isim = isim;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsim() {
		return this.isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	
	
}
