public class Album {
    private String name;
    private String artist;
    private double time;
    private int songs;

    public Album(String name, String artist, int songs, double time){
        this.name = name;
        this.artist = artist;
        this.time = time;
        this.songs = songs;
    }
    public String toString(){
        String a = "\nName: " + name + "\nArtist: " + artist + "\nNumber of Songs: " + songs + "\nPlay Time: " + time + " minutes\n";
        return a;
    }
    public String getName(){
        return name;
    }

    public String getArtist(){
        return artist;
    }
}