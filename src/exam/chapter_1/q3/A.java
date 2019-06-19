package exam.chapter_1.q3;
/*
Which of the following are true? (Choose all that apply)
4: short numPets = 5;
5: int numGrains = 5.6;
6: String name = "Scruffy";
7: numPets.length();
8: numGrains.length();
9: name.length();
A. Line 4 generates a compiler error. -
B. Line 5 generates a compiler error. +
C. Line 6 generates a compiler error. -
D. Line 7 generates a compiler error. +
E. Line 8 generates a compiler error. +
F. Line 9 generates a compiler error. -
G. The code compiles as is.  -
 * */


public class A {
//    short numPets = 5;        
//    int numGrains = 5.6;      
//    String name = "Scruffy";  
//    numPets.length();         
//    numGrains.length();       
//    name.length();            
}
/*
3.) B, D, E. Option A (line 4) compiles because short is an integral type. Option B (line
5) generates a compiler error because int is an integral type, but 5.6 is a floating-point
type. Option C (line 6) compiles because it is assigned a String. Options D and E (lines
7 and 8) do not compile because short and int are primitives. Primitives do not allow
methods to be called on them. Option F (line 9) compiles because length() is defined
on String. 
 * */
