package Day7;

import java.util.*;

enum e {
    CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
};

public class EnumCol {
    public static void main(String[] args) {
        EnumSet<e> s1, s2, s3, s4;

        s1 = EnumSet.of(e.QUIZ, e.CONTRIBUTE, e.LEARN, e.CODE);
        s2 = EnumSet.complementOf(s1);
        s3 = EnumSet.allOf(e.class);
        s4 = EnumSet.range(e.CODE, e.CONTRIBUTE);

        System.out.println("Set1: " + s1);
        System.out.println("Set2: " + s2);
        System.out.println("Set3: " + s3);
        System.out.println("Set4: " + s4);
    }
}
