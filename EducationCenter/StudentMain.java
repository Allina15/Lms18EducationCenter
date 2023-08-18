package EducationCenter;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.SplittableRandom;

public class StudentMain {
    public static void main(String[] args) {
        School school1 = new School("Bilimkana", "Kyrgyzstan", LocalDate.of(2000, 12, 12));
        School school2 = new School("Sebat","Kyrgyzstan",LocalDate.of(1989,12,25));

        College college1 = new College("It academy", "Kyrgyzstan", LocalDate.of(1996, 2, 15));
        College college2 = new College("Politech","Kyrgyzstan",LocalDate.of(1988,6,14));

        University university1 = new University("KSTU", "Kyrgyzstan", LocalDate.of(1952, 9, 13));
        University university2 = new University("BHU","Kyrgyzstan",LocalDate.of(1899,7,25));

        Student student1 = new Student("Alina", "Akhunova", "Female", LocalDate.of(2020, 9, 1), university1);
        Student student2 = new Student("Aziza", "Tynybekova", "Female", LocalDate.of(2020, 9, 1), university2);
        Student student3 = new Student("Tunuk", "Zhumabekova", "Female", LocalDate.of(2023, 9, 1), college1);
        Student student4 = new Student("Farida", "B", "Female", LocalDate.of(2021, 9, 1), university1);
        Student student5 = new Student("Adeliia", "J", "Female", LocalDate.of(2018, 9, 1), university2);
        Student student6 = new Student("Alina", "T", "Female", LocalDate.of(2020, 9, 1), school1);
        Student student7 = new Student("Kandybek", "Isaev", "Male", LocalDate.of(2023, 9, 1), college1);
        Student student8 = new Student("Asel", "A", "Female", LocalDate.of(2020, 9, 1), school2);
        Student student9 = new Student("Zalkar", "M", "Male", LocalDate.of(2022, 9, 1), college2);
        Student student10 = new Student("Islam", "M", "Male", LocalDate.of(2020, 9, 1), university1);
        Student[] students = {student2, student6, student10, student3, student7, student5, student1, student4, student6, student8, student1, student9};
        showStudents(students);


    }
    public static void showStudents(Student[]students) {
        for (Student st : students) {
            System.out.println(st);
            st.getStudentsEducationCenter();
            st.getStudentsStudyingYear();
        }
    }
}
