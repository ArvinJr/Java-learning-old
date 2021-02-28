package FileTree;

import java.io.File;

/**
 * 打印文件目录
 * @author arvin
 * @date 2021/2/19
 */
public class FileOperation {
    public static void main(String[] args) {
        File file =new File("./");
        FileTree fileTree = new FileTree(file);
        fileTree.filePrint();
    }
}
