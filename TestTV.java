package Tutoring_Assignment;

class TV {
    private int size;
    public TV(int size) { this.size = size; }
    protected int getSize() { return size; }
}

//[1번]
class ColorTV extends TV {
    int color;
    public ColorTV(int size,int color) {
        super(size);
        this.color = color;
    }
    public void printProperty() {
        System.out.printf(getSize()+" 인치 %d 컬러",color);
    }
}

//[2번]
class IPTV extends ColorTV {
    String address;
    public IPTV(String address,int size,int color) {
        super(size,color);
        this.address = address;
    }
    @Override
    public void printProperty() {
        System.out.printf("\n나의 IPTV는 %s 주소의 "+getSize()+" 인치 %d 컬러",address,color);
    }
}

public class TestTV {
    public static void main(String[] args) {
        //[1번]
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();

        //[2번]
        IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();

    }
}
