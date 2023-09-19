package E03_UML;

import E03_UML.Album;
import E03_UML.Artist;
import E03_UML.MusikItem;

public class Track extends MusikItem {
    private String trackTitle;  // album title
    private Artist artist;  // track artist
    private Album album;  // track album
    private int l;  // length of the track in seconds

    // Constructor
    public Track(String trackTitle, Artist artist, Album album, int length) {
        super(trackTitle, artist);
        this.album = album;
        this.l = length;
    }

    // Methods
    // Getters

    public int getLength() {
        return l;
    }

    public Album getAlbum() {
        return album;
    }

    // Setters
    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setLength(int len) {
        this.l = len;
    }

    public String getDescription() {
        return this.getArtist().getName() + " - " + this.getTitle() + " (" + getRuntimeString(this.l) + ")";
    }
}
