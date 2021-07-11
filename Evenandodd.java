import java.util.Scanner;
public class Evenandodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
int num= sc.nextInt();
 if(num>0)
 {
	 if(num%2==0)
	 {
		 System.out.println("even");
	 }
		 else {
			 System.out.println("odd");	 
	 }
	System.out.println("Enter the number greater than 0");
 sc.close();
	}

}
}
