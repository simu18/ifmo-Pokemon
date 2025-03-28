package moves.Thundurus;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FlashCannon extends SpecialMove {
    public FlashCannon (){
        super(Type.STEEL,80, 100);

    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        // Apply core damage calculation
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        // 10% chance to reduce opponent's Special Defense by 1 stage
        if (Math.random() <= 0.1) {
            def.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return "uses Flash Cannon, possibly reducing the target's Special Defense";
    }
}
