package com.codecool.scc;

import com.codecool.scc.output.OutputFormatterFactory;

import java.io.File;

public class ConverterApplication {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No input file defined");
            return;
        }
        handleInputArguments(args);
    }

    private static void handleInputArguments(String[] args) {

        File file;
        OutputFormat outputFormat = null;

        if (args.length == 1) {
            file = new File(args[0]);
        } else if (args.length == 2) {

            for (OutputFormat format : OutputFormat.values()) {
                if (format.toString().equals(args[0].toUpperCase())) {
                    outputFormat = format;
                }
            }

            if (outputFormat == null) {
                System.out.println("Invalid format");
                return;
            }
            file = new File(args[1]);
        } else {
            System.out.println("Invalid arguments");
            return;
        }
        handleConversion(file, outputFormat);
    }

    private static void handleConversion(File file, OutputFormat outputFormat) {

        CsvFileReader csvFileReader = new CsvFileReader();
        OutputFormatterFactory outputFormatterFactory = new OutputFormatterFactory();
        SimpleCsvConverter simpleCsvConverter = new SimpleCsvConverter(csvFileReader, outputFormatterFactory);

        if (file.exists()) {
            if (outputFormat != null) {
                simpleCsvConverter.convert(file, outputFormat);
            } else {
                simpleCsvConverter.convert(file);
            }
        } else {
            System.out.println("Invalid file");
        }
    }
}
