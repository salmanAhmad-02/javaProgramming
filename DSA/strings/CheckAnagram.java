class CheckAnagram{
    public static void main(String[] args){
        String s1 = "silent";
        String s2 = "listen";

        if(isAnagram(s1,s2)){
            System.out.println(s1+" - "+s2+" , Are Anagram.");
        }
        else{
            System.out.println(s1+" - "+s2+" , Not Anagram.");
        }
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-97]++;
        }
        for(int i=0; i<t.length(); i++){
            if(freq[t.charAt(i)-97]==0){
                return false;
            }
            freq[t.charAt(i)-97]--;
        }
        return true;
    }
}