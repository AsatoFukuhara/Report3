package jp.ac.uryukyu.ie.e205730;

public class Warrior extends LivingThing {
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);

    }

public void attackWithWeponSkill(LivingThing opponent) {
        if (opponent.getDead())
            return;

        int damage = (int) (this.getAttack() * 1.5);//×1．5
        
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
        opponent.wounded(damage);
    }

    @Override
    public void wounded(int damage) {
        int nowWarriorHitPoint = this.getHitPoint();
        this.setHitPoint(nowWarriorHitPoint - damage) ;
        if( this.getHitPoint() < 0 ) {
            this.setDead(true);
            System.out.printf("戦士%sは倒れた。\n", getName());
        }
    }



}
