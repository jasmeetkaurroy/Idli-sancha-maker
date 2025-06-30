package lalitidlisachamakerpvtltd;


public class Deep extends Hemisphere {

    private int numberOfDeep;

    public Deep(int numberOfDeep, double hemisphereRadius) {
        super(hemisphereRadius);
        this.numberOfDeep = numberOfDeep;
    }
    
    public int getNumberOfDeep() {
        return numberOfDeep;
    }

    public void setNumberOfDeep(int numberOfDeep) {
        this.numberOfDeep = numberOfDeep;
    }
   
}
