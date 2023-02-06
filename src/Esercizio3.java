import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Esercizio3 {

        public static void main(String[] args) {

            System.out.println("Esercizio - SQl 03 - Select ");
            System.out.println(" ---------------------- ");


            try{

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer" , "Salvatore97");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from students");
                while(resultSet.next()){
                    System.out.println("Student id : " + resultSet.getString("student_id"));
                    System.out.println("Last Name : " + resultSet.getString("last_name"));
                    System.out.println("First name : " + resultSet.getString("first_name"));

                    System.out.println("Array : ");

                    ArrayList <String> surnames = new ArrayList<>();
                    surnames.add(resultSet.getString("last_name"));
                    System.out.println(surnames);











                }

            }catch (Exception e){
                e.printStackTrace();
            }




        }


    }

