package E09_State.State;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Haustier {
    // Fields
    private int energie;
    private int hunger;
    private boolean training;
    private boolean anfang = false;
    private State currentState;
    private State froehlich;
    private State schlafend;
    private State schlechtGelaunt;
    private State hungrig;

    // Constructor
    public Haustier() { initialize(); }


    // Methods
    // Getters
    public int getEnergie() { return this.energie; }

    public int getHunger() { return this.hunger; }

    public boolean isTrainig() { return this.training; }

    public State getCurrentState() { return this.currentState; }

    public State getFroehlich() { return this.froehlich; }

    public State getSchlafend() { return this.schlafend; }

    public State getSchlechtGelaunt() { return this.schlechtGelaunt; }

    public State getHungrig() { return this.hungrig; }

    // Setters

    public void setEnergie(int energie) { this.energie += energie; }

    public void setHunger(int hunger) { this.hunger += hunger; }

    public void setTrainig(boolean training) { this.training = training; }

    public void setCurrentState(State currentState) { this.currentState = currentState; }

    public void initialize(){
        // Instantiation
        froehlich = new Froehlich(this);
        schlafend = new Schlafend(this);
        schlechtGelaunt = new SchechtGelaunt(this);
        hungrig = new Hungrig(this);

        // initialize random state

        Random rnd = new Random();
        energie = rnd.nextInt(26);
        hunger = rnd.nextInt(20);
        int schlafendSchlechtGelaunt = rnd.nextInt(2);

        if (energie >= 16)
        {
            currentState = new Froehlich(this);
            anfangVitalUpdate();
        }
        else if (hunger >10) {
            currentState = new Hungrig(this);
            anfangVitalUpdate();
        }
        else {
            if (schlafendSchlechtGelaunt == 0){
                currentState = new Schlafend(this);
                anfangVitalUpdate();
            }
            else {
                currentState = new SchechtGelaunt(this);
                anfangVitalUpdate();
            }
        }
    }

    private void anfangVitalUpdate(){
        this.energie += -1;
        this.hunger += 1;
    }

    public void start() throws IOException {
        startDisplay();
        startInput();
    }

    public void startDisplay(){
        System.out.print("Dies ist dein Haustier Yamagotchi\n");
        System.out.println("Es ist " + this.currentState.toString() + "\n");
        System.out.print("Bitte gib ein \"spielen\" ein, um mit ihm zu spielen,\n" +
                " \"trainieren\", um es zu trainieren,\n \"fuettern\", um es zu füttern " +
                "oder \"schlaffen\", um es einzuschläfern\n");
        System.out.println("um das Spiel zu beenden Ende, gib \"ende\" ein,\n");
        System.out.println("Input: ");
    }

    public void startInput() throws IOException {
        BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(System.in));
        String input = inputBuffer.readLine();

        while(!input.equals("ende")){
            if (input.equals("spielen")){
                this.getCurrentState().spielen();
                checkVitals();
                continuePlaying();
            }
            else if (input.equals("trainieren")) {
                this.getCurrentState().trainieren();
                checkVitals();
                continuePlaying();;
            }
            else if (input.equals("fuettern")) {
                this.getCurrentState().fuettern();
                checkVitals();
                continuePlaying();;
            }
            else if (input.equals("schlaffen")) {
                this.getCurrentState().schlaffen();
                checkVitals();
                continuePlaying();
            }
            else{
                System.out.println("Ungültige Eingabe, bitte versuchen Sie es erneut");
                continuePlaying();
            }
        }
        return;
    }

    public void continuePlaying() throws IOException {
        System.out.println("Dein Haustier ist " + this.currentState.toString() + "\n");
        System.out.println("Was wollen Sie machen? " + "\n");
        startInput();
    }

    public void checkVitals() {
        if (this.getEnergie() == 0) {
            this.setCurrentState(this.getSchlafend());
        }
        else if (this.getHunger() > 10) {
            this.setCurrentState(this.getHungrig());
        }
        else if (this.getEnergie() >= 16){
            this.setCurrentState(this.getFroehlich());
        }
    }
}
