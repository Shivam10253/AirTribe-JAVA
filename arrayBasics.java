public class arrayBasics {
    public static void main(String[] args) {

        //declaration
        int [] arr;
        // int arr[]; // we can use both ways to declare an array

        // allocation
        arr = new int[10];
        // System.out.println(arr.length); // by using .length, we can find the size of an array

        // initialisation
        int marks[] = {90, 50, 67, 99, 21};
        // System.out.println(marks); // if we do this, then it will give me the address of an array

        System.out.println("First element: " + marks[0]);
        System.out.println("Last element: " + marks[marks.length-1]);

        System.out.println(marks.length); // it give me the length of an array: 5

    }
}
