package exam.assesment_test.q2;

/*
 * What is the result of the following code?
String s1 = "Java";
String s2 = "Java";
StringBuilder sb1 = new StringBuilder();
sb1.append("Ja").append("va");
System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
System.out.println(sb1.toString() == s1);
System.out.println(sb1.toString().equals(s1));
A. true is printed out exactly once.
B. true is printed out exactly twice.
C. true is printed out exactly three times.
D. true is printed out exactly four times.
E. The code does not compile.
 * 
 * */


public class Q2 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }
}

//C. String literals are used from the string pool. This means that s1 and s2 refer to the
//same object and are equal. Therefore, the first two print statements print true. The
//third print statement prints false because toString() uses a method to compute the
//value and it is not from the string pool. The final print statement again prints true
//because equals() looks at the values of String objects. For more information, see
//Chapter 3.
