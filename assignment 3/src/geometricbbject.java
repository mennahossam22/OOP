import java.util.Date;

public abstract class geometricbbject
{
    private String color;
    private boolean filled;


    public geometricbbject(){

    }

    public geometricbbject(String color, boolean filled){
        this.color = color;
        this.filled = filled;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getarea();
    public abstract double getperimeter();

}
