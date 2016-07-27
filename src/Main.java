import com.tonyrich.*;
/**
 * Created by localadmin on 7/27/16.
 */
public class Main {
    public static void main(String[] args){
        Song s1 = new Song("Amazing Grace", "bala blah blah", (short) 31);
        Song s2 = new Song("Bridge of Troubled Waters", "bala blah blah", (short) 43);
        Song s3 = new Song("Star Spangled Banner", "bala blah blah", (short) 21);
        Album a1 = new Album("American Songs", "various", "art");
        Song sa1 = new Song("abc", "bala", (short) 20 );
        Album a2 = new Album("Chinese Songs", "various", "art");
        a2.addSong(sa1);

        a1.addSong(s1);
        a1.addSong(s2);
        a1.addSong(s3);
        System.out.println("Album is: ");

        for (Song s: a1.getSongs()){
            System.out.println("Song is: " + s.getName());
        }

        a1.deleteSong("Song 1");

        System.out.println("Current Album after Song1 was removed: ");

        for (Song s: a1.getSongs()){
            System.out.println("Song is: " + s.getName());
        }

        s1.play();

        int dur = a1.getTotalDuration();

        System.out.println("Total Alubum length: " + dur);

        Artist newArtist = new Artist("John");

        newArtist.addAlbum(a1);
        newArtist.addAlbum(a2);
        newArtist.deleteAlbum("Chinese Songs");

        for (Album al: newArtist.getAlbums()){
            System.out.println("This artist " + newArtist.getName() + " has album " + al.getName());
        }



    }
}
