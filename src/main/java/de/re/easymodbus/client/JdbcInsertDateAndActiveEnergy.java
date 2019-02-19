package de.re.easymodbus.client;

import java.sql.*;

public class JdbcInsertDateAndActiveEnergy {


    public static void jdbcInsert(Timestamp currentDate, double activeEnergy) throws Exception{
        //String DB_CONNECTION = "jdbc:mysql://localhost:3306/pac_database";
        String DB_CONNECTION = "jdbc:mysql://localhost:3306/pac_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String DB_USER = "root";
        String DB_PASSWORD = "";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            String insertTableSQL = "INSERT INTO co2"
                    + "(Date_Time, 801_Active_Energy_Import_Tariff_1) VALUES"
                    + "(?,?)";

            preparedStatement = connection.prepareStatement(insertTableSQL);

            preparedStatement.setTimestamp(1,currentDate);
            preparedStatement.setDouble(2,activeEnergy);


            // execute insert SQL stetement
            preparedStatement.executeUpdate();

        } catch (SQLException e)
        {
            System.out.println(e.getMessage());

        } finally

        {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
    }
}
}
