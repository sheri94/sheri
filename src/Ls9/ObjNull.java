package Ls9;

public class ObjNull {
    int id;
    String name;
    double sales;

    ObjNull(int id, String name, double sales) {
        this.id = id;
        this.name = name;
        this.sales = sales;
    }

    ObjNull(int id, double sales) {
        this(id, null, sales);
    }

    ObjNull(int id, String name) {
        this(id, name, 0.0);
    }

    ObjNull(String name, double sales) {
        this(0, name, sales);
    }

    ObjNull(String name) {
        this(0, name, 0.0);
    }

    ObjNull(int id) {
        this(id, null, 0.0);
    }

    ObjNull(double sales) {
        this(0, null, sales);
    }

    ObjNull() {
    }
}
class Test{
    static ObjNull oN1 = new ObjNull(1,"anri",78.23);
    static ObjNull oN2 = new ObjNull(2,78.22);
    static ObjNull oN3 = new ObjNull(3,"Kira");
    static ObjNull oN4 = new ObjNull("Igor", 67.12);
    static ObjNull oN5 = new ObjNull("Alena");
    static ObjNull oN6 = new ObjNull(4);
    static ObjNull oN7 = new ObjNull(120_000.78);
    static ObjNull oN8 = new ObjNull();
    public static void main(String[] args) {
        oN1 = null;
        oN2 = null;
        oN3 = null;
        oN4 = null;
        oN5 = null;
        oN6 = null;
        oN7.name = "String";
        oN8.sales =125_000.23;
    }
}
class Test2{
    int a =1;
    static  int b = 2;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.abc(3);
    }
}
class Test3{
    int a = 1;
    static int b = 2;
    static void abc(final int a){
        System.out.println(a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}
class Test4{
    int a =1;
    static int b = 2;
    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test4.b);
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc(4);
    }
}
