package moves.Blissey;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 100); // Type: Electric, Power: 0, Accuracy: 100%
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        // Applies paralysis effect to the opponent, setting chance to miss and Speed reduction
        Effect paralyzeEffect = new Effect().chance(0.25).stat(Stat.SPEED, -2);
        Effect.paralyze(def);
        def.addEffect(paralyzeEffect); // Adds a 25% miss chance and reduces Speed by 50%
    }

    @Override
    protected String describe() {
        return "uses Thunder Wave to paralyze the opponent and reduce their Speed";
    }
}
