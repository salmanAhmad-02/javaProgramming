/*
    Compression Example :
    case 1: 
        input : "cccdddeecc"
        output : "3c2d2e2c"  
        Explanation :  Write the appearence of charecters in their begning.

    case 2 :
        input : "aaaaaaaaaaaaaaaaaaaabbbkkkkkkkkkk"
        output : "20a3b10k" 
        Explanation : Total number of occurence of a continous charecters.


*/
class Compression2{
    public static void main(String[] args){
        String input = "aaaaaaaaaaaaaaaaaaaabbbkkkkkkkkkk";
        String output = compressedString(input);

        System.out.println("Original String :"+input);
        System.out.println("Compressed String :"+output);
    }
    public static String compressedString(String s){
        if(s.length()==1){
            return 1+s;
        }

        StringBuilder res = new StringBuilder();
        
        int count=1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                res.append(count);
                res.append(s.charAt(i - 1));

                count = 1;
            }
        }
        res.append(count);
        res.append(s.charAt(s.length() - 1));

        return res.toString();
    }
}