import java.util.ArrayList;

public class Album extends MusikItem implements AbspielbarMusik{
    // Fields
    private String albumTitle;
    private Artist artist;
    private int length;
    private ArrayList<Track> tracks = new ArrayList<>();  // tracks

    // Constructor
    public Album(String albumTitle, Artist artist) {
        super(albumTitle, artist);

    }

    // Methods
    // Getters
    public ArrayList<Track> getTracks() { return this.tracks; }

    // Setters
    public void addTrack(Track track) { this.tracks.add(track); }

    public String getDescription() {
        return this.getTitle() + " by " + this.getArtist().getName() + " (" + getRuntimeString(this.length) + ")";
    }

    public void setLength(int hours, int minutes, int seconds) {
        this.length = hours * 60 * 60 + minutes * 60 + seconds;
    }

    /**
     * Updates the length of the album by calculating the sum of track lengths
     * Developer Note: Call this after adding tracks!
     */
    @Override
    public void updateLength() {
        this.length = 0;
        for (Track track :
                tracks) {
            this.length += track.getLength();
        }
    }

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
