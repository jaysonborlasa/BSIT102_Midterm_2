import java.util.Scanner;
import java.util.Random;
import java.math.RoundingMode;
import java.text.DecimalFormat;

 class Javelinn {

	
	public static void main(String[] args){
	DecimalFormat df = new DecimalFormat(".##");
	Scanner sc = new Scanner(System.in);
	String P1, P2, P3, P4;
	
	Random r = new Random();
	int rangeMax = 150;
	int rangeMin = 50;
	
	double randomValue1 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	double randomValue2 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	double randomValue3 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	double randomValue4 = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	
	System.out.println("Enter Player1: ");
	P1 = sc.nextLine();
	System.out.println("Enter Player2: ");
	P2 = sc.nextLine();
	System.out.println("Enter Player3: ");
	P3 = sc.nextLine();
	System.out.println("Enter Player4: ");
	P4 = sc.nextLine();
	
	System.out.println("Player1: " + P1 + " thrown at " + df.format(randomValue1) + " meters. ");
	System.out.println("Player2: " + P2 + " thrown at " + df.format(randomValue2) + " meters. ");
	System.out.println("Player3: " + P3 + " thrown at " + df.format(randomValue3) + " meters. ");
	System.out.println("Player4: " + P4 + " thrown at " + df.format(randomValue4) + " meters. ");
	}
}