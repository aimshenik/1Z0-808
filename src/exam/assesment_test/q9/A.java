package exam.assesment_test.q9;
/*
Which of the following statements are true? (Choose all that apply)
A. Checked exceptions are intended to be thrown by the JVM (and not the programmer).
B. Checked exceptions are required to be caught or declared.
C. Errors are intended to be thrown by the JVM (and not the programmer).
D. Errors are required to be caught or declared.
E. Runtime exceptions are intended to be thrown by the JVM (and not the programmer).
F. Runtime exceptions are required to be caught or declared.
 * */
public class A {
}

/*
B, C. Only checked exceptions are required to be handled (caught) or declared. Runtime
exceptions are commonly thrown by both the JVM and programmer code.
Checked exceptions are usually thrown by programmer code. Errors are intended to be
Introduction xli
thrown by the JVM. While a programmer could throw one, this would be a horrible
practice. For more information, see Chapter 6. 
 * */
