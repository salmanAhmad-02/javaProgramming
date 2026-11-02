/* A String is callled Pangram if it consist each and every charecter from a to z , at least once */
class CheckPangram{
    public static void main(String[] args){
        String s1 = "thequickbrownfoxjumpsoverthelazydog";

        if(isPangram(s1)){
            System.out.println("Given String is Pangram");
        }
        else{
            System.out.println("Given String is NOT Pangram");
        }
    }
    public static boolean isPangram(String s){
        if(s.length()<26){
            return false;
        }
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)-97]++;
        }
        for(int i = 0; i < 26; i++){
            if(freq[i]<1){
                return false;
            }
        }
        return true;
    }
}