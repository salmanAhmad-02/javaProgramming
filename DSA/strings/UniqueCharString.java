/* This program is to tell that all charecters in a string are unique or not.
    Example:    "superb"  : true
                "good"  : false
    Contain lower case letters of English.
*/
class UniqueCharString{
    public static void main(String[] args){
        String eg = "abcdefghijklmnopqrstuvwxyz";

        if(isUnique(eg)){
            System.out.println(eg+" : is unique");
        }
        else{
            System.out.println(eg+" : Not unique");
        }
    }
    public static boolean isUnique(String s){
       if(s.length()<=1)
            return true;
        
        boolean[] freq = new boolean[26];
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-97]){
                return false;
            }
            else{
                freq[s.charAt(i)-97] = true;
            }
        }
        return true;
    }
}