package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Maksim");
        student.setGroup("стажер");
        student.setDate("14.09.23");
        student.setUniversity("j4j");
        System.out.println(student.getName() + " поступил " + student.getDate() + " в группу "
                + student.getGroup() + " " + student.getUniversity());
    }
}
