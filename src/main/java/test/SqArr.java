package test;

public class SqArr {
    Object y;
    Object d;

    void speed (Object d, Object y){

    }
    void speed (Object y){

    }
    int speed (Object x, Object y, int z){
        return 0;
    }


   SqArr(Object y) {
        this.y = y;
    }
//
//    SqArr(Object y, Object d) {
//        this.y = y;
//        this.d = d;
//    }

    public static void main(String[] args) {
        Object x = new Object();
        SqArr sq = new SqArr(x);
        SqArr2 sq2 = new SqArr2(x);
        sq2.speed(x);
    }
}

class SqArr2 extends SqArr {


    SqArr2(Object y) {
        super(y);
    }
}
