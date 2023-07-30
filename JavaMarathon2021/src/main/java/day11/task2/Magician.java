package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack{
    public Magician() {
        super(MAX_HEALTH, 0, 80, 5, 20);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getMagicAtt() - (this.getMagicAtt() * (hero.getMagicDef() / 100))));
        if (hero.getHealth() < MIN_HEALTH){
            hero.setHealth(MIN_HEALTH);
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - (this.getPhysAtt() - (this.getPhysAtt() * (hero.getPhysDef() / 100))));
        if (hero.getHealth() < MIN_HEALTH){
            hero.setHealth(MIN_HEALTH);
        }
    }


}
