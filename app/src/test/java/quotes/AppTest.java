package quotes;

public class AppTest {
    public static void main(String[] args) {
        testQuoteMap();
    }

    public static void testQuoteMap() {
        QuoteMap quoteMap = new QuoteMap();
        quoteMap.addQuote(1, "Author 1", "Quote 1");
        quoteMap.addQuote(2, "Author 2", "Quote 2");
        quoteMap.addQuote(3, "Author 3", "Quote 3");
        quoteMap.addQuote(4, "Author 4", "Quote 4");
        quoteMap.addQuote(5, "Author 5", "Quote 5");

        String randomQuote = quoteMap.getRandomQuote();
        System.out.println("Random Author and Quote: " + randomQuote);
    }
}
