package altonsfence;

import java.util.Scanner;

public class CostEstimation {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int woodenFence = 25;
		int chainFence = 15;
		int gateCost = 150;
		final double permitFee = 50.00;
		double taxRate = .06;
		//This will asks user to input the length of his yard
		System.out.println("What is your length of your yard in feet?");
		int yardLength = sc.nextInt();
		//This will asks user to input the width of the yard
		System.out.println("And what is your width of your yard in feet?");
		int yardWidth = sc.nextInt();
		//Calculate the perimeter of the yard
		double perimeter = 2 * (yardLength + yardWidth);
		//This will asks user to input the quantity of the gates
		System.out.println("How many gates do you want?");
		int totalGates = sc.nextInt();
		//Calculate the total cost
		double totalCost = woodenFence * perimeter + totalGates * gateCost;
		//Calculate the tax amount
		double tax = totalCost * taxRate;
		//calculate the final cost
		double finalCost = totalCost + tax + permitFee;
		//display the final cost
		System.out.println("The total calculation of the rectangular yard is $ " + finalCost);

	}
}
