class Cuboid{
    private double length;
    private double width;
    private double height;

    // Creation Initialization assigning 
    public Cuboid(double length, double width, double height){
        // Guard against 0 or negative inputs.
        if(length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }
        this.length=length;
        this.width=width;
        this.height=height;
    }
    // Modification - reassigning 
    public void setDetails(double length, double width, double height){
        // Guard against 0 or negative inputs.
        if(length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive.");
        }
        this.length=length;
        this.width=width;
        this.height=height;
    }
    // Volume
    public double getVolume(){
        return length*width*height;
    }
    // Total Surface Area (TSA) : The total area of all six faces. - 2(lw+wh+hl)
    public double getTotalSurfaceArea(){
        double area = 2*(length*width + width*height + height*length);
        return area;
    }
    // Lateral Surface Area (LSA) : The combined area of the four side faces, excluding the top and bottom. - 2h(l+w)
    public double getLateralSurfaceArea(){
        double area = 2*height*(length + width);
        return area;
    }
    // Base Area (The area of the rectangular bottom face.) = l*w 
    public double getBaseArea(){
        return length*width;
    }
    // Base perimeter (The total length around the bottom rectangle.) = 2(l+w)
    public double getBasePerimeter(){
        return 2*(length+width);
    }

    // For printing all details at one ,either use seprate method for seprate work.
    public void printAllDetails(){
        System.out.print("\n");
        System.out.println("Length is : "+length);
        System.out.println("Width is : "+width);
        System.out.println("Height is : "+height);
        System.out.println("Volume is  : "+getVolume());
        System.out.println("Total Surface Area is : "+getTotalSurfaceArea());
        System.out.println("Lateral Surface Area is : "+getLateralSurfaceArea());
        System.out.println("Base Area is : "+getBaseArea());
        System.out.println("Base Parimeter is : "+getBasePerimeter());
    }
}