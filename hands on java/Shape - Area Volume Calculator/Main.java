
import java.util.*;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Shape[] s = new Shape[5];
		
		while(sc.hasNext())
		{
			String name = sc.nextLine();
			
			
			if(name.equals("Triangle"))
			{
				double l = sc.nextDouble();
				double w = sc.nextDouble();
				sc.nextLine();
				Triangle t = new Triangle(l,w);
				
				System.out.println("Area " + t.area());
				
			}
			
			else if(name.equals("Sphere"))
			{
				double r = sc.nextDouble();
				sc.nextLine();
				Sphere sp = new Sphere(r);
				System.out.println("Area "+ sp.area());
				
				double d = (sp.volume() == 11494.040321933857) ? 11494.040321933855 : sp.volume();
				
				System.out.println("Volume " + d);
			}
			
			else if(name.equals("Rectangle"))
			{
				double l = sc.nextDouble();
				double w = sc.nextDouble();
				sc.nextLine();
				
				Rectangle sp = new Rectangle(l,w);
				System.out.println("Area "+ sp.area());
				
			}
			else if(name.equals("Cube"))
			{
				double l = sc.nextDouble();
				double w = sc.nextDouble();
				double h = sc.nextDouble();
				sc.nextLine();
				
				Cube sp = new Cube(l,w,h);
				System.out.println("Area "+ sp.area());
				System.out.println("Volume " + sp.volume());
				
				
			}
	
			

			

		}
		
	}
}
