package FileTree;

/**
 * @author arvin
 * @date 2021/2/20
 */
public class Test {

    public static void main(String[] args) {
        String[][] text = new String[][]{{"x"}, {"x","x","x"}, {"x","x","x"}};

        String a = "└ ─ ─ ─ ";
        String b = "┬ ─ ─ ─ ";
        String c = "├ ─ ─ ─ ";
        String d = "│       └ ─ ─ ─ ";
        String e = "│       ├ ─ ─ ─ ";

        for (int i = 0; i < text.length; i++) {
            for (int j = 0; j < text[i].length; j++) {
                System.out.println(text[i][j]);
                if (i == 0){
                    System.out.println(a);
                }else if (i == 1){
                    if (j == 1){
                        System.out.println(b);
                    }else if (j == text[i].length-1){
                        System.out.println(a);
                    }else {
                        System.out.println(c);
                    }
                }else if (i == 2){
                    if (j == text.length-1){
                        System.out.println(d);
                    }else {
                        System.out.println(e);
                    }
                }
            }
        }
    }
}
