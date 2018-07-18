package com.codecool.scc.output;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonOutputFormatter implements OutputFormatter {

    public void printToConsole(List<Map<?, ?>> data) {

        String json = "";
        ObjectMapper mapper = new ObjectMapper();

        try {
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(json);
    }
}
