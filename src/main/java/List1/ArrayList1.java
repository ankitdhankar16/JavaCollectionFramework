package List1;
import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
    //creating the array list
    public List<Integer> list = new java.util.ArrayList<>();
    public ArrayList1(){
        //adding values in the ArrayList
        list.add(10);
        list.add(13);
        list.add(14);
        list.add(18);
        list.add(111);
        list.add(117);
        list.add(139);
        list.add(178);
    }
    public void viewList(){
        System.out.println(list);
    }
    public int get(int index){
        return list.get(index);
    }

}
