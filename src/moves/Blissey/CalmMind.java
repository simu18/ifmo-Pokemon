package moves.Blissey;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    public CalmMind() {
        super(Type.PSYCHIC, 0, 0); // Type: Psychic, Power: 0, Accuracy: 0%
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        // Create an Effect to increase the Special Attack and Special Defense by 1 stage
        Effect e1 = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        Effect e2 = new Effect().stat(Stat.SPECIAL_DEFENSE, 1);
        p.addEffect(e1);
        p.addEffect(e2);
        System.out.println(p.toString() + " increased Special Attack and Special Defense by 1 stage!");
    }

    @Override
    protected String describe() {
        return "uses Calm Mind, boosting its Special Attack and Special Defense!";
    }
}
