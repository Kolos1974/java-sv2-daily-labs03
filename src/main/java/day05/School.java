package day05;

public class School {


    public static void main(String[] args) {
        Journal journal = new Journal();

        journal.addStudent("Kiss Géza");
        journal.addStudent("Madonna");


        System.out.println(journal.getStudents().size());
        System.out.println(journal.getStudents().get(0).toString());
    }

}
