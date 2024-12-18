import java.util.Scanner;
import java.util.Random;
/**
 * implements the life journey
 */
public class LifeJourney {
    /**
     * method that starts the life journey
     *@param name passes name of person going through life journey
     */
    public void liveALife(String name) {
        Scanner input = new Scanner(System.in);
        Random random = new Random(); 
        
        System.out.println("Hello " + name + ", where would you like to be born?");
        System.out.println("Pick between Zambia and India.");
        String birthPlace = input.nextLine();

        if (birthPlace.equalsIgnoreCase("zambia")) {
            System.out.println("Marvelous! You were born to a lower-class family!");
            System.out.println("Your new parents are Abeba and Ade.");
            System.out.println("They are low-class citizens and will treat you well.");
            System.out.println("I will now transport you in...");
        } else if (birthPlace.equalsIgnoreCase("india")) {
            System.out.println("Marvelous! You were born to a low-class family!");
            System.out.println("Your new parents are Vijay and Sati.");
            System.out.println("They are middle-class citizens and will treat you well.");
            System.out.println("I will now transport you in...");
        } else {
            System.out.println("Restart and pick a valid life.");
            System.exit(0);
        }

        int i = 1;
        System.out.println("Welcome to the world");
        while (i <= 5) {
            System.out.println("Your mom wishes to feed you (yes or no)");
            String myAnswer = input.nextLine();
            if (myAnswer.equalsIgnoreCase("no")) {
                System.out.println("You died from lack of food");
                System.exit(0);
            } else if (myAnswer.equalsIgnoreCase("yes")) {
                System.out.println("You have been fed with your parents best food. You have lived a blissful year.");
            } else {
                System.exit(0);
            }
            System.out.println("Life is uneventful and boring");
            System.out.println("You are now age " + i);
            i++;
        }

        System.out.println("Your parents ask you if you want to go to transitional");
        System.out.println("kindergarden");
        String myAnswer2 = input.nextLine();
        if (myAnswer2.equalsIgnoreCase("yes")) {
            System.out.println("You will now start your education... get ready for");
            System.out.println("a wild ride!");
            handleKindergarten(input, birthPlace, random); 
        } else {
            System.out.println("You chose not to go to kindergarten. Game over.");
            System.exit(0);
        }
    }
            /**
             * this method handles lifeJourney after the kindergarden stage
             * @ param scanner input gets using Scanner class
             * @param string "birthPlace" gets the place the person was born
             * @param random random uses random class to get random values 
            */
    public static void handleKindergarten(Scanner input, String birthPlace, Random random) {
        if (birthPlace.equalsIgnoreCase("zambia")) {
            System.out.println("Your parents send you to Montessori school");
        } else if (birthPlace.equalsIgnoreCase("india")) {
            System.out.println("Your parents send you to Bodhi Montessori school");
        }

        System.out.println("You are now 6.");
        System.out.println("Your parents ask you if you like school");
        String myAnswer3 = input.nextLine();

        if (myAnswer3.equalsIgnoreCase("yes")) {
            System.out.println("Your parents are happy, well done!");
        } else {
            System.out.println("Your parents needed you to succeed, and you failed them.");
            System.out.println("It is too early to make these decisions for yourself.");
            System.out.println("The game is terminated, if you would like try again.");
            System.exit(0);
        }

        System.out.println("Congrats on surviving this long, I can see you are very accomplished");
        System.out.println("Now your life will start getting more complex, and decisions will get harder.");
        System.out.println("GOOD LUCK!");
        System.out.println("Your parents ask if you want to go to elementary school");
        String Answer4 = input.nextLine();
        if (Answer4.equalsIgnoreCase("yes")) {
            System.out.println("You were given 2 options, pick one");
            System.out.println("An expensive private school, or a public school");
            String myAnswer5 = input.nextLine();
            if (myAnswer5.equalsIgnoreCase("An expensive private school")) {
                System.out.println("The teacher asks you if you are ready, and wants you to answer 5*5");
                int myAnswer6 = input.nextInt();
                input.nextLine();
                if (myAnswer6 != 25) {
                    System.out.println("You failed, and your parents decided you were worthless, so you give up hope");
                    System.exit(0);
                } else {
                    System.out.println("You succeeded");
                    int b = 7;
                    while (b < 11) {
                        System.out.println("Another year, you are doing great academically");
                        System.out.println("Everyone loves you, and you are on a path to greatness!");
                        b++;
                        System.out.println("You are now " + b + " years old");
                    }
                    System.out.println("Private school was too expensive, and your parents could not afford it");
                    System.out.println("To avoid embarrassment, you move away");
                    System.out.println("Game Over.");
                    System.exit(0);
                }
            } else if (myAnswer5.equalsIgnoreCase("a public school")) {
                int b = 7;
                while (b < 11) {
                    System.out.println("You have friends, and don't focus too hard on school");
                    System.out.println("Another year passes");
                    b++;
                    System.out.println("You are now " + b + " years old");
                }
            }

            int x = 11;
            System.out.println("Time for middle school.");
            while (x <= 14) {
                System.out.println("Classes are getting egregiously harder every year.");
                System.out.println(" ");
                System.out.println("Just study and chill");
                System.out.println(" ");
                System.out.println("You are now " + x + " years old.");
                x++;
            }

            System.out.println("Are you ready for High School?");
            String myAnswer7 = input.nextLine();
            if (myAnswer7.equalsIgnoreCase("yes")) {
                
                int eventChance = random.nextInt(100); 
                if (eventChance < 20) {
                    System.out.println("You got shot in a school shooting and died.");
                    System.exit(0);
                } else if (eventChance < 25) { 
                    System.out.println("You die from a car crash.");
                    System.exit(0);
                } else if(eventChance<20){
                    System.out.println("You failed all your classes in high school and quit");
                    System.exit(0);
                }else if(eventChance<6){
                    System.out.println("You got on drugs");
                    System.exit(0);
                }
            } 
            System.out.println("You passed High School and got a diploma");
            System.out.println("Do you want to go to college?");
            String myAnswer9 = " ";
            String myAnswer8 = input.nextLine();
            if(myAnswer8.equalsIgnoreCase("yes")){
               
                    System.out.println("You start your college journey");
                    System.out.println("You decide to spin on what you major in... this depends on your LIFE");
                    if (random.nextInt(100) < 30) {
                        System.out.println("You picked medicine");
                        System.out.println("CONGRATS ON PICKING MEDICINE!! You survived");
                      
                        myAnswer9 = "medicine";
                    } else if (random.nextInt(100) < 25) { 
                        System.out.println("You picked business");
                        System.out.println("Sorry buddy wrong choice... you are not getting anywhere");
                        System.exit(0);
                    } else if(random.nextInt(100)<20){
                        System.out.println("You quit college");
                        System.exit(0);
                    } else {
                        System.out.println("You decided to try biotech");
                        System.out.println("Congrats, you have a bright future ahead of you");
                        myAnswer9 = "biotech";
                    }
             
            }

            if (myAnswer9.equalsIgnoreCase("medicine")) {
                for (int i = 19; i < 80; i++) {
                    System.out.println("You picked medicine, so you have to register for the MCAT.");
                    System.out.println("you are " + i + " years old, and hopefully, you pass the test.");

                    if (random.nextInt(100) < 70) {
                        System.out.println("You failed the MCAT... try again.");
                    } else {
                        System.out.println("You passed and are now a certified doctor.");
                        break; 
                    }
                }
            }
            if (myAnswer9.equalsIgnoreCase("biotech")) {
                System.out.println("Do you want to take an internship for $15k a year, or wait for a better-paying internship?");
                String myAnswer10 = input.nextLine();
                if (myAnswer10.equalsIgnoreCase("yes")) {
                    System.out.println("Congrats on starting to earn money!");
                } else {
                    System.out.println("You never got a job. Be decisive with what you get.");
                    System.exit(0);
                }
            }

            int age =23;
            if (birthPlace.equalsIgnoreCase("zambia")) {
                System.out.println("Would you like to move to America? If you do, you have a 30% chance of success and will win the game.");
                String myAnswer11 = input.nextLine();
                if (myAnswer11.equalsIgnoreCase("yes")) {
                    if (random.nextInt(100) < 30) {
                        System.out.println("You passed! The game is now over. Congrats on surviving, and we'll now set you on a bright path for the rest of your life!");

                        while (age < 90) { 
                            if (random.nextInt(100) < 50) {
                                System.out.println("You went for a walk.");
                                System.out.println("You collected a paycheck.");
                            } else if (random.nextInt(100) < 25) {
                                System.out.println("You started a new business!");
                                System.out.println("You collected a million-dollar check!");
                                System.exit(0);
                            } else if (random.nextInt(100) < 20) {
                                System.out.println("You died in bed peacefully.");
                                break; 
                            }
                            age++;
                            System.out.println("You are now " + age + " years old.");
                        }
                        System.out.println("You lived a long life and died peacefully.");
                    } else {
                        System.out.println("You didn't make it to America. Life ends here.");
                        System.exit(0);
                    }
                } else {
                    System.out.println("You chose to stay in Zambia. The game continues.");
                }
            }
            if (myAnswer9.equalsIgnoreCase("biotech")) {
                System.out.println("Congrats on lasting so long. The rest of your life will be amazing.");
                age = 23;
                while (age < 100) { 
                    if (random.nextInt(100) < 50) {
                        System.out.println("You went for a walk.");
                        System.out.println("You collected a biotech paycheck.");
                    } else if (random.nextInt(100) < 40) {
                         System.out.println("You started a new biotech business and named it!");
                        System.out.println("You collected a million-dollar check!");
                        System.exit(0);
                     } else if (random.nextInt(100) < 5) {
                        System.out.println("You died in bed peacefully.");
                        break; 
                     }
                    else if(random.nextInt(100)<30){
                        System.out.println("You got a 3 million dollar bank exception.");
                    }
                    age++;
                     System.out.println("You are now " + age + " years old.");
                }
                System.out.println("You lived a long life and died peacefully.");
            } else if (myAnswer9.equalsIgnoreCase("medicine")) {
                System.out.println("You somehow passed the MCAT now live out your life!");
                for (;age < 90; age++) { 
                    if (random.nextInt(100) < 30) {
                        System.out.println("You went to your office");
                        System.out.println("You collected a paycheck.");
                    } else if (random.nextInt(100) < 50) {
                        System.out.println("You are tired, but save a life.");
                        System.out.println("You collected a million-dollar check!");
                        System.exit(0);
                    } else if (random.nextInt(100) < 80) {
                        System.out.println("You died in bed peacefully.");
                        System.exit(0); 
                    }
                    System.out.println("You are now " + age + " years old.");
            }
    System.out.println("You lived a long life and died peacefully.");
}

System.out.println("I hope you enjoyed the game.");
System.exit(0);
        }
    }
}