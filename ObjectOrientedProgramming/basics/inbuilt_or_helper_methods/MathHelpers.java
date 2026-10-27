class MathHelpers{
    public static void main(String[] args){
        //  public static double sqrt(double) in the Math class , java.lang package 
        double res = Math.sqrt(9);
        System.out.println(res);

        //   public static double cbrt(double) int the Math class , java.lang package 
        System.out.println(Math.cbrt(27));

        System.out.println(Math.ciel(32.1)); //return upper integer

        System.out.println(Math.floor(32.5));   //return lower integer

        System.out.println(Math.round(32.1)) ;   //round off value , val >= .5 , upper , 

        System.out.println(Math.pow(10, 3));    //return power 

        System.out.println(Math.random());      // generate any rendom value 1<val>0 

        System.out.println(Math.abs(12, -10));         //returns abosolute value   
    }
}