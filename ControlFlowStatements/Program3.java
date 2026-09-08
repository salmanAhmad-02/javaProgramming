/* Q- WAP to provide discounter price as per below conditions 
*	if shoppping price>=10000 then %discount is 40%
*	Shopping price>=6000 and price<=9999 then discount is 30%
*	shopping price>=3000 and price<5999 then discount 20%
*	Shopping price>=1 and price<=2999 then discount 8%
*/

class Program3{
	public static void main(String[] args){
		int price=5000;
		System.out.println("Total Shopping Price is: "+price);
		if(price>=10000){
			System.out.println("You got 40% discount");
			System.out.println("You have to pay: "+price*0.6);
		}else if(price>=6000){
			System.out.println("You got 30% discount");
			System.out.println("You have to pay: "+price*0.7);
		}else if(price>=3000){
			System.out.println("You got 20% discount");
			System.out.println("You have to pay: "+price*0.8);
		}else{
			System.out.println("You got 8% discount");
			System.out.println("You have to pay: "+price*0.92);
		}
		System.out.println("====Application ends========");
			
	}
}