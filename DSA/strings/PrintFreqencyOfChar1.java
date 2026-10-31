class PrintFreqencyOfChar1{
    // containing only lowercase strings a-z.
    public static void printFrequency(String s){
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-97]++;
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            // to print only one time for a charecter 
            if(freq[c-97]>0){
                System.out.println(c+" is : "+freq[c-97]+" times");
                freq[c-97] = 0;
            }
        }
    }
    public static void main(String[] args){
        String s1 = "dbbbaaddcckk";
        printFrequency(s1);
    }
}