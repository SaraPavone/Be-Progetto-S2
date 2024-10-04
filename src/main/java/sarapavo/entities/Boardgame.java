package sarapavo.entities;

public class Boardgame extends Games {
    private Integer numOfPlayers;
    private Integer averageLength;

    public Boardgame(Integer id, String title, Integer year, Double price, Integer averageLength, Integer numOfPlayers) {
        super(id, title, year, price);
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
        return "Boardgame{" +
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
