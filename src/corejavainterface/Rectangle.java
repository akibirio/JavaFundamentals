package corejavainterface;

public class Rectangle implements PolygonInterface{
    //implentation of the abstract method in the PolyginInterface
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is : " + (length*breadth));
        
    }
    
}
