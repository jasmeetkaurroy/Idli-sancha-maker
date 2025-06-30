package lalitidlisachamakerpvtltd;

public class LalitIdliSachaMakerPvtLtd {

    public static void main(String[] args) {
        int numberOfDeeps=5;
        double deepRadius=3.5;
        int numberOfTray=4;
        double trayDiameter=18;
        double rackDiameter=23;
        double rackHeight=10;
        
        boolean deepCountValidation=Validations.validateDeepCount(trayDiameter, numberOfDeeps);
        boolean trayCountValidate=Validations.validateTrayCount(numberOfTray);
        boolean trayDiameterValidate=Validations.validateTrayDiameter(trayDiameter);
        boolean trayRackHeightValidate=Validations.validateTrayRackHeight(rackHeight,deepRadius*2);
        boolean trayRackDiameterValidate=Validations.validateTrayRackDiameter(trayDiameter, rackDiameter);
        boolean trayAreaValidate=Validations.validateTrayArea(numberOfDeeps, deepRadius, trayDiameter/2);
        
        
        
        if(deepCountValidation==true && trayCountValidate==true && trayDiameterValidate==true && trayRackHeightValidate==true && trayRackDiameterValidate==true && trayAreaValidate==true)
        {
            TrayRack tr=new TrayRack(trayDiameter,numberOfDeeps,deepRadius,numberOfTray,rackDiameter,rackHeight);
            Estimation.print(tr);
        }
        else
        {
            System.out.println("Incorrect data :(\nPlease enter valid data.");
        }
    }
    
}
