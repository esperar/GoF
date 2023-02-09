package esperer.GoF.Structural.strategy.example.weapon.impl;

import esperer.GoF.Structural.strategy.example.weapon.Weapon;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("검으로 공격합니다.");
    }
}
