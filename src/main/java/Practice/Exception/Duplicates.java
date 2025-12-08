package Practice.Exception;
import java.util.ArrayList;
import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        duplicates();
    }
    static void duplicates(){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(30);
        arr.add(20);
        HashSet<Integer> set = new HashSet<>(arr);
        for(int i : set){
            System.out.println(i);
        }

    }
}
