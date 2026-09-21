class Program1{
    public static void main(String[] args){
        int[] ages={22,20,19,25,22,19};
        System.out.println(ages);   //[I@somehexdecimal code
        // [ : represent 1-D array
        // I : Stands for the data type int.
        //  @ : A Seprator
        // 5a4041cc : Something like this hexadecimal code 

        System.out.println(ages.length);    //length of the array -- in this case 6

        System.out.println(ages[0]);        //22
        System.out.println(ages[1]);        //20
        System.out.println(ages[2]);        //19
        System.out.println(ages[3]);        //25
        System.out.println(ages[4]);        //22
        System.out.println(ages[5]);        //19

        System.out.println(ages[ages.length-1]);        //last index value , here 19
        System.out.println(ages[ages.length]);          //Error, Exception, ArrayIndexOutOfBoundsEsception
    }
}