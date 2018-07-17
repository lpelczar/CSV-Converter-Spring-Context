package com.codecool.scc.output;

import com.codecool.scc.OutputFormat;

public class OutputFormatterFactory {

    public OutputFormatter createByFormat(OutputFormat outputFormat) {
        switch (outputFormat) {
            case XML:
                return new XmlOutputFormatter();
            case JSON:
                return new JsonOutputFormatter();
            default:
                return new TableOutputFormatter();
        }
    }
}
