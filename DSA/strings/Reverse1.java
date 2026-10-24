class Reverse1{
    public static void main(String[] args){
        String s1= "Mahiya";
        String reversed=getReversed(s1);
        System.out.println(reversed);
    }
    public static String getReversed(String s){
        String rev = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            rev = c+""+rev;
        }
        return rev;
    }
}