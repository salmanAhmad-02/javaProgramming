class PrintFreqencyOfChar2{
    // for a strings that may have a-z,A-Z,0-9, and special charecters
    public static void printFrequency(String s){
        int[] freq = new int[128];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            // to print only one time for a charecter 
            if(freq[c]>0){
                System.out.println(c+" is : "+freq[c]+" times");
                freq[c] = 0;
            }
        }
    }
    public static void main(String[] args){
        String s1 = "dbbbaaddcckkADGDUDJJB@#$%,";
        printFrequency(s1);
    }
}