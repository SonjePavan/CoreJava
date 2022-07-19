import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * LinkedList should be used
 *  where modifications to a collection are frequent like addition/deletion operations.
 * LinkedList is much faster as compare to ArrayList in such cases.
 * In case of read-only collections or collections which are rarely modified,
 * ArrayList is suitable
 * */
public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(Math.round((float) Math.random() * 100));
        intList.add(Math.round((float) Math.random() * 100));
        intList.add(Math.round((float) Math.random() * 100));
        intList.add(Math.round((float) Math.random() * 100));
        intList.add(Math.round((float) Math.random() * 100));
        intList.add(Math.round((float) Math.random() * 100));
        intList.add(Math.round((float) Math.random() * 100));

        for (Integer i : intList) {
            System.out.print(i + " , ");
        }

        //adding element at specific position
        //itr will add new  element  and new element will point to
        // element which was already there at that position

        intList.add(5, 96);
        System.out.println("\nLinkedList after adding elemenent at index 5");
        for (Integer i : intList) {
            System.out.print(i + " , ");
        }


        //iterator for iterating through linkedlist (FORWARD ONLY)
        //Can be used to iterate all collection classes.
        //Supports only READ and DELETE operations.
        testIterator(intList);

        //Listerator for iterating foraward as well as backward (FORWARD+BACKWARD)
        //Can be used to iterate only List implemented classes.
        //Supports all CRUD operations.
        testListerator(intList);

        //lets add In order Using Listerator
        System.out.println("\n");
        LinkedList<String> designation = new LinkedList<>();
        testAddInOrderByListerator(designation, "Manager");
        testAddInOrderByListerator(designation, "Assistant");
        testAddInOrderByListerator(designation, "Devloper");
        testAddInOrderByListerator(designation, "Guard");
        testAddInOrderByListerator(designation, "Manager");

        for (String s : designation)
            System.out.print(s + " ");
    }


    private static void testAddInOrderByListerator(LinkedList<String> designation, String newDesignation) {
        ListIterator<String> litr = designation.listIterator();
        while (litr.hasNext()) {
            int comparison = litr.next().compareTo(newDesignation);
            if (comparison == 0) {
                System.out.println(newDesignation + " is alreay present in LinkedList");
                return ;
            } else if (comparison > 1) {
                litr.previous();
                litr.add(newDesignation);
                return ;
            }

        }
        litr.add(newDesignation);
        return ;
    }

    private static void testListerator(LinkedList<Integer> intList) {
        ListIterator<Integer> litr = intList.listIterator();
        System.out.println("\nUsing Listerator Forward");
        while (litr.hasNext()) {
            System.out.print(litr.next() + " , ");
        }
        System.out.println("\nUsing Listerator Backward");
        while (litr.hasPrevious())
            System.out.print(litr.previous() + " , ");
    }

    private static void testIterator(LinkedList<Integer> intList) {
        Iterator<Integer> itr = intList.iterator();
        System.out.println("\nUsing Iterator");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " , ");
        }

    }
}
