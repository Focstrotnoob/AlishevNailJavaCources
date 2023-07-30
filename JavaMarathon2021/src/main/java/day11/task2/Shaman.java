package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{
    public Shaman() {
        super(MAX_HEALTH, 20, 20, 10.0, 15.0);
    }

    @Override
    public void healHimself() {
        this.setHealth(Math.min(this.getHealth() + 50, MAX_HEALTH));

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(Math.min(this.getHealth() + 30, MAX_HEALTH));

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
