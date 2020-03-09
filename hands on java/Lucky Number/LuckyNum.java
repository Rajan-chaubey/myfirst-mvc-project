import java.util.Scanner;

public class LuckyNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the car no:");
		int no = s.nextInt();
		int temp=no;
		int c=0;
		int sum=0;
		while(temp>0) {
			sum+=temp%10;
			temp = temp/10;
			c+=1;
			
		}
		if(no<=0||c!=4){
			System.out.println(no + " is not a valid car number");
		}
		
		else if(sum%3==0||sum%5==0||sum%7==0) {
			System.out.println("Lucky Number");
		}
		else{
			System.out.println("Sorry its not my lucky number");
		}
		
	}
}