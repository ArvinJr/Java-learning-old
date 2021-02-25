package com.xinzhi;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @author arvin
 * @date 2021/2/18
 */
public class IOTest {

    @Test
    public void fileTest01() throws IOException {
        File file = new File("/home/arvin/Programming/Java/Java-learning/learn10/aa.txt");
        file.createNewFile();
    }

    @Test
    public void fileTest() throws Exception{
        File file = new File("/home/arvin/Programming/Java/Java-learning/learn10/aa.txt");
        System.out.println(file.toString());
    }

    @Test
    public void fileTest02(){
        File file = new File("./");
        String ab = file.getAbsolutePath();
        System.out.println(ab);
        String can = null;
        try {
            can = file.getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(can);
    }

    @Test
    public void fileTest03(){
        File file =new File("/home/arvin/Programming/Java/Java-learning");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }

}
