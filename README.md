# Student Admission Management (Java)

A console application for managing student records, written as an object-oriented programming assignment. An administrator can add, update and view students from a text menu.

## Features

- Add a student (ID, name, age, grade)
- Update a student's details by ID
- View a student's details by ID
- Keeps a running total of students

## Design

| Class | Responsibility |
| --- | --- |
| `Student` | Data model with private fields, getters and setters (encapsulation) |
| `StudentManagement` | Static methods that store students in an `ArrayList` and add, update and look them up |
| `Administrator` | Entry point: menu loop that reads input with `Scanner` |

## Run

Requires JDK 8 or later. All classes are in the `Program1` package.

```bash
mkdir -p out
javac -d out *.java
java -cp out Program1.Administrator
```

## Limitations

- Records are kept in memory only and are lost when the program exits.
- There is no input validation for non-numeric values.

## Author

**Hsu Myat Noe** · [GitHub](https://github.com/NoeNoe25)
