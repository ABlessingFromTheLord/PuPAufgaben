package E03_UML;

import E03_UML.Artist;

public class MusikItem {
    // Fields
    private String t;
    private Artist a;
    private int l;

    // Constructor
    public MusikItem(String title, Artist artist){
        this.t = title;
        this.a = artist;
    }

    // Methods
    // Getters
    public String getTitle() {
        return this.t;
    }

    public Artist getArtist() {
        return this.a;
    }

    public int getLength() {
        return this.l;
    }

    // Setters
    public void setTitle(String title) {
        this.t = title;
    }

    public void setA(Artist artist) {
        this.a = artist;
    }

    public void setL(int length) {
        this.l = length;
    }

    public String getDescription(){ return this.t + " by " + this.a.getName() + " (" + getRuntimeString(this.l) + ")"; }

    /**
     * Formats a time in seconds into a String with the format hh:mm:ss or mm:ss if hours = 0
     * @param timeInSeconds The time in seconds
     * @return The formatted String
     */
    public static String getRuntimeString(int timeInSeconds) {
        int tAbs = Math.abs(timeInSeconds);
        if(timeInSeconds >= 60 * 60) {
            int hours = Math.floorDiv(tAbs, 60 * 60);
            int minutes = Math.floorDiv(tAbs % (60 * 60), 60);
            int seconds = tAbs % 60;
            return String.format("%02d:%02d:%02d", hours, minutes, seconds);
        } else {
            int minutes = Math.floorDiv(tAbs, 60);
            int seconds = tAbs % 60;
            return String.format("%02d:%02d", minutes, seconds);
        }
    }
}
