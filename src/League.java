import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    private String name;
    private ArrayList<T> list;

    public League(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }

    public void addTeam(T t) {
        if(list.contains(t)){
            System.out.println("Is already in list");
        }
        if (t.isLeague()) {
            list.add(t);
        } else {
            System.out.println("The team is not in league");
        }

    }

    public void printInOrder() {
        Collections.sort(list);
        for (T t : list) {
            System.out.println(t.getName() + " : " + t.getNumberOfPoints());
        }
    }



}
