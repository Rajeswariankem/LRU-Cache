/**
 * LRU Cache implementation using HashMap and Doubly Linked List
 * - get() and put() run in O(1) time
 * - Most Recently Used (MRU) node is kept near head
 * - Least Recently Used (LRU) node is kept near tail
 */
import java.util.HashMap;
public class LRUCache {

    // Maximum number of items cache can hold
    private int capacity;
    // Maps key to its corresponding node in the DLL
    private HashMap<Integer,Node> map;

     // Dummy head and tail nodes to simplify add/remove logic
    private Node head;
    private Node tail;

    /**
     * Initializes LRU Cache with given capacity
     */
    public LRUCache(int capacity)
    {
        this.capacity=capacity;
        map=new HashMap<>();

        // Initialize dummy head and tail
        head=new Node(0,0);
        tail=new Node(0, 0);
        head.next=tail;
        tail.prev=head;
    }

    /**
     * Adds node right after head (Most Recently Used position)
     */
    private void addNode(Node node)
    {
        Node nextnode=head.next;

        node.next=nextnode;
        nextnode.prev=node;

        head.next=node;
        node.prev=head;
    }

     /**
     * Removes an existing node from the Doubly Linked List
     */
    private void deleteNode(Node node)
    {
        Node prevnode=node.prev;
        Node nextnode=node.next;

        prevnode.next=nextnode;
        nextnode.prev=prevnode;
    }

    /**
     * Returns value for given key and marks it as Most Recently Used
     */
    public void get(int key)
    {
        // Cache miss
        if(!map.containsKey(key))
        {
            System.out.println("Key not found..!");
            return;
        }

        // Cache hit
        Node node=map.get(key);

        // Move accessed node to MRU position
        deleteNode(node);
        addNode(node);

        System.out.println("Found value: " + node.value);
        print();
    }


    /**
     * Inserts or updates key-value pair in cache
     * Evicts LRU item if capacity is exceeded
     */
    public void put(int key,int value)
    {

         // Key already exists → update value and move to MRU
        if(map.containsKey(key))
        {
            Node node=map.get(key);
            node.value=value;
            deleteNode(node);
            addNode(node);
            System.out.println("Updated existing key..!");
        }
        else{
            // Cache full → remove LRU node
            if(map.size()==capacity)
            {
                Node lru=tail.prev;
                deleteNode(lru);
                map.remove(lru.key);
                System.out.println("Evicted LRU key(Least Recently Used): " + lru.key);
            }

            // Insert new node as MRU
            Node newnode=new Node(key, value);
            addNode(newnode);
            map.put(key, newnode);
            System.out.println("Inserted new key!!");
        }
        print();
    }


    /**
     * Prints current cache state from MRU to LRU
     */
    public void print()
    {
        if(head.next==tail)
        {
            System.out.println("Cache is empty! Try to add..");
            return;
        }
        System.out.print("Cache : [ ");
        Node crr=head.next;
        while (crr!=tail) {
            System.out.print(crr.key+ " : "+crr.value);
            if(crr.next!=tail)
            {
                System.out.print(" | ");
            }
            crr=crr.next;
        }
        System.out.print(" ]");
    }
}
