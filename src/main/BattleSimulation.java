package main;

import MyPokemon.*;
import moves.Thundurus.SludgeWave;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class BattleSimulation {
    public static void main(String[] args) {

        Battle b = new Battle();
        Thundurus thundurus = new Thundurus("Thundurus",1);
        Patrat patrat = new Patrat("Patrat", 1);
        Watchog watchog = new Watchog("Watchog",1);
        Happiny happiny = new Happiny("Happiny",1);
        Chansey chansey = new Chansey("Chansey",1);
        Blissey blissey = new Blissey("Blissey",1);


        b.addAlly(thundurus);
        b.addAlly(patrat);
        b.addAlly(watchog);


        b.addFoe(happiny);
        b.addFoe(chansey);
        b.addFoe(blissey);

        b.go();
    }
}
