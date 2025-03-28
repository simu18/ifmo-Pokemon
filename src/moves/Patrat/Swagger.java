package moves.Patrat;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85); // Type: Normal, Power: 0, Accuracy: 85%
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // Applies confusion and boosts the opponent's Attack stat by two stages
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "uses Swagger to confuse the opponent and boost their Attack sharply";
    }
}
