# LRU Cache – Java Console Application

## 📌 Project Description
A Java-based **Least Recently Used (LRU) Cache** implementation that stores key-value
pairs with a fixed capacity and automatically evicts the least recently used entry
when the cache is full.

The project uses **HashMap** and **Doubly Linked List** to achieve **O(1)** time
complexity for cache operations and includes a **menu-driven console interface**
with runtime-configurable capacity.

This project demonstrates strong fundamentals in **Data Structures, Java, and
algorithmic optimization**.

---

## ✨ Features
- Runtime-configurable cache capacity
- Supports `PUT` and `GET` operations
- Automatic eviction of least recently used entries
- O(1) time complexity for cache operations
- Clear handling of cache hit and cache miss
- Menu-driven console interface
- Displays cache contents from MRU to LRU

---

## 🛠 Technologies Used
- Java
- HashMap
- Doubly Linked List
- Java Collections Framework
- Object-Oriented Programming (OOP)

---

## ⚙️ How It Works
1. User enters the cache capacity at runtime.
2. User selects an option from the menu.
3. For `PUT` operation:
   - If the key exists, the value is updated and marked as most recently used.
   - If the cache is full, the least recently used entry is evicted.
4. For `GET` operation:
   - If the key exists, the value is returned and moved to MRU position.
   - If the key does not exist, a cache miss occurs.
5. Cache state is maintained using a combination of HashMap and Doubly Linked List.

---

## 📦 Data Structures Used
- **HashMap**
  - `key → node reference`
- **Doubly Linked List**
  - Maintains usage order (MRU → LRU)

---

## ⏱ Time & Space Complexity
| Operation | Complexity |
|----------|------------|
| GET      | O(1)       |
| PUT      | O(1)       |

**Space Complexity:** O(N), where N is the cache capacity.

---

## 🧪 Sample Output
```
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
```

---

## ▶️ How to Run
1. Clone the repository : git clone <repository-url>
2. Compile the Java files : javac Main.java
3. Run the application : java Main
4. Use the menu to perform cache operations.

---

## 📘 Key Learnings
- Efficient use of HashMap and Doubly Linked List
- Cache eviction strategies
- Writing clean, modular Java code
- Building interactive console-based applications

---

## 🌍 Real-World Use Cases
- Browser caching
- Database query caching
- Memory management systems
- Backend systems requiring fast data access
- Foundations for scalable cache and system design




