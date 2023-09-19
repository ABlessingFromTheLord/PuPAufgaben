package E03_UML;

public class Player {

    public Player() {
        System.out.println("\uD834\uDD60 LinAmpPlayer initialized \uD834\uDD60");
    }

    /**
     * Plays a single track (blocking call).
     * Mock implementation at 1000x speed.
     * @param track The track to play.
     */
    public void PlayTrack(Track track) {
        try {
            System.out.println("▶ (00:00/" + Track.getRuntimeString(track.getLength()) + ") |o--------------| Now Playing: " + track.getDescription());
            Thread.sleep(track.getLength());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Plays all tracks on a given album (blocking call).
     * @param album The album to play.
     */
    public void PlayAlbum(Album album) {
        System.out.println("\uD834\uDD60 Playing " + album.getDescription());
        for (Track track: album.getTracks()) {
            PlayTrack(track);
        }
    }

    /**
     * Plays all tracks on a given album (blocking call).
     * @param playlist The album to play.
     */
    public void PlayAlbum(Playlist playlist) {
        System.out.println("\uD834\uDD60 Playing " + playlist.getDescription());
        for (Track track: playlist.getTracks()) {
            PlayTrack(track);
        }
    }
}
