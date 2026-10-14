class Vehicle extends Thread{
    String name;
    int distance;

    Vehicle(String name, int distance){
        this.name=name;
        this.distance=distance;
    }
    public void travel(){
        System.out.println(name+"===== Stared Travel ======");
        for(int i=0; i<=distance; i++){
            System.out.println(name+" Covered Distance : "+i+" KM");
        }
        System.out.println(name+"===== Reached Destination =====");
    }
    public void run(){
        travel();
    }
}