# DSA-patterns

Java reference implementations for common data structures and algorithms patterns. The first module covers the **two pointers** and related techniques (sliding window, binary search, prefix sums, and more).

## Prerequisites

- [Git](https://git-scm.com/downloads)
- Java 21 or newer (`java -version` and `javac -version`)
- Optional: [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) for the easiest workflow

## Clone the repository

```bash
git clone https://github.com/singhjava592/DSA-patterns.git
cd DSA-patterns
```

## Use in IntelliJ IDEA

1. Open IntelliJ IDEA and choose **Open**.
2. Select the cloned `DSA-patterns` folder.
3. When prompted, use **JDK 21** as the project SDK.
4. Browse `src/twopointers/` and open a class.
5. Classes with a `main` method can be run with the green **Run** button or **Run > Run 'ClassName'**.

## Compile and run from the terminal

From the repository root:

```bash
javac -d out src/twopointers/*.java
java -cp out twopointers.BinarySearch
```

Replace `BinarySearch` with any class that defines `public static void main`.

## How to study the code

- Start in `src/twopointers/` and read one problem at a time.
- Compare the method name with the class name to see what each file solves.
- Run classes that include `main` to see sample input and output.
- Try changing inputs, then re-run or debug to trace pointer movement and loop conditions.
- Re-implement the idea without looking at the file, then compare your version with the reference.

## Project layout

```text
DSA-patterns/
├── src/
│   └── twopointers/   # Two pointers, sliding window, and related problems
├── .gitignore
└── README.md
```

## Contributing

Keep solutions readable for learning: clear variable names, one idea per file, and short notes on time and space complexity where helpful.
