package sarapavo.entities;

import java.util.ArrayList;
import java.util.List;

public class Collect {
    private List<Videogame> videogames;
    private List<Boardgame> boardgames;

    public Collect() {
        this.videogames = new ArrayList<>();
        this.boardgames = new ArrayList<>();
    }


    //Metodi per videogames

    public List<Videogame> getVideogames() {
        return videogames;
    }

    public void addVideogame(Videogame videogame) {
        this.videogames.add(videogame);
    }

    public void removeVideogame(Videogame videogame) {
        this.videogames.remove(videogame);
    }


    //Metodi per boardgames

    public List<Boardgame> getBoardgames() {
        return boardgames;
    }

    public void addBoardgame(Boardgame boardgame) {
        this.boardgames.add(boardgame);
    }

    public void removeBoardgame(Boardgame boardgame) {
        this.boardgames.remove(boardgame);
    }


}
