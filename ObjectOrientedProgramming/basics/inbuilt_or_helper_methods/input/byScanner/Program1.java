import java.util.Scanner;
class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st Number: ");
        // To take number input nextInt();
		int n1=sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println(n1+"+"+n2+"= "+sum);
    }
}