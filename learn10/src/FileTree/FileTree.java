package FileTree;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author arvin
 * @date 2021/2/20
 */
public class FileTree {
    private static final int LEVEL = 0;
    private static final boolean LAST = false;
    private static File FILE = null;
    private static final int INDEX = 0;

    private static final String A = "└ ─ ─ ─ ";
    private static final String B = "├ ─ ─ ─ ";
    private static final String C = "│       ";
    private static final String D = "        ";

    /**
     * 把文件目录引入
     * @param file
     */
    public FileTree(File file) {
        try {
            FILE = new File(file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 调用filePrint以打印文件目录
     */
    public void filePrint(){
        filePrinter(FILE,LEVEL,LEVEL,INDEX,LAST);
    }

    /**
     * 实现文件目录打印及目录名称排序
     */
    private void filePrinter(File file, int level, int parentLevel, int index, boolean last){
        // 打印“-”以表示目录结构
        printLines(level,parentLevel,index);

        System.out.println(file.getName());

        // 在确认是文件夹后展开并排序
        if (file.isDirectory()) {
            File[] fileDetails = fileProcess(file);
            for (int i = 0; i < fileDetails.length; i++) {
                if (fileDetails.length == 1){
                    index = -1;
                    parentLevel = level;
                    last = true;
                } else {
                    if (i == fileDetails.length - 1) {
                        index = -1;
                        last = true;
                        parentLevel = level-1;
                    } else {
                        last = false;
                        parentLevel = level;
                    }
                }
                filePrinter(fileDetails[i],level+1,parentLevel,index,last);
            }
        }
    }

    /**
     * 展开并排序文件夹
     * @param file
     * @return
     */
    private static File[] fileProcess(File file){
        List<String> list = new ArrayList<>();

        // 查看该目录下所有文件
        File[] files = file.listFiles();
        // 提取所有文件名并排序
        for (File temp : files) {
            list.add(temp.getName());
        }
        list.sort(Comparator.naturalOrder());
        // 把所有的list转回file
        File[] filesSorted = new File[list.size()];
        try {
            filesSorted = toFile(list,file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return filesSorted;
    }

    /**
     * 把文件名转化成文件路径
     * @param list
     * @param path
     * @return
     */
    private static File[] toFile(List<String> list,String path){
        File[] files = new File[list.size()];
        StringBuilder[] filePath = new StringBuilder[list.size()];

        for (int i = 0; i < list.size(); i++) {
            filePath[i] = new StringBuilder().append(path).append("/").append(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            files[i] = new File(filePath[i].toString());
        }
        return files;
    }

    private static void printLines(int level, int parentLevel, int index){
       if (level == 1){
            if (index == -1){
                System.out.print(A);
            } else {
                System.out.print(B);
            }
       } else if (level > 1){
           for (int i = 0; i < parentLevel; i++) {
               System.out.print(C);
           }
           for (int i = 0; i < level - parentLevel - 1; i++) {
               System.out.print(D);
           }
           if (index == -1){
               System.out.print(A);
           } else {
               System.out.print(B);
           }
       }
    }
}
