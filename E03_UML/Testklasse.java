package E03_UML;

public class Testklasse {
    public static void main(String[] args) {

        // 3 Arbeiten mit UML
        Artist pinkFloyd = new Artist("Pink Floyd");
        Artist godspeedYouBlackEmperor = new Artist("Godspeed You! Black Emperor");
        Artist lilWayne = new Artist("Lil Wayne");
        Artist eminem = new Artist("Eminem");
        Artist rihanna = new Artist("Rihanna");
        Artist variousArtists = new Artist("Various Artists");

        Album carter3 = new Album("Carter 3", lilWayne);
        Album slimShadyLP = new Album("The Slim Shady LP", eminem);
        Album anti = new Album("ANTI", rihanna);

        Album wywh = new Album("Wish You Were Here", pinkFloyd);
        wywh.addTrack(new Track("Shine On You Crazy Diamond, Pts. 1-5", pinkFloyd, wywh, 13*60+30));
        wywh.addTrack(new Track("Welcome To The Machine", pinkFloyd, wywh, 7*60+33));
        wywh.addTrack(new Track("Have A Cigar", pinkFloyd, wywh, 5*60+7));
        wywh.addTrack(new Track("Wish You Were Here", pinkFloyd, wywh, 5*60+5));
        wywh.addTrack(new Track("Shine On You Crazy Diamond, Pts. 6-9", pinkFloyd, wywh, 12*60+23));
        wywh.updateLength();

        Album lysf = new Album("Lift Your Skinny Fists Like Antennas to Heaven", godspeedYouBlackEmperor);
        lysf.addTrack(new Track("Storm", godspeedYouBlackEmperor, lysf, 22*60+32));
        lysf.addTrack(new Track("Static", godspeedYouBlackEmperor, lysf, 22*60+35));
        lysf.addTrack(new Track("Sleep", godspeedYouBlackEmperor, lysf, 23*60+17));
        lysf.addTrack(new Track("Like Antennas To Heaven...", godspeedYouBlackEmperor, lysf, 18*60+57));
        lysf.updateLength();

        Playlist rap = new Playlist("rap", variousArtists);
        rap.addTrack(new Track("A milli ", lilWayne, carter3, 2 * 60 + 05));
        rap.addTrack(new Track("My Name is", eminem, slimShadyLP, 3*60+44));
        rap.addTrack(new Track("Needed Me", rihanna, anti, 2*60+59));
        rap.updateLength();

        Player player = new Player();
        player.PlayAlbum(wywh);
        player.PlayAlbum(lysf);
        player.PlayAlbum(rap);

    }
}
