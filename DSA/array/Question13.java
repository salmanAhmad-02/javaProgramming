// For the given array of Strings, print the largest string.
class Question13{
    public static void largestString(String[] str){
        String largest=str[0];
        for(String s:str){
            if(s.length()>largest.length()){
                largest = s;        //if more than one same length string hold 1st occuring.
            }
        }
        System.out.println("Largest String is : "+largest);
    }
    public static void main(String[] args){
        String[] fruits = {"Apple", "Banana", "Mango", "Orange", "Grapes"};
        largestString(fruits);
    }
}