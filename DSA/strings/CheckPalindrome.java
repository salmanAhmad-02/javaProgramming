class CheckPalindrome{
    public static void main(String[] args){
        String s1= "Racecar";
        if(isPalindrome(s1)){
            System.out.println(s1+" is a Palindrome");
        }
        else{
            System.out.println(s1+" is not a Palindrome");
        }
    }
    public static boolean isPalindrome(String s){
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            rev.append(c);
        }
        return rev.toString().equalsIgnoreCase(s);
    }
}