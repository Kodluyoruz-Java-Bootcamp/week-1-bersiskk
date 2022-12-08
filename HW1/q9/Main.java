package HW1.q9;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.print();
        System.out.println(myList.size());

        myList.add("ceren");
        myList.add("deniz");
        myList.add("Cemre");
        myList.add("Aslı");
        myList.add("Cemre");
        System.out.println(myList.size() + ", " + myList.getCapacity());
        myList.print();
    }
}
