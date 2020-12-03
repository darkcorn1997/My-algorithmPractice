package Noob;

/*🐸跳台阶问题, f(0)=0, f(1)=1, f(2)=2;  f(3)=3, f(4)=5, n>=3 f(n)=f(n-1)+f(n-2)
* 与斐波那契数列类似，表达式相同，边界值不同
* 斐：0 1 1 2 3 5, n>=2*/

public class question {

    static int[] arr = new int[21]; //避免重复计算 用一个数组保存计算结果，如果a[i]为初始值0 代表未计算过
    public static int f1(int i) {   //但直接f1(0)会有问题
        if (i<=2) {
            arr[i] = i;
        }
        if (arr[i] == 0) {
            arr[i] = f1(i-1) + f1(i-2);
        }
        return arr[i];
    }

    static int[] arr1 = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    public static int f2(int i) { //给数组赋值 用-1判断可避免
        if (i<=2) {
            arr1[i] = i;
        }
        if (arr1[i] == -1) {
            arr1[i] = f2(i-1) + f2(i-2);
        }
        return arr1[i];
    }

    public static int f3(int i, int[] arr) { //美化一下， 问题来了：
        if (i<=2) {
            arr[i] = i;
        }
        if (arr[i] == -1) {
            arr[i] = f3(i-1, arr) + f3(i-2, arr);
        }
        return arr[i];
    }

    public static void main(String[] args) {

        System.out.println(f1(20));
        System.out.println(f2(20));

        int[] arr = new int[21];
        for (int i=0; i<21; i++) { arr[i]= -1;}
        System.out.println(f3(20, arr));
    }
}
