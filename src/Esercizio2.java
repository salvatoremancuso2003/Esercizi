import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Esercizio2 {
    public static void main(String[] args) {
        try{
            System.out.println("Esercizio - SQl 02 - Table ");


            //MYSQL workbench :

            //SELECT `students`.`student_id`,
            //`students`.`last_name`,
            //`students`.`first_name`
            //FROM `newdb`.`students`;
            //INSERT INTO students(last_name,first_name) values ('Mancuso','Salvatore'); select * from students;
            //INSERT INTO students(last_name,first_name) values ('Mancuso','Aldo'); select * from students;
            //INSERT INTO students(last_name,first_name) values ('Mancuso','Francesco'); select * from students;
            //INSERT INTO students(last_name,first_name) values ('Mancuso','Elisa'); select * from students;


            //Intellij Java configurazione :

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer" , "Salvatore97");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from students");
        while(resultSet.next()){
            System.out.println("Student id : ");
            System.out.println(resultSet.getString("student_id"));
            System.out.println("Last Name : ");
            System.out.println(resultSet.getString("last_name"));
            System.out.println("First name : ");
            System.out.println(resultSet.getString("first_name"));

        }
        }catch (Exception e){
            e.printStackTrace();
        }




    }


}


