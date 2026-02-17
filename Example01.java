package Array;

public class Example01 {
    static void main() {

        int arr[];  // declare
        arr = new int[6]; // initialize
        // access the data from arr[]
        System.out.println("Before initialize "+arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // modify an array
        arr[0] = 101; // modify val by 101
        arr[1] = 102; // modify val by 102
        arr[2] = 103; // modify val by 103
        // access the data from arr[]
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

//        declare and initialize array
        int marks[] = {1,2,3,4,55,6,7};
        // access data form marks[]
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println("after modify "+marks[2]);
        // modify an array
//        marks[2] = 33;
//        System.out.println("before modify "+marks[2]);
        System.out.println("size of array "+marks.length);
        System.out.println("-------------------");

        // print all value of marks array [array traversing]
        for (int i = 0;i< marks.length;i++){
            System.out.println("val at index "+i+ " is "+marks[i]);
        }

        // enhance / for-each
        for (int res : marks){
            System.out.println(res);
        }
    }
}
