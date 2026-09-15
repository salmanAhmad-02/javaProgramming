// Remove Zeors in decimal representation
// e.g -- input = 102 ; return output=12;
// e.g.2-- input = 32023010; output=32231
class LeetProblem3726{
    public static long removeZeros(long n){
        long updatedNumber=0; long position=1;
        while(n>0){
            long digit=n%10;
            if(digit!=0){
                updatedNumber +=position*digit;
                position *= 10;
                
            }
            n /=10;
        }
        return updatedNumber;
    }
    public static void main(String[] args){
        long num1=102;
        long num2= 32023010;

        long result1=removeZeros(num1);
        long result2=removeZeros(num2);

        System.out.println("\nBefore with Zeros : "+num1+"\nAfter Removal Of Zeros : "+result1);
        System.out.println("\nBefore with Zeros : "+num2+"\nAfter Removal Of Zeros : "+result2);
    }
}