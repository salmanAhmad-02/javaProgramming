class ValidPalindrome{
    // Leet code problem - 125 
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int st = 0 , end = s.length()-1;
        while(st<end){
            char cL = s.charAt(st);
            char cR = s.charAt(end);
            if (!(cL >= 'a' && cL <= 'z' || cL >= '0' && cL <= '9')) {
                st++;
                continue;
            }
            if (!(cR >= 'a' && cR <= 'z' || cR >= '0' && cR <= '9')) {
                end--;
                continue;
            }
            if(cL != cR){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "A man, a plan, a canal: Panama";
        if(isPalindrome(s1)){
            System.out.println(s1+" : is Palindrome ");
        }
        else{
            System.out.println(s1+" is not a Palindrome");
        }
    }
}