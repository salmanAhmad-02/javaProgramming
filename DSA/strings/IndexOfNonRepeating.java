
/* Get index of first non repeating charecter
    e.g. 1: i/p : "loveleetcode"
            o/p : 0 , 'v' is first non repeating charecter.

    e.g. 2:  i/p : "aabb"
             o/p : -1 , there are no unique charecter.
*/
class IndexOfNonRepeating{
    public static void main(String[] args){
        String input = "loveleetcode";
        int idx = getNonRepeated(input);
        String res = (idx >= 0) ? "Index is " + idx : " Not Exist ! "+idx;
        System.out.println(res);
    }
    public static int getNonRepeated(String s){
        if(s.length()==1){
            return 0;
        }
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-97]++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i)-97]==1){
                return i;
            }
        }
        return -1;
    }
}