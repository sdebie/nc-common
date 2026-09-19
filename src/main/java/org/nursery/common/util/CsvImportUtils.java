package org.nursery.common.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvImportUtils {

    public static List<Map<String, String>> parseCsv(InputStream inputStream) throws IOException {
        return parseCsv(inputStream, CSVFormat.DEFAULT.withFirstRecordAsHeader());
    }

    public static List<Map<String, String>> parseCsv(InputStream inputStream, CSVFormat format) throws IOException {
        List<Map<String, String>> records = new ArrayList<>();

        try (Reader reader = new InputStreamReader(inputStream);
             CSVParser csvParser = new CSVParser(reader, format)) {

            for (CSVRecord csvRecord : csvParser) {
                Map<String, String> record = new HashMap<>(csvRecord.toMap());
                records.add(record);
            }
        }

        return records;
    }

    public static CSVParser createCsvParser(InputStream inputStream) throws IOException {
        return createCsvParser(inputStream, CSVFormat.DEFAULT.withFirstRecordAsHeader());
    }

    public static CSVParser createCsvParser(InputStream inputStream, CSVFormat format) throws IOException {
        Reader reader = new InputStreamReader(inputStream);
        return new CSVParser(reader, format);
    }
}
