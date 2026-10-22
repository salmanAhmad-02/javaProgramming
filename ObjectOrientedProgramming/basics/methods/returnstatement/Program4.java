class Program4{

	public static void main(String[] args){
		System.out.println(isEven(3536));
        System.out.println(isEven(3539));
	}
	public static boolean isEven(int n){
		if(n%2==0){
			return true;
		}else{
            return false;  
        }
		return false;        //compilation error: unreachable statement
	}
}