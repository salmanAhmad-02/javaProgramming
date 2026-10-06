class AnimalDriver{
    public static void main(String[] args){
        Animal catInfo=new Animal();
        Animal horseInfo=new Animal();
        Animal cowInfo=new Animal();
        

        // Object Initialization : for catInfo 
        catInfo.breed="Persian";
        catInfo.legCount=4;
        catInfo.color="White";
        catInfo.sound="Meawon";
        catInfo.age=1.5;
        catInfo.weight=4.6;

        // Object Initialization : for horseInfo 
        horseInfo.breed="Marwadi";
        horseInfo.legCount=4;
        horseInfo.color="Black";
        horseInfo.sound="ehhheeeeeehhhe";
        horseInfo.age=6.0;
        horseInfo.weight=155.0;

        // Object Initialization : for cowInfo 
        cowInfo.breed="Jersey";
        cowInfo.legCount=4;
        cowInfo.color="Yellowish Red";
        cowInfo.sound="bheeeeeeeeenh";
        cowInfo.age=3.0;
        cowInfo.weight=180.0;

        System.out.println("\n===================================Cat Details====================================");
        System.out.println("Cat Breed is : "+catInfo.breed);
        System.out.println("Color of cat is : "+catInfo.color);
        System.out.println("Cat Sound is : "+catInfo.sound);
        System.out.println("Cat age is : "+catInfo.age);
        System.out.println("Total legs a cat have : "+catInfo.legCount);
        System.out.println("weight of our cat is  : "+catInfo.weight);

        System.out.println("\n===================================Horse Details==================================");
        System.out.println("Horse Breed is : "+horseInfo.breed);
        System.out.println("Color of horse is : "+horseInfo.color);
        System.out.println("Horse Sound is : "+horseInfo.sound);
        System.out.println("Horse age is : "+horseInfo.age);
        System.out.println("Total legs a horse have : "+horseInfo.legCount);
        System.out.println("weight of our horse is  : "+horseInfo.weight);

        System.out.println("\n===================================Cow Details=====================================");
        System.out.println("Cow Breed is : "+cowInfo.breed);
        System.out.println("Color of cow is : "+cowInfo.color);
        System.out.println("Cow Sound is : "+cowInfo.sound);
        System.out.println("Cow age is : "+cowInfo.age);
        System.out.println("Total legs a cow have : "+cowInfo.legCount);
        System.out.println("weight of our cow is  : "+cowInfo.weight);

        System.out.println("\n=====================================END===========================================");
    }
}