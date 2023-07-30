package org.aidan.MyFitnessPalData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GetNutritionData {
    NutritionDataInput output = new NutritionDataInput();
    Connection connection = null;
    ArrayList<Double> nutritionOutput = new ArrayList<>();
    public void getNutritionDataMethod()
    {

        try
        {
            connection = DriverManager.getConnection("jdbc:sqlite:nutrition_summary.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);


            ResultSet rs = statement.executeQuery("select " + output.getNutritionInput() + " from nutrition_info_main where date='" + output.getDateInput() + "' ");
            if (!rs.next()) {
                System.out.println("No matching records found.");
                return;
            }

            do {
                nutritionOutput.add(rs.getDouble(output.getNutritionInput()));
            } while (rs.next());

            System.out.println(nutritionOutput);
        }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            try
            {
                if(connection != null)
                    connection.close();
            }
            catch(SQLException e)
            {
                System.err.println(e.getMessage());
            }
        }
    }
}
