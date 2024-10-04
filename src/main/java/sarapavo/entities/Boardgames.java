package sarapavo.entities;

public class Boardgames extends Games {
    private Integer numOfPlayers;
    private Integer averageLength;

    public Boardgames(Integer id, Double price, Integer year, String title, Integer averageLength, Integer numOfPlayers) {
        super(id, price, year, title);
        this.averageLength = averageLength;
        this.numOfPlayers = numOfPlayers;
    }

    public Integer getNumOfPlayers() {
        return numOfPlayers;
    }

    public void setNumOfPlayers(Integer numOfPlayers) {
        this.numOfPlayers = numOfPlayers;
    }

    public Integer getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(Integer averageLength) {
        this.averageLength = averageLength;
    }

    @Override
    public String toString() {
        return "Boardgames{" +
                "numOfPlayers=" + numOfPlayers +
                ", averageLength=" + averageLength +
                '}' + super.toString();
    }

    //games ha:
    //"ID: " + id +
    //      " Title: " + title +
    //      " Published in " + year +
    //      " costs " + price + "€";
}
