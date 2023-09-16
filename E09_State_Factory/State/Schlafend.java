package E09_State_Factory.State;

public class Schlafend implements State{
    // Fields
    private Haustier tier;

    // Constructor
    public Schlafend(Haustier haustier) {
        this.tier = haustier;
    }

    // Methods
    // Getters
    public Haustier getTier() {
        return this.tier;
    }

    // Setters
    public void setTier(Haustier haustier) {
        this.tier = tier;
        updateVitals();
        checkVitals();
    }

    @Override
    public void spielen() {
        this.tier.setEnergie(-1);
        this.tier.setHunger(1);
        this.tier.setCurrentState(this.tier.getSchlechtGelaunt());
    }

    @Override
    public void trainieren() {
        this.tier.setCurrentState(this.tier.getSchlechtGelaunt());
    }

    @Override
    public void fuettern() {
        this.tier.setCurrentState(this.tier.getFroehlich());
    }

    @Override
    public void schlaffen() {
        this.tier.setEnergie(4);
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

    public String toString(){ return "schlafend"; }
}
