class ReverseWordSequence{
    public static String reverseWords(String s) {
        StringBuilder temp = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                temp.append(c);
            }
            if((c == ' ' || i==s.length()-1) && temp.length() > 0){
                res.insert(0, " "+temp);
                temp.setLength(0);
            }
        }
        return res.toString().strip();
    }
    public static void main(String[] args){
        String s1 = "  hello            world  ";
        String res = reverseWords(s1);  //"world hello"
        System.out.println(res);
    }
}