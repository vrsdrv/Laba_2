package mypockemons;

import mymoves.Physical.WakeUpSlap;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwhirl extends Poliwag {
    public Poliwhirl (String name, int level){
        super( name, level);
        super.setType(Type.WATER);
        super.setStats(65,65,65,50,50,90);
        addMove(new WakeUpSlap());
    }
}
