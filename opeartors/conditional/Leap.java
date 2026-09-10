class Leap{
	public static void main(String[] args){
		int year=1972;
		String res=year%400==0? year+" is a Leap Year":
			year%100==0? year+" is NOT a Leap Year":
			year%4==0?year+" is a Leap Year":year+" is NOT a Leap Year";
		
		System.out.println(res);
		
	}
}