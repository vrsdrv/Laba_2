package mypockemons;
import mymoves.Physical.BrutalSwing;
import mymoves.Physical.DragonClaw;
import mymoves.Spesial.DracoMeteor;
import mymoves.Spesial.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kyurem extends Pokemon {
    public Kyurem(String name, int level){
        super(name, level);
        super.setType(Type.DRAGON, Type.ICE);
        super.setStats(125, 130, 90, 130, 90, 95);

        addMove(new Psychic());
        addMove(new BrutalSwing());
        addMove(new DragonClaw());
        addMove(new DracoMeteor());
    }

}
