package jp.ac.uryukyu.ie.e205730;




 public class LivingThing {
     String name;//フィールド変数
     int hitPoint;
     int attack;
     boolean dead;


     public LivingThing (String name, int maximumHP, int attack) {//共通項目の書き出し
         this.name = name;
         hitPoint = maximumHP;
         this.attack = attack;
         dead = false;
         System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
     }


     public String getName(){
        return this.name;
    }
    public int getHitPoint(){
        return this.hitPoint;
    }
    public int getAttack(){
        return this.attack;
    }
    public boolean getDead(){
        return this.dead;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public void setAttack(int attack){
        this.attack = attack;
    }
    public void setDead(boolean dead){
        this.dead = dead;
    }


     public void attack(LivingThing opponent){
         if(!dead){
             int damage = (int)(Math.random() * attack);
             System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
             opponent.wounded(damage);
         }
     }


     public void wounded(int damage){
         hitPoint -= damage;
         if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
         }
     }

     /**
      * フィールドhitPointのgetterメソッド。
      */

     }

