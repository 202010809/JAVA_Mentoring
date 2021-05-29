package Tutoring_Assignment;

import java.util.Scanner;
abstract class Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+res+getDestString()+" 입니다");
        //scanner.close();
    }
}

class Won2Dollar extends Converter {
    public Won2Dollar(int ratio) {
        super.ratio = ratio;
    }
    @Override
    protected double convert(double src) {
        return src/ratio;
    }
    @Override
    protected String getSrcString() {
        return "원";
    }
    @Override
    protected String getDestString() {
        return "달러";
    }
}

class Km2Mile extends Converter {
    double mile;
    public Km2Mile(double mile) {
        this.mile = mile;
    }
    @Override
    protected double convert(double src) {
        return src/mile;
    }
    @Override
    protected String getSrcString() {
        return "Km";
    }
    @Override
    protected String getDestString() {
        return "mile";
    }
}

public class TestConverter {
    public static void main(String args[]) {
        //[3번]
        Won2Dollar toDollar = new Won2Dollar(1200);
        toDollar.run();

        //[4번]
        Km2Mile toMile = new Km2Mile(1.6); // 1 마일은 1.6km
        toMile.run();
    }
}
