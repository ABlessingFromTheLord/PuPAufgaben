package E05_Strategie_Iterator.Strategie.ZaehlungStrategie;

public class PaypalStrategie implements Zahlungsstrategie {
    // Fields
    private String Email;

    // Constructor
    public PaypalStrategie(String email){
        this.Email = email;
    }

    //Methods
    // Getters
    public String getEmail() {
        return this.Email;
    }

    // Setters
    public void setEmail(String email) {
        this.Email = email;
    }

    @Override
    public void zahle(int preis) {
        System.out.println("Preis: " + preis + ", Email: " + this.getEmail());
    }
}
