class MostFrequentChar{
    // for most frequent charecter : On a lower case string.
    public static void printMostFrequent(String s){
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-97]++;
        }
        int count=0; char c = '\0';
        for(int i=0; i<freq.length; i++){
            if(freq[i]>count){
                c = (char)(i + 97);
                count = freq[i];
            }
        }
        System.out.println("Most Frequent Charecter is "+c+" : "+count+" times.");
    }
    public static void main(String[] args){
        String s1 = "dbbbaaddcckkkk";
        printMostFrequent2(s1);
    }
    // In other ways it also can be printed as :
    public static void printMostFrequent2(String s){
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-97]++;
        }
        //Just track the indexes of the freq array
        int maxIndex=0;
        int count=0;
        for(int i=0; i<freq.length; i++){
            if(freq[i]>count){
                maxIndex = i;
                count = freq[i];
            }
        }
        System.out.println("Most Frequent Charecter is "+ (char)(maxIndex + 97) +" : "+count+" times.");
    }
}