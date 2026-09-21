class Program2{
    public static void main(String[] args){
        int n=577;
        String[] msg={"Even", "Odd"};
        System.out.println(n+" is : "+msg[n%2]);

        /* msg[n%2] - Explanation
          if n%2 is evaluated as remainder 0 means , msg[0] -- "Even" 
          either its avaluated as remainder 1 means , msg[1] -- "Odd" 
        */
    }
}