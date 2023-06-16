import com.oocourse.spec3.exceptions.EqualMessageIdException;

import java.util.HashMap;

public class MyEqualMessageIdException extends EqualMessageIdException {
    private int id;
    private static int counter = 0;
    private static HashMap<Integer, Integer> idCounter = new HashMap<>();

    public MyEqualMessageIdException(int id) {
        this.id = id;
    }

    @Override
    public void print() {
        counter++;
        if (idCounter.containsKey(this.id)) {
            int oldCnt = idCounter.get(this.id);
            idCounter.put(id, oldCnt + 1);
        } else {
            idCounter.put(id, 1);
        }
        System.out.println("emi-" + counter + ", " + id + "-" + idCounter.get(id));
    }
}