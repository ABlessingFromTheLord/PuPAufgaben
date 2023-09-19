package E03_UML;

import java.util.ArrayList;

public class Playlist extends MusikItem implements AbspielbarMusik {
    // Fields
    private int length;
    private ArrayList<Track> tracks = new ArrayList<>();  // tracks

    // Constructor
    public Playlist(String title, Artist artist){
        super(title, artist);
    }

    // Methods
    @Override
    public void updateLength() {
        this.length = 0;
        for (Track track :
                tracks) {
            this.length += track.getLength();
        }
    }

    @Override
    public ArrayList<Track> getTracks() {
        return this.tracks;
    }

    @Override
    public void addTrack(Track track) {
        this.tracks.add(track);
    }

    public String getDescription() {
        return this.getTitle() + " by " + this.getArtist().getName() + " (" + getRuntimeString(this.length) + ")";
    }
}
