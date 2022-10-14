package HarrysSalon;

import java.util.ArrayList;
import java.util.Arrays;

public class Calender
{
    private ArrayList<Appointment> chosenDay = new ArrayList<>();
    public ArrayList<ArrayList<Appointment>> calender = new ArrayList<>();


    public Calender()
    {
        for (int i = 0; i < 365; i++)
        {
            ArrayList c1 = new ArrayList();
            calender.add(c1);
            for (int j = 0; j < 8; j++)
            {
                Appointment d1 = new Appointment();
                c1.add(d1);
            }
        }
    }

    public void setAppointment(int dag, int aftale, String name)
    {
        calender.get(dag).get(aftale).setName(name);
    }

    //En metode, som returnere en bestemt dag. Kan bruges til at tjekke, hvilke tider der er ledige.
    public ArrayList getDay(int dag)
    {
        return calender.get(dag);
    }

    //Returnere en bestemt aftale på en bestemt dag.
    public Appointment getAppointment(int dag, int aftale)
    {
        return calender.get(dag).get(aftale);
    }

    //Returnere hele kalenderen, for hvad der svarer til et år.
    public ArrayList getCalender()
    {
        return calender;
    }

    public void setTotalAmountOfSale(int dag, int aftale, double totalAmountOfSale)
    {
        calender.get(dag).get(aftale).setTotalAmountOfSale(totalAmountOfSale);
    }

    //Hjælper brugeren med at vælge en dato på en nemmere måde.
    public void userAvailibility(int måned, int ugedag)
    {
        switch (måned)
        {
            case 1:
                for (int i = 0; i < 5; i++)
                {
                    System.out.println((ugedag + i) + ". Januar");
                    System.out.println(calender.get((0 + i) + ugedag));
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++)
                {
                    System.out.println((ugedag + i) + ". Februar");
                    System.out.println(calender.get((31 + i) + ugedag));
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++)
                {
                    System.out.println((ugedag + i) + ". Marts");
                    System.out.println(calender.get((59 + i) + ugedag));
                }
                break;
            case 4:
                for (int i = 0; i < 5; i++)
                {


                    System.out.println((ugedag + i) + ". April");
                    System.out.println(calender.get((59 + 31 + i) + ugedag));
                }
                break;
            case 5:
                for (int i = 0; i < 5; i++)
                {

                    System.out.println((ugedag + i) + ". Maj");
                    System.out.println(calender.get((90 + 30 + i) + ugedag));
                }
                break;
            case 6:
                for (int i = 0; i < 5; i++)
                {
                    System.out.println((ugedag + i) + ". Juni");
                    System.out.println(calender.get(120 + 31 + ugedag));
                }
                break;
            case 7:
                for (int i = 0; i < 5; i++)
                {


                    System.out.println((ugedag + i) + ". Juli");
                    System.out.println(calender.get((151 + 30 + i) + ugedag));
                }
                break;
            case 8:
                for (int i = 0; i < 5; i++)
                {
                    System.out.println((ugedag + i) + ". August");
                    System.out.println(calender.get((181 + 31 + i) + ugedag));
                }
                break;
            case 9:
                for (int i = 0; i < 5; i++)
                {
                    System.out.println((ugedag + i) + ". September");
                    System.out.println(calender.get((212 + 30 + i) + ugedag));
                }
                break;
            case 10:
                for (int i = 0; i < 5; i++)
                {


                    System.out.println((ugedag + i) + ". Oktober");
                    System.out.println(calender.get((242 + 31 + i) + ugedag));
                }
                break;
            case 11:
                for (int i = 0; i < 5; i++)
                {
                    System.out.println((ugedag + i) + ". November");
                    System.out.println(calender.get((273 + 30 + i) + ugedag));
                }
                break;
            case 12:
                for (int i = 0; i < 5; i++)
                {


                    System.out.println((ugedag + i) + ". December");
                    System.out.println(calender.get((304 + 30 + i) + ugedag));
                }
                break;

        }
    }

