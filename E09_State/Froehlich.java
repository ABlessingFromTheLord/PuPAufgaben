package E09_State;

public class Froehlich implements State{
    // Fields
    private Haustier tier;

    // Constructor
    public Froehlich(Haustier haustier) {
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
        // not specified in task
    }

    @Override
    public void trainieren() {
        this.tier.setCurrentState(this.tier.getFroehlich());
        System.out.println("Das tier ist fröhlich");
    }

    @Override
    public void fuettern() {
        this.tier.setCurrentState(this.tier.getSchlechtGelaunt());
        System.out.println("Das tier ist leider schlecht gelaunt");
    }

    @Override
    public void schlaffen() {

    }

    @Override
    public void updateVitals() {
        this.tier.setEnergie(-1);
        this.tier.setHunger(1);
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

    public String toString(){ return "froehlich"; }

}
