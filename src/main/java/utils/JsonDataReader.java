package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class JsonDataReader {
    
    private static final ObjectMapper objectMapper = new ObjectMapper();
    
    public static JsonNode readJsonFile(String fileName) {
        try {
            InputStream inputStream = JsonDataReader.class.getClassLoader()
                    .getResourceAsStream("testdata/" + fileName);
            
            if (inputStream == null) {
                throw new RuntimeException("File not found: testdata/" + fileName);
            }
            
            return objectMapper.readTree(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Error reading JSON file: " + fileName, e);
        }
    }
    
    public static String getStringValue(JsonNode node, String fieldName) {
        return node.get(fieldName) != null ? node.get(fieldName).asText() : null;
    }
    
    public static JsonNode getArrayNode(JsonNode node, String arrayName) {
        return node.get(arrayName);
    }
}