import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Q1
        for(int i = 1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
                continue;
            }
            if(i%3 == 0){
                System.out.println("Fizz");
                continue;
            }
            if(i%5 == 0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }//enc of Q1

        //Q2
        System.out.println("Enter a string: ");
        String data = s.nextLine();
        String reverse ="";
        for(int i = data.length()-1; i>=0;i--){
            reverse = reverse + data.charAt(i);
        }
        System.out.println("Reverse string:"+reverse);
        //End of Q2

        //Q3
        System.out.println("Enter a positive integer");
        int pNumber = s.nextInt();
        int result = 1;
        for(int i = 1; i<=10; i++){
            result = i * pNumber;
            System.out.println(pNumber+" x "+i +" = "+result);
        }//End of Q3

        //Q4
        System.out.println("Enter a number: ");
        int faNumber = s.nextInt();
        int faResult = faNumber;
        for(int i =1 ; i<faResult; i++){
            //n × (n - 1)
            faNumber = faNumber * i;
        }
        System.out.println("the factorial of "+ faResult+" = "+faNumber);
        //End of Q4

        //Q5
        System.out.println("Enter the first number");
        int eNumber = s.nextInt();
        System.out.println("Enter the power");
        int power = s.nextInt();
        int finalResult = eNumber;
        while(power > 1){
            finalResult = finalResult * eNumber;
            power--;
        }
        System.out.println("the result is: "+finalResult);
        // End of Q5

        //Q6
        System.out.println("Enter a number (-1 to exit): ");
        int number6 = s.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while(number6 != -1){
            if(number6%2 == 0){
                evenSum = evenSum + number6;
            }else{
                oddSum = oddSum +number6;
            }
            System.out.println("Enter another number (-1 to exit): ");
            number6 = s.nextInt();
        }
        System.out.println("the sum of even numbers are: "+ evenSum +" and the sum of odd numbers are: "+ oddSum);
        // End of Q6
        // Q7
        System.out.println("Enter a number");
        int primeN = s.nextInt();
        if(primeN > 1){
            for(int i =2; i< primeN || primeN == 2; i++) {
                if (primeN % i == 0 && primeN != 2) {
                    System.out.println("number is not a prime number");
                    break;
                }
                System.out.println("number is a prime number");
                break;
            }

            }

        //Q8
        System.out.println("Enter a number (-1 to exit): ");
        int userN = s.nextInt();
        int pCount = 0;
        int nCount = 0;
        int zCount = 0;
        while(userN != -1){
            if(userN > 0){
                pCount++;
            } else if (userN < 0) {
                nCount++;
            }else {
                zCount++;
            }
            System.out.println("Enter a number (-1 to exit): ");
            userN = s.nextInt();
        }
        System.out.println("count of positive number are: "+ pCount+" and count of negative numbers are: "+ nCount+" and the count of zero numbers are: "+zCount);
        //End of Q8

        // Q9

        for(int i = 1; i <=4 ; i++){
            System.out.println("Week: "+i);
            for(int d = 1; d <= 7; d++){
               System.out.println("Day"+d);
            }
        } //End of Q9
        }
    }






