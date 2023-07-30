package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Shaman shaman = new Shaman();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();

        warrior1.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(magician);
        System.out.println(magician);
        shaman.healTeammate(magician);
        System.out.println(magician);
        magician.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior1);
        System.out.println(warrior1);
        paladin.healHimself();
        System.out.println(paladin);
        for (int i = 0; i < 5; i++) {
            warrior1.physicalAttack(magician);
            System.out.println(magician);
        }


    }
}
