import java.util.ArrayList;
public class ArrayListDemo {

    public static void main(String[] args) {


        ArrayList list = new ArrayList();

        list.add("Hello you fat bastard");
        list.add(45);
        list.add(87.98);
        list.add('z');

        System.out.println(list.toString());
                //<> will specify the type of data within the ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("りんご");
        fruits.add("トマト");
        fruits.add("Grapes");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add(2, "Pinapple"); //Overload method


        System.out.println(fruits.toString());

        ArrayList<String> colors = new ArrayList<>();
        colors.add("黒い");
        colors.add("白い ");
        colors.add("赤い");
        colors.add("Pink");

        System.out.println(colors);
        colors.addAll(2,fruits);

        System.out.println(colors);

        colors.set(1,"Green");
        System.out.println(colors);

        //Get

        System.out.println(colors.get(4));

        //Index of
        System.out.println(colors.indexOf("Mango"));

        //Delete element from list
        colors.remove(6);

        System.out.println(colors);

        //colors.removeAll(colors);
       // System.out.println(colors);
        //Clear the contents of the array
       // colors.clear();

        System.out.println(colors);

        System.out.println(colors.contains("Pink"));

    }
}
