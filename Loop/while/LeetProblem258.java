/*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
*Exmaple : 619 --> 6 + 1 + 9 = 16 --> 1 + 6 = 7 (input=619, output=7)
*/
class LeetProblem258{
    public static int addDigit(int num){
        if(num<=9){
            return num;
        }
        else if(num%9==0){
            return 9;
        }
        else{
            return num%9;
        }
    }
    public static void main(String[] args){
        int n1=0;
        int n2=36;
        int n3=619;

        int result1=addDigit(n1);
        int result2=addDigit(n2);
        int result3=addDigit(n3);

        System.out.println("For number : "+n1+" Sum of it's Digits is : "+result1);
        System.out.println("For number : "+n2+" Sum of it's Digits is : "+result2);
        System.out.println("For number : "+n3+" Sum of it's Digits is : "+result3);
    }
}