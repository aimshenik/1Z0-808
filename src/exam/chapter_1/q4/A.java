package exam.chapter_1.q4;

/*
Given the following class, which of the following is true? (Choose all that apply)
1: public class Snake {
2:
3: public void shed(boolean time) {
4:
5: if (time) {
6:
7: }
8: System.out.println(result);
9:
10: }
11: }
A. If String result = "done"; is inserted on line 2, the code will compile.
B. If String result = "done"; is inserted on line 4, the code will compile.
C. If String result = "done"; is inserted on line 6, the code will compile.
D. If String result = "done"; is inserted on line 9, the code will compile.
E. None of the above changes will make the code compile.
 * */

public class A {
}

/*
4. A, B. Adding the variable at line 2 makes result an instance variable. Since instance
variables are in scope for the entire life of the object, option A is correct. Option B is
correct because adding the variable at line 4 makes result a local variable with a scope
of the whole method. Adding the variable at line 6 makes result a local variable with
a scope of lines 6–7. Since it is out of scope on line 8, the println does not compile and
option C is incorrect. Adding the variable at line 9 makes result a local variable with
a scope of lines 9 and 10. Since line 8 is before the declaration, it does not compile and
option D is incorrect. Finally, option E is incorrect because the code can be made to
compile. 
 * */
