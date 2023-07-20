package quotes;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        QuoteMap quoteMap = new QuoteMap();

        try {
            String jsonFilePath = "./app/src/main/resources/recentquotes.json";
            JsonObject jsonObject = readJsonFromFile(jsonFilePath);

            Set<Map.Entry<String, JsonElement>> entries = jsonObject.entrySet();
            for (Map.Entry<String, JsonElement> entry : entries) {
                JsonObject quoteObject = entry.getValue().getAsJsonObject();
                String author = quoteObject.get("author").getAsString();
                String quote = quoteObject.get("text").getAsString();

                quoteMap.addQuote(author.hashCode(), author, quote);
            }

            String randomQuote = quoteMap.getRandomQuote();
            System.out.println("Random Quote: " + randomQuote);
        } catch (IOException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
        }
    }

    private static JsonObject readJsonFromFile(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        JsonElement jsonElement = JsonParser.parseReader(reader);
        reader.close();

        return jsonElement.getAsJsonObject();
    }
}
