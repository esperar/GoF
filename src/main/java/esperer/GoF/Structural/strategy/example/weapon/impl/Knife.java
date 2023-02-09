package esperer.GoF.Structural.strategy.example.weapon.impl;

import esperer.GoF.Structural.strategy.example.weapon.Weapon;

public class Knife implements Weapon {
    @Override
    public void attack() {
        System.out.println("칼로 공격합니다.");
    }
}
