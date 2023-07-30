package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    public Paladin() {
        super(MAX_HEALTH, 50, 20, 15, 0);
    }

    @Override
    public void healHimself() {
        this.setHealth(Math.min(this.getHealth() + 25, MAX_HEALTH));

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(Math.min(this.getHealth() + 10, MAX_HEALTH));
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - (this.getPhysAtt() * (hero.getPhysDef() / 100))));
        if (hero.getHealth() < MIN_HEALTH){
            hero.setHealth(MIN_HEALTH);
        }
    }
}
