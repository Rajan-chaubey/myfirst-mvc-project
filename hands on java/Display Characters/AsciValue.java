import java.util.Scanner;

public class AsciValue {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c,d;
		a= s.nextInt();
		b= s.nextInt();
		c= s.nextInt();
		d= s.nextInt();
		System.out.println("Enter the digits:");
		char e = (char) a;
		System.out.println(a+ "-" + e);
		char f = (char) b;
		System.out.println(b+ "-" + f);
		char g = (char) c;System.out.println(c+ "-" + g);
		char h= (char) d;System.out.println(d+ "-" + h);
	}
}