
package lalitidlisachamakerpvtltd;

public class Tray extends Circle{

    private Deep deep;
    private int numberOfTray;

    public Tray(double CircleDiameter,int numberOfDeep,double hemisphereRadius,int numberOfTray) {
        super(CircleDiameter);
        deep=new Deep(numberOfDeep,hemisphereRadius);
        this.numberOfTray = numberOfTray;
    }
    
    public Deep getDeep()
    {
        return deep;
    }

    public void setDeep(Deep deep) {
        this.deep = deep;
    }

    public double getNumberOfTray() {
        return numberOfTray;
    }

    public void setNumberOfTray(int numberOfTray) {
        this.numberOfTray = numberOfTray;
    }

    public double getTrayDiameter()
    {
        return getCircleDiameter();
    }
    
    public double getTrayHeight()
    {
        return deep.getHemisphereRadius();
    }
    public double getTotalTrayHeight()
    {
        return getNumberOfTray()*getTrayHeight();
    }
    public double getDeepArea()
    {
        return deep.getHemisphereArea();
    }
    public double getDeepVolume()
    {
        return deep.getHemisphereVolume();
    }
    public double getTotalVolumeOfDeep()
    {
        return deep.getNumberOfDeep()*getDeepVolume();
    }
    public double getTrayArea()
    {
        return getAreaOfCircle();
    }
    public double getVolumeOfTray()
    {
        return getTotalVolumeOfDeep();
    }
    public double getTotalTrayVolume()
    {
        return getNumberOfTray()*getVolumeOfTray();
    }
}
