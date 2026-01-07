# LRU Cache Implementation (Java)

An interactive implementation of a **Least Recently Used (LRU) Cache** in Java using **HashMap** and **Doubly Linked List**, supporting **O(1)** time complexity for cache operations.

---

## Key Highlights
- Runtime-configurable cache capacity
- Menu-driven console interface
- O(1) time complexity for `get` and `put`
- Automatic eviction of least recently used entries
- Clear handling of cache hit and cache miss scenarios

---

## Problem Statement
Design an LRU Cache that stores a fixed number of key-value pairs.  
When the cache exceeds its capacity, the **least recently used** entry must be evicted.

---

## Approach
- **HashMap** provides constant-time access to cache elements
- **Doubly Linked List** maintains the order of usage  
  - Most Recently Used (MRU) near the head  
  - Least Recently Used (LRU) near the tail  

This combination ensures efficient cache operations.

---

## Operations Supported
- **PUT(key, value)** – Insert or update a key-value pair
- **GET(key)** – Retrieve value and update usage order
- **DISPLAY** – Display cache contents from MRU to LRU

---

## Sample Execution
Enter cache capacity: 2

PUT(1,10)
Cache : [ 1 : 10 ]

PUT(2,20)
Cache : [ 2 : 20 | 1 : 10 ]

GET(2) → Cache Hit
Cache : [ 2 : 20 | 1 : 10 ]

PUT(3,30)
Evicted LRU key (Least Recently Used): 1
Cache : [ 3 : 30 | 2 : 20 ]


---

## Time & Space Complexity
| Operation | Complexity |
|----------|------------|
| GET      | O(1)       |
| PUT      | O(1)       |

**Space Complexity:** O(N), where N is the cache capacity.

---

## Project Structure

```
LRU-Cache/
│── LRUCache.java
│── Main.java
│── README.md
```



---

## Key Learnings
- Efficient use of HashMap and Doubly Linked List
- Cache eviction strategies
- Writing clean, modular Java code
- Building interactive console-based applications

---

## Real-World Use Cases
- Browser caching
- Database query caching
- Memory management systems
