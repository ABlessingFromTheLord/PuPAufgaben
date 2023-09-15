package E09_State;

public class Hungrig implements State{
    // Fields
    private Haustier tier;

    // Constructor
    public Hungrig(Haustier haustier) {
        this.tier = haustier;
        updateVitals();
        checkVitals();
    }

    // Methods
    // Getters
    public Haustier getTier() {
        return this.tier;
    }

    // Setters
    public void setTier(Haustier haustier) {
        this.tier = tier;
    }

    @Override
    public void spielen() {
        System.out.println("Das Tier ist zu hungrig zum spielen");
    }

    @Override
    public void trainieren() {
        System.out.println("Das Tier ist zu hungrig zum trainieren");
    }

    @Override
    public void fuettern() {
        this.tier.setHunger(-1 *(this.tier.getHunger()));
        this.tier.setCurrentState(this.tier.getFroehlich());
        System.out.println("Das tier ist wieder fröhlich");
    }

    @Override
    public void schlaffen() {
        System.out.println("Das Tier ist zu hungrig zum schlaffen");
    }

    @Override
    public void updateVitals() {

    }

    @Override
    public void checkVitals() {
        if (this.tier.getEnergie() == 0) {
            this.tier.setCurrentState(this.tier.getSchlafend());
            System.out.println("keine Energie mehr, das tier ist schlafend");
        }
        else if (this.tier.getHunger() > 10) {
            this.tier.setCurrentState(this.tier.getHungrig());
            System.out.println("Das tier ist hungrig");
        }
        else if (this.tier.getEnergie() >= 16){
            this.tier.setCurrentState(this.tier.getFroehlich());
            System.out.println("Das tier ist wieder fröhlich");
        }
    }

    public String toString(){ return "hungrig"; }
}
