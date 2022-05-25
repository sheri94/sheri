package p4;

import p1.*;
import p1.p2.*;
import p1.p2.p3.C;
import p4.p5.*;
import p1.p2.B.*;

public class D {
    public static void main(String[] args) {
        B b = new B();
        B.name = "String";
        System.out.println(b.name);
        b.id = 23;
        System.out.println(b.id);
        b.sales = 45.23;
        System.out.println(b.sales);
    }
}