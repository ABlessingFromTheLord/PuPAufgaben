package E06_Observer;

import java.util.ArrayList;

public class ChatClient {
    // Fields
    private ArrayList<IChatBeobachter> beobachterList;

    // Constructor
    public ChatClient() {
    }

    // Methods
    // Getters
    public ArrayList<IChatBeobachter> getBeobachter() {
        return this.beobachterList;
    }

    // Setters
    public void setBeobachter(ArrayList<IChatBeobachter> beobachter) {
        this.beobachterList = beobachter;
    }

    public void registriereBeobachter(IChatBeobachter beobachter){
        if(!(beobachterList.contains(beobachter))) beobachterList.add(beobachter);
    }

    public void entferneBeobachter(IChatBeobachter beobachter){
        if(beobachterList.contains(beobachter)) beobachterList.remove(beobachter);
    }

    public void benachrichtigeBeobachter(Nachricht nachricht){

    }

    public void schreibeNachricht(String text, String sender, String emfaenger){

    }
}

