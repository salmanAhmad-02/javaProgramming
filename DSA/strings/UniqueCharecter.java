package strings;
class UniqueCharecter{
    public static void main(String[] args){
        String input = "cdaecddba";
        printUnique(input);
    }
    public static void printUnique(String s){
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-97]++;
        }
        for(int i=0; i<26; i++){
            if(freq[i]==1){
                System.out.print((char)(i+97)+" ");
            }
        }
    }
}