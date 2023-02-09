package esperer.GoF.Structural.strategy.example;

import esperer.GoF.Structural.strategy.example.character.GameCharacter;
import esperer.GoF.Structural.strategy.example.weapon.impl.Knife;
import esperer.GoF.Structural.strategy.example.weapon.impl.Sword;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();

        gameCharacter.attack();

        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();
    }
}
