package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = 0; 
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }


    public static int multiples(int n, int a, int b) { // 改为public，方便测试
        int count = 0;
        for (int i = 1; i < n; i++) {
            // 处理a==b的情况（避免重复统计，如a=3、b=3，只需判断i%a==0）
            if (a == b) {
                if (i % a == 0) {
                    count++;
                }
            } else {
                if (i % a == 0 || i % b == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

