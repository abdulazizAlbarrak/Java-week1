import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Q1
        int [] intArr = {50, -20, 0, 30, 40, 60, 10};

        if(intArr[0] == intArr[intArr.length - 1]){
            System.out.println("True");
        }else {
            System.out.println("False");
        }//End of Q1

        //Q2
        int [] q2Arr = {1, 4, 17, 7, 25, 3, 100};
        int firstN = 0;
        Arrays.sort(q2Arr);
        System.out.println("3 largest elements of the said array are: "+q2Arr[q2Arr.length - 1]+" "+q2Arr[q2Arr.length - 2]+" "+q2Arr[q2Arr.length - 3]);
        //End of Q2

        //Q3
        int [] q3Arr = {1, 4, 17, 7, 25, 3, 100};
        Arrays.sort(q3Arr);
        double average = 0;
        int sum = 0;
        ArrayList greatN = new ArrayList<>();
        for(int i : q3Arr){
           sum = sum + i;
        }
        average = sum/(q3Arr.length);
        for(int i : q3Arr){
            if(i > average){
                greatN.add(i);
            }
        }
        System.out.println("The average of the said array is: "+average +" The numbers in the said array that are greater than the average are: "+greatN.get(0)+" and "+greatN.get(1));
        //End of Q3

        //Q4
        int [] q4Arr = {20, 30, 40};
        if(q4Arr[0] > q4Arr[q4Arr.length -1]){
            System.out.println("Larger value between first and last element: "+q4Arr[0]);
        }else{
            System.out.println("Larger value between first and last element: "+q4Arr[q4Arr.length-1]);
        }//End of Q4

        //Q5
        int [] q5Arr = {20, 30, 40};
        int q5Arr2[] = new int[q5Arr.length];
        for (int i = 0; i <= (q5Arr.length -1); i++){
            if(i == 0){
                q5Arr2[i] = q5Arr[q5Arr.length-1];
            }else if(i == (q5Arr.length-1)){
                q5Arr2[i] = q5Arr[0];
            }else {
                q5Arr2[i] = q5Arr[i];
            }
        }
        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(q5Arr2));
        // End of Q5

        //Q6
        String [] Q6words = { "cat", "dog", "red", "is", "am" };
        int max = 0;
        int count = 0;
        for(String s : Q6words){
            if(s.length()>=max){
                max = s.length();
                count++;
            }
        }
        String q6results[] = new String[count];
        for(int i = 0; i <= Q6words.length-1; i++){
            if(Q6words[i].length()==max){
                q6results[i] = Q6words[i];
            }
        }
        System.out.printf("Result: ");
        for (String s: q6results){
            System.out.printf("\"%s\" ",s);
        }//End of Q6

        //Q7
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int input0 = s.nextInt();
        int Q7Arr[] = new int[input0];
        int input;
        do {
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. To Stop");
            input = s.nextInt();

            if(input == 1){
                for(int i = 0; i < Q7Arr.length; i++){
                    System.out.println("Enter element "+i+" : ");
                    Q7Arr[i] = s.nextInt();
                }
            } else if (input == 2) {
                System.out.println("the arrays are: "+Arrays.toString(Q7Arr));
            } else if (input == 3) {
                boolean res = false;
                System.out.println("Search for: ");
                int search = s.nextInt();
                for(int i : Q7Arr){
                    if(i == search){
                        res = true;
                        break;
                    }else{
                        res = false;
                    }
                }
                if(res == true){
                    System.out.println("element found");
                }else{
                    System.out.println("element not found");
                }
            } else if (input == 4) {
                Arrays.sort(Q7Arr);
                System.out.println("Array sorted");
            }else{
                System.out.println("please enter only from 1 to 5");
            }
        }while(input != 5);
        //End of Q7

        //Q8
        int [] Q8Arr = {1,1,1,3,3,5};
        ArrayList visitedN = new ArrayList<>();
        for(int i = 0 ; i<Q8Arr.length; i++){
            if(!visitedN.contains(Q8Arr[i])) {
                visitedN.add(Q8Arr[i]);
            }
        }
        for(int i = 0 ; i < visitedN.size(); i++){
            int Q8count = 0;
            for(int c : Q8Arr){
                if(c == (int)visitedN.get(i)){
                    Q8count++;
                }
            }
            System.out.println(visitedN.get(i)+" occurs "+Q8count+" times");
        }
        //End of Q8

        //Q9
        int [] Q9Arr = {2,3,40,1,5,9,4,10,7};
        int [] Q9Arr2 = new int[9];
        int Q9count = 0;

        for (int i: Q9Arr){
            if(i % 2 != 0) {
                Q9Arr2[Q9count] = i;
                Q9count++;
            }
        }
        for (int i : Q9Arr){
            if(i % 2 == 0) {
                Q9Arr2[Q9count] = i;
                Q9count++;
            }
        }
        System.out.println(Arrays.toString(Q9Arr2));
        //End of Q9

        //Q10
        int [] Q10Arr1 = {2,3,6,6,4};
        int [] Q10Arr2 = {2,3,6,6,4};
        System.out.println(Arrays.equals(Q10Arr1, Q10Arr2));
        // End of Q10
    }
}