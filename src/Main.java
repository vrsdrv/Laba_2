import mypockemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Kyurem kyurem = new Kyurem("kyurem", 1);
        Barboach barboach = new Barboach("barboach", 1);
        Whiscash whiscash = new Whiscash("whiscash", 1);
        Poliwag poliwag = new Poliwag("poliwag", 1);
        Poliwhirl poliwhirl = new Poliwhirl("poliwhirl", 1);
        Poliwrath poliwrath = new Poliwrath("poliwrath", 1);

        b.addFoe(kyurem);
        b.addFoe(barboach);
        b.addFoe(whiscash);
        b.addAlly(poliwag);
        b.addAlly(poliwhirl);
        b.addAlly(poliwrath);

        b.go();
    }
}