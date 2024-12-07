package mypockemons;

import mymoves.Physical.Facade;
import mymoves.Spesial.IceBeam;
import mymoves.Spesial.WaterGun;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Barboach extends Pokemon {
    public Barboach(String name, int level){
        super(name,level);
        super.setType(Type.WATER,Type.GROUND);
        super.setStats(50, 48,43,46,41,60);
        addMove(new Facade());
        addMove(new IceBeam());
        addMove(new WaterGun());


    }

}
