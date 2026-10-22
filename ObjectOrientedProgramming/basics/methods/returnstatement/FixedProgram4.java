class FixedProgram4{

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
		// The execution never reach outside the if- else , either return from if or from else , so the execution can never reach here , thats why the error was unreachable statement.
	}
}