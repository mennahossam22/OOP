public class triangle extends geometricbbject
{
    private double side1, side2, side3 =1;

    public triangle() {}

    public triangle (double side1, double side2, double side3,String color,boolean filled){
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getarea(){
        return side1 * side2 * side3;
    }

    public double getperimeter() {
        return side1 + side2 +side3;
    }

}
