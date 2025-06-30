package lalitidlisachamakerpvtltd;


public class Validations {
    public static boolean validateDeepCount(double trayDiameter,int numberOfDeeps)
    {
        if(trayDiameter==Limitations.smallTrayDiameter)
        {
            if(numberOfDeeps>=Limitations.minimumNumberOfSmallDeep && numberOfDeeps<=Limitations.maximumNumberOfSmallDeep)
                return true;
        }
        else if(trayDiameter==Limitations.mediumTrayDiameter)
        {
            if(numberOfDeeps>=Limitations.minimumNumberOfMediumDeep && numberOfDeeps<=Limitations.maximumNumberOfMediumDeep)
                return true;
        }
        else if(trayDiameter==Limitations.largeTrayDiameter)
        {
            if(numberOfDeeps==Limitations.exactNumberOfLargeDeep)
                return true;
        }
        return false;
    }
    
    public static boolean validateTrayCount(int numberOfTray)
    {
        if(numberOfTray>=Limitations.minimumNumberOfTray && numberOfTray<=Limitations.maximumNumberOfTray)
            return true;
        else
            return false;
    }
    
    public static boolean validateTrayDiameter(double trayDiameter)
    {
        if(trayDiameter==Limitations.smallTrayDiameter)
            return true;
        else if(trayDiameter==Limitations.mediumTrayDiameter)
            return true;
        else if(trayDiameter==Limitations.largeTrayDiameter)
            return true;
        else
            return false;
    }
    
    public static boolean validateTrayRackHeight(double rackHeight,double trayHeight)
    {
        double minimumTrayHeight=(rackHeight*70)/100;
        double maximumTrayHeight=(rackHeight*85)/100;
        
        if(trayHeight>=minimumTrayHeight && trayHeight<=minimumTrayHeight)
        {
            return true;
        }
        return false;
    }
    
     public static boolean validateTrayRackDiameter(double trayDiameter,double rackDiameter)
    {
        
        if(trayDiameter>=(rackDiameter*70)/100 && trayDiameter<=(rackDiameter*80)/100)
            return true;
        else
        return false;
    }
     
      public static boolean validateTrayArea(double numberOfDeeps,double deepRadius,double trayRadius)
    {
        double trayArea=Math.PI*trayRadius*trayRadius;
        double totalDeepArea=Math.PI*deepRadius*deepRadius*numberOfDeeps;
        double minimumTrayArea=(trayArea*70)/100;
        double maximumTrayArea=(trayArea*85)/100;
        
        if(totalDeepArea>=minimumTrayArea && totalDeepArea<=maximumTrayArea)
        {
            return true;
        }
        return false;
    }
}
