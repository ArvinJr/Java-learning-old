package com.xinzhi;

import java.util.Scanner;

/**
 * @author arvin
 * @date 2021/2/1
 */
public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        game.showHeros();
        game.play();
    }

    private void showHeros() {
        System.out.println("请选择英雄:");
        for (int i = 1; i <= Heros.HEROS.size(); i++) {
            System.out.println(i + ":" + Heros.HEROS.get(i-1).getName());
        }
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
    }

    public void play(){
        Equipment equipment = new Equipment("fsdfs",0,1200,200);
        Hero hero = new Hero();
        hero.setName("gdsf");

        Hero enemy = new Hero();
        enemy.setName("gsgf");

        Boss boss = new Boss();
        boss.setName("gfrhdfh");

        hero.fight(boss);
        hero.fight(enemy);

        hero.ware(equipment);
        System.out.println(hero.getAttack());
    }
}
