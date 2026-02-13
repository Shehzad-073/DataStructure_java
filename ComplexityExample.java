public class ComplexityExample {

    // Big O(n2) - quadratic Time
    static void quadraticTime(){
       int array[] = {4,3,2,1,5};
       int large = array[0];
       for (int i=0;i<array.length;i++){
           if (large>array[i]){
               large = array[i+1];
           }
       }
    }

    // Big O(1) - Constant Time
    static void constantTime(){
        int array[] = {1,2,3,4};
        System.out.println(array[0]);
    }

    // Big O(n) -Linear Time
    static void LinearTime(){
        int array[] = {1,2,3,4,5,6,7};
        for (int i = 0;i< array.length;i++){
            System.out.print((i+1)+" time \t");
            System.out.println(array[i]+" ");
        }

    }

    static void main() {
//        constantTime();
//        LinearTime();
       quadraticTime();
    }
}
