package com.xinzhi;

/**
 * @author arvin
 * @date 2021/1/2
 */
public class SuperArray<T> implements Super<T> {
    private Object[] array;
    private int currentIndex = -1;

    public SuperArray(int size) {
        array = new Object[size];
    }

    public SuperArray() {
        this(10);
    }

//    public void sort(){
//        for (int i = 0; i < currentIndex; i++) {
//            for (int j = i+1; j < currentIndex+1; j++) {
//                if (array[j] < array[i]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//    }


    /**
     * 添加数据至array（逐个添加且扩容）
     * @param data
     * @return
     */
    @Override
    public void add(T data){
        currentIndex++;
        if (currentIndex >= array.length){
            Object[] temp = new Object[array.length*2];
            for (int i = 0; i < array.length; i++) {
                temp[i] = array[i];
            }
            array = temp;
        }
        array[currentIndex] = data;
    }


    /**
     * 删除指定下标内容
     * @param index
     */
    @Override
    public void delete(int index){
        if (index < 0 || index > currentIndex){
            System.out.println("您输入的下标不合法！");
            return;
        }
        for (int i = index; i < currentIndex; i++) {
            array[i] = array[i+1];
        }
        currentIndex--;
    }

    @Override
    public void update(int index, T newData){
        array[index] = newData;
    }

    @Override
    public void print(){
        System.out.println("---------结果----------");
        for (int i = 0; i <= currentIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }

    @Override
    public int size() {
        return currentIndex+1;
    }

//    public String toStr(){
//        String res = "";
//        for (int i = 0; i <= currentIndex; i++) {
//            if (i == currentIndex){
//                res += array[i];
//            }else {
//                res += array[i] + ",";
//            }
//        }
//        return res;
//    }
//
//    public int[] get(){
//        return array;
//    }

    @Override
    public T get(int index) {
        return (T)array[index];
    }
}
