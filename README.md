#  Tic Tac Toe – Java Console Application

A Java-based **command-line Tic Tac Toe game** designed for two players.  
This project emphasizes **simple gameplay**, **safe input handling**, and a **clean board layout**, making it ideal for beginners and academic projects.

---

##  Project Features

- ✔ Two-player mode (X vs O)
- ✔ Custom player names
- ✔ Standard 3×3 Tic Tac Toe board
- ✔ Row and column based input system
- ✔ Strong input validation
- ✔ Automatic win detection
- ✔ Draw detection when no moves remain
- ✔ Replay option after each game
- ✔ Clean, modular, and readable code

---

##  Game Rules

- The game is played on a **3×3 grid**
- Player 1 uses **X**
- Player 2 uses **O**
- Players enter their moves in the format:


Example:

- Row and column indices range from **0 to 2**
- The game ends when:
  - A player completes a row, column, or diagonal
  - OR all cells are filled (draw)

---

## 🖥️ Sample Board Output

<img width="240" height="251" alt="image" src="https://github.com/user-attachments/assets/940f9ed6-130c-44ff-84cf-d1514ee4ca10" />

---

## ⚙️ Technologies Used

- **Java**
- **Scanner class** for user input
- **2D character arrays** for board representation
- **Loops and conditional statements**
- **Modular methods** for organized logic

---

## ▶️ How to Run the Program

### Step 1: Compile the Java file

Ensure Java is installed and added to your system PATH.

---

## 🛡️ Input Validation

The program is designed to handle incorrect inputs gracefully and prevent runtime errors.

### Prevents:
- Alphabetic or string inputs (e.g., `a b`)
- Mixed or invalid values
- Out-of-range numbers (not between 0 and 2)
- Selecting already occupied cells

### Validation Method:
- Uses `Scanner.hasNextInt()` to verify input
- Displays clear error messages
- Prompts the user until a valid move is entered

---

## 📁 Project Structure

<img width="230" height="132" alt="image" src="https://github.com/user-attachments/assets/4ba550cd-1f5b-45a2-b645-2064e91dc692" />

