import java.util.LinkedList;
public class LinkedListDemo {
//LinkList will use more memory than ArrayList
    public static void main(String[] args) {

        LinkedList <Integer> nums = new LinkedList<>();

        nums.add(9);
        nums.add(7);
        nums.add(15);

        System.out.println(nums);

        nums.add(1,17);
        System.out.println(nums);

        //nums.add(0,2);

        nums.addFirst(2);
        nums.addLast(50);
        System.out.println(nums);


    }
}
