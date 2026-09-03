//Max of five
class Program3{
	public static void main(String[] args){
		int a= 45  , b= 55  , c=  35 , d=60, e=44;

		int max=(a>b && a>c && a>d && a>e) ? a : 
			(b>c && b>d && b>e)?b:
			(c>d && c>e)? c:
			(d>e)?d:e;

		System.out.println("Biggest is : "+max);
		
	}
}
