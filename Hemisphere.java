package lalitidlisachamakerpvtltd;


public class Hemisphere {
    protected double hemisphereRadius;

    public Hemisphere(double hemisphereRadius) {
        this.hemisphereRadius = hemisphereRadius;
    }

    public double getHemisphereRadius() {
        return hemisphereRadius;
    }

    public void setHemisphereRadius(double radius) {
        this.hemisphereRadius = hemisphereRadius;
    }
    
    public double getHemisphereVolume()
    {
        return ((2*Math.PI*hemisphereRadius*hemisphereRadius*hemisphereRadius)/3);
    }
    public double getHemisphereArea()
    {
        return 3*Math.PI*getHemisphereRadius()*getHemisphereRadius();
    }
    
   
}