    public void userSetTotalAmountOfSale(int måned, int ugedag, int tidspunkt, double totalAmountOfSale)
    {
        switch (måned)
        {
            case 1:
                System.out.println(ugedag + ". Januar kl: "+(tidspunkt+9));
                calender.get(0 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(0 + ugedag).get(tidspunkt));
                break;
            case 2:
                System.out.println(ugedag + ". Februar kl: "+(tidspunkt+9));
                calender.get(31 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(31 + ugedag).get(tidspunkt));
                break;
            case 3:
                System.out.println(ugedag + ". Marts kl: "+(tidspunkt+9));
                calender.get(59 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(59 + ugedag).get(tidspunkt));
                break;
            case 4:
                System.out.println(ugedag + ". April kl: "+(tidspunkt+9));
                calender.get(59 + 31 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(59 + 31 + ugedag).get(tidspunkt));
                break;
            case 5:
                System.out.println(ugedag + ". Maj kl: "+(tidspunkt+9));
                calender.get(90 + 30 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(90 + 30 + ugedag).get(tidspunkt));
                break;
            case 6:
                System.out.println(ugedag + ". Juni kl: "+(tidspunkt+9));
                calender.get(120 + 31 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(120 + 31 + ugedag).get(tidspunkt));
                break;
            case 7:
                System.out.println(ugedag + ". Juli kl: "+(tidspunkt+9));
                calender.get(151 + 30 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(151 + 30 + ugedag).get(tidspunkt));
                break;
            case 8:
                System.out.println(ugedag + ". August kl: "+(tidspunkt+9));
                calender.get(181 + 31 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(181 + 31 + ugedag).get(tidspunkt));
                break;
            case 9:
                System.out.println(ugedag + ". September kl: "+(tidspunkt+9));
                calender.get(212 + 30 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(212 + 30 + ugedag).get(tidspunkt));
                break;
            case 10:
                System.out.println(ugedag + ". Oktober kl: "+(tidspunkt+9));
                calender.get(242 + 31 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(242 + 31 + ugedag).get(tidspunkt));
                break;
            case 11:
                System.out.println(ugedag + ". November kl: "+(tidspunkt+9));
                calender.get(273 + 30 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(273 + 30 + ugedag).get(tidspunkt));
                break;
            case 12:
                System.out.println(ugedag + ". December kl: "+(tidspunkt+9));
                calender.get(304 + 30 + ugedag).get(tidspunkt).setTotalAmountOfSale(totalAmountOfSale);
                System.out.println(calender.get(304 + 30 + ugedag).get(tidspunkt));
                break;

        }
    }

    public void userGetAppointment(int måned, int ugedag, int tidspunkt)
    {
        switch (måned)
        {
            case 1:
                System.out.println(ugedag + ". Januar kl: "+(tidspunkt+9));
                System.out.println(calender.get(0 + ugedag).get(tidspunkt));
                break;
            case 2:
                System.out.println(ugedag + ". Februar kl: "+(tidspunkt+9));
                System.out.println(calender.get(31 + ugedag).get(tidspunkt));
                break;
            case 3:
                System.out.println(ugedag + ". Marts kl: "+(tidspunkt+9));
                System.out.println(calender.get(59 + ugedag).get(tidspunkt));
                break;
            case 4:
                System.out.println(ugedag + ". April kl: "+(tidspunkt+9));
                System.out.println(calender.get(59 + 31 + ugedag).get(tidspunkt));
                break;
            case 5:
                System.out.println(ugedag + ". Maj kl: "+(tidspunkt+9));
                System.out.println(calender.get(90 + 30 + ugedag).get(tidspunkt));
                break;
            case 6:
                System.out.println(ugedag + ". Juni kl: "+(tidspunkt+9));
                System.out.println(calender.get(120 + 31 + ugedag).get(tidspunkt));
                break;
            case 7:
                System.out.println(ugedag + ". Juli kl: "+(tidspunkt+9));
                System.out.println(calender.get(151 + 30 + ugedag).get(tidspunkt));
                break;
            case 8:
                System.out.println(ugedag + ". August kl: "+(tidspunkt+9));
                System.out.println(calender.get(181 + 31 + ugedag).get(tidspunkt));
                break;
            case 9:
                System.out.println(ugedag + ". September kl: "+(tidspunkt+9));
                System.out.println(calender.get(212 + 30 + ugedag).get(tidspunkt));
                break;
            case 10:
                System.out.println(ugedag + ". Oktober kl: "+(tidspunkt+9));
                System.out.println(calender.get(242 + 31 + ugedag).get(tidspunkt));
                break;
            case 11:
                System.out.println(ugedag + ". November kl: "+(tidspunkt+9));
                System.out.println(calender.get(273 + 30 + ugedag).get(tidspunkt));
                break;
            case 12:
                System.out.println(ugedag + ". December kl: "+(tidspunkt+9));
                System.out.println(calender.get(304 + 30 + ugedag).get(tidspunkt));
                break;

        }
    }

