package ru.mirea.lab9.task2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Natasha", 240));
        students.add(new Student("Masha", 230));
        students.add(new Student("Polina", 280));
        students.add(new Student("Irina", 223));
        students.add(new Student("Sasha", 249));

        SortingStudents sorter = new SortingStudents();
        sorter.quickSort(students,0, students.size()-1);
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getExamScore());
        }
    }
}
