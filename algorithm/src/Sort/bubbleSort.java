package Sort;

import java.util.Arrays;

//冒泡排序
public class bubbleSort {

    public static int[] array = new int[] {6,5,4,3,2,1};

    public static int[] sort() {
        System.out.println(Arrays.toString(array));

        /*
        //第一步：从第一位开始，把相邻两位进行比较
        //如果发现前面的比后面的大，就进行交换
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("第一轮：" + Arrays.toString(array));

        //第二步： 再来一次，只不过不用比较最后一位
        for (int i = 0; i < array.length-2; i++) {
            if (array[i] > array[i+1]) {
                int temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("第二轮：" + Arrays.toString(array));
        */

        //总结：后边界在收缩，所以可以在外面套一层循环，总共进行n-1轮循环
        for (int i = 0; i < array.length-1; i++) {
            //每轮比较n-1-i次
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println("第" + (i+1) + "轮：" + Arrays.toString(array));
        }
        return array;
    }

    //冒泡倒序排序
    public static int[] sort2() {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println("第" + (i+1) + "轮：" + Arrays.toString(array));
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort.sort()));
        System.out.println(Arrays.toString(bubbleSort.sort2()));
    }
}
