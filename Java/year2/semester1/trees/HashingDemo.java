package Java.year2.semester1.trees;
import java.util.LinkedList;
import java.util.List;

public class HashingDemo {

    public static void main(String[] args) {
        // Demonstrating Linear Probing
        System.out.println("\n");
        System.out.println("LINEAR PROBING DEMO:");
        int[] linearProbingTable = new int[10];
        linearProbing(3, linearProbingTable);
        linearProbing(8, linearProbingTable);
        linearProbing(13, linearProbingTable);
        System.out.println("Linear Probing Table: " + java.util.Arrays.toString(linearProbingTable));

        // Demonstrating Quadratic Probing
        System.out.println("\nQUADRATIC PROBING DEMO:");
        int[] quadraticProbingTable = new int[10];
        quadraticProbing(3, quadraticProbingTable);
        quadraticProbing(8, quadraticProbingTable);
        quadraticProbing(13, quadraticProbingTable);
        System.out.println("Quadratic Probing Table: " + java.util.Arrays.toString(quadraticProbingTable));

        // Demonstrating Double Hashing
        System.out.println("\nDOUBLE HASHING DEMO:");
        int[] doubleHashingTable = new int[10];
        doubleHashing(3, doubleHashingTable);
        doubleHashing(8, doubleHashingTable);
        doubleHashing(13, doubleHashingTable);
        System.out.println("Double Hashing Table: " + java.util.Arrays.toString(doubleHashingTable));

        // Demonstrating Separate Chaining
        System.out.println("\nSEPARATE CHAINING DEMO:");
        List<Integer>[] separateChainingTable = new List[10];
        separateChaining(3, separateChainingTable);
        separateChaining(8, separateChainingTable);
        separateChaining(13, separateChainingTable);
        System.out.println("Separate Chaining Table: " + java.util.Arrays.toString(separateChainingTable));
        System.out.println("\n");
    }

    // LINEAR PROBING
    static void linearProbing(int key, int[] hashTable) {
        int index = key % hashTable.length;
        while (hashTable[index] != 0) {
            index = (index + 1) % hashTable.length;
        }
        hashTable[index] = key;
    }

    // QUADRATIC PROBING
    static void quadraticProbing(int key, int[] hashTable) {
        int index = key % hashTable.length;
        int i = 1;
        while (hashTable[index] != 0) {
            index = (index + i * i) % hashTable.length;
            i++;
        }
        hashTable[index] = key;
    }

    // DOUBLE HASHING
    static void doubleHashing(int key, int[] hashTable) {
        int index = key % hashTable.length;
        int stepSize = 7 - (key % 7); // Using a simple secondary hash function
        int i = 0;
        while (hashTable[index] != 0) {
            index = (index + i * stepSize) % hashTable.length;
            i++;
        }
        hashTable[index] = key;
    }

    // SEPARATE CHAINING
    static void separateChaining(int key, List<Integer>[] hashTable) {
        int index = key % hashTable.length;
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
        }
        hashTable[index].add(key);
    }
}

