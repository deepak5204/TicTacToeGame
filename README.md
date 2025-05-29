# Tic Tac Toe Android App

A simple 2-player **Tic Tac Toe** game built using **Android (Kotlin)** with a traditional **XML-based UI layout**.

---

## 📱 Features

- Classic 3x3 Tic Tac Toe game
- Player turn tracking (X and O)
- Winning position logic
- Smooth animations on player moves
- UI designed using **Layout Inspector** for visual debugging and accuracy
- Grid design supported using `grid.png`

---

## 🔧 Tech Stack

- **Language**: Kotlin
- **UI**: XML Layouts
- **Android SDK**: View-based (no Jetpack Compose)
- **Tools**: Android Studio, Layout Inspector

---

## 🎮 Gameplay Logic

- Board is represented using a `MutableList<Int>` to track cell states:
    - `0` → X
    - `1` → O
    - `2` → Empty
- Checks for all 8 possible winning combinations
- Disables tap on already-filled cells
- Player alternates on each valid move

---

## 📂 Project Structure

```text
.
├── res/
│   ├── layout/
│   │   └── activity_main.xml
│   └── drawable/
│       ├── x.png
│       ├── o.png
│       └── grid.png   ← used as board background
├── MainActivity.kt
├── AndroidManifest.xml
└── README.md
