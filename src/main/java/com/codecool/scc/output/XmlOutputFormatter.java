package com.codecool.scc.output;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter {
    public void printToConsole(List<String[]> data) {
        System.out.println("XML");
    }
}
