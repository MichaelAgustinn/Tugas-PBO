package pbo2;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hash Set
        Set<Integer> hashSet = new HashSet<>();
        System.out.println("Enter elements for HashSet (type 'done' to finish):");
        while (true) {
            String input = scanner.next();
            if (input.equals("done")) break;
            int element = Integer.parseInt(input);
            hashSet.add(element);
        }
        System.out.println("Elements in HashSet: " + hashSet);

        // Hash Map
        Map<String, Integer> hashMap = new HashMap<>();
        System.out.println("\nEnter key-value pairs for HashMap (type 'done' to finish):");
        while (true) {
            System.out.print("Enter key: ");
            String key = scanner.next();
            if (key.equals("done")) break;
            System.out.print("Enter value: ");
            int value = scanner.nextInt();
            hashMap.put(key, value);
        }
        System.out.println("Elements in HashMap: " + hashMap);

        // Stack
        Stack<Integer> stack = new Stack<>();
        System.out.println("\nEnter elements for Stack (type 'done' to finish):");
        while (true) {
            String input = scanner.next();
            if (input.equals("done")) break;
            int element = Integer.parseInt(input);
            stack.push(element);
        }
        System.out.print("Elements in Stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        // Queue
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("\nEnter elements for Queue (type 'done' to finish):");
        while (true) {
            String input = scanner.next();
            if (input.equals("done")) break;
            int element = Integer.parseInt(input);
            queue.offer(element);
        }
        System.out.print("Elements in Queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

        // Graph (Undirected)
        Map<Integer, List<Integer>> graph = new HashMap<>();
        scanner.nextLine(); // Consume newline character
        System.out.println("\nEnter edges for Graph (type 'done' to finish):");
        while (true) {
            System.out.print("Enter source-destination pair (e.g., 'source destination'): ");
            String input = scanner.nextLine().trim();
            if (input.equals("done")) break;
            String[] nodes = input.split(" ");
            int source = Integer.parseInt(nodes[0]);
            int destination = Integer.parseInt(nodes[1]);
            graph.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
            graph.computeIfAbsent(destination, k -> new ArrayList<>()).add(source); // For undirected graph
        }
        System.out.println("Graph: " + graph);

        // Tree (Binary Tree)
        TreeNode root = buildTree(scanner);
        System.out.println("Elements in Tree (in-order traversal):");
        printInOrder(root);

        scanner.close();
    }

    public static TreeNode buildTree(Scanner scanner) {
        System.out.println("\nEnter elements for Tree (type 'null' for empty node):");
        String val = scanner.next().trim();
        if (val.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = buildTree(scanner);
        root.right = buildTree(scanner);
        return root;
    }

    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
