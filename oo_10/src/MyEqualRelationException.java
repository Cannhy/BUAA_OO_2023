import com.oocourse.spec2.exceptions.EqualRelationException;

import java.util.HashMap;

public class MyEqualRelationException extends EqualRelationException {
    private int id1;
    private int id2;
    private static int counter = 0;
    private static HashMap<Integer, Integer> idCounter = new HashMap<>();

    public MyEqualRelationException(int id1, int id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    public void print() {
        counter++;
        if (idCounter.containsKey(id1)) {
            int oldCount = idCounter.get(id1);
            idCounter.put(id1, oldCount + 1);
        } else {
            idCounter.put(id1, 1);
        }
        if (id1 == id2) {
            System.out.println("er-" + counter + ", " + id1 + "-" + idCounter.get(id1) +
                    ", " + id1 + "-" + idCounter.get(id1));
        }
        else {
            if (idCounter.containsKey(id2)) {
                int oldCount = idCounter.get(id2);
                idCounter.put(id2, oldCount + 1);
            } else {
                idCounter.put(id2, 1);
            }
            if (id1 < id2) {
                System.out.println("er-" + counter + ", " + id1 + "-" + idCounter.get(id1) +
                        ", " + id2 + "-" + idCounter.get(id2));
            } else {
                System.out.println("er-" + counter + ", " + id2 + "-" + idCounter.get(id2) +
                        ", " + id1 + "-" + idCounter.get(id1));
            }
        }
    }
}