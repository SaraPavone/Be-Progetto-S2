package sarapavo.entities;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    private List<Videogames> videogames;
    private List<Boardgames> boardgames;

    public Collection() {
        this.videogames = new ArrayList<>();
        this.boardgames = new ArrayList<>();
    }

    public List<Videogames> getVideogames() {
        return videogames;
    }

    ;

    public List<Boardgames> getBoardgames() {
        return boardgames;
    }

    ;


}
