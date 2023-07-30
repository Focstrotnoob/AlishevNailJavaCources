package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    public Warrior() {
        super(MAX_HEALTH, 80, 0, 30, 0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - (this.getPhysAtt() * (hero.getPhysDef() / 100))));
        if (hero.getHealth() < MIN_HEALTH){
            hero.setHealth(MIN_HEALTH);
        }
    }
}
