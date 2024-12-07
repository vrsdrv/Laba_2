package mypockemons;

import mymoves.Physical.Facade;
import mymoves.Spesial.IceBeam;
import mymoves.Spesial.WaterGun;
import mymoves.Status.Tickle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Whiscash extends Pokemon {
    public Whiscash(String name,int level){
        super(name, level);
        super.setType(Type.WATER, Type.GROUND);
        super.setStats(110,78,73,76,71,60);

        addMove(new Facade());
        addMove(new IceBeam());
        addMove(new WaterGun());
        addMove(new Tickle());
    }
}
