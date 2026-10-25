class ReverseEachWord{
    public static void main(String[] args){
        String s1= "Hello World";
        System.out.println("Original : "+s1);
        String res = getReversedString(s1);
        System.out.println("Result : "+res);
    }
    public static String getReversedString(String s){
        StringBuilder temp = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c != ' ')
                temp.append(c);
            if(c == ' ' || i == 0){
                rev.append(temp+" ");
                temp = new StringBuilder();
            }
        }
        return rev.toString();
    }
}