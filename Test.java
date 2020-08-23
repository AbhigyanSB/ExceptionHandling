package sarmabaruaabhigyan_OOP_07;

//Import for the IOException, ArrayList, Collection and List.
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Lab8 class to test the Customer class.
public class Test {
	
	//Main method throwing the IOException.
	public static void main(String[] args) throws IOException {
		
		//Creating five objects to test the Customer class. 
		Customer C1 = new Customer(24, "Shawn Johnson", 876573863);
		Customer C2 = new Customer(43, "Tony Green", 862347356);
		Customer C3 = new Customer(19, "Patrick Rogers", 852863517);
		Customer C4 = new Customer(56, "Chris Jane", 846578364);
		Customer C5 = new Customer(37, "Bruce Clerk", 838368279);
		
		//Creating an arrayList to add the customer objects.
		List<Customer> cust = new ArrayList<>();
        
		//Adding the customers using an arrayList.
		cust.add(C1);
		cust.add(C2);
		cust.add(C3);
		cust.add(C4);
		cust.add(C5);
		
		//Sorting the elements of the customer arrayList using the Collections, which is being imported.
		Collections.sort(cust);
		
		//Displaying the information of all the customer objects using a for loop for Customer.
		for(int i = 0; i < cust.size(); i++) {
			System.out.println(cust.get(i));				//Displaying the results for all the Customer objects.
		}
		
		//Create a print writer object to write it to a file called "OutFile.txt".
		PrintWriter out = null;
		out = new PrintWriter(new FileWriter("OutFile.txt"));
		out.println("Test");
		
		if(out != null) {
		//Closing the print writer.
		out.close();
		}
		
	}
	
}
