// Loacal variable can only be accessed in the block where it been declared ...
class LoacalExample{
    
    public static void test(){
        /* Correct way of declare local variable to pass a initial value ..
        * Local Variable don't have any default value.
        */
        int x=10;
        // the scope of the variable 'x' is in this test metod only 

        System.out.println("Local X : "+x);
    }
    public static void main(String[] args){
        test();
        // System.out.println("test X in main : "+x); -- compilation error , can't find symbol , because x not in range of main()
    }
}