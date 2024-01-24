package src;
public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = getVolume(height, perimeter, baseArea);
        return volume;
    }

    private static double getVolume(int height, double perimeter, double baseArea) {
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getPerimeter(int radius) {
        double perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }

    private static double getBaseArea(int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
}
