package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer serdar = new IndividualCustomer();
		serdar.customerNumber="12345";
		
		CorparateCustomer hepsiBurada = new CorparateCustomer();
		hepsiBurada.customerNumber="18866";
		
		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {serdar,hepsiBurada};
		
		customerManager.addMultipleCustomer(customers);
		
		//customerManager.add(serdar);
		
		//IndividualCustomer individualCustomer = new IndividualCustomer();
		//individualCustomer.setCustomerNumber("245886");
		//individualCustomer.firstName = "serdar";
		//System.out.println(individualCustomer.getCustomerNumber());
		//System.out.println(serdar.getCustomerNumber());
		
	}

}
