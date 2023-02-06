import java.sql.*;
import java.util.ArrayList;

public class Esercizio3 {

        public static void main(String[] args) {

            System.out.println("Esercizio - SQl 03 - Select ");
            System.out.println(" ---------------------- ");


            try{

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer" , "Salvatore97");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from students");

                    ArrayList<String> surnames = new ArrayList<>();
                    while (resultSet.next()) {
                        String name = resultSet.getString("first_name");
                        System.out.println(" - First name : " + name );
                        String surname = resultSet.getString("last_name");
                        System.out.println(" - Last name : " + surname);
                        surnames.add(resultSet.getString("last_name"));

                    }
                    System.out.println(" ------------------ ");
                    System.out.println("Array list of surnames:");
                    for (String surname : surnames) {
                        System.out.println(surname); }



            }catch (Exception e){
                e.printStackTrace();
            }


        }}

