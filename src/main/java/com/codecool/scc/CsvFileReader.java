package com.codecool.scc;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class CsvFileReader {

    List<String[]> readData(File file) {

        List<String[]> records = new ArrayList<>();

        try {
            Reader reader = new FileReader(file);
            CSVReader csvReader = new CSVReader(reader);
            records.addAll(csvReader.readAll());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(records);

        return records;
    }
}
