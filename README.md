# Data Structures & Algorithms (DSA) in Java ☕

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![DSA Practice](https://img.shields.io/badge/DSA-Practice-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-In%20Progress-brightgreen?style=for-the-badge)

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

## 📊 Quick Reference Table

| # | Topic / Problem | Solution | Time Complexity | Space Complexity | Approach / Key Idea |
|---|---|---|:---:|:---:|---|
| 1 | Array Basics & I/O | [`ArraysCC.java`](./Arrays/ArraysCC.java) | $O(N)$ | $O(1)$ | Dynamic input using `Scanner`, basic arithmetic, `.length` |
| 2 | Linear Search | [`LinearSearch.java`](./Arrays/LinearSearch.java) | $O(N)$ | $O(1)$ | Sequential scan to locate target element |
| 3 | Find Largest Number | [`Largest.java`](./Arrays/Largest.java) | $O(N)$ | $O(1)$ | Single-pass linear scan with `Integer.MIN_VALUE` |
| 4 | Binary Search | [`BinarySearch.java`](./Arrays/BinarySearch.java) | $O(\log N)$ | $O(1)$ | Divide and conquer on sorted array using safe midpoint |
| 5 | Reverse an Array | [`Reverse.java`](./Arrays/Reverse.java) | $O(N)$ | $O(1)$ | Two-pointer swap technique in-place |
| 6 | Pairs in an Array | [`Pairs.java`](./Arrays/Pairs.java) | $O(N^2)$ | $O(1)$ | Nested loops generating all unique pairs |
| 7 | Print Subarrays | [`SubArray.java`](./Arrays/SubArray.java) | $O(N^3)$ | $O(1)$ | 3-loop traversal to print continuous subsegments |

---

## 🚀 Progress & Detailed Topics

### 1. Arrays
- [x] **Array Basics & Operations** ([`ArraysCC.java`](./Arrays/ArraysCC.java)) - Initialization, dynamic user input using `Scanner`, basic arithmetic, and `.length` property.
- [x] **Linear Search** ([`LinearSearch.java`](./Arrays/LinearSearch.java)) - Finding element index sequentially.
  - **Time Complexity:** $O(N)$ | **Space Complexity:** $O(1)$
- [x] **Find Largest Number** ([`Largest.java`](./Arrays/Largest.java)) - Finding the maximum element in an array using `Integer.MIN_VALUE`.
  - **Time Complexity:** $O(N)$ | **Space Complexity:** $O(1)$
- [x] **Binary Search** ([`BinarySearch.java`](./Arrays/BinarySearch.java)) - Divide-and-conquer search on sorted array with overflow-safe midpoint calculation.
  - **Time Complexity:** $O(\log N)$ | **Space Complexity:** $O(1)$
- [x] **Reverse an Array** ([`Reverse.java`](./Arrays/Reverse.java)) - In-place two-pointer reversal.
  - **Time Complexity:** $O(N)$ | **Space Complexity:** $O(1)$
- [x] **Pairs in an Array** ([`Pairs.java`](./Arrays/Pairs.java)) - Generate all pairs with nested loops (total pairs: $n(n-1)/2$).
  - **Time Complexity:** $O(N^2)$ | **Space Complexity:** $O(1)$
- [x] **Print Subarrays** ([`SubArray.java`](./Arrays/SubArray.java)) - 3-loop traversal to generate all continuous subarrays (total subarrays: $n(n+1)/2$).
  - **Time Complexity:** $O(N^3)$ | **Space Complexity:** $O(1)$
- [ ] Max Subarray Sum (Brute Force, Prefix Sum, Kadane's Algorithm)
- [ ] Trapping Rainwater
- [ ] Buy & Sell Stocks

---

## 💡 Key Formulas & Notes

- **Total Pairs in Array:**
  $$\text{Total Pairs} = \frac{n(n - 1)}{2} = O(n^2)$$
- **Total Subarrays in Array:**
  $$\text{Total Subarrays} = \frac{n(n + 1)}{2} = O(n^2)$$
- **Binary Search Midpoint (prevent integer overflow):**
  $$\text{mid} = \text{start} + \frac{\text{end} - \text{start}}{2}$$

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
javac SubArray.java

# Run the compiled bytecode
java Arrays.SubArray
# or if compiled without package / run from root:
# java -cp . Arrays.SubArray
```

---

*Keep coding, keep improving!* 🚀
