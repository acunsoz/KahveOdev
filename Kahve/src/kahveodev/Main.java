package kahveodev;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Alihan","Acunsöz",LocalDate.of(1999, 1, 19),"154545454"));
		

	}

}

