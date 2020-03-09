import java.util.Scanner;

public class SnacksDetails {
	public static void main(String[] args) {
		System.out.println("Enter the no of pizzas bought:");
		Scanner s = new Scanner(System.in);
		int pizza = s.nextInt();
		System.out.println("Enter the no of puffs bought:");
		int puffs = s.nextInt();
		System.out.println("Enter the no of cool drinks bought");
		int drinks = s.nextInt();
		int totalprice = (pizza*100)+(puffs*20)+(drinks*10);
		System.out.println("Bill Details \nNo of pizzas:" + pizza + "\nNo of puffs:" + puffs + "\nNo of cooldrinks:" + drinks + "\nTotal price:" + totalprice + "\nENJOY THE SHOW!!!");
	}
}