/*
 This Example based on calculations of corcle.
 Also going to control this class via CircleDriver class.
*/
class StaticVariableExample{
    // static one , and that will be same shared across all objects, (also defined it as final so it value can not updated)
    static final double PI=3.14159;

    //other one 
    double radius;

    public StaticVariableExample(double radius){
        this.radius=radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getCircumference(){
        return 2*PI*radius;
    }
}