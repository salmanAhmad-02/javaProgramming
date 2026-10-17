class FascinatingCheck{
    public static boolean isFascinating(int n){
        String num = n + "" + (2 * n) + "" + (3 * n);
        // if the length() of concatenated number more or less than 9 immediately return fals.
        if(num.length() != 9){
            return false;
        }
        int[] freq=new int[10];
        for(int i=0; i<num.length(); i++){
            char c = num.charAt(i);
            if( c- 48 == 0){
                return false;
            }
            freq[c-48]++;
        }
        for(int i=1; i<10; i++){
            if(freq[i]==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        int n=192;
        if(isFascinating(n))
            System.out.println(n +" Is Facinating Number.");
        else
            System.out.println(n +" Is Not Facinating.");
    }
}