class Example{
/*
    access specifier - public , protected, don't tell antthing (default), private  : Not Necessary but recommended
    non-access modifier like - static, final, syncronized, abstract etc , a mothod can have more than one non access modifier : Not Necessary 
    return type - void , int , String , int[] etc : Necessary
    Method name - e.g main, printSum, getDetails, etc : Necessary
    () - parameter list or Formal Parameter List : Necessary
    { } - Method Block or Method Body : Not Necessary (the method can be abstract)
*/

    // Static method : can be used via class refrence , or directly within same class
    public static void printSum(int a, int b){
        int sum= a + b;
        System.out.println("Sum of "+a+" and "+b+" is : "+sum);
    }
    // Non-static method : can only be used on object refrence 
    void printSubtraction(int a, int b){
        System.out.println("Output :  "+a+" - "+b+" = "+(a-b));
    }
    public static void main(String[] args){
        printSum(18, 22);

        Example e = new Example();
        e.printSubtraction(22, 18);
    }
}