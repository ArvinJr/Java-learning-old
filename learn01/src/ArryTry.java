/**
 * @author arvin
 * @date 2020/12/30
 */
public class ArryTry {
    public static void main(String[] args) {
        int[] arr = {1,3,4,13,12,71,17,177,32};
        int sum = 0;

        // 个位十位均不为7的偶数的合
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%10!=7 && arr[i]/10%10!=7 && arr[i]%2==0){
                sum += arr[i];
            }
        }
        System.out.println(sum);

        System.out.println("-----------------------------------");

        // 倒置
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
