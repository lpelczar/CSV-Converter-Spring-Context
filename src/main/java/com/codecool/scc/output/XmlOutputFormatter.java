package com.codecool.scc.output;

import java.util.List;
import java.util.Map;

public class XmlOutputFormatter implements OutputFormatter {
    public void printToConsole(List<Map<?, ?>> data) {
        System.out.println("XML");
    }
}
