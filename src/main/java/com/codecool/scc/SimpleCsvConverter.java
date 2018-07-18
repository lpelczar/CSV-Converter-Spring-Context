package com.codecool.scc;

import com.codecool.scc.output.OutputFormatter;
import com.codecool.scc.output.OutputFormatterFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;
import java.util.Map;

@Component
class SimpleCsvConverter {

    private CsvFileReader csvFileReader;
    private OutputFormatterFactory outputFormatterFactory;

    SimpleCsvConverter() {}

    @Autowired
    public void setCsvFileReader(CsvFileReader csvFileReader) {
        this.csvFileReader = csvFileReader;
    }

    @Autowired
    public void setOutputFormatterFactory(OutputFormatterFactory outputFormatterFactory) {
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
