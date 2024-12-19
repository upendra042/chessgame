# Chess Game

A simple yet functional console-based Chess game implemented in Java. The game replicates the core mechanics of chess and ensures that each piece adheres to its movement rules. It is designed for players who want to enjoy a basic chess game or for developers who wish to learn or experiment with chess game mechanics.

---

## **Features**

### **Players**
- Two players take turns making moves.  
- One controls the White pieces, and the other controls the Black pieces.

### **Chessboard**
- An 8x8 grid with the standard chess setup and initial positions for all pieces.

### **Pieces**
- Includes all six standard chess pieces:  
  - **King**  
  - **Queen**  
  - **Rook**  
  - **Bishop**  
  - **Knight**  
  - **Pawn**

### **Move Validation**
- Each piece follows its specific movement rules:  
  - **Pawn:** Moves forward, captures diagonally, and can make an initial double-step move.  
  - **Knight:** Moves in an "L" shape, jumping over other pieces.  
  - **Bishop:** Moves diagonally.  
  - **Rook:** Moves straight along rows or columns.  
  - **Queen:** Combines the movements of the Rook and Bishop.  
  - **King:** Moves one square in any direction.

### **Capture Logic**
- Pieces can capture opponents by moving to their occupied square.

---

## **How to Play**

### **Setup**
1. Clone or download the project files.  
2. Run the `ChessGame` class from your Java IDE or terminal to initialize the board and start the game.

### **Making Moves**
- Enter moves in the format:  
  `startRow startCol endRow endCol`  
  Example:  
  - `6 4 4 4` moves a White pawn from position `(6,4)` to `(4,4)`.

- The game validates the move and updates the board if valid.  
  Invalid moves prompt the player to try again.

### **Objective**
- Capture the opponent’s **King** by putting it in a checkmate position.

---

## **Game Rules Implemented**

1. Piece-specific movement rules (e.g., Knights move in "L" shapes).  
2. Path-checking to prevent illegal moves (e.g., Rooks can't jump over other pieces).  
3. Basic gameplay without advanced rules like castling, en passant, or pawn promotion.

---

## **Code Structure**

### **ChessGame Class**
- Entry point for the game. Initializes the chessboard and handles player moves.

### **ChessBoard Class**
- Represents the 8x8 chessboard. Manages piece initialization and movement logic.

### **Player Class**
- Represents the players with attributes such as name and color (White or Black).

### **Piece Abstract Class**
- Base class for all pieces. Defines common attributes and methods.  

#### **Subclasses:**
- **King:** Moves one square in any direction.  
- **Queen:** Combines Rook and Bishop movements.  
- **Rook:** Moves straight along rows or columns.  
- **Bishop:** Moves diagonally.  
- **Knight:** Moves in "L" shapes and can jump over other pieces.  
- **Pawn:** Moves forward and captures diagonally.  

---

## **Example Gameplay**

```java
ChessBoard board = new ChessBoard();  
board.initializeBoard();  

// Example Moves:  
System.out.println(board.movePiece(6, 4, 4, 4)); // Move white pawn from (6,4) to (4,4)  
System.out.println(board.movePiece(1, 3, 3, 3)); // Move black pawn from (1,3) to (3,3)  
