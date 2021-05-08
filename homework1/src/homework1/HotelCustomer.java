package homework1;

public class HotelCustomer {

	int id;
	String name;
	String surname;
	int tcKimlik;
	int age;
	int price;
	int discount = 10;
	int priceAfterDiscount;
	String[] teStrings;

	
	public HotelCustomer() {
		this.teStrings[0] = "sds";
		
		System.out.println("Hotel Müþteri Bilgileri Çaðýrýldý");
	}

	
	public HotelCustomer(int id, String name, String surname, int tcKimlik, int age, int price, int discount,
			int priceAfterDiscount) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.tcKimlik = tcKimlik;
		this.age = age;
		this.price = price;
		this.discount = discount;
		this.priceAfterDiscount = priceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getTcKimlik() {
		return tcKimlik;
	}

	public void setTcKimlik(int tcKimlik) {
		this.tcKimlik = tcKimlik;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getPriceAfterDiscount() {
		return priceAfterDiscount;
	}
}
