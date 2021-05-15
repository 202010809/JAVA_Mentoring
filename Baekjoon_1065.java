package tutoring;

import java.util.Scanner;

class Hansu {
    int n;
    int count=0;

    Hansu (int n) {
        this.n = n;
    }

    public int getCount(int n) {
        if (n < 100) {
            count = n;
        } else {
            count = 99;
            for (int i = 101; i <= n; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;

                if ((hun - ten) == (ten - one)) {
                    count++;
                }
            }
        }
        return count;
    }

    public void printCount() {
        System.out.println("한수 : "+count);
    }

}
public class Baekjoon_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer : ");
        int n = sc.nextInt();

        Hansu hansu = new Hansu(n);
        hansu.getCount(n);
        hansu.printCount();
    }
}
