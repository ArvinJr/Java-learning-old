import java.util.Scanner;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Name;

/**
 * @author arvin
 * @date 2020/12/29
 */
public class HeroGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入英雄的名字：");
        String heroName = scanner.next();
        System.out.println("请输入英雄的血量：");
        int heroBlood = scanner.nextInt();
        System.out.println("请输入英雄的攻击力：");
        int heroAttack = scanner.nextInt();
        System.out.println("请输入英雄的防御力：");
        int heroDefense = scanner.nextInt();

        String bossName = "猪仔";
        int bossBlood = 1000;
        int bossAttack = 200;
        int bossDefense = 20;

        while (heroBlood>0 && bossBlood>0){
            sleep(500);
            System.out.println("开始：-----------------------");
            System.out.println(heroName + "打了" + bossName + "一下，" + heroName + "受到了" + (heroAttack-bossDefense) + "伤害");
            System.out.println(bossName + "打了" + heroName + "一下，" + bossName + "受到了" + (bossAttack-heroDefense) + "伤害");

            heroBlood -= (bossAttack-heroDefense);
            bossBlood -= (heroAttack-bossDefense);
        }

        if (heroBlood <= 0){
            System.out.println(heroName + "被打死了");
        }

        if (bossBlood <= 0){
            System.out.println(bossName + "被打死了");

        }
    }

    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
