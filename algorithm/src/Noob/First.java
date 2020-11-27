package Noob;

public class First {

    public static int f1(int i) { //求阶层
        if (i<=2) { return i; }
        return f1(i-1) * i;
    }

    public static int f2(int i) { //斐波那契数列，1 1 2 3 5 8 13
        if (i<=2) { return 1; }
        return f2(i-1) + f2(i-2);
    }

    static int[] arr = new int[10];
    public static int f3(int i) { //🐸跳台阶 改进版：避免重复计算 用一个数组保存计算结果，如果a[i]为0 默认值 代表未计算过
        if (i<=2) {
            arr[i] = i;
            return i; }
        if (arr[i] == 0) {
            arr[i] = f3(i-1) + f3(i-2);
        }
        return arr[i];
    }

    public static int f4(int i) { //递推，由下而上; 递归容易OOM
        if (i<=2) { return i; }
        int v1 = 1;
        int v2 = 2;
        int sum = 0;

        for (int j=3; j<=i; j++) {
            sum = v1 + v2;
            v1 = v2;
            v2 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(f1(10));
        System.out.println(f2(9));
        System.out.println(f3(9));
        //for (int each:arr) { System.out.println(each); }
        System.out.println(f4(3));
    }
}
