package com.xinzhi;

import java.io.File;

/**
 * @author arvin
 * @date 2021/2/19
 */
public class FileTree {
    public static void main(String[] args) {
        File file = new File("/home/arvin/Programming/Java/Java-learning");
        printFile(file,0);
    }

    static void printFile(File file, int level){
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }

        System.out.println(file.getName());
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File temp : files) {
                printFile(temp,level+1);
            }
        }
    }
}
