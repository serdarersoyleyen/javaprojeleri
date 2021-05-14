package javaCampIntro;

public class Main {

	public static void main(String[] args) {
		
		Module modul1 = new Module();
		modul1.setFiyat(25);
		modul1.setAciklama("Lenovo marka pc");
		modul1.setIndirim(25);
		modul1.setAd("Laptop");
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setIsim("Ýçecek");
		
		Category category2 = new Category();
		category2.getId();
		category2.getIsim();
		
		
		System.out.println(category1.getId());
		System.out.println(category1.getIsim());

	}

}
