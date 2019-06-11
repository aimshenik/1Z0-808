package exam.assesment_test.q6;

/*
What is the result of the following program?
1: public class MathFunctions {
2: public static void addToInt(int x, int amountToAdd) {
3: x = x + amountToAdd;
4: }
5: public static void main(String[] args) {
6: int a = 15;
7: int b = 10;
8: MathFunctions.addToInt(a, b);
9: System.out.println(a); } }
A. 10
B. 15
C. 25
D. Compiler error on line 3.
E. Compiler error on line 8.
F. None of the above.
 * */
public class MathFunctions {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
    }
}

/*
B. The code compiles successfully, so options D and E are incorrect. The value of a
cannot be changed by the addToInt method, no matter what the method does, because
only a copy of the variable is passed into the parameter x. Therefore, a does not change
and the output on line 9 is 15. For more information, see Chapter 4.
 * */