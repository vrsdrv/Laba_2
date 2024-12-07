package mypockemons;

import mymoves.Physical.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwrath extends Poliwhirl {
    public Poliwrath (String name, int level){
        super(name, level);
        super.setType(Type.FIGHTING,Type.GHOST);
        super.setStats(90,95,95,70,90,70);


        addMove(new Waterfall());
    }
}
