package com.codecool.scc;

import com.codecool.scc.output.OutputFormatter;
import com.codecool.scc.output.OutputFormatterFactory;

import java.io.File;
import java.util.List;

class SimpleCsvConverter {

    private FileReader fileReader;
    private OutputFormatterFactory outputFormatterFactory;

    SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {
        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    void convert(File file, OutputFormat outputFormat) {

        List<String[]> data = fileReader.readData(file);
        OutputFormatter outputFormatter = outputFormatterFactory.createByFormat(outputFormat);
        outputFormatter.printToConsole(data);
    }

    void convert(File file) {
        convert(file, OutputFormat.TABLE);
    }
}
