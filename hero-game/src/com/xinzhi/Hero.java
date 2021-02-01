package com.xinzhi;

/**
 * 英雄类
 * @author arvin
 * @date 2021/2/1
 */
public class Hero extends Charater{

    public Hero(String name, Integer blood, Integer attack, Integer defense) {
        super(name, blood, attack, defense);
    }

    public Hero(){}

    /**
     * 穿装备
     * @param equipment
     */
    public void ware(Equipment equipment){
        this.setBlood(this.getBlood() + equipment.getBlood());
        this.setAttack(this.getAttack() + equipment.getAttack());
        this.setDefense(this.getDefense() + equipment.getDefense());
    }

    /**
     * 打架
     * @param charater
     */
    public void fight(Charater charater){
        while (charater.getBlood() >= 0 && this.getBlood() >= 0){
            this.setBlood(this.getBlood() - charater.getAttack() + this.getDefense());
            charater.setBlood(charater.getBlood() - this.getAttack() + charater.getDefense());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName() + "还有" + (this.getBlood() > 0 ? this.getBlood() : 0) + "点血！");
            System.out.println(charater.getName() + "还有" + (charater.getBlood() > 0 ? charater.getBlood() : 0) + "点血！");
        }
    }
}
