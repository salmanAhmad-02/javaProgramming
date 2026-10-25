class ReverseWords2{
    public static void main(String[] args){
        String s1 = "Hello Java      String";
        System.out.println(s1);
        String res = getReversedByBuilder(s1);
        System.out.println(res);
    }
    public static String getReversedString(String s){
        String temp = "";
        String rev = "";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                temp = c+temp;
            }
            if(c==' ' || i==s.length()-1){
                rev = rev+" "+temp;
                temp = "";
            }
        }
        return rev.strip();
    }
    public static String getReversedByBuilder(String s){
        StringBuilder temp =  new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                temp.insert(0, c);
            }
            if(c==' ' || i==s.length()-1){
                rev.append(" "+temp);
                temp.setLength(0);
            }
        }
        return rev.toString().strip();
    }
}