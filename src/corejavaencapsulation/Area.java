package corejavaencapsulation;

/**
 * Area class, all fields, methods constructor to calculate area will be defined here
 * That is, all implementation to calculate are is here... then mainArea class will call methods
 * from here.
 */
public class Area {

    //define fields to calculate area of a rectangle
    int length;
    int breadth;

    // define constructor to initialize values
    Area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    // define method to calculate the area
    public void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of a rectangle is : " + area);
        
    }
    
}
