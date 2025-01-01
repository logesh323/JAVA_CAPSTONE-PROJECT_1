import java.util.Scanner;
public class Demo{
    static Scanner sc=new Scanner(System.in);
        public static void main(String[]args)throws Exception{
            System.out.print("select your input:\n1.Buhari\n2.ss hydrabad\n3.A2b\n4.amma canteen\nENTER YOUR INPUT:");
            int hotel=sc.nextInt();
            switch(hotel){

                case 1:{
                    System.out.println("\n\t\t\twelcome to buhari");//buhari
                    System.out.print("select your input:\n1.chicken briyani\n2.mutton briyani\n3.prawn briyani\nENTER YOUR INPUT:");
                    int menu=sc.nextInt();
                    switch(menu){

                        case 1:{//chicken briyani
                            System.out.print("enter quantity:");
                            int qua=sc.nextInt();
                            double price=3000;
                            System.out.println("your bill "+qua*price);
                            System.out.print("enter bill amount:");
                            double uprice=sc.nextDouble();
                            System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                            int pay=sc.nextInt();
                            switch(pay){
                                case 1:{//upi payment
                                     System.out.print("enter pin:");
                                     int pin=sc.nextInt();
                                     if (pin==999999)
                                        System.out.println("payment success");
                                     else
                                        System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                                break;}
                                case 2:{//card payment using OTP
                                    int otps=(int) (Math.random()*9999+9999);
                                    System.out.println("your OTP is: "+otps);
                                    System.out.print("enter the otp: ");
                                    int otp=sc.nextInt();
                                    if (otps==otp)
                                    System.out.println("payment success");
                                    else
                                    System.out.println("invalid otp, retry");
                                    break;}   
                            }break;
                        
                        }
                        case 2:{//mutton briyani
                            System.out.print("enter quantity:");
                            int qua=sc.nextInt();
                            double price=7000;
                            System.out.println("your bill "+qua*price);
                            System.out.print("enter bill amount:");
                            double uprice=sc.nextDouble();
                            System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                            int pay=sc.nextInt();
                            switch(pay){
                                case 1:{//upi payment
                                     System.out.print("enter pin:");
                                     int pin=sc.nextInt();
                                     if (pin==999999)
                                        System.out.println("payment success");
                                     else
                                        System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                                break;}
                                case 2:{//card payment using OTP
                                    int otps=(int) (Math.random()*9999+9999);
                                    System.out.println("your OTP is: "+otps);
                                    System.out.print("enter the otp: ");
                                    int otp=sc.nextInt();
                                    if (otps==otp)
                                    System.out.println("payment success");
                                    else
                                    System.out.println("invalid otp, retry");
                                    break;}
                                
                            }break;

                        }
                        case 3:{//prawn briyani
                            System.out.print("enter quantity:");
                            int qua=sc.nextInt();
                            double price=17000;
                            System.out.println("your bill "+qua*price);
                            System.out.print("enter bill amount:");
                            double uprice=sc.nextDouble();
                            System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                            int pay=sc.nextInt();
                            switch(pay){
                                case 1:{//upi payment
                                     System.out.print("enter pin:");
                                     int pin=sc.nextInt();
                                     if (pin==999999)
                                        System.out.println("payment success");
                                     else
                                        System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                                break;}
                                case 2:{//card payment using OTP
                                    int otps=(int) (Math.random()*9999+9999);
                                    System.out.println("your OTP is: "+otps);
                                    System.out.print("enter the otp: ");
                                    int otp=sc.nextInt();
                                    if (otps==otp)
                                    System.out.println("payment success");
                                    else
                                    System.out.println("invalid otp, retry");
                                    break;}
                                
                            }break;
                        }
                    }
                    
                    break;}

                case 2:
                System.out.println("\n\t\t\twelcome to ss hydrabad");//ss hydrabad(2nd hotel)
                System.out.print("select your input:\n1.chicken briyani\n2.65 briyani\n3.egg briyani\nENTER YOUR INPUT:");
                int menu=sc.nextInt();
                switch(menu){

                    case 1:{//chicken briyani
                        System.out.print("enter quantity:");
                        int qua=sc.nextInt();
                        double price=3000;
                        System.out.println("your bill "+qua*price);
                        System.out.print("enter bill amount:");
                        double uprice=sc.nextDouble();
                        System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                        int pay=sc.nextInt();
                        switch(pay){
                            case 1:{//payment using upi
                                 System.out.print("enter pin:");
                                 int pin=sc.nextInt();
                                 if (pin==999999)
                                    System.out.println("payment success");
                                 else
                                    System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                            break;}
                            case 2:{//payment using card with OTP
                                int otps=(int) (Math.random()*9999+9999);
                                System.out.println("your OTP is: "+otps);
                                System.out.print("enter the otp: ");
                                int otp=sc.nextInt();
                                if (otps==otp)
                                System.out.println("payment success");
                                else
                                System.out.println("invalid otp, retry");
                            break;}
                            
                        }break;

                    }
                    case 2:{//65 briyani
                        System.out.print("enter quantity:");
                        int qua=sc.nextInt();
                        double price=2000;
                        System.out.println("your bill "+qua*price);
                        System.out.print("enter bill amount:");
                        double uprice=sc.nextDouble();
                        System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                        int pay=sc.nextInt();
                        switch(pay){
                            case 1:{//payment using upi
                                 System.out.print("enter pin:");
                                 int pin=sc.nextInt();
                                 if (pin==999999)
                                    System.out.println("payment success");
                                 else
                                    System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                            break;}
                            case 2:{//payment using card with OTP
                                int otps=(int) (Math.random()*9999+9999);
                                System.out.println("your OTP is: "+otps);
                                System.out.print("enter the otp: ");
                                int otp=sc.nextInt();
                                if (otps==otp)
                                System.out.println("payment success");
                                else
                                System.out.println("invalid otp, retry");
                            break;}
                            
                        }break;
                       
                    }case 3:{//egg briyani
                        System.out.print("enter quantity:");
                        int qua=sc.nextInt();
                        double price=1500;
                        System.out.println("your bill "+qua*price);
                        System.out.print("enter bill amount:");
                        double uprice=sc.nextDouble();
                        System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                        int pay=sc.nextInt();
                        switch(pay){
                            case 1:{//payment using upi
                                 System.out.print("enter pin:");
                                 int pin=sc.nextInt();
                                 if (pin==999999)
                                    System.out.println("payment success");
                                 else
                                    System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                            break;}
                            case 2:{//payment using card with OTP
                                int otps=(int) (Math.random()*9999+9999);
                                System.out.println("your OTP is: "+otps);
                                System.out.print("enter the otp: ");
                                int otp=sc.nextInt();
                                if (otps==otp)
                                System.out.println("payment success");
                                else
                                System.out.println("invalid otp, retry");
                                break;}
                                
                            }break;
                        }
                    }
                    
                    break;
            
                case 3:System.out.println("\n\t\t\twelcome to A2B");//A2B(3nd hotel)
                System.out.print("select your input:\n1.veg briyani\n2.panner briyani\n3.empty briyani\nENTER YOUR INPUT:");
                int men=sc.nextInt();
                switch(men){

                    case 1:{//veg briyani
                        System.out.print("enter quantity:");
                        int qua=sc.nextInt();
                        double price=30000;
                        System.out.println("your bill "+qua*price);
                        System.out.print("enter bill amount:");
                        double uprice=sc.nextDouble();
                        System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                        int pay=sc.nextInt();
                        switch(pay){
                            case 1:{//payment using upi
                                 System.out.print("enter pin:");
                                 int pin=sc.nextInt();
                                 if (pin==999999)
                                    System.out.println("payment success");
                                 else
                                    System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                            break;}
                            case 2:{//payment using card with OTP
                                int otps=(int) (Math.random()*9999+9999);
                                System.out.println("your OTP is: "+otps);
                                System.out.print("enter the otp: ");
                                int otp=sc.nextInt();
                                if (otps==otp)
                                System.out.println("payment success");
                                else
                                System.out.println("invalid otp, retry");
                            break;}
                            
                        }break;

                    }
                    case 2:{//panner briyani
                        System.out.print("enter quantity:");
                        int qua=sc.nextInt();
                        double price=20000;
                        System.out.println("your bill "+qua*price);
                        System.out.print("enter bill amount:");
                        double uprice=sc.nextDouble();
                        System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                        int pay=sc.nextInt();
                        switch(pay){
                            case 1:{//payment using upi
                                 System.out.print("enter pin:");
                                 int pin=sc.nextInt();
                                 if (pin==999999)
                                    System.out.println("payment success");
                                 else
                                    System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                            break;}
                            case 2:{//payment using card with OTP
                                int otps=(int) (Math.random()*9999+9999);
                                System.out.println("your OTP is: "+otps);
                                System.out.print("enter the otp: ");
                                int otp=sc.nextInt();
                                if (otps==otp)
                                System.out.println("payment success");
                                else
                                System.out.println("invalid otp, retry");
                            break;}
                            
                        }break;
                       
                    }
                    case 3:{//empty briyani
                        System.out.print("enter quantity:");
                        int qua=sc.nextInt();
                        double price=15000;
                        System.out.println("your bill "+qua*price);
                        System.out.print("enter bill amount:");
                        double uprice=sc.nextDouble();
                        System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                        int pay=sc.nextInt();
                        switch(pay){
                            case 1:{//payment using upi
                                 System.out.print("enter pin:");
                                 int pin=sc.nextInt();
                                 if (pin==999999)
                                    System.out.println("payment success");
                                 else
                                    System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                            break;}
                            case 2:{//payment using card with OTP
                                int otps=(int) (Math.random()*9999+9999);
                                System.out.println("your OTP is: "+otps);
                                System.out.print("enter the otp: ");
                                int otp=sc.nextInt();
                                if (otps==otp)
                                System.out.println("payment success");
                                else
                                System.out.println("invalid otp, retry");
                            break;}
                            
                        }break;
                       
                    

                        }
                }break;

                case 4:System.out.println("\n\t\t\twelcome to amma canteen");//amma canteen(4nd hotel)
                System.out.print("select your input:\n1.curd rice\n2.lemon rice\n3.edli\nENTER YOUR INPUT:");
                int menus=sc.nextInt();
                switch(menus){

                    case 1:{//curd rice
                        System.out.print("enter quantity:");
                        int qua=sc.nextInt();
                        double price=3;
                        System.out.println("your bill "+qua*price);
                        System.out.print("enter bill amount:");
                        double uprice=sc.nextDouble();
                        System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                        int pay=sc.nextInt();
                        switch(pay){
                            case 1:{//payment using upi
                                 System.out.print("enter pin:");
                                 int pin=sc.nextInt();
                                 if (pin==999999)
                                    System.out.println("payment success");
                                 else
                                    System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                            break;}
                            case 2:{//payment using card with OTP
                                int otps=(int) (Math.random()*9999+9999);
                                System.out.println("your OTP is: "+otps);
                                System.out.print("enter the otp: ");
                                int otp=sc.nextInt();
                                if (otps==otp)
                                System.out.println("payment success");
                                else
                                System.out.println("invalid otp, retry");
                            break;}
                            
                        }break;

                    }
                    case 2:{//lemon rice
                        System.out.print("enter quantity:");
                        int qua=sc.nextInt();
                        double price=5;
                        System.out.println("your bill "+qua*price);
                        System.out.print("enter bill amount:");
                        double uprice=sc.nextDouble();
                        System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                        int pay=sc.nextInt();
                        switch(pay){
                            case 1:{//payment using upi
                                 System.out.print("enter pin:");
                                 int pin=sc.nextInt();
                                 if (pin==999999)
                                    System.out.println("payment success");
                                 else
                                    System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                            break;}
                            case 2:{//payment using card with OTP
                                int otps=(int) (Math.random()*9999+9999);
                                System.out.println("your OTP is: "+otps);
                                System.out.print("enter the otp: ");
                                int otp=sc.nextInt();
                                if (otps==otp)
                                System.out.println("payment success");
                                else
                                System.out.println("invalid otp, retry");
                            break;}
                            
                        }break;
                       
                    }
                    case 3:{//idli
                        System.out.print("enter quantity:");
                        int qua=sc.nextInt();
                        double price=1;
                        System.out.println("your bill "+qua*price);
                        System.out.print("enter bill amount:");
                        double uprice=sc.nextDouble();
                        System.out.print("\n\t\t\tPAYMENT\nchoose payment method:\n1.upi\n2.card\nENTER YOUR PAYMENT METHOD:");
                        int pay=sc.nextInt();
                        switch(pay){
                            case 1:{//payment using upi
                                 System.out.print("enter pin:");
                                 int pin=sc.nextInt();
                                 if (pin==999999)
                                    System.out.println("payment success");
                                 else
                                    System.out.println("wrong pin, check the pin.\n you have only 3 chance");   
                            break;}
                            case 2:{//payment using card with OTP
                                int otps=(int) (Math.random()*9999+9999);
                                System.out.println("your OTP is: "+otps);
                                System.out.print("enter the otp: ");
                                int otp=sc.nextInt();
                                if (otps==otp)
                                System.out.println("payment success");
                                else
                                System.out.println("invalid otp, retry");
                            break;}
                        }        
                        break;}
                }
                break;}        
        }}