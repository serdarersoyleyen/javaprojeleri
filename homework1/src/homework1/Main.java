package homework1;

public class Main {

	public static void main(String[] args) {
		// Main class

		HotelCustomer hotelCustomer1 = new HotelCustomer();
		hotelCustomer1.age = 25;
		hotelCustomer1.name = "Serdar";
		hotelCustomer1.surname = "Ersoyleyen";
		hotelCustomer1.tcKimlik = 5161681;

		HotelCustomer hotelCustomer2 = new HotelCustomer();
		hotelCustomer2.age = 1;
		hotelCustomer2.name = "Sel�uk";
		hotelCustomer2.surname = "Ersoyleyen";
		hotelCustomer2.tcKimlik = 64846;

		HotelCustomer hotelCustomer3 = new HotelCustomer();
		hotelCustomer3.age = 20;
		hotelCustomer3.name = "Ali";
		hotelCustomer3.surname = "Ersoyleyen";
		hotelCustomer3.tcKimlik = 9864864;

		HotelCustomer[] hotelCustomers = { hotelCustomer1, hotelCustomer2, hotelCustomer3 };

		for (HotelCustomer hotelCustomer : hotelCustomers) {
			System.out.println("M��teri ya��: " + hotelCustomer.getAge());
			System.out.println("M��teri ad�: " + hotelCustomer.getName());
			System.out.println("M��teri soyad�: " + hotelCustomer.getSurname());
			System.out.println("M��teri kimlikno: "+hotelCustomer.getTcKimlik());

		}

		System.out.println(hotelCustomer1.getDiscount());
	}

}
