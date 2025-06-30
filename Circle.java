package lalitidlisachamakerpvtltd;


public class Circle {
    
    protected double CircleDiameter;

    public Circle(double CircleDiameter) {
        this.CircleDiameter = CircleDiameter;
    }

    public double getCircleDiameter() {
        return CircleDiameter;
    }

    public void setCircleDiameter(double CircleDiameter) {
        this.CircleDiameter = CircleDiameter;
    }
    
    public double getCircleRadius()
    {
        return (getCircleDiameter()/2);
    }
    
    public double getAreaOfCircle()
    {
        return Math.PI*getCircleRadius()*getCircleRadius();
    }
}
