package expr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Power implements Factor {
    private final ArrayList<Factor> factors;

    public Power() {
        this.factors = new ArrayList<>();
    }

    public void addFactor(Factor factor) {
        this.factors.add(factor);
    }

    public String toString() {
        Iterator<Factor> iter = factors.iterator();
        StringBuilder sb = new StringBuilder();
        sb.append(iter.next().toString());
        if (iter.hasNext()) {
            sb.append(" ");
            sb.append(iter.next().toString());
            sb.append(" **");
            while (iter.hasNext()) {
                sb.append(" ");
                sb.append(iter.next().toString());
                sb.append(" **");
            }
        }

        return sb.toString();
    }
}