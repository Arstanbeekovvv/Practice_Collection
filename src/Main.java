import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("cat", "dog", "horse", "dog"));
        for (int i = 0; i < animals.size()/2; i++) {
            for (int j = 0; j < animals.size(); j++) {
                if(i != j){
                    if(animals.get(i).equalsIgnoreCase(animals.get(j))) {
                        animals.remove(i);
                        j = animals.size();
                    }
                }
            }
        }
        System.out.println(animals);
    }
}