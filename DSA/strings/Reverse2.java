class Reverse2{
    public static void main(String[] args){
        String s1= "Himalya";
        String reversed=getReversed(s1);
        System.out.println(reversed);
    }
    public static String getReversed(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            rev = rev+""+c;
        }
        return rev;
    }
}