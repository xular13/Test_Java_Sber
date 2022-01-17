import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IncorrectSizeException {
//        Integer[] gas_tmp = new Integer[]{2, 3, 4};
        Integer[] gas_tmp = new Integer[]{1, 2, 3, 4, 5};
//        Integer[] gas_tmp = new Integer[]{1, 2, 3, 4};
//        Integer[] cost_tmp = new Integer[]{3, 4, 3};
        Integer[] cost_tmp = new Integer[]{3, 4, 5, 1, 2};
        List<Integer> gas = Arrays.asList(gas_tmp);
        List<Integer> cost = Arrays.asList(cost_tmp);
        Route tmp = new Route(gas, cost);
        tmp.Possible_Route();
    }
}
