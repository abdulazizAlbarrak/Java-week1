import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

                    Scanner s = new Scanner(System.in);
                    System.out.println();
                    // Q1
        try{
                    System.out.println("Input first number: ");
                    int num0 = s.nextInt();
                    System.out.println("Input second number: ");
                    int num1 = s.nextInt();
                    System.out.println(num0+" + "+num1+" = "+(num0+num1));
                    System.out.println(num0+" - "+num1+" = "+(num0-num1));
                    System.out.println(num0+" x "+num1+" = "+(num0*num1));
                    System.out.println(num0+" / "+num1+" = "+(num0/num1));
                    System.out.println(num0+" mod "+num1+" = "+(num0%num1));
        }catch(InputMismatchException e1){
            System.out.prinln("You can only add integer numbers"):
        }catch(ArithmeticException e2){
            System.out.println(e2.getMessage());
        }catch(Exception e3){
            System.out,println(e3.getMessage());
        }
                    //end of Q1

                    //Q2
                    System.out.println("Input a String: ");
                    String stringA = s.nextLine();
                    stringA = stringA.toLowerCase();
                    System.out.println(stringA);

                    //end of Q2

                    //Q3
                    System.out.println("Input a String: ");
                    String string1 = s.nextLine();
                    System.out.println("Input a number: ");


                    int num2 = s.nextInt();
                    System.out.println(string1.charAt(num2));
                    //end of Q3

                    //Q4
                    System.out.println("Input a number: ");
                    int num3 = s.nextInt();
                    if(num3 % 2 == 0){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    //end of Q4

                    //Q5

                    System.out.println("Input a role: ");
                    String role = s.nextLine();
                    if(role.equalsIgnoreCase("admin")){
                        System.out.println("welcome admin");
                    } else if (role.equalsIgnoreCase("superuser")) {
                        System.out.println("welcome superuser");

                    }else if(role.equalsIgnoreCase("user")){
                        System.out.println("welcome user");
                    }else{
                        System.out.println("only: admin, superuser and user.");
                    }
                    //end of Q5

                    //Q6
                    System.out.println("Input the first number: ");
                    int fNumber = s.nextInt();
                    System.out.println("Input the second number: ");
                    int sNumber = s.nextInt();
                    System.out.println("Input the third number: ");
                    int tNumber = s.nextInt();

                    int reslut = fNumber + sNumber;
                    if(reslut == tNumber){
                        System.out.println("The result is: "+true);
                    }else{
                        System.out.println("The result is: "+false);
                    }
                    //end Q6

                    //Q7
                    System.out.println("Input the first number: ");
                    int f1Number = s.nextInt();
                    System.out.println("Input the second number: ");
                    int s2Number = s.nextInt();
                    System.out.println("Input the third number: ");
                    int t3Number = s.nextInt();

                    int max = f1Number;
                    if(s2Number>max){
                        max = s2Number;
                    }if(t3Number>max){
                        max = t3Number;
                    }
                    System.out.println("The greatest: "+max);

                    //end of Q7

                    //Q8
                    System.out.println("Input number(1 to 7 only): ");
                    int day = s.nextInt();
                    switch (day) {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;
                    }





    }

  }
