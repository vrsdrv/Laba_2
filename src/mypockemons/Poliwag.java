package mypockemons;

import mymoves.Physical.Facade;
import mymoves.Spesial.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {
    public Poliwag (String name, int level){
        super(name,level);
        super.setType(Type.WATER);
        super.setStats(40,50,40,40,40,90);
        addMove(new Scald());
        addMove(new Facade());

    }
}
