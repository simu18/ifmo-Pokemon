package moves.Chansey;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC,90,100);

    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        // Inflicts damage on the opponent
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // 10% chance to lower the opponent's Special Defense by one stage
        if (Math.random() <= 0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "uses Psychic, a powerful Psychic-type move with a chance to lower Special Defense";
    }
}
