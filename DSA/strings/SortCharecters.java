package strings;
class SortCharecters{
    public static void main(String[] args){
        String input = "cdaecddba";
        //output strings = aabbcddde
        sort(input);
    }
    public static void sort(String s){
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-97]++;
        }
        int count = freq[0];
        for(int i=0; i<26; i++){
            while(count-->0){
                System.out.print((char)(i+97));
            }
            count = freq[i];
        }
    }
}