/*
    Compression Example :
    case 1: 
        input : "cdaecddbaaae"
        output : "1c1d1a1e1c2d1b3a1e"  
        Explanation : Write the appearence of charecters in their begning.

    case 2 :
        input : "aaaaaaaaaaaaaaaaaaaabbbkkkkkkkkkk"
        output : "9a9a2a3b9k1k"  
        Explanation : 'a' appears 20 times, but rule is that if a charecter appears more than 9 times, 
            write it into form of max 9 appearence, so 'a' become "9a9a2a" : 20a.
            '3b', and 'k' is 10 times so "9k1k".

*/
public class Compression3{
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
                while(count>9){
                    res.append(9);
                    res.append(s.charAt(i - 1));
                    count -=9;
                }
                res.append(count);
                res.append(s.charAt(i - 1));

                count = 1;
            }
        }
        while(count>9){
            res.append(9);
            res.append(s.charAt(s.length()-1));
            count -=9;
        }
        res.append(count);
        res.append(s.charAt(s.length()-1));

        return res.toString();
    }
}