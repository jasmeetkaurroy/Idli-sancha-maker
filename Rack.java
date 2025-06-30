package lalitidlisachamakerpvtltd;

public class Rack extends Cylinder{

    public Rack(double cylinderDiameter, double height) {
        super(cylinderDiameter, height);
    }
    public double getRackHeight()
    {
        return getCylinderHeight();
    }
    public double getRackDiameter()
    {
        return getCylinderDiameter();
    }
    public double getRackVolume()
    {
        return getCylinderVolume();
    }
}
