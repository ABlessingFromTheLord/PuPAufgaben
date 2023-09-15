package E09_State;

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
        this.tier.setCurrentState(this.tier.getSchlechtGelaunt());
        System.out.println("Das tier ist leider schlecht gelaunt");
    }

    @Override
    public void trainieren() {
        this.tier.setCurrentState(this.tier.getSchlechtGelaunt());
        System.out.println("Das tier ist leider schlecht gelaunt");
    }

    @Override
    public void fuettern() {
        this.tier.setCurrentState(this.tier.getFroehlich());
        System.out.println("Das tier ist wieder froehlich");
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

    public String toString(){ return "schlafend"; }
}
