# chessgame

Chess Game
A simple yet functional console-based Chess game implemented in Java. The game replicates the core mechanics of chess and ensures that each piece adheres to its movement rules. It is designed for players who want to enjoy a basic chess game or for developers who wish to learn or experiment with chess game mechanics.

Features
Players:
Two players take turns making moves. One controls the White pieces, and the other controls the Black pieces.
Chessboard:
The board is an 8x8 grid with standard chess setup and initial positions for all pieces.
Pieces:
The game includes all six standard pieces (King, Queen, Rook, Bishop, Knight, and Pawn), each with its unique movement logic.
Move Validation:
Moves are validated based on the rules of chess for each piece. For example, pawns can move forward, attack diagonally, and make an initial double-step move, while rooks move in straight lines, and knights jump in an "L" shape.
Capture Logic:
Players can capture opponent pieces if their move lands on an opponent’s position.
How to Play
Setup:

Clone or download the project files.
Run the ChessGame class from your Java IDE or terminal to initialize the board and start the game.
Making Moves:

Moves are entered in the format: startRow startCol endRow endCol (e.g., 6 4 4 4 to move a White pawn from position (6, 4) to (4, 4)).
The game validates the move and updates the board if it is valid. If the move is invalid, the player is prompted to try again.
Objective:

The goal is to capture the opponent’s King by putting it in a checkmate position (future enhancement).
Game Rules Implemented:

Piece-specific movement rules (e.g., diagonal moves for Bishops, "L" moves for Knights).
Path-checking to ensure no illegal moves (e.g., no jumping over pieces for Rooks, Bishops, or Queens).
Pawn promotion, castling, and en passant are not yet implemented.
Code Structure
ChessGame Class:
The entry point for the game. It initializes the chessboard, players, and allows moves to be made.
ChessBoard Class:
Represents the board as an 8x8 grid. Handles piece initialization and movement logic.
Player Class:
Represents the players with attributes like name and color (White or Black).
Piece Abstract Class:
Defines common attributes and methods for all pieces.
Subclasses:
King – Moves one square in any direction.
Queen – Combines Rook and Bishop movements.
Rook – Moves in straight lines (vertical or horizontal).
Bishop – Moves diagonally.
Knight – Moves in "L" shapes and can jump over other pieces.
Pawn – Moves forward one step (two steps on its first move) and captures diagonally.
Example Gameplay
java
Copy code
ChessBoard board = new ChessBoard();  
board.initializeBoard();  

// Example Moves:  
System.out.println(board.movePiece(6, 4, 4, 4)); // Move white pawn from (6,4) to (4,4)  
System.out.println(board.movePiece(1, 3, 3, 3)); // Move black pawn from (1,3) to (3,3)  
Future Enhancements
Check and Checkmate Detection:
Implement logic to detect check and checkmate conditions for the Kings.
Special Moves:
Add support for castling, en passant, and pawn promotion.
Game Over Conditions:
Identify stalemates, checkmates, and draws.
Graphical Interface:
Replace the console-based interaction with a GUI for a more user-friendly experience.
Timers:
Add time limits for moves to make the game competitive.
Why Play This Game?
This game is perfect for:

Chess enthusiasts looking for a basic chess simulation.
Developers exploring object-oriented programming concepts like inheritance, abstraction, and encapsulation.
Students seeking a foundation for building more advanced chess applications.
Contributing
We welcome contributions! Feel free to fork the repository, make improvements, and submit a pull request.
