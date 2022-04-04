package Models;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album();
        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author();

        Quote quote1 = new Quote();
        Quote quote2 = new Quote();
        Quote quote3 = new Quote();
        Quote quote4 = new Quote();
        Quote quote5 = new Quote();

        ArrayList<Quote> quoteList = new ArrayList<>();

        author1.setId(1);
        author1.setFirstName("Douglas");
        author1.setLastName("Adams");

        author2.setId(2);
        author2.setFirstName("Mark");
        author2.setLastName("Twain");

        author3.setId(3);
        author3.setFirstName("Kurt");
        author3.setLastName("Vonnegut");

        quote1.setId(1);
        quote1.setAuthor(author1);
        quote1.setContent("I love deadlines. I love the whooshing noise they make as they go by.");

        quote2.setId(1);
        quote2.setAuthor(author1);
        quote2.setContent("Don't Panic.");

        quote3.setId(1);
        quote3.setAuthor(author1);
        quote3.setContent("Time is an illusion. Lunchtime doubly so.");

        quote4.setId(2);
        quote4.setAuthor(author2);
        quote4.setContent("Clothes make the man. Naked people have little or no influence on society.");

        quote5.setId(3);
        quote5.setAuthor(author3);
        quote5.setContent("The universe is a big place, perhaps the biggest.");

        quoteList.add(quote1);
        quoteList.add(quote2);
        quoteList.add(quote3);
        quoteList.add(quote4);
        quoteList.add(quote5);

        for(Quote quote : quoteList){
            System.out.println(quote.getAuthor().getFirstName()+ " "+ quote.getAuthor().getLastName()+" : "+'"'+quote.getContent()+'"');
        }
    }
}
