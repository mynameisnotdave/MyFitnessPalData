package src;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class NutritionDataInput {
    private String dateInput;
    private String nutritionInput;

    String[] validNutrientTypes = {"calories", "fat", "protein", "carbs", "sugar", "salt", "vitC", "vitA", "fibre", "calcium", "iron", "potassium", "cholesterol", "satfat", "trans", "poly", "mono"};

    public NutritionDataInput() {
    }

    void welcomeMessage() {
        System.out.print("""
                Welcome to MyFitnessPalData v0.1!
                What data would you like to retrieve?
                Request format:
                
                nutrient-type date
                
                For example:
                
                calories 2023-03-24
                
                This is an example of a simple request.
                
                Complex requests are also possible. For example, one can request any combination of nutrient types/calories and within a certain timeframe, such as within a calendar month, or within a date range, or within a week.
                
                For example:
                
                calories fats 2023-03
                
                Or protein 2023-01-week
                
                Valid nutrient types are:
                """ + Arrays.toString(validNutrientTypes));
    }
    void nutrientTypeSelection() {
        Scanner selectNutrientType = new Scanner(System.in);
        System.out.println("\nPlease select a nutrient type first: ");
        this.nutritionInput = selectNutrientType.nextLine();

        }
    public String getNutritionInput() {
        return nutritionInput;
    }
    void dateRangeSelection() {
        Scanner selectDateRange = new Scanner(System.in);
        System.out.println("Then, please give a date range");
        String dateRange = selectDateRange.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateInput = dateRange;
    }
    public String getDateInput() {
        return dateInput;
    }
}



