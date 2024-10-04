package sarapavo;

import sarapavo.entities.Boardgame;
import sarapavo.entities.Games;
import sarapavo.entities.Videogame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static sarapavo.entities.Genres.*;

public class Application {

    static List<Object> collectList = new ArrayList<>();
    static List<Videogame> videogames = new ArrayList<>();
    static List<Boardgame> boardgames = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        createVideogamesList();
        createBoardgamesList();
        createCollectList();


        System.out.println("****Benvenuto nel menú di navigazione, cosa vuoi fare?****");
        System.out.println("1.Ricerca Giochi");
        System.out.println("2.Modifica Giochi");
        System.out.println("3.Accedi alle statistiche");
        int scelta = scan.nextInt();
        scan.nextLine();


        switch (scelta) {

            case 1:
                System.out.println("****Menú di Ricerca****");
                System.out.println("Quale parametro vuoi utilizzare?");

                System.out.println("1.Voglio ricercare tramite ID");
                System.out.println("2.Voglio ricercare tramite il prezzo");
                System.out.println("3.Voglio ricercare in base al numero di giocatori");
                int sceltaRicerca = scan.nextInt();
                scan.nextLine();

                switch (sceltaRicerca) {

                    case 1:
                        System.out.println("Inserisci l'ID del gioco: ");
                        Integer searchId = scan.nextInt();
                        scan.nextLine();
                        findById(searchId);
                        break;

                    case 2:
                        System.out.println("Inserisci il prezzo massimo del gioco: ");
                        Double priceMax = scan.nextDouble();
                        scan.nextLine();
                        findByPrice(priceMax);

                        break;


                    default:
                        throw new IllegalStateException("Unexpected value: " + sceltaRicerca);
                }
        }


        System.out.println("1.Ricerca Giochi");


    }
    //ricerca per id

    public static void findById(Integer searchId) {
        collectList.stream().filter(game -> {
            if (game instanceof Videogame) {
                return ((Videogame) game).getId().equals(searchId);
            } else if (game instanceof Boardgame) {
                return ((Boardgame) game).getId().equals(searchId);
            }
            return false;
        }).findFirst().ifPresentOrElse(game -> System.out.println("Ecco il gioco che cercavi! " + game),
                () -> System.out.println("Ci dispiace, il gioco con ID " + searchId + " non esiste nella raccolta!"));
    }

    //ricerca per prezzo

    public static List<Games> findByPrice(Double maxPrice) {
        collectList.stream().filter(game -> {
            if (game instanceof Videogame) {
                return ((Videogame) game).getPrice() <= maxPrice;
            } else if (game instanceof Boardgame) {
                return ((Boardgame) game).getPrice() <= maxPrice;
            }
            return false;
        }).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        return List.of();
    }

    public static void createVideogamesList() {
        Videogame horizon = new Videogame(101234, "The Last Horizon", 2021, 49.99, "PS5", 40, ADVENTURE);
        Videogame odissey = new Videogame(102567, "Cyber Odyssey", 2023, 59.90, "PC", 55, RPG);
        Videogame galactic = new Videogame(103890, "Galactic Wars", 2020, 39.99, "Xbox", 35, ACTION);
        Videogame mystic = new Videogame(104321, "Mystic Legends", 2019, 29.99, "Nintendo Switch", 25, FANTASY);
        Videogame streets = new Videogame(105678, "Neo Tokyo Streets", 2022, 44.50, "PS5", 30, OPENWORLD);
        Videogame space = new Videogame(106543, "Space Explorers", 2021, 34.75, "PC", 50, SIMULATION);
        Videogame zombie = new Videogame(107876, "Zombie Survival", 2020, 19.99, "Xbox", 15, HORROR);
        Videogame warrior = new Videogame(108999, "Warrior's Path", 2023, 69.99, "PS5", 60, ACTION);
        Videogame forest = new Videogame(109123, "The Enchanted Forest", 2018, 24.99, "Nintendo Switch", 20, PUZZLE);
        Videogame racing = new Videogame(110456, "F1 Ultimate Racing", 2021, 59.00, "PC", 80, SPORT);

        Videogame[] videogameList = {horizon, odissey, galactic, mystic, streets, space, zombie, warrior, forest, racing};

        videogames.addAll(Arrays.asList(videogameList));
    }

    public static void createBoardgamesList() {
        Boardgame catan = new Boardgame(301234, "Catan", 1995, 44.99, 120, 4);
        Boardgame ride = new Boardgame(302567, "Ticket to Ride", 2004, 39.90, 90, 5);
        Boardgame pandemic = new Boardgame(303890, "Pandemic", 2008, 34.99, 45, 4);
        Boardgame codenames = new Boardgame(304321, "Codenames", 2015, 19.99, 30, 8);
        Boardgame carcassonne = new Boardgame(305678, "Carcassonne", 2000, 29.50, 35, 5);
        Boardgame wonders = new Boardgame(306543, "7 Wonders", 2010, 54.75, 60, 7);
        Boardgame house = new Boardgame(307876, "Betrayal at House on the Hill", 2004, 49.99, 90, 6);
        Boardgame dEd = new Boardgame(308999, "Dungeons & Dragons", 1974, 59.99, 240, 6);
        Boardgame azul = new Boardgame(309123, "Azul", 2017, 34.99, 30, 4);
        Boardgame splendor = new Boardgame(310456, "Splendor", 2014, 39.00, 30, 4);

        Boardgame[] boardgamesList = {catan, ride, pandemic, codenames, carcassonne, wonders, house, dEd, azul, splendor};

        boardgames.addAll(Arrays.asList(boardgamesList));
    }

    public static void createCollectList() {
        collectList.addAll(videogames);
        collectList.addAll(boardgames);
    }


}
