import java.util.Scanner;

/**
 * 人事年龄管理系统
 * @author arvin
 */
public class XinZhiHr {
    public static void main(String[] args){
        int[] users = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入员工的年龄：");
        for (int i = 0;i < users.length;i++){
            System.out.print("请输入第" + (i+1) + "个员工的年龄：");
            users[i] = scanner.nextInt();
        }

        for (int i = 0;i < users.length;i++){
            System.out.println("欣之第" + (i+1) + "号的员工年龄为" + users[i] + "岁。");
        }
    }
}
