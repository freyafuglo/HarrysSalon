package HarrysSalon;

import java.util.ArrayList;

import java.util.Scanner;

public class Menu
{
    Scanner in = new Scanner(System.in);
    private String menuHeader;
    private String leadText;
    private ArrayList<String> mainMenu = new ArrayList<>();


    Calender calender1 = new Calender();
    int måned;
    int ugedag;
    int tidspunkt;
    double totalAmountOfSale;

    double finance;

    String name;

    // CONSTRUCTOR
    public Menu(String menuHeader, String leadText, ArrayList<String> mainMenu)
    {
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.mainMenu = mainMenu;
    }

    public void viewMainMenu()
    {
        ArrayList<String> mainMenu = new ArrayList<>();
        System.out.println("HOVEDMENU: ");
        mainMenu.add("1. Lav aftale");
        mainMenu.add("2. Slet aftale");
        mainMenu.add("3. Vis aftaler");
        mainMenu.add("4. Afregn ydelelse for aftale");
        mainMenu.add("5. Vælg tidspunkt");
        mainMenu.add("6. Finans");
        mainMenu.add("9. Exit programme");


        for (int i = 0; i < mainMenu.size(); i++)
        {
            System.out.println(mainMenu.get(i));
        }
        System.out.println("Indtast valgmulighed: ");
    }

    // METHOD FOR MENU DESIGN
    public void printMenu()
    {
        System.out.println(menuHeader);
        System.out.println(mainMenu);
        System.out.println(leadText);
    }

    // TRY / CATCH METHOD
    public int readChoiceMonth()
    {
        int userChoice = 0;
        boolean validChoice = false;
        do
        {
            System.out.println("Indtast måned:");

            try
            {
                userChoice = Integer.parseInt(in.next());
                if (userChoice > 0 && userChoice <= 12)
                {
                    validChoice = true;
                }
                else
                {
                    System.out.println("Tast et tal mellem 1 og 12");
                }
            } catch (NumberFormatException e)
            {
                System.out.println("Tast et tal!! Ikke fx et bogstav!");
            }
        } while (!validChoice);
        return userChoice;
    }

    public int readChoiceWeekDay()
    {
        int userChoice = 0;
        boolean validChoice = false;
        do
        {
            System.out.println("Indtast dag: ");
            try
            {
                userChoice = Integer.parseInt(in.next());
                if (userChoice > 0 && userChoice <= 31)
                {
                    validChoice = true;
                }
                else
                {
                    System.out.println("Tast et tal mellem 1-31");
                }
            } catch (NumberFormatException e)
            {
                System.out.println("Tast et tal!!");
            }
        } while (!validChoice);
        return userChoice;
    }

    public int readChoiceAppointment()
    {
        int userChoice = 0;
        boolean validChoice = false;
        do
        {
            System.out.println("Indtast nummer på aftale (1-8)");
            try
            {
                userChoice = Integer.parseInt(in.next());
                if (userChoice > 0 && userChoice <= 8)
                {
                    validChoice = true;
                }
                else
                {
                    System.out.println("Tast et tal mellem 1-8");
                }
            } catch (NumberFormatException e)
            {
                System.out.println("Tast et tal!!");
            }
        } while (!validChoice);
        return userChoice;
    }

    public int readChoiceMenu()
    {
        int userChoice = 0;
        boolean validChoice = false;
        do
        {
            try
            {
                userChoice = Integer.parseInt(in.next());
                if (userChoice > 0 && userChoice <= 6 || userChoice == 9)
                {
                    validChoice = true;
                }
                else
                {
                    System.out.println("Tast et tal fra menuen...");
                }
            } catch (NumberFormatException e)
            {
                System.out.println("Tast et tal fra menuen!!!... Dumme");
            }
        } while (!validChoice);
        return userChoice;
    }

    public String readChoiceName()
    {

        String userChoice = null;
        boolean validChoice = false;
        do
        {
            try
            {
                userChoice = in.next();
                if (userChoice instanceof String)
                {
                    validChoice = true;
                }
                else
                {
                    System.out.println("Skriv et Navn for helvede");
                }
            } catch (Exception e)
            {
                System.out.println("Det er ikke et Navn, kom NU!");
            }
        } while (!validChoice);
        return userChoice;
    }

    public double readChoiceTotalAmountOfSale()
    {
        double userChoice = 0;
        boolean validChoice = false;
        do
        {
            System.out.println("Registrer ydelse");
            try
            {
                userChoice = Double.parseDouble(in.next());

                validChoice = true;

            } catch (NumberFormatException e)
            {
                System.out.println("Tast det beløb kunden har købt for!!");
            }
        } while (!validChoice);
        return userChoice;
    }

    public void findAppointment()
    {
        måned = readChoiceMonth();
        ugedag = readChoiceWeekDay();
        tidspunkt = readChoiceAppointment();

    }

    public void getTotalFinances()
    {
        for (int i = 0; i < 365; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                finance += calender1.calender.get(i).get(j).getTotalAmountOfSale();
            }
        }
        System.out.println(finance);
    }


    // EMPTY CONSTRUCTOR
    public Menu()
    {
    }

    // SWITCH CASE METHOD
    public void mainMenuSwitch()
    {
        int choice;

        do
        { viewMainMenu();
            choice = readChoiceMenu();
            switch (choice)
            {
                case 1:
                    findAppointment();
                    System.out.println("Indtast Navn på kunde: ");
                    name = readChoiceName();
                    calender1.userSetAppointment(måned, ugedag, tidspunkt, name);
                    break;
                case 2:
                    findAppointment();
                    calender1.userDeleteAppointment(måned, ugedag, tidspunkt);
                    break;
                case 3:
                    måned = readChoiceMonth();
                    ugedag = readChoiceWeekDay();
                    calender1.userAvailibility(måned, ugedag);
                    break;
                case 4:
                    findAppointment();
                    totalAmountOfSale = readChoiceTotalAmountOfSale();
                    calender1.userSetTotalAmountOfSale(måned, ugedag, tidspunkt, totalAmountOfSale);
                    break;
                case 5:
                    måned = readChoiceMonth();
                    ugedag = readChoiceWeekDay();
                    calender1.userAvailibility(måned, ugedag);
                    break;
                case 6:
                    String password = "hairyharry";
                    int passwordTry = 0;
                    boolean keepTrying = true;
                    in.nextLine();
                    do
                        {
                            System.out.println("Skriv password");

                            String userTry = in.nextLine();

                            if (userTry.equals(password))
                            {
                                getTotalFinances();
                                keepTrying = false;
                            }
                            else
                            {
                                System.out.println("Forkert password!");
                                passwordTry++;
                            }
                            if (passwordTry == 3) {
                                System.out.println("Forsøg opbrugt!!");
                            }
                        } while (passwordTry < 3 && keepTrying);
                    break;
                case 9:
                    System.out.println("Program sluk. præcist heeej");
                    System.exit(0);
                    break;
            }
        } while (choice != 9);
    }
}