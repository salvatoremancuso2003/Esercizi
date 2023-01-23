public class Esercizio1 {
    public static void main(String[] args) {
        System.out.println("Esercizio - SQL 01 - Installation and user permissions ");

        System.out.println(
                "MySQL Shell 8.0.32\n" +
                "\n" +
                "Copyright (c) 2016, 2023, Oracle and/or its affiliates.\n" +
                "Oracle is a registered trademark of Oracle Corporation and/or its affiliates.\n" +
                "Other names may be trademarks of their respective owners.\n" +
                "\n" +
                "Type '\\help' or '\\?' for help; '\\quit' to exit.\n" +
                " MySQL  JS > \\sql\n" +
                "Switching to SQL mode... Commands end with ;\n" +
                " MySQL  SQL > \\c root@localhost\n" +
                "Creating a session to 'root@localhost'\n" +
                "Fetching global names for auto-completion... Press ^C to stop.\n" +
                "Your MySQL connection id is 25 (X protocol)\n" +
                "Server version: 8.0.32 MySQL Community Server - GPL\n" +
                "No default schema selected; type \\use <schema> to set one.\n" +
                " MySQL  localhost:33060+ ssl  SQL > SELECT User from mysql.user;\n" +
                "+------------------+\n" +
                "| User             |\n" +
                "+------------------+\n" +
                "| admin            |\n" +
                "| app_developer    |\n" +
                "| app_read         |\n" +
                "| app_write        |\n" +
                "| developer        |\n" +
                "| mysql.infoschema |\n" +
                "| mysql.session    |\n" +
                "| mysql.sys        |\n" +
                "| root             |\n" +
                "| viewer           |\n" +
                "| writer           |\n" +
                "+------------------+\n" +
                "11 rows in set (0.0010 sec)");
    }
}
