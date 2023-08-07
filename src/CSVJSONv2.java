package src;
import org.json.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class CSVJSONv2 {
    public CSVJSONv2() {}




    public JSONArray convertCSV (String fileName) throws IOException {
        JSONArray jsonArray = new JSONArray();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        //StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader);

        JSONArray keys = new JSONArray();
        String primaryKey = "";
        String firstLine = "";
        // Read the first line only, these are the keys of our JSON collection.
        firstLine = bufferedReader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(firstLine, ",");

        return jsonArray;
    }

    public void generateCSV() {
    }
}

