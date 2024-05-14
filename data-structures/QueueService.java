import java.util.Arrays;
import java.util.LinkedList;

public class QueueService {

    public static void main(String[] args) {

        LinkedList<Integer> customers = new LinkedList<>(Arrays.asList(101, 201, 701));
        System.out.println(customers);

        addCustomer(customers, 102);
        System.out.println(customers);

        Integer customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        addCustomer(customers, 702);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);
    }

    /**
     * Add the number to the end of the queue
     * @param queue - LinkedList of customers
     * @param number - client number
     */
    public static void addCustomer(LinkedList<Integer> queue, Integer number) {
        
    }

    /**
     * Returns the first customer number in the queue.
     * If there is a VIP client (starts with 7xx), it is the next one.
     * @param queue - LinkedList of customers
     * @return - client number
     */
    public static Integer nextCustomer(LinkedList<Integer> queue) {
        
    }

    /**
     * Removes the number from the queue
     * @param queue - LinkedList of customers
     * @param number - client number
     */
    public static void removeCustomer(LinkedList<Integer> queue, Integer number) {
        
    }
}
