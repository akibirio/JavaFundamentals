package corejavapolymorphism;

public class Sqaure extends Polygon {
    // render square, inherit render() from polygon
    @Override
    public void render() {
        System.out.println("Rendering Square ... ");
    }
    
}
