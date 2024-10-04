package sarapavo.entities;

public class Videogame extends Games {
    private Genres genre;
    private String platform;
    private Integer gameDuration;

    //COSTRUTTORE
    public Videogame(Integer id, String title, Integer year, Double price, String platform, Integer gameDuration, Genres genre) {
        super(id, title, year, price);
        this.platform = platform;
        this.gameDuration = gameDuration;
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getGameDuration() {
        return gameDuration;
    }

    public void setGameDuration(Integer gameDuration) {
        this.gameDuration = gameDuration;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Videogame{" +
                "platform='" + platform + '\'' +
                ", gameDuration=" + gameDuration +
                ", genre='" + genre + '\'' +
                '}' + super.toString();
    }


//games ha:
    //"ID: " + id +
    //      " Title: " + title +
    //      " Published in " + year +
    //      " costs " + price + "€";
}
