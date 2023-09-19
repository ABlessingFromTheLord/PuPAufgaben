package E03_UML;

import java.util.ArrayList;

public interface AbspielbarMusik {
   ArrayList<Track> tracks = new ArrayList<Track>();

    public void updateLength();
    public ArrayList<Track> getTracks();
    public void addTrack(Track track);

}
