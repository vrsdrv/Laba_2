package mymoves.Physical;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap() {
        super(Type.FIGHTING, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (pokemon.getCondition().equals(Status.SLEEP)) {
            super.applyOppDamage(pokemon, v*2);
        }else {
            super.applyOppDamage(pokemon, v);
        }
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

        // Сделали свой эффект, так как не было базового
        Effect f = new Effect();
        f.condition(Status.NORMAL);
        pokemon.setCondition(f);
    }
}
