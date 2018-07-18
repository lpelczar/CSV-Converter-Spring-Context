package com.codecool.scc;

import com.codecool.scc.output.OutputFormatter;
import com.codecool.scc.output.OutputFormatterFactory;

import java.io.File;
import java.util.List;
import java.util.Map;

class SimpleCsvConverter {

    private CsvFileReader csvFileReader;
    private OutputFormatterFactory outputFormatterFactory;

    SimpleCsvConverter(CsvFileReader csvFileReader, OutputFormatterFactory outputFormatterFactory) {
        this.csvFileReader = csvFileReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    void convert(File file, OutputFormat outputFormat) {

        List<Map<?, ?>> data = csvFileReader.readData(file);
        OutputFormatter outputFormatter = outputFormatterFactory.createByFormat(outputFormat);
        outputFormatter.printToConsole(data);
    }

    void convert(File file) {
        convert(file, OutputFormat.TABLE);
    }
}
