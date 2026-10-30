import java.util.Scanner;
class Program2{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		// input as double 
		double n1=sc.nextDouble();
		System.out.println("Enter the 2nd Number: ");
		double n2=sc.nextDouble();
		double sum=n1+n2;
		System.out.println(n1+"+"+n2+"= "+sum);
    }
}