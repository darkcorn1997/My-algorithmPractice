package Sort;

import java.util.Arrays;

//选择排序
public class selectionSort {

    public static int[] array = new int[] {6,5,4,3,2,1};

    public static int[] sort() {
        System.out.println(Arrays.toString(array));

        /*
        //第一步： 把第一位和其他所有位进行比较
        //如果发现第一位比其他位置的数据大，就进行交换
        for (int i = 1; i < array.length; i++) {
            if (array[0] > array[i]) {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
            }
        }
        System.out.println("第一轮：" + Arrays.toString(array));

        //第二步： 把第二位的和剩下的所有位进行比较
        for (int i = 2; i < array.length; i++) {
            if (array[1] > array[i]) {
                int temp = array[i];
                array[i] = array[1];
                array[1] = temp;
            }
        }
        System.out.println("第二轮：" + Arrays.toString(array));
         */

        //总结：移动的位置是从0 逐渐增加的，所以可以在外面套一层循环，总共进行n-1轮循环
        for (int i = 0; i < array.length-1; i++) {
            //每轮比较n-1-i次
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println("第" + (i+1) + "轮：" + Arrays.toString(array));
        }
        return array;
    }

    //选择倒序排序
    public static int[] sort2() {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println("第" + (i+1) + "轮：" + Arrays.toString(array));
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort.sort()));
        System.out.println(Arrays.toString(selectionSort.sort2()));
    }
}
