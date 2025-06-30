package lalitidlisachamakerpvtltd;


public class TrayRack extends Tray{
   
    private Rack rack;

    public TrayRack(double CircleDiameter,int numberOfDeep,double hemisphereRadius,int numberOfTray,double cylinderDiameter, double height) {
        super(CircleDiameter, numberOfDeep, hemisphereRadius, numberOfTray);
        rack=new Rack(cylinderDiameter,height);
    }

    public Rack getRack()
    {
        return rack;
    }
    public void setRack(Rack rack) {
        this.rack = rack;
    }
   
    public double getDeepMasalaRequired()
    {
        return getDeepVolume()*Values.idliMasalaDensity;
    }
    public double getFullTrayMasalaRequired()
    {
        return getVolumeOfTray()*Values.idliMasalaDensity;
    }
    public double getFullRackMasalaReqyired()
    {
        return getNumberOfTray()*getFullTrayMasalaRequired();
    }

    
    
}
