class PowerOfNumbers{
    public static int getPower(int base, int exponent){
        int pow=1;
        for(int i=1; i<=exponent; i++){
            pow *=base;
        }
        return pow;
    }
    public static void main(String[] args){
        int base=4;
        int exponent=3;

        int power=getPower(base,exponent);
        System.out.println(base+"^"+exponent+" = "+power);
    }
}