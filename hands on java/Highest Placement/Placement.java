import java.util.*;

public class Placement {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE:");
		int cse=s.nextInt();
		System.out.println("Enter the no of students placed in ECE:");
		int ece = s.nextInt();
		System.out.println("Enter the no of students placed in MECH:");
		int mech = s.nextInt();
		if(cse<0||ece<0||mech<0) {
			System.out.println("Input is Invalid");
			System.exit(0);
		}
		
		else if((cse==mech)&&(cse==ece)) {
		    System.out.println("None of the department has got the highest placement");
		    System.exit(0);
		}
		List<Integer> arr = new ArrayList<>();
		arr.add(cse);
		arr.add(ece);
		arr.add(mech);
		
		int highest = Collections.max(arr);
		System.out.println("Highest placement");
		for(int i=0; i<arr.size(); i+=1) {
			if(arr.get(i)==highest) {
				if(i==0) {
					System.out.println("CSE");
				}
				else if(i==1) {
					System.out.println("ECE");
				}
				else {
					System.out.println("MECH");
				}
			}
		}
	}
}