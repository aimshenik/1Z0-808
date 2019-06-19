package exam.assesment_test.q17;

import java.util.function.Predicate;

/*
Which of the following lines can be inserted at line 11 to print true? (Choose all that
apply)
10: public static void main(String[] args) {
11: // INSERT CODE HERE
12: }
13: private static boolean test(Predicate<Integer> p) {
14: return p.test(5);
15: }
A. System.out.println(test(i -> i == 5));
B. System.out.println(test(i -> {i == 5;}));
C. System.out.println(test((i) -> i == 5));
D. System.out.println(test((int i) -> i == 5);
E. System.out.println(test((int i) -> {return i == 5;}));
F. System.out.println(test((i) -> {return i == 5;}));
 * */
public class Q {
    public static void main(String[] args) {     
     // INSERT CODE HERE                                   
     }                                                     
     private static boolean test(Predicate<Integer> p) {   
     return p.test(5);                                     
     }                                                     
}


/*
A, C, F. The only functional programming interface you need to memorize for the
exam is Predicate. It takes a single parameter and returns a boolean. Lambda expressions
with one parameter are allowed to omit the parentheses around the parameter
list, making options A and C correct. The return statement is optional when a single
statement is in the body, making option F correct. Option B is incorrect because a
return statement must be used if braces are included around the body. Options D and
E are incorrect because the type is Integer in the predicate and int in the lambda.
Autoboxing works for collections not inferring predicates. If these two were changed
to Integer, they would be correct. For more information, see Chapter 4.
 * */
