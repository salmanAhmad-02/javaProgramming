public class Decompression{
    public static String decode(String s){
        int left = 0, right = 0;
        int num = 0;

        StringBuilder res = new StringBuilder();

        while(right < s.length()){
            char c = s.charAt(right);
            if(c >= 48 &&  c <= 57){
                num = num*10 + c - 48;
            }
            else{
                while(num > 0){
                    res.append(s.charAt(left));
                    num -=1;
                }
                left = right;

                // num = 0; for the cases where using repeat() ...
                // Reset num to 0 if using String.repeat(), since it doesn't modify num.
            }
            right++;
        }
        while(num > 0){
            res.append(s.charAt(left));
            num -=1;
        }

        // This approach requires converting char to String.
        // Alternative: Repeat the character using String.repeat() and append the resulting String to res.

        // String temp = String.valueOf(s.charAt(left)).repeat(num);
        // res.append(temp);

        return res.toString();
    }
    public static  void main(String[] args){
        String input = "a2b15c23d21";

        String output = decode(input);

        System.out.println(output);
    }
}