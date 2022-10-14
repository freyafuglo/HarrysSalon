package HarrysSalon;

public class Appointment {

    private String name;

    private double totalAmountOfSale;

    private boolean reserved;


    public Appointment() {

        name = "";
        totalAmountOfSale = 0;
        reserved = false;
    }

    public void setName(String name) {
        this.name = name;
        reserved = true;
    }

    public String getName() {
        return name;
    }

    public void deleteAppointment() {
        name = null;
        reserved = false;
    }

    public void setTotalAmountOfSale(double totalAmountOfSale) {
        this.totalAmountOfSale = totalAmountOfSale;
    }

    public double getTotalAmountOfSale() {
        return totalAmountOfSale;
    }

    @Override
    public String toString() {
        String availability = "";

        if (reserved == false)
        {
            availability = "Ledig";
        } else
        {
            availability = "Reserveret";
        }

        return "Aftale: " + availability + ", Navn = '" + name + '\'' +
                ", Beløb = " + totalAmountOfSale +
                ", " + "\n";
    }
}
