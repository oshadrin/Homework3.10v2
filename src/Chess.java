import java.util.ArrayList;
import java.util.List;

public class Chess {

    static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        boolean change = true;
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                int relation = 0;
                if(change) relation = 1;
                if (j % 2 == relation){
                    biDemArrList.get(i).add(j, "●");
                } else {
                    biDemArrList.get(i).add(j, "◯");
                }
            }
            change = !change;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
