/*
    Compression Example :
    input : "cdaecddba"
    output : "a2b1c2d3e1" 
    Explanation : 'a' appears 2 times 'b' is 1 time 'c' is 2 times , d appears 3 times and e is 1 time in the given string.
*/
class Compression1{
    public static void main(String[] args){
        String input = "cdaecddba";
        String output = getCompressed(input);

        System.out.println("Original String :"+input);
        System.out.println("Compressed String :"+output);
    }
    public static String getCompressed(String s){
        if(s.length()==1){
            return s+1;
        }
        int[] freq= new int[26];
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i)-97]++;
        }

        StringBuilder res = new StringBuilder();
        //int count=0;
        for(int i = 0; i<freq.length; i++){
           if(freq[i]>0){
                res.append((char)(i+97));
                int c = freq[i];
                res.append(c);
           }
        }
        return res.toString();
    }
}