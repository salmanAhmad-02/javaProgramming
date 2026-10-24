class ReverseByBuilder1{
    public static void main(String[] args){
        String s1= "Spaceship";
        String reversed=getReversed(s1);
        System.out.println(reversed);
    }
    public static String getReversed(String s){
        StringBuilder rev = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            rev.insert(0,c);
        }
        return rev.toString();
    }
}