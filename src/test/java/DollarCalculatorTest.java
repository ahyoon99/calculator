import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DollarCalculatorTest {

    @Test
    public void testHello(){
        System.out.println("Hello JUnit");
    }

    @Test
    public void dollar(){
        MarketApi marketApi = new MarketApi();
        DollarCalculator dollarCalculator = new DollarCalculator(marketApi);
        dollarCalculator.init();

        Calculator calculator = new Calculator(dollarCalculator);  // 달러 계산기를 사용하기 위해 dollarCalculator를 주입해준다.
        // System.out.println(calculator.sum(10,10));
        Assertions.assertEquals(22000, calculator.sum(10,10));
        Assertions.assertEquals(0,calculator.minus(10,10));
    }
}