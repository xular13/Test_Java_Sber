import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Route {
    ArrayList <Integer> gas;
    ArrayList <Integer> cost;


    public ArrayList<Integer> Possible_Route(){
        int num_station = this.gas.size();
        ArrayList<Integer> list_of_routs = new ArrayList<>();
        if (num_station != this.cost.size())
            throw new IncorrectSizeException("Error with size of arrays");
        for (int i = 0; i<num_station; i++){
            int fuel_tank = 0;
            int steps = 0;
            fuel_tank += this.gas.get(i);
            int k = i;
            while (true){
                fuel_tank-=this.cost.get(k);
                if (fuel_tank>=0){
                    steps+=1;
                }
                else break;
                if (steps == num_station){
                    list_of_routs.add(i);
                    break;
                }
                k = (k+1)%num_station;
                fuel_tank += this.gas.get(k);
            }
        }
        if(list_of_routs.isEmpty()){
            System.out.println("Нет возможных маршрутов");
        }
        else{
            System.out.println("Возможные станции для маршрута:");
            System.out.println(list_of_routs);
        }
        return list_of_routs;
    }

    public Route(List<Integer> gas, List<Integer> cost) {
        this.gas = new ArrayList<>(gas);
        this.cost = new ArrayList<>(cost);
    }
}
