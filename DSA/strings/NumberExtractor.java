public class NumberExtractor {
    public static int countNumbers(String s){
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if((i == 0 && c >= 48 && c <= 57) || (c >= 48 && c<= 57 && !(s.charAt(i-1) >= 48 && s.charAt(i-1) <= 57))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String s1 = "ab3de48cd325ee155de678";
        int numCount = countNumbers(s1);

        int largest = getLargestNumber(s1);

        System.out.println("Total Number are : "+numCount);
        System.out.println("Largest Number is : "+largest);
    }
    public static int getLargestNumber(String s){
        int num = 0, largestNumber = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 48 && c <= 57 ){
                num = num*10 + c - 48;
            }
            else{
                if(num > largestNumber){
                    largestNumber = num;
                }
                num = 0;
            }
        }
        if(num > largestNumber){
            largestNumber = num;
        }
        return largestNumber;
    }
}
