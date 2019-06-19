package exam.assesment_test.q15;

import java.util.ArrayList;
import java.util.List;

/*
Which of the following statements can be inserted in the blank line so that the code will
compile successfully? (Choose all that apply)
public interface CanSwim {}
public class Amphibian implements CanSwim {}
class Tadpole extends Amphibian {}
public class FindAllTadPole {
public static void main(String[] args) {
List<Tadpole> tadpoles = new ArrayList<Tadpole>();
for(Amphibian amphibian : tadpoles) {
___________ tadpole = amphibian;
} } }
A. CanSwim
B. Long
C. Amphibian
D. Tadpole
E. Object
 * */
interface CanSwim {
}

class Amphibian implements CanSwim {
}

class Tadpole extends Amphibian {
}

public class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
//            __________ tadpole = amphibian;
        }
    }
}
/*
A, C, E. The for-each loop automatically casts each Tadpole object to an Amphibian
reference, which does not require an explicit cast because Tadpole is a subclass of
Amphibian. From there, any parent class or interface that Amphibian inherits from is
permitted without an explicit cast. This includes CanSwim, the interface Amphibian
implements, and Object, which all classes extend from, so options A and E are correct.
Option C is also correct since the reference is being cast to the same type, so no explicit
cast is required. Option B is incorrect, since Long is not a parent of Amphibian. Option
D is incorrect as well, although an explicit cast to Tadpole on the right-hand side of the
expression would be required to allow the code to compile. For more information, see
Chapter 5.*/
