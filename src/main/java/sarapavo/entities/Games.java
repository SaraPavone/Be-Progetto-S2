package sarapavo.entities;

public abstract class Games {
    private Integer id;
    private String title;
    private Integer year;
    private Double price;


    //COSTRUTTORE
    public Games(Integer id, Double price, Integer year, String title) {
        this.id = id;
        this.price = price;
        this.year = year;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " Title: " + title +
                " Published in " + year +
                " costs " + price + "€";
    }
}