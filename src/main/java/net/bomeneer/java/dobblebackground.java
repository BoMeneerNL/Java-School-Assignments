package net.bomeneer.java;

import java.util.*;
import static java.lang.System.out;

public class dobblebackground {
    static int flnow = 0;
    //dobblesteen waardes
    static String t1 = "[---]\n[   ]\n[ * ]\n[---]";
    static String t2 = "[---]\n[ * ]\n[ * ]\n[---]";
    static String t3 = "[---]\n[  *]\n[ **]\n[---]";
    static String t4 = "[---]\n[** ]\n[** ]\n[---]";
    static String t5 = "[---]\n[ **]\n[***]\n[---]";
    static String t6 = "[---]\n[***]\n[***]\n[---]";
    static String t7 = "*********\n*     *\n *  7  *\n*      *\n*********";
    static String t8 = "*********\n*     *\n *  8  *\n*      *\n*********";
    static String t9 = "*********\n*     *\n *  9  *\n*      *\n*********";
    static String t10 = "*********\n*     *\n *  10 *\n*      *\n*********";
    static String t11 = "*********\n*     *\n *  11 *\n*      *\n*********";
    static String t12 = "*********\n*     *\n *  12 *\n*      *\n*********";
    static String t13 = "*********\n*     *\n *  13 *\n*      *\n*********";
    static String t14 = "*********\n*     *\n *  14 *\n*      *\n*********";
    static String t15 = "*********\n*     *\n *  15 *\n*      *\n*********";
    static String t16 = "*********\n*     *\n *  16 *\n*      *\n*********";
    static String t17 = "*********\n*     *\n *  17 *\n*      *\n*********";
    static String t18 = "*********\n*     *\n *  18 *\n*      *\n*********";
    static String t19 = "*********\n*     *\n *  19 *\n*      *\n*********";
    static String t20 = "*********\n*     *\n *  20 *\n*      *\n*********";
    static String t21 = "*********\n*     *\n *  21 *\n*      *\n*********";
    static String t22 = "*********\n*     *\n *  22 *\n*      *\n*********";
    static String t23 = "*********\n*     *\n *  23 *\n*      *\n*********";
    static String t24 = "*********\n*     *\n *  24 *\n*      *\n*********";
    static String t25 = "*********\n*     *\n *  25 *\n*      *\n*********";
    static String t26 = "*********\n*     *\n *  26 *\n*      *\n*********";
    static String t27 = "*********\n*     *\n *  27 *\n*      *\n*********";
    static String t28 = "*********\n*     *\n *  28 *\n*      *\n*********";
    static String t29 = "*********\n*     *\n *  29 *\n*      *\n*********";
    static String t30 = "*********\n*     *\n *  30 *\n*      *\n*********";
    static String t31 = "*********\n*     *\n *  31 *\n*      *\n*********";
    static String t32 = "*********\n*     *\n *  32 *\n*      *\n*********";
    static String t33 = "*********\n*     *\n *  33 *\n*      *\n*********";
    static String t34 = "*********\n*     *\n *  34 *\n*      *\n*********";
    static String t35 = "*********\n*     *\n *  35 *\n*      *\n*********";
    static String t36 = "*********\n*     *\n *  36 *\n*      *\n*********";
    static String t37 = "*********\n*     *\n *  37 *\n*      *\n*********";
    static String t38 = "*********\n*     *\n *  38 *\n*      *\n*********";
    static String t39 = "*********\n*     *\n *  39 *\n*      *\n*********";
    static String t40 = "*********\n*     *\n *  40 *\n*      *\n*********";
    static String t41 = "*********\n*     *\n *  41 *\n*      *\n*********";
    static String t42 = "*********\n*     *\n *  42 *\n*      *\n*********";
    static String t43 = "*********\n*     *\n *  43 *\n*      *\n*********";
    static String t44 = "*********\n*     *\n *  44 *\n*      *\n*********";
    static String t45 = "*********\n*     *\n *  45 *\n*      *\n*********";
    static String t46 = "*********\n*     *\n *  46 *\n*      *\n*********";
    static String t47 = "*********\n*     *\n *  47 *\n*      *\n*********";
    static String t48 = "*********\n*     *\n *  48 *\n*      *\n*********";
    static String t49 = "*********\n*     *\n *  49 *\n*      *\n*********";
    static String t50 = "*********\n*     *\n *  50 *\n*      *\n*********";
    static String t51 = "*********\n*     *\n *  51 *\n*      *\n*********";
    static String t52 = "*********\n*     *\n *  52 *\n*      *\n*********";
    static String t53 = "*********\n*     *\n *  53 *\n*      *\n*********";
    static String t54 = "*********\n*     *\n *  54 *\n*      *\n*********";
    static String t55 = "*********\n*     *\n *  55 *\n*      *\n*********";
    static String t56 = "*********\n*     *\n *  56 *\n*      *\n*********";
    static String t57 = "*********\n*     *\n *  57 *\n*      *\n*********";
    static String t58 = "*********\n*     *\n *  58 *\n*      *\n*********";
    static String t59 = "*********\n*     *\n *  59 *\n*      *\n*********";
    static String t60 = "*********\n*     *\n *  60 *\n*      *\n*********";
    static String t61 = "*********\n*     *\n *  61 *\n*      *\n*********";
    static String t62 = "*********\n*     *\n *  62 *\n*      *\n*********";
    static String t63 = "*********\n*     *\n *  63 *\n*      *\n*********";
    static String t64 = "*********\n*     *\n *  64 *\n*      *\n*********";
    static String t65 = "*********\n*     *\n *  65 *\n*      *\n*********";
    static String t66 = "*********\n*     *\n *  66 *\n*      *\n*********";
    static String t67 = "*********\n*     *\n *  67 *\n*      *\n*********";
    static String t68 = "*********\n*     *\n *  68 *\n*      *\n*********";
    static String t69 = "*********\n*     *\n *  69 *\n*      *\n*********";
    static String t70 = "*********\n*     *\n *  70 *\n*      *\n*********";
    static String t71 = "*********\n*     *\n *  71 *\n*      *\n*********";
    static String t72 = "*********\n*     *\n *  72 *\n*      *\n*********";
    static String t73 = "*********\n*     *\n *  73 *\n*      *\n*********";
    static String t74 = "*********\n*     *\n *  74 *\n*      *\n*********";
    static String t75 = "*********\n*     *\n *  75 *\n*      *\n*********";
    static String t76 = "*********\n*     *\n *  76 *\n*      *\n*********";
    static String t77 = "*********\n*     *\n *  77 *\n*      *\n*********";
    static String t78 = "*********\n*     *\n *  78 *\n*      *\n*********";
    static String t79 = "*********\n*     *\n *  79 *\n*      *\n*********";
    static String t80 = "*********\n*     *\n *  80 *\n*      *\n*********";
    static String t81 = "*********\n*     *\n *  81 *\n*      *\n*********";
    static String t82 = "*********\n*     *\n *  82 *\n*      *\n*********";
    static String t83 = "*********\n*     *\n *  83 *\n*      *\n*********";
    static String t84 = "*********\n*     *\n *  84 *\n*      *\n*********";
    static String t85 = "*********\n*     *\n *  85 *\n*      *\n*********";
    static String t86 = "*********\n*     *\n *  86 *\n*      *\n*********";
    static String t87 = "*********\n*     *\n *  87 *\n*      *\n*********";
    static String t88 = "*********\n*     *\n *  88 *\n*      *\n*********";
    static String t89 = "*********\n*     *\n *  89 *\n*      *\n*********";
    static String t90 = "*********\n*     *\n *  90 *\n*      *\n*********";
    static String t91 = "*********\n*     *\n *  91 *\n*      *\n*********";
    static String t92 = "*********\n*     *\n *  92 *\n*      *\n*********";
    static String t93 = "*********\n*     *\n *  93 *\n*      *\n*********";
    static String t94 = "*********\n*     *\n *  94 *\n*      *\n*********";
    static String t95 = "*********\n*     *\n *  95 *\n*      *\n*********";
    static String t96 = "*********\n*     *\n *  96 *\n*      *\n*********";
    static String t97 = "*********\n*     *\n *  97 *\n*      *\n*********";
    static String t98 = "*********\n*     *\n *  98 *\n*      *\n*********";
    static String t99 = "*********\n*     *\n *  99 *\n*      *\n*********";
    static String t100 = "*********\n*     *\n *  100 *\n*      *\n*********";
    static String space = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    static Random random = new Random();
    static int uitkomst;
    static boolean tt100 = true;
    public static void dobblie(int typethrow){
        if(typethrow == 0){uitkomst = random.nextInt(6);}
        else if(typethrow == 1){uitkomst = random.nextInt(100);}
        else {
            out.println("Oops, an unfixable error has occured");
            System.exit(1);
        }
        uitkomst++;
        forlooper();
        if(typethrow == 1){forlooper2();}
        forlooper();
        switch (uitkomst) {
            case 1 -> t1();
            case 2 -> t2();
            case 3 -> t3();
            case 4 -> t4();
            case 5 -> t5();
            case 6 -> t6();
            case 7 -> t7();
            case 8 -> t8();
            case 9 -> t9();
            case 10 -> t10();
            case 11 -> t11();
            case 12 -> t12();
            case 13 -> t13();
            case 14 -> t14();
            case 15 -> t15();
            case 16 -> t16();
            case 17 -> t17();
            case 18 -> t18();
            case 19 -> t19();
            case 20 -> t20();
            case 21 -> t21();
            case 22 -> t22();
            case 23 -> t23();
            case 24 -> t24();
            case 25 -> t25();
            case 26 -> t26();
            case 27 -> t27();
            case 28 -> t28();
            case 29 -> t29();
            case 30 -> t30();
            case 31 -> t31();
            case 32 -> t32();
            case 33 -> t33();
            case 34 -> t34();
            case 35 -> t35();
            case 36 -> t36();
            case 37 -> t37();
            case 38 -> t38();
            case 39 -> t39();
            case 40 -> t40();
            case 41 -> t41();
            case 42 -> t42();
            case 43 -> t43();
            case 44 -> t44();
            case 45 -> t45();
            case 46 -> t46();
            case 47 -> t47();
            case 48 -> t48();
            case 49 -> t49();
            case 50 -> t50();
            case 51 -> t51();
            case 52 -> t52();
            case 53 -> t53();
            case 54 -> t54();
            case 55 -> t55();
            case 56 -> t56();
            case 57 -> t57();
            case 58 -> t58();
            case 59 -> t59();
            case 60 -> t60();
            case 61 -> t61();
            case 62 -> t62();
            case 63 -> t63();
            case 64 -> t64();
            case 65 -> t65();
            case 66 -> t66();
            case 67 -> t67();
            case 68 -> t68();
            case 69 -> t69();
            case 70 -> t70();
            case 71 -> t71();
            case 72 -> t72();
            case 73 -> t73();
            case 74 -> t74();
            case 75 -> t75();
            case 76 -> t76();
            case 77 -> t77();
            case 78 -> t78();
            case 79 -> t79();
            case 80 -> t80();
            case 81 -> t81();
            case 82 -> t82();
            case 83 -> t83();
            case 84 -> t84();
            case 85 -> t85();
            case 86 -> t86();
            case 87 -> t87();
            case 88 -> t88();
            case 89 -> t89();
            case 90 -> t90();
            case 91 -> t91();
            case 92 -> t92();
            case 93 -> t93();
            case 94 -> t94();
            case 95 -> t95();
            case 96 -> t96();
            case 97 -> t97();
            case 98 -> t98();
            case 99 -> t99();
            case 100 -> t100();
        }
    }
    public static void throwed(byte throwed){
        switch (throwed){
            case 1:
        }

    }
    public static void t1(){
        out.println(t1);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        if(tt100){
            out.println("You've thrown"+ " " + uitkomst);
        }
        else {
            out.println("You've thrown"+ " " + uitkomst);
        }
    }
    //if throw is 2
    public static void t2(){
        t1();
        out.println(space);
        out.println(t2);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        if(tt100){
            out.println("You've thrown"+ " " + uitkomst);
        }
        else {
            out.println("You've thrown"+ " " + uitkomst);
        }
    }
    public static void t3(){
        t2();
        out.println(space);
        out.println(t3);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        if(tt100){
            out.println("You've thrown"+ " " + uitkomst);
        }
        else {
            out.println("You've thrown"+ " " + uitkomst);
        }
    }
    public static void t4(){
        t3();
        out.println(space);
        out.println(t4);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        if(tt100){
            out.println("You've thrown"+ " " + uitkomst);
        }
        else {
            out.println("You've thrown"+ " " + uitkomst);
        }
    }
    public static void t5(){
        t4();
        out.println(space);
        out.println(t5);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        if(tt100){
            out.println("You've thrown"+ " " + uitkomst);
        }
        else {
            out.println("You've thrown"+ " " + uitkomst);
        }
    }
    public static void t6(){
        t5();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        if(tt100){
            out.println("You've thrown"+ " " + uitkomst);
        }
        else {
            out.println("You've thrown"+ " " + uitkomst);
        }
    }
    public static void t7() {
        t6();
        out.println(space);
        out.println(t7);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t8() {
        t7();
        out.println(space);
        out.println(t8);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t9() {
        t8();
        out.println(space);
        out.println(t9);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t10() {
        t9();
        out.println(space);
        out.println(t10);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t11() {
        t10();
        out.println(space);
        out.println(t11);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t12() {
        t11();
        out.println(space);
        out.println(t12);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t13() {
        t12();
        out.println(space);
        out.println(t13);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t14() {
        t13();
        out.println(space);
        out.println(t14);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t15() {
        t14();
        out.println(space);
        out.println(t15);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t16() {
        t15();
        out.println(space);
        out.println(t16);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t17() {
        t16();
        out.println(space);
        out.println(t17);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t18() {
        t17();
        out.println(space);
        out.println(t18);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t19() {
        t18();
        out.println(space);
        out.println(t19);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t20() {
        t19();
        out.println(space);
        out.println(t20);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t21() {
        t20();
        out.println(space);
        out.println(t21);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t22() {
        t21();
        out.println(space);
        out.println(t22);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t23() {
        t22();
        out.println(space);
        out.println(t23);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t24() {
        t23();
        out.println(space);
        out.println(t24);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t25() {
        t24();
        out.println(space);
        out.println(t25);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t26() {
        t25();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t27() {
        t26();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t28() {
        t27();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t29() {
        t28();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t30() {
        t29();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t31() {
        t30();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t32() {
        t31();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t33() {
        t32();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t34() {
        t33();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t35() {
        t34();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t36() {
        t35();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t37() {
        t36();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t38() {
        t37();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t39() {
        t38();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t40() {
        t39();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t41() {
        t40();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t42() {
        t41();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t43() {
        t42();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t44() {
        t43();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t45() {
        t44();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t46() {
        t45();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t47() {
        t46();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t48() {
        t47();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t49() {
        t48();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t50() {
        t49();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t51() {
        t50();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t52() {
        t51();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t53() {
        t52();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t54() {
        t53();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t55() {
        t54();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t56() {
        t55();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t57() {
        t56();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t58() {
        t57();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t59() {
        t58();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t60() {
        t59();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t61() {
        t60();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t62() {
        t61();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t63() {
        t62();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t64() {
        t63();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t65() {
        t64();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t66() {
        t65();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t67() {
        t66();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t68() {
        t67();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t69() {
        t68();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t70() {
        t69();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t71() {
        t70();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t72() {
        t71();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t73() {
        t72();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t74() {
        t73();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t75() {
        t74();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t76() {
        t75();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t77() {
        t76();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t78() {
        t77();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t79() {
        t78();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t80() {
        t79();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t81() {
        t80();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t82() {
        t81();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t83() {
        t82();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t84() {
        t83();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t85() {
        t84();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t86() {
        t85();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t87() {
        t86();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t88() {
        t87();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t89() {
        t88();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t90() {
        t89();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t91() {
        t90();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t92() {
        t91();
        out.println(space);
        out.println(t6);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t93() {
        t92();
        out.println(space);
        out.println(t93);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t94() {
        t93();
        out.println(space);
        out.println(t94);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t95() {
        t94();
        out.println(space);
        out.println(t95);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t96() {
        t95();
        out.println(space);
        out.println(t96);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t97() {
        t96();
        out.println(space);
        out.println(t97);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t98() {
        t97();
        out.println(space);
        out.println(t98);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t99() {
        t98();
        out.println(space);
        out.println(t99);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }
    public static void t100() {
        t99();
        out.println(space);
        out.println(t100);
        try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
        out.println("You've thrown" + " " + uitkomst);
    }

    public static void forlooper(){
        while(flnow <=6){
            out.println(space);
            switch (flnow) {
                case 1 -> out.println(t1);
                case 2 -> out.println(t2);
                case 3 -> out.println(t3);
                case 4 -> out.println(t4);
                case 5 -> out.println(t5);
                case 6 -> out.println(t6);
            }
            try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace(); }
            flnow++;
        }
        flnow = 0;
    }

    public static void forlooper2() {
        while(flnow <=100){
            flnow = 7;
            out.println(space);
            switch (flnow) {
                case 7 -> out.println(t7);
                case 8 -> out.println(t8);
                case 9 -> out.println(t9);
                case 10 -> out.println(t10);
                case 11 -> out.println(t11);
                case 12 -> out.println(t12);
                case 13 -> out.println(t13);
                case 14 -> out.println(t14);
                case 15 -> out.println(t15);
                case 16 -> out.println(t16);
                case 17 -> out.println(t17);
                case 18 -> out.println(t18);
                case 19 -> out.println(t7);
                case 20 -> out.println(t8);
                case 21 -> out.println(t9);
                case 22 -> out.println(t10);
                case 23 -> out.println(t11);
                case 24 -> out.println(t12);
                case 25 -> out.println(t7);
                case 26 -> out.println(t8);
                case 27 -> out.println(t9);
                case 28 -> out.println(t10);
                case 29 -> out.println(t11);
                case 30 -> out.println(t12);
                case 31 -> out.println(t7);
                case 32 -> out.println(t8);
                case 33 -> out.println(t9);
                case 34 -> out.println(t10);
                case 35 -> out.println(t11);
                case 36 -> out.println(t12);
                case 37 -> out.println(t7);
                case 38 -> out.println(t8);
                case 39 -> out.println(t9);
                case 40 -> out.println(t10);
                case 41 -> out.println(t11);
                case 42 -> out.println(t12);
                case 43 -> out.println(t7);
                case 44 -> out.println(t8);
                case 45 -> out.println(t9);
                case 46 -> out.println(t10);
                case 50 -> out.println(t11);
                case 51 -> out.println(t12);
                case 52 -> out.println(t7);
                case 53 -> out.println(t8);
                case 54 -> out.println(t9);
                case 55 -> out.println(t10);
                case 56 -> out.println(t11);
                case 57 -> out.println(t12);
                case 58 -> out.println(t7);
                case 59 -> out.println(t8);
                case 60 -> out.println(t9);
                case 61 -> out.println(t10);
                case 62 -> out.println(t11);
                case 63 -> out.println(t12);
                case 64 -> out.println(t7);
                case 65 -> out.println(t8);
                case 66 -> out.println(t9);
                case 67 -> out.println(t10);
                case 68 -> out.println(t11);
                case 69 -> out.println(t12);
                case 70 -> out.println(t7);
                case 71 -> out.println(t8);
                case 72 -> out.println(t9);
                case 73 -> out.println(t10);
                case 74 -> out.println(t11);
                case 75 -> out.println(t75);
                case 76 -> out.println(t76);
                case 77 -> out.println(t77);
                case 78 -> out.println(t78);
                case 79 -> out.println(t79);
                case 80 -> out.println(t80);
                case 81 -> out.println(t81);
                case 82 -> out.println(t82);
                case 83 -> out.println(t83);
                case 84 -> out.println(t84);
                case 85 -> out.println(t85);
                case 86 -> out.println(t86);
                case 87 -> out.println(t87);
                case 88 -> out.println(t88);
                case 89 -> out.println(t89);
                case 90 -> out.println(t90);
                case 91 -> out.println(t91);
                case 92 -> out.println(t92);
                case 93 -> out.println(t93);
                case 94 -> out.println(t94);
                case 95 -> out.println(t95);
                case 96 -> out.println(t96);
                case 97 -> out.println(t97);
                case 98 -> out.println(t98);
                case 99 -> out.println(t99);
                case 100 -> out.println(t100);
            }
            try {Thread.sleep(200);}
            catch (InterruptedException e) {e.printStackTrace(); }
            flnow++;
        }
        flnow = 0;
    }
}