package GenericCalculator;
import Exceptions.MyCustomCheckedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.util.List;



public class Calculator1{

        String name;
        List<String> caracterePermise = Arrays.asList("0","1","2","3","4","5","6","7","8","9");

        private static final Logger logger = LogManager.getLogger(Calculator1.class);

        public MyCustomCheckedException calculatorValidate(String input) throws MyCustomCheckedException {
                if (!caracterePermise.contains(input)) throw new MyCustomCheckedException(){
                };
                else {

                        Calculator1 calculator1 = new Calculator1();

                        calculator1.name = "Calculator1";

                        logger.info(calculator1.name + ": Suma numerelor este " + new Operation().sum(6, 10));
                        logger.info(calculator1.name + ": Diferenta numerelor este " + new Operation().divide(6, 10));
                        logger.info(calculator1.name + ": Impartirea numerelor este " + new Operation().multiply(8, 3));
                        logger.info(calculator1.name + ": Diferenta numerelor este " + new Operation().subtract(7, 3));
                }
            return null;
        }
}


