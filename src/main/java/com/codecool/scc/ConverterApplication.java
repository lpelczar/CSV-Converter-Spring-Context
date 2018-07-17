package com.codecool.scc;

public class ConverterApplication {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No input file defined");
            return;
        }
        handleInputArguments(args);
    }

    private static void handleInputArguments(String[] args) {
        if (args.length == 1) {
            String filePath = args[0];
            // Check if path is correct and start
        } else if (args.length == 2) {

            OutputFormat outputFormat = null;
            for (OutputFormat format : OutputFormat.values()) {
                if (format.toString().equals(args[0].toUpperCase())) {
                    outputFormat = format;
                }
            }

            if (outputFormat == null) {
                System.out.println("Invalid format");
                return;
            }

            String filePath = args[1];
            // Check if path is correct and start

        } else {
            System.out.println("Invalid arguments");
        }
    }
}
