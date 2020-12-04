package Noob;

/*🐸跳台阶问题, f(0)=0, f(1)=1, f(2)=2;  f(3)=3, f(4)=5, n>=3 f(n)=f(n-1)+f(n-2)
* 与斐波那契数列类似，表达式相同，边界值不同
* 斐：0 1 1 2 3 5, n>=2*/

public class FrogJump {

    static int[] arr = new int[21]; //避免重复计算 用一个数组保存计算结果

    public static int f0(int i) { //初始版，如果a[i]为初始值0 代表未计算过； 但两个问题:
        if (i<=2) {
            arr[i] = i; // 1.好像每次递归 到这里都重新赋值了————经测试不会，最多只会3次，f3时f1 f2，f4时f2
        }
        if (arr[i] == 0) { // 2.直接f(0)报错，f(0)=0,数组越界
            arr[i] = f0(i-1) + f0(i-2);
        }
        return arr[i];
    }

    static int[] arr1 = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public static int f1(int i) { //给数组赋值 用-1判断可避免f(0)报错
        if (i<=2) {
            arr1[i] = i;
        }
        if (arr1[i] == -1) {
            arr1[i] = f1(i-1) + f1(i-2);
        }
        return arr1[i];
    }

    public static int f2(int i, int[] arr) { //美化一下，怪怪的写法
        if (i<=2) {
            arr[i] = i;
        }
        if (arr[i] == -1) {
            arr[i] = f2(i-1, arr) + f2(i-2, arr);
        }
        return arr[i];
    }

    public static int f3(int i) { //最佳优化
        if (i<=2) {
            return i;
        }
        else if (arr[i] == 0) { // 用else if就能避免f(0)的情况
            arr[i] = f3(i-1) + f3(i-2);
        }
        return arr[i];
    }

    public static void main(String[] args) {

        System.out.println(f0(20));
        System.out.println(f1(20));

        int[] arr = new int[21];
        for (int i=0; i<21; i++) { arr[i]= -1;}
        System.out.println(f2(20, arr));

        System.out.println(f3(20));
    }
}
