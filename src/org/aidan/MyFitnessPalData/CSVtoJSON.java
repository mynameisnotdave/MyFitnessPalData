package org.aidan.MyFitnessPalData;

import java.io.*;
import java.util.StringTokenizer;

public class CSVtoJSON {
    char JSONdelimiter1 = '{';
    char JSONdelimiter2 = '}';
    char JSONkeyValueRelator = ':';
    String CSVdelimiter = ",";

    void convert() throws IOException {
        try (FileReader fileReader = new FileReader("Nutrition-Summary-2023-03-02-to-2023-04-04.csv")) {
            StringTokenizer tokenizer = new StringTokenizer();
        } catch (IOException e) {
            System.out.println("Error, people beep, pass not found!");
            throw new RuntimeException(e);
        }
    }
    }
}
