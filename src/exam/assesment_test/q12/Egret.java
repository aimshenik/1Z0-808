package exam.assesment_test.q12;

/*    What is the result of the following program?
1: public class Egret {
2: private String color;
3: public Egret() {
4: this("white");
5: }
6: public Egret(String color) {
7: color = color;
8: }
9: public static void main(String[] args) {
10: Egret e = new Egret();
11: System.out.println("Color:" + e.color);
12: }
13: }
A. Color:
B. Color:null
C. Color:White
D. Compiler error on line 4.
E. Compiler error on line 10.
F. Compiler error on line 11.
 * */
public class Egret {
    private String color;

    public Egret() {
        this("white");
    }

    public Egret(String color) {
        color = color;
    }

    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
    }
}

/*
B. Line 10 calls the constructor on lines 3–5. That constructor calls the other constructor.
However, the constructor on lines 6–8 assigns the method parameter to itself,
which leaves the color instance variable on line 2 set to its default value of null. For
more information, see Chapter 4. 
 * */
