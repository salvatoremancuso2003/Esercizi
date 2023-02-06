package Esercizio5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        System.out.println("Esercizio - SQL 04 - View");
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer" , "Salvatore97");
            Statement statement = connection.createStatement();


            String sql1 = "CREATE VIEW italian_students AS SELECT first_name, last_name FROM students WHERE country='Italy'";
            statement.executeUpdate(sql1);

            //creating italian_students view

            String sql2 = "CREATE VIEW german_students AS SELECT first_name, last_name FROM students WHERE country='Germany'";
            statement.executeUpdate(sql2);

            //creating german_students view

            System.out.println("Views created successfully...");


            ArrayList<Student> italianStudents = new ArrayList<>();
            String sql3 = "SELECT * FROM italian_students";
            ResultSet resultSet = statement.executeQuery(sql3);
            while (resultSet.next()) {
                italianStudents.add(new Student(resultSet.getString("first_name"), resultSet.getString("last_name")));
            }
            //adding italian students to the arraylist

            ArrayList<Student> germanStudents = new ArrayList<>();
            String sql4 = "SELECT * FROM german_students";
            resultSet = statement.executeQuery(sql4);
            while (resultSet.next()) {
                germanStudents.add(new Student(resultSet.getString("first_name"), resultSet.getString("last_name")));
            }
            //adding german students to the arraylist

            System.out.println("Italian students:");
            for (Student s : italianStudents) {
                System.out.println(s.getName() + " " + s.getSurname());
            }

            //adding for cycle to print correctly and cleanly the array list

            System.out.println("German students:");
            for (Student s : germanStudents) {
                System.out.println(s.getName() + " " + s.getSurname());
            }

            //adding for cycle to print correctly and cleanly the array list



        }catch(Exception e){
            e.printStackTrace();
        }

    }
    String name;
    String surname;
    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
