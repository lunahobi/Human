import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Human a = new Human("Шишигина", "Дарья", "Александровна");
        Human b = new Human("Данилкина", "Дарья", "Гамлетовна");
        System.out.println(a.compareTo(b));
        LinkedList<Human> people = new LinkedList<>();
        people.add(a);
        people.add(b);
        people.add(new Human("Харченко", "Елена", "Алексеевна"));
        Collections.sort(people);
        for (Human c: people){
            System.out.println(c.toString());
        }
    }
}