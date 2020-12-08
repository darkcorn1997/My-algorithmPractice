package Noob;


public class First {

    public static int f1(int i) { //求阶层
        if (i<=2) { return i; }
        return f1(i-1) * i;
    }

    public static int f2(int i) { //斐波那契数列，1 1 2 3 5 8 13 21 34 55
        if (i<=2) { return 1; }
        return f2(i-1) + f2(i-2);
    }

    static int[] arr = new int[21]; //🐸跳台阶, 0 1 2 3 5 8 13 21 34 55
    public static int f3(int i) {
        if (i<=2) {
            return i;
        }
        else if (arr[i] == 0) {
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
        long startTime = System.nanoTime();

        System.out.println(f1(10));
        System.out.println(f2(21));
        System.out.println(f3(20));
        System.out.println(f4(20));

        long endTime = System.nanoTime();
        long Time = endTime-startTime;
        System.out.println("运行时间：" + Time);
    }
}
