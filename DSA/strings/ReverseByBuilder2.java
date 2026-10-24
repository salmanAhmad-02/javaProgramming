class ReverseByBuilder2{
    public static void main(String[] args){
        String s1= "Spaceship";
        String reversed=getReversed(s1);
        System.out.println(reversed);
    }
    public static String getReversed(String s){
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            rev.append(c);
        }
        return rev.toString();
    }
}