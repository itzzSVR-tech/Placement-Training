# Data Structures

## Module 1: Foundations of Data Structures in Java

Before diving into specific structures, we must understand *how* Java organizes data in memory. Unlike Python, Java is statically typed, meaning we must define what kind of data our structures will hold.

### 1. Arrays (The Building Block)
An array is the simplest data structure: a contiguous block of memory holding elements of the same type.

* **Key Characteristic:** Fixed size. Once created, it cannot grow or shrink.
* **Time Complexity:** Access is $O(1)$ (instant), but searching/inserting is $O(n)$.
* **Java Syntax:**
    ```java
    int[] numbers = new int[5]; // Array of size 5
    numbers[0] = 10;
    ```

### 2. The Java Collections Framework (JCF)
In professional Java development, we rarely use raw arrays. Instead, we use the **Collections Framework** (`java.util.*`), a set of pre-built classes and interfaces that implement common data structures.

> **Note:** The JCF is hierarchical. The root interface is `Collection` (except for Maps).

---

## Module 2: Linear Data Structures

These structures organize data sequentially.

### 1. ArrayList (Dynamic Array)
Think of this as a "resizable array." It manages an internal array that grows automatically when it gets full.

* **Best For:** Scenarios where you read data frequently but modify it rarely.
* **Java Class:** `java.util.ArrayList`
* **Under the Hood:** When the internal array fills up, Java creates a new, larger array (usually 50% larger) and copies all elements over.
* **Example:**
    ```java
    import java.util.ArrayList;

    ArrayList<String> tasks = new ArrayList<>();
    tasks.add("Code");
    tasks.add("Debug"); // Adds to the end
    String firstTask = tasks.get(0); // O(1) Access
    ```

### 2. LinkedList
A chain of nodes where each node contains data and a reference (pointer) to the next node. Java’s `LinkedList` is actually a **Doubly Linked List** (references to both next and previous nodes).

* **Best For:** Frequent insertions and deletions (especially at the beginning or middle).
* **Trade-off:** Slower access time ($O(n)$) because you must traverse the chain to find an item.

### 3. Stacks (LIFO - Last In, First Out)
Imagine a stack of plates. You can only take the top one off.

* **Use Cases:** Undo features in editors, navigating browser history (back button), recursion handling.
* **Java Implementation:** While a `Stack` class exists, modern Java developers prefer using the `ArrayDeque` class for stacks as it is faster.
    ```java
    import java.util.ArrayDeque;
    import java.util.Deque;

    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(10);
    stack.push(20);
    int top = stack.pop(); // Returns 20
    ```

### 4. Queues (FIFO - First In, First Out)
Like a line at a ticket counter. The first person in line is the first one served.

* **Use Cases:** Printer job scheduling, web server request handling.
* **Java Implementation:** Usually implemented using `LinkedList` or `ArrayDeque`.
    ```java
    Queue<String> queue = new LinkedList<>();
    queue.offer("First");
    queue.offer("Second");
    String served = queue.poll(); // Returns "First"
    ```

---

## Module 3: Non-Linear Data Structures

These structures organize data hierarchically or based on relationships.

### 1. Trees
Trees store data in a hierarchy with a "Root" node and "Child" nodes.

* **Binary Search Tree (BST):** A specific type of tree where the left child is smaller than the parent, and the right child is larger. This makes searching very fast ($O(\log n)$).
* **Java Implementation:** Java uses `TreeSet` and `TreeMap`, which are actually **Red-Black Trees** (a self-balancing BST). This ensures the tree doesn't get lopsided, maintaining performance.

### 2. Heaps (Priority Queue)
A specialized tree-based structure that satisfies the "heap property."
* **Max-Heap:** The parent is always greater than or equal to the children.
* **Min-Heap:** The parent is always smaller than or equal to the children.
* **Use Case:** Finding the "K-th" largest element, scheduling tasks by priority.
* **Java Class:** `PriorityQueue` (Defaults to Min-Heap).

### 3. Graphs
A collection of nodes (vertices) and edges connecting them. They can be directed (one-way like Instagram followers) or undirected (two-way like Facebook friends).

* **Representations:**
    * **Adjacency Matrix:** A 2D array (good for dense graphs).
    * **Adjacency List:** An array of Lists (good for sparse graphs, used most often).
* **Java:** There is no built-in "Graph" class. You typically build your own using `HashMap<Node, List<Node>>`.

---

## Module 4: Hashing (The Speed King)

Hashing is critical for interview questions and real-world performance.

### 1. HashMap
Stores data in Key-Value pairs. It uses a "Hash Function" to compute an index into an array of "buckets" or "slots."

* **Time Complexity:** $O(1)$ for insertion, deletion, and lookup on average.
* **Collision Handling:** What happens if two keys produce the same hash? Java uses **Chaining**. It stores a LinkedList (or a Red-Black Tree if the list gets too long) at that specific bucket index.
* **Example:**
    ```java
    import java.util.HashMap;

    HashMap<String, Integer> scores = new HashMap<>();
    scores.put("Alice", 95);
    scores.put("Bob", 80);
    
    if (scores.containsKey("Alice")) {
        int score = scores.get("Alice");
    }
    ```

---

## Comparison Cheat Sheet

| Data Structure | Access | Search | Insertion | Deletion | Best Java Class |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **ArrayList** | $O(1)$ | $O(n)$ | $O(n)$ | $O(n)$ | `ArrayList` |
| **LinkedList** | $O(n)$ | $O(n)$ | $O(1)$* | $O(1)$* | `LinkedList` |
| **Stack** | - | - | $O(1)$ | $O(1)$ | `ArrayDeque` |
| **Queue** | - | - | $O(1)$ | $O(1)$ | `LinkedList` |
| **HashMap** | N/A | $O(1)$ | $O(1)$ | $O(1)$ | `HashMap` |
| **BST (RB Tree)**| $O(\log n)$ | $O(\log n)$ | $O(\log n)$ | $O(\log n)$ | `TreeMap` / `TreeSet` |

*\*Assuming you are already at the position to insert/delete.*