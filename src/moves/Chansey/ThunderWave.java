package moves.Chansey;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        Effect paralyzeEffect = new Effect().chance(0.25).stat(Stat.SPEED, -2);
        Effect.paralyze(def);
        def.addEffect(paralyzeEffect);
    }

    @Override
    protected String describe() {
        return "uses Thunder Wave to paralyze the opponent and reduce their Speed";
    }
}
