package exam.assesment_test.q16;

/*
What individual changes, if any, would allow the following code to compile? (Choose all
that apply)
1: public interface Animal { public default String getName() { return null; } }
2: interface Mammal { public default String getName() { return null; } }
3: abstract class Otter implements Mammal, Animal {}
A. The code compiles without issue.
B. Remove the default method modifier and method implementation on line 1.
C. Remove the default method modifier and method implementation on line 2.
D. Remove the default method modifier and method implementation on lines 1 and 2.
E. Change the return value on line 1 from null to "Animal".
F. Override the getName() method with an abstract method in the Otter class.
G. Override the getName() method with a concrete method in the Otter class.
 * */
public interface Animal {
    public default String getName() {
        return null;
    }
}

interface Mammal {
    public default String getName() {
        return null;
    }
}
//UNCOMMENT
//abstract class Otter implements Mammal, Animal {
//}

/*
D, F, G. The code does not compile, since a class cannot inherit two interfaces that
both define default methods with the same signature, unless the class implementing
the interfaces overrides it with an abstract or concrete method. Therefore, option A is
incorrect and options F and G are correct. The alternate approach is to make the
getName() method abstract in the interfaces, because an interface may inherit two
abstract methods with the same signature. The change must be made to both interfaces,
though, so options B and C are incorrect if taken individually, and option D is
correct since the changes are taken together. For more information, see Chapter 5.
*/
