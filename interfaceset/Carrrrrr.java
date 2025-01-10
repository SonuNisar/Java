package interfaceset;

import java.util.TreeSet;

public class Carrrrrr implements Comparable<Carrrrrr> {

    int cost;

    Carrrrrr(int cost) {
        this.cost = cost;
    }
    public String toString() {
        return "cost: " + cost;
    }

    public int compareTo(Carrrrrr c) {
        return this.cost - c.cost;
    }

    public static void main(String[] args) {

        Carrrrrr c = new Carrrrrr(10000);
        Carrrrrr c1 = new Carrrrrr(200);
        Carrrrrr c2 = new Carrrrrr(300);

        TreeSet<Carrrrrr> t = new TreeSet<>();
        t.add(c);
        t.add(c1);
        t.add(c2);

        for (Carrrrrr r : t) {
            System.out.println(r);
        }
    }
}
