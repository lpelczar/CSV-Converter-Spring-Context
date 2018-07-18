package com.codecool.scc.output;

import java.util.List;
import java.util.Map;

public class TableOutputFormatter implements OutputFormatter {
    public void printToConsole(List<Map<?, ?>> data) {
        System.out.println("TABLE");
    }
}
