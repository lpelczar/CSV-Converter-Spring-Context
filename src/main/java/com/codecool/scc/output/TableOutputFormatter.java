package com.codecool.scc.output;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TableOutputFormatter implements OutputFormatter {
    public void printToConsole(List<Map<?, ?>> data) {

        for (Map<?,?> item : data) {
            for (Entry<?,?> entry : item.entrySet()) {
                System.out.print(entry.getKey() + " : " + entry.getValue() + " | ");
            }
            System.out.println();
        }
    }
}
