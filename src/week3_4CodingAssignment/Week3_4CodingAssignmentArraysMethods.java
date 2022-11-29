package week3_4CodingAssignment;

import java.lang.reflect.Array;

public class Week3_4CodingAssignmentArraysMethods {

	public static void main(String[] args) {
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int [] ages = {3, 9, 23, 64, 2, 8, 93};
		
		//a. Programmatically subtract the value of the first element in the array from the value in the last
		//element of the array(i.e. do not use ages[7] in your code). Print the result to the console.  
		//System.out.println(ages.length -1);
		//System.out.println(ages[0]);
		//System.out.println(ages[ages.length -1]);
		System.out.println(ages[ages.length -1] - ages[0]);
		
		//b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of
		//different lengths).
		int [] ages2 = {3, 9, 23, 64, 2, 8, 93, 20};
		System.out.println(ages2[ages2.length -1] - ages2[0]);
		
		
		//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double total = 0;
		//i is the index 
		for (int i = 0; i < ages.length; i++) {
			// toatl = total+ages[i]
			//ages[i] means give me the i'th item in the list
			// so like if we have 0 give me the 0th item in the list
			total += ages[i];
			}
		System.out.println(total / ages.length);
		
		//2. Create an array of String called names that contains the following values: "Sam", "Tommy", "Tim",
		//"Sally", "Buck", "Bob".
		String[] names = {"Sam", "Tommy", "Tim","Sally", "Buck", "Bob"};
		
		//a. Use a loop to iterate through the array and calculate the average number of letters per name.
		//Print the result to the console.
		double total2 = 0;
		for (int k=0; k < names.length; k++) {
			// to get how many letters are in a strintg 
			// we use .length() 
			// example. "Cat".length() will give use 3 :D
			total2 += names[k].length();
		}
			System.out.println(total2 / names.length);
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated
		//by spaces, and print the result to the console.
		String together = "";
		for(int i = 0; i < names.length; i++) {
			together += names[i] + " ";
		}
			System.out.println(together);
			
		//3. How do you access the last element of any array?
		
			// The length of an array -1
		
		//4. How do you access the first element of any array?
		
			//The first element of an array always starts with zero, so you type System.out.println(names[0];
		//and we would get "Sam".
			
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously 
		//created names array and add the length of each name to the nameLengths array.
		
			int[] nameLengths = new int [names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements
		//in the array. Print the result to the console
		
			int total3 = 0;
			for(int numbers : nameLengths) { //for all the members in the nameLengths array, we're going to add those to total3
				total3 += numbers;
			}
			System.out.println(total3);
			
		//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word
		//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to
		//return “HelloHelloHello”).
		
			String trippleHello = multiplyString("Hello", 3);
			System.out.println(trippleHello);
			
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name
		//(the full name should be the first and the last name as a String separated by a space).
		
			String firstName = "Sophia";
			String lastName = "Anderson";
			String fullName = giveFullName(firstName, lastName);
			System.out.println(fullName);
			
		//9. Write a method that takes an array of int and returns true if the sum of all the ints
		//in the array is greater than 100.
			
			int[] numbers = {1, 2, 3, 99};
			System.out.println(arraySumOfNumbers(numbers));
		
		//10.Write a method that takes an array of double and returns the average of all the elements in the array.
		
			double[] array = {12, 40, 4, 21};
			System.out.println(calculateAverage(array));
			
		//11.Write a method that takes two arrays of double and returns true if the average of the elements in
		//the first array is greater than the average of the elements in the second array.
			
			double[] arrayTwo = {11, 39, 3, 20};
			System.out.println(calculateAverageForTwo(array, arrayTwo));
		
		//12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
		//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
			boolean isHotOutside = true;
			double moneyInPocket = 11;
			System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
			
		//13.Create a method of your own that solves a problem. In comments, write what the method does and why
		//you created it.
			
			int time = 7;
			System.out.println("Time to Wake up?");
			System.out.println(wakeSchedule (time));
		
	} //end of main
	
	//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word
			//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to
			//return “HelloHelloHello”).
	
	public static String multiplyString(String word,int n) {
		String result = word.repeat(n);
		//for(int i = 0; i < n; i++) {
			//result += word;
		
		//the newer way todo this
		word.repeat(n);
		return result;
	}
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name
			//(the full name should be the first and the last name as a String separated by a space).
			
	public static String giveFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	//9. Write a method that takes an array of int and returns true if the sum of all the ints
			//in the array is greater than 100.
	
	public static boolean arraySumOfNumbers(int[] numbers) {
		int sum = 0;
		for (int number : numbers ) {
			sum += number;
		}
		if (sum > 100) {
			return true;
		}else {
			return false;
		}
	}
	
	//10.Write a method that takes an array of double and returns the average of all the elements in the array.
	
	public static double calculateAverage(double[] array) {
		double total = 0;
		for(double number : array) {
			total += number;
		}
		return total / array.length;
	}
	
	//11.Write a method that takes two arrays of double and returns true if the average of the elements in
			//the first array is greater than the average of the elements in the second array.
	
	public static boolean calculateAverageForTwo(double[] array, double[] arrayTwo) {
		double sum = 0;
		for(double numbers : array) {
			sum += numbers / array.length;
		}
		double total = 0;
		for(double numbers : arrayTwo) {
			total += numbers / arrayTwo.length;
		}
		if(sum > total) {
			return true;
		}else {
			return false;
		}
	}
	
	//12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
			//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static boolean willBuyDrink(boolean temp, double money) {
		if(temp == true && money > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	
	//13.Create a method of your own that solves a problem. In comments, write what the method does and why
			//you created it.
	//The method I created is a boolean expression of when to wake up. If it's 8 or later, I will wake up, but
	//it it's earlier then I will keep sleeping.
	
	public static boolean wakeSchedule(int time) {
		if(time >= 8) {
			return true;
		} else {
			return false;
		}
	}
	
	
	}
