import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Integer[] gas_tmp = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> gas = Arrays.asList(gas_tmp);
        Integer[] cost_tmp = new Integer[]{3, 4, 5, 1, 2};
        List<Integer> cost = Arrays.asList(cost_tmp);
        Route tmp = new Route(gas, cost);
        System.out.println(tmp.Possible_Route());
    }
}
