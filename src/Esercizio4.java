import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Esercizio4 {
    public static void main(String[] args) {

    try

    {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "developer", "Salvatore97");
        Statement statement = connection.createStatement();

        String sql1 = "ALTER TABLE students ADD COLUMN country VARCHAR(30)";
        statement.executeUpdate(sql1);
        //new column added

        String sql2 = "UPDATE students SET country='Italy' WHERE student_id IN (1, 2)";
        statement.executeUpdate(sql2);
        //adding Italy as country for first two students

        String sql3 = "UPDATE students SET country='Germany' WHERE student_id IN (3, 4)";
        statement.executeUpdate(sql3);
        //adding Germany as country for last two students



    } catch (Exception e){
    e.printStackTrace();}
    }}