package esperer.GoF.Structural.strategy.example.character;

import esperer.GoF.Structural.strategy.example.weapon.Weapon;

public class GameCharacter {

    // 접근점
    private Weapon weapon;

    //교환 가능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        // 델리게이트 -> 위임한다.
        if(weapon == null){
            System.out.println("맨 주먹 공격");
        } else {
            weapon.attack();
        }
    }
}
