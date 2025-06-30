package lalitidlisachamakerpvtltd;

public class Cylinder {
    protected double cylinderDiameter;
    protected double height;

    public Cylinder(double cylinderDiameter, double height) {
        this.cylinderDiameter = cylinderDiameter;
        this.height = height;
    }

    public double getCylinderDiameter() {
        return cylinderDiameter;
    }

    public void setCylinderDiameter(double cylinderDiameter) {
        this.cylinderDiameter = cylinderDiameter;
    }

    public double getCylinderHeight() {
        return height;
    }

    public void setCylinderHeight(double height) {
        this.height = height;
    }
    public double getCylinderRadius()
    {
        return getCylinderDiameter()/2;
    }
    public double getCylinderVolume()
    {
        return Math.PI*getCylinderRadius()*getCylinderRadius()*height;
    }
    
}
