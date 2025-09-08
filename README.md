# Java-Beginning

Welcome to the **Java-Beginning** repository! This collection contains Java programs created during my 5th semester coursework. Each file demonstrates concepts and exercises relevant to learning Java, including classes, constructors, inheritance, encapsulation, and more.

## How to Use This Repository

- **Browse the `.java` files**: These contain the source code and are intended for learning and reference. Each file is named according to the concept or exercise it demonstrates.
- **Ignore the `.class` files**: These are compiled Java bytecode files generated automatically when you build or run the programs. They are not meant for direct reading or editing.

## Getting Started

1. Clone or download the repository.
2. Open any `.java` file in your favorite IDE or text editor to explore the code.
3. See the instructions below for setting up Java and running the programs.

## How to Run Java Files

If you're new to Java, follow these steps to set up your environment and run the programs:

### 1. Download and Install Java

- Go to the official Oracle website: https://www.oracle.com/java/technologies/downloads/
- Download the latest Java SE Development Kit (JDK) for your operating system (Windows, macOS, or Linux).
- Run the installer and follow the instructions to complete the installation.

### 2. Set Up the PATH Environment Variable (Windows)

After installing Java, you need to add the JDK's `bin` directory to your system PATH:

1. Find the installation path (e.g., `C:\Program Files\Java\jdk-XX.X.X\bin`).
2. Open Control Panel > System > Advanced system settings > Environment Variables.
3. Under 'System variables', find and select `Path`, then click 'Edit'.
4. Add the path to the JDK's `bin` directory and click OK.
5. Open a new command prompt and type `java -version` and `javac -version` to verify installation.

### 3. Using VS Code for Java

- Install Visual Studio Code: https://code.visualstudio.com/
- Install the 'Extension Pack for Java' from the VS Code marketplace for Java support.
- Open this repository folder in VS Code.
- You can edit, compile, and run Java files directly from VS Code using the built-in terminal.

### 4. Compile and Run Java Files

Open a terminal (PowerShell, Command Prompt, or VS Code terminal) in the repository folder and use these commands:

**To compile a Java file:**

```
javac FileName.java
```

This will generate a `FileName.class` file in the same directory.

**To run the compiled Java program:**

```
java FileName
```

**Example:**

```
javac Main.java
java Main
```

Repeat these steps for any `.java` file you want to run. Make sure the file contains a `main` method.

If you have any issues, make sure Java is installed and your PATH is set correctly.

## Folder Structure

All Java source files are in the root directory. Each file covers a specific topic or concept from the 5th semester syllabus.

## Contributing

This repository is primarily for personal learning, but suggestions and improvements are welcome. Feel free to open issues or submit pull requests.

## License

This project is for educational purposes.