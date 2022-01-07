
package io.caused;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
  public static void main( String[] args ) {
    System.out.println( "Text Blocks" );
    new TextBlocks().print();
    System.out.println( "---------------------------" );
    
    System.out.println( "Switch expressions" );
    System.out.println(new SwitchExpressions().getPrice(PaymentType.PIX, 50.0));
    System.out.println( "---------------------------" );
    
    System.out.println( "Records" );
    var product = new Product( "TV", 230.0);
    System.out.println(product.name());
    System.out.println(product.price());
    System.out.println(product.toString());
    System.out.println( "---------------------------" );
    
    System.out.println( "Pattern Matching" );
    new PatternMatching().getPriceDescription();
    System.out.println( "---------------------------" );
    
    System.out.println( "New format for date/time" );
    var formatter = DateTimeFormatter.ofPattern("hh:mm B").withLocale(new Locale("pt", "BR"));
    System.out.println(formatter.format(LocalDateTime.now()));
    System.out.println( "---------------------------" );
    
    System.out.println("Convert stream to list");
    var stream = Stream.of("a", "b","c");
    var charList = stream.toList();
    charList.forEach(System.out::println);
  }
}
