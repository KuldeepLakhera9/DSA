# Data Structures & Algorithms (DSA) in Java ☕

A structured repository documenting my journey of learning Data Structures and Algorithms from fundamentals to advanced concepts in Java.

---

## 📌 Repository Structure

```
DSA/
├── Arrays/
│   ├── ArraysCC.java        # Array creation, input/output, length, and basic operations
│   ├── BinarySearch.java    # Binary Search implementation (Time: O(log N), Space: O(1))
│   ├── Largest.java         # Find largest number in array (Time: O(N), Space: O(1))
│   ├── LinearSearch.java    # Linear Search implementation (Time: O(N), Space: O(1))
│   ├── Pairs.java           # Print all pairs in array (Time: O(N^2), Space: O(1))
│   ├── Reverse.java         # Reverse an array in-place (Time: O(N), Space: O(1))
│   └── SubArray.java        # Print all subarrays of array (Time: O(N^3), Space: O(1))
├── .gitignore               # Excludes compiled .class and build files
└── README.md                # Progress tracker and repository overview
```

---

## 🚀 Progress & Topics Covered

### 1. Arrays
- [x] **Array Basics & Operations** ([`ArraysCC.java`](./Arrays/ArraysCC.java)) - Initialization, dynamic user input using `Scanner`, basic arithmetic, and `.length` property.
- [x] **Linear Search** ([`LinearSearch.java`](./Arrays/LinearSearch.java)) - Finding element index sequentially.
  - **Time Complexity:** $O(N)$
  - **Space Complexity:** $O(1)$
- [x] **Find Largest Number** ([`Largest.java`](./Arrays/Largest.java)) - Finding the maximum element in an array using `Integer.MIN_VALUE`.
  - **Time Complexity:** $O(N)$
  - **Space Complexity:** $O(1)$
- [x] **Binary Search** ([`BinarySearch.java`](./Arrays/BinarySearch.java)) - Divide-and-conquer search on sorted array.
  - **Time Complexity:** $O(\log N)$
  - **Space Complexity:** $O(1)$
- [x] **Reverse an Array** ([`Reverse.java`](./Arrays/Reverse.java)) - In-place two-pointer reversal.
  - **Time Complexity:** $O(N)$
  - **Space Complexity:** $O(1)$
- [x] **Pairs in an Array** ([`Pairs.java`](./Arrays/Pairs.java)) - Generate all pairs with nested loops (total pairs: $n(n-1)/2$).
  - **Time Complexity:** $O(N^2)$
  - **Space Complexity:** $O(1)$
- [x] **Print Subarrays** ([`SubArray.java`](./Arrays/SubArray.java)) - 3-loop traversal to generate all continuous subarrays (total subarrays: $n(n+1)/2$).
  - **Time Complexity:** $O(N^3)$
  - **Space Complexity:** $O(1)$
- [ ] Max Subarray Sum (Brute Force, Prefix Sum, Kadane's Algorithm)
- [ ] Trapping Rainwater
- [ ] Buy & Sell Stocks

---

## 🗺️ Learning Roadmap

- [x] **Basics & Arrays**
- [ ] **Sorting Algorithms** (Bubble, Selection, Insertion, Counting)
- [ ] **2D Arrays / Matrices**
- [ ] **Strings**
- [ ] **Bit Manipulation**
- [ ] **Recursion & Backtracking**
- [ ] **Divide & Conquer**
- [ ] **Linked Lists** (Singly, Doubly, Circular)
- [ ] **Stacks & Queues**
- [ ] **Greedy Algorithms**
- [ ] **Binary Trees & BST**
- [ ] **Heaps & Priority Queues**
- [ ] **Hashing** (HashMap, HashSet)
- [ ] **Tries**
- [ ] **Graphs**
- [ ] **Dynamic Programming (DP)**

---

## 💻 How to Compile and Run

To run any program locally using terminal:

```bash
# Navigate to the topic folder
cd Arrays

# Compile the Java file
javac LinearSearch.java

# Run the compiled bytecode
java LinearSearch
```

---

*Keep coding, keep improving!* 🚀