    public void userSetAppointment(int måned, int ugedag, int tidspunkt, String name)
    {
        switch (måned)
        {
            case 1:
                System.out.println(ugedag + ". Januar kl: "+(tidspunkt+9));
                calender.get(0 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(0 + ugedag).get(tidspunkt));
                break;
            case 2:
                System.out.println(ugedag + ". Februar kl: "+(tidspunkt+9));
                calender.get(31 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(31 + ugedag).get(tidspunkt));
                break;
            case 3:
                System.out.println(ugedag + ". Marts kl: "+(tidspunkt+9));
                calender.get(59 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(59 + ugedag).get(tidspunkt));
                break;
            case 4:
                System.out.println(ugedag + ". April kl: "+(tidspunkt+9));
                calender.get(59 + 31 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(59 + 31 + ugedag).get(tidspunkt));
                break;
            case 5:
                System.out.println(ugedag + ". Maj kl: "+(tidspunkt+9));
                calender.get(90 + 30 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(90 + 30 + ugedag).get(tidspunkt));
                break;
            case 6:
                System.out.println(ugedag + ". Juni kl: "+(tidspunkt+9));
                calender.get(120 + 31 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(120 + 31 + ugedag).get(tidspunkt));
                break;
            case 7:
                System.out.println(ugedag + ". Juli kl: "+(tidspunkt+9));
                calender.get(151 + 30 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(151 + 30 + ugedag).get(tidspunkt));
                break;
            case 8:
                System.out.println(ugedag + ". August kl: "+(tidspunkt+9));
                calender.get(181 + 31 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(181 + 31 + ugedag).get(tidspunkt));
                break;
            case 9:
                System.out.println(ugedag + ". September kl: "+(tidspunkt+9));
                calender.get(212 + 30 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(212 + 30 + ugedag).get(tidspunkt));
                break;
            case 10:
                System.out.println(ugedag + ". Oktober kl: "+(tidspunkt+9));
                calender.get(242 + 31 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(242 + 31 + ugedag).get(tidspunkt));
                break;
            case 11:
                System.out.println(ugedag + ". November kl: "+(tidspunkt+9));
                calender.get(273 + 30 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(273 + 30 + ugedag).get(tidspunkt));
                break;
            case 12:
                System.out.println(ugedag + ". December kl: "+(tidspunkt+9));
                calender.get(304 + 30 + ugedag).get(tidspunkt).setName(name);
                System.out.println(calender.get(304 + 30 + ugedag).get(tidspunkt));
                break;
        }

    /*public void userMakeAppointment(int måned, int ugedag, int tidspunkt, String name)
    {
        userAvailibility(måned, ugedag);
        switch (tidspunkt)
        {
            case 10:
                calender.get();
        }

        //setName(name);
        System.out.println("Aftale for " + name + " oprettet.");
    }*/
    }

    public void userDeleteAppointment(int måned, int ugedag, int tidspunkt)
    {
        switch (måned)
        {
            case 1:
                System.out.println(ugedag + ". Januar kl: "+(tidspunkt+9));
                calender.get(0 + ugedag).get(tidspunkt).deleteAppointment();

                System.out.println(calender.get(0 + ugedag).get(tidspunkt));
                break;
            case 2:
                System.out.println(ugedag + ". Februar kl: "+(tidspunkt+9));
                calender.get(31 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(31 + ugedag).get(tidspunkt));
                break;
            case 3:
                System.out.println(ugedag + ". Marts kl: "+(tidspunkt+9));
                calender.get(59 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(59 + ugedag).get(tidspunkt));
                break;
            case 4:
                System.out.println(ugedag + ". April kl: "+(tidspunkt+9));
                calender.get(59 + 31 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(59 + 31 + ugedag).get(tidspunkt));
                break;
            case 5:
                System.out.println(ugedag + ". Maj kl: "+(tidspunkt+9));
                calender.get(90 + 30 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(90 + 30 + ugedag).get(tidspunkt));
                break;
            case 6:
                System.out.println(ugedag + ". Juni kl: "+(tidspunkt+9));
                calender.get(120 + 31 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(120 + 31 + ugedag).get(tidspunkt));
                break;
            case 7:
                System.out.println(ugedag + ". Juli kl: "+(tidspunkt+9));
                calender.get(151 + 30 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(151 + 30 + ugedag).get(tidspunkt));
                break;
            case 8:
                System.out.println(ugedag + ". August kl: "+(tidspunkt+9));
                calender.get(181 + 31 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(181 + 31 + ugedag).get(tidspunkt));
                break;
            case 9:
                System.out.println(ugedag + ". September kl: "+(tidspunkt+9));
                calender.get(212 + 30 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(212 + 30 + ugedag).get(tidspunkt));
                break;
            case 10:
                System.out.println(ugedag + ". Oktober kl: "+(tidspunkt+9));
                calender.get(242 + 31 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(242 + 31 + ugedag).get(tidspunkt));
                break;
            case 11:
                System.out.println(ugedag + ". November kl: "+(tidspunkt+9));
                calender.get(273 + 30 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(273 + 30 + ugedag).get(tidspunkt));
                break;
            case 12:
                System.out.println(ugedag + ". December kl: "+(tidspunkt+9));
                calender.get(304 + 30 + ugedag).get(tidspunkt).deleteAppointment();
                System.out.println(calender.get(304 + 30 + ugedag).get(tidspunkt));
                break;
        }
    }
}


