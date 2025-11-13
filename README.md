# MST Bonus Task

## Project Description
This project implements the **Edge Removal from Minimum Spanning Tree (MST)** task.  
Goal: efficiently find a replacement edge after removing an edge from the MST so that the graph remains connected and the total weight stays minimal.

The project is written in Java and uses **Maven** for building and running.

---

## Project Structure

MSTBonusTask/
├── pom.xml
└── src/
└── main/
└── java/
└── mst/
├── Edge.java        # Class for graph edges
├── UnionFind.java   # Union-Find data structure
├── MST.java         # MST building using Kruskal's algorithm
└── Main.java        # Main class demonstrating functionality

---

## How to Build and Run

1. Clone the repository:

```bash
git clone https://github.com/USERNAME/MSTBonusTask.git
cd MSTBonusTask
``` 


### Build the project using Maven:
```cookie
mvn compile

```

### Run the program:
```cookie
mvn exec:java -Dexec.mainClass="mst.Main"

```
## Sample Output
```
Original MST:
1 -- 2 (weight: 1)
1 -- 3 (weight: 2)
3 -- 4 (weight: 2)
0 -- 2 (weight: 3)
4 -- 5 (weight: 6)

Removed edge:
1 -- 2 (weight: 1)

Replacement edge:
1 -- 3 (weight: 2)

New MST:
1 -- 3 (weight: 2)
3 -- 4 (weight: 2)
0 -- 2 (weight: 3)
4 -- 5 (weight: 6)
1 -- 3 (weight: 2)
```

## Algorithm Description
```cookie
Build MST using Kruskal's algorithm:
Sort all edges by weight.
Add an edge to the MST if it connects two different components (using Union-Find).
Remove one edge from the MST.
Use Union-Find to identify the two components after removal.
Find the minimum weight edge that connects these two components — this is the replacement edge.
Add the replacement edge to the MST and output the new tree.
```
### Notes
```cookie
The project is fully ready to be uploaded to GitHub and compiled with Maven.

The program demonstrates MST construction, edge removal, and finding a replacement edge.

You can easily modify the graph by adding new edges in Main.java.

All classes are located in the mst package.
```
### Comments for the teacher
I honestly apologize for how things turned out. I tried my best to study your lesson, but somehow it just didn’t work out. I don’t think I will be pursuing a career in IT. I’ve just started working and gaining experience in the business field.

I just wanted to ask, if possible, to raise my grade az bolsa da, because I’m aiming for a higher scholarship, and right now only a DAA is in a question.

## Author 
### Zhanibek Ibyrkhanov SE-2426