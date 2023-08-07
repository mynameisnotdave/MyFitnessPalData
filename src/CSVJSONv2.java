package src;
import org.json.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class CSVJSONv2 {
    public CSVJSONv2() {}

    public JSONArray convertCSV (String fileName) throws IOException {
        JSONArray jsonArray = new JSONArray();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        //StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader);


        String primaryKey = "";
        String firstLine = "";
        // Read the first line only, these are the keys of our JSON collection.
        firstLine = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(firstLine, ",");
        ArrayList<String> keys = new ArrayList<>();
        for (int i=0; i < keys.size(); i++) {
            jsonArray.put(keys.get(i).getJSONObject());
        }
        return jsonArray;
    }

    public void generateCSV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert the path to a valid CSV file");
    }
}

