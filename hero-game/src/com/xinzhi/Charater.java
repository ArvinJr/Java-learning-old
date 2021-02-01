package com.xinzhi;

/**
 * 游戏角色
 * @author arvin
 * @date 2021/2/1
 */
public class Charater {
    /**
     * 姓名
     */
    private String name;

    public Charater(String name, Integer blood, Integer attack, Integer defense) {
        this.name = name;
        this.blood = blood;
        this.attack = attack;
        this.defense = defense;
    }

    public Charater(){}

    /**
     * 血量
     */
    private Integer blood = 1000;
    /**
     * 攻击
     */
    private Integer attack = 200;
    /**
     * 防御
     */
    private Integer defense = 100;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }
}
