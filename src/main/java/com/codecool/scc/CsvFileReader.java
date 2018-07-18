package com.codecool.scc;

import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.opencsv.CSVReader;
import org.codehaus.jackson.map.MappingIterator;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
class CsvFileReader {

    List<Map<?,?>> readData(File file) {

        List<Map<?,?>> data = new ArrayList<>();

        try {
            CsvSchema bootstrap = CsvSchema.emptySchema().withHeader();
            CsvMapper csvMapper = new CsvMapper();
            MappingIterator<Map<?,?>> mappingIterator = csvMapper.reader(Map.class).withSchema(bootstrap).readValues(file);
            while (mappingIterator.hasNext()) {
                data.add(mappingIterator.next());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
