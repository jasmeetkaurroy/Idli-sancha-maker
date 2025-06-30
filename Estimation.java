package lalitidlisachamakerpvtltd;


public class Estimation {
    public static void print(TrayRack tr)
    {
        if(tr.getTrayDiameter()==Limitations.smallTrayDiameter)
        {
            System.out.println("\"Small tray\" ");
        }
        else if(tr.getTrayDiameter()==Limitations.mediumTrayDiameter)
        {
            System.out.println("Medium tray ");
        }
        else if(tr.getTrayDiameter()==Limitations.largeTrayDiameter)
        {
            System.out.println("Large tray");
        }
        
        System.out.println("Tray area "+tr.getTrayArea());
        System.out.println("Total number of tray "+tr.getNumberOfTray());
        System.out.println("Total tray height "+tr.getTotalTrayHeight());
        System.out.println("Tray volume "+tr.getVolumeOfTray());
        System.out.println("All tray volume "+tr.getTotalTrayVolume());
        System.out.println("Rack volume "+tr.getRack().getRackVolume());
        System.out.println("Idli masala density "+Values.idliMasalaDensity);
        System.out.println("Individual deep masala required "+tr.getDeepMasalaRequired());
        System.out.println("Full tray masala required "+tr.getFullTrayMasalaRequired());
        System.out.println("Full rack masala required "+tr.getFullRackMasalaReqyired());
    }
}
