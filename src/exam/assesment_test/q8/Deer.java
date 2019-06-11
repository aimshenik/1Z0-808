package exam.assesment_test.q8;

/*
What is the output of the following code?
1: public class Deer {
2: public Deer() { System.out.print("Deer"); }
3: public Deer(int age) { System.out.print("DeerAge"); }
4: private boolean hasHorns() { return false; }
5: public static void main(String[] args) {
6: Deer deer = new Reindeer(5);
7: System.out.println(","+deer.hasHorns());
8: }
9: }
10: class Reindeer extends Deer {
11: public Reindeer(int age) { System.out.print("Reindeer"); }
12: public boolean hasHorns() { return true; }
13: }
A. DeerReindeer,false
B. DeerReindeer,true
C. ReindeerDeer,false
D. ReindeerDeer,true
E. DeerAgeReindeer,false
F. DeerAgeReindeer,true
G. The code will not compile because of line 7.
H. The code will not compile because of line 12.
 * */
public class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        System.out.print("DeerAge");
    }

    private boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }
}
