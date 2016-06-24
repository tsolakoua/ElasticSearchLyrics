public class Lyrics {
    
    private String title;
    private String lyrics;
    private String age;
    private String artist;

    public Lyrics(String title, String lyrics, String age, String artist) {
        this.title = title;
        this.lyrics = lyrics;
        this.age = age;
        this.artist = artist;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    
}
