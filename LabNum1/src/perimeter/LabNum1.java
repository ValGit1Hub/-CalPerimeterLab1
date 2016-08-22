package perimeter;

import java.util.Scanner;

public class LabNum1 {

	public static void main(String[] args) {
		// Define variables
		Float length = 0f;
		Float width  = 0f;
		Float height = 0f;
		Float area = 0f;
		Float perimeter = 0f;
		Float volume = 0f;
		String cont = "yes";
		Scanner scan1 = new Scanner(System.in);
		while(cont.equalsIgnoreCase("yes")){
		  //Prompt for length
		  System.out.println("Please enter the length: ");
		  //wait for the user to enter the length
		  length = scan1.nextFloat();
		  
		  //Prompt for width
		  System.out.println("Please enter the width: ");
		  //wait for the user to enter the width
		  width = scan1.nextFloat();
		  
		//Prompt for height
		  System.out.println("Please enter the height: ");
		  //wait for the user to enter the width
		  height = scan1.nextFloat();
		
		  //calculate area: Area = Length x Width
		  area = (length * width);
		  //display area
		  System.out.println("Area: "+area);

		  //calculate perimeter = 2*(Length + Width)
		  perimeter = 2 *(length + width) ;
		  System.out.println("Perimeter: "+ perimeter);
		  
		  //calculate volume = Length x Width x height
		  volume = (length * width * height) ;
		  System.out.println("Volume: "+volume);
		 //garbage line by clearing scan1 using
		  //scan1.nextLine(); test out later.
		  System.out.println("would you like to continue yes or no?");
		  cont = scan1.nextLine();
		  //garbage line by clearing scan1 using 
		   cont = scan1.nextLine();
		  
	 }
		System.out.println("Goodbye");
		scan1.close();
	}

}
