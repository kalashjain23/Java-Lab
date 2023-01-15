import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice
{
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        TreeSet<Integer> tree_int = new TreeSet<Integer>();

        tree.add("Kalash");
        tree.add("PDEU");
        tree.remove("Kalash");

        tree_int.add(5);
        tree_int.add(7);
        tree_int.add(6);
        tree_int.remove(5);

        System.out.println(tree);
        System.out.println(tree_int);

        Iterator<Integer> it_int = tree_int.iterator();
        Iterator<String> it = tree.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        while(it_int.hasNext()){
            System.out.print(it_int.next() + " ");
        }
    }
}
