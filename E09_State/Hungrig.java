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
        this.tier.setEnergie(-1);
        this.tier.setHunger(1);
    }

    @Override
    public void trainieren() {
    }

    @Override
    public void fuettern() {
        this.tier.setHunger(-1 *(this.tier.getHunger()));
        this.tier.setCurrentState(this.tier.getFroehlich());
    }

    @Override
    public void schlaffen() {

    }

    @Override
    public void updateVitals() {

    }

    @Override
    public void checkVitals() {
        if (this.tier.getEnergie() == 0) {
            this.tier.setCurrentState(this.tier.getSchlafend());
        }
        else if (this.tier.getHunger() > 10) {
            this.tier.setCurrentState(this.tier.getHungrig());
        }
        else if (this.tier.getEnergie() >= 16){
            this.tier.setCurrentState(this.tier.getFroehlich());
        }
    }

    public String toString(){ return "hungrig"; }
}
