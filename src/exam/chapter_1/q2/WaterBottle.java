package exam.chapter_1.q2;

/*
What is the output of the following program?
1: public class WaterBottle {
2: private String brand;
3: private boolean empty;
4: public static void main(String[] args) {
5: WaterBottle wb = new WaterBottle();
6: System.out.print("Empty = " + wb.empty);
7: System.out.print(", Brand = " + wb.brand);
8: } }
A. Line 6 generates a compiler error.
B. Line 7 generates a compiler error.
C. There is no output.
D. Empty = false, Brand = null
E. Empty = false, Brand =
F. Empty = null, Brand = null
 * */
public class WaterBottle {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}
