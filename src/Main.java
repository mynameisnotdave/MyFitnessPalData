package src;

public class Main {
    public static void main(String[] args) {
        NutritionDataInput output = new NutritionDataInput();
        GetNutritionData getNutritionData = new GetNutritionData();
        output.welcomeMessage();
        output.nutrientTypeSelection();
        output.dateRangeSelection();
        getNutritionData.getNutritionDataMethod();
    }
}