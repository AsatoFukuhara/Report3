package jp.ac.uryukyu.ie.e205730;

public class Warrior extends LivingThing {
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);

    }

public void attackWithWeponSkill(LivingThing opponent) {
        if (dead)
            return;

        int damage = (int) (attack * 1.5);//×1．5
        
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }

    @Override
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("戦士%sは倒れた。\n", name);
        }
    }



}
