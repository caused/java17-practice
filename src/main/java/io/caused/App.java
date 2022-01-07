
package io.caused;

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
    
  }
}
