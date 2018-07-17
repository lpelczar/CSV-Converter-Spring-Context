package com.codecool.scc;

import java.io.File;
import java.util.List;

class SimpleCsvConverter {

    private FileReader fileReader = new FileReader();

    void convert(File file, OutputFormat outputFormat) {

        List<String[]> data = fileReader.readData(file);
        System.out.println(data);

        System.out.println("I convert CSV to output format");
    }

    void convert(File file) {
        convert(file, OutputFormat.TABLE);
    }
}
