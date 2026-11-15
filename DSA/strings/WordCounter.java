public class WordCounter {
    public static void main(String[] args) {
        String input = " Mahi  is                           a good                    boy           ";
        int  words = getWordCount(input);

        System.out.println(input);
        System.err.println("Total words in given string are : "+words);

    }
    public static int getWordCount(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(i==0 && c !=' ' || c != ' ' && s.charAt(i-1)==' '){
                count +=1;
            }
        }
        return count;
    }
}
