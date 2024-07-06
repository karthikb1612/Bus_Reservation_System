package Bus_Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
   protected String passengerName;
    protected int Bus_No;
    protected Date date;

    public Booking() {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the passenger name");
        passengerName=in.nextLine();
        System.out.println("Enter the Bus No");
        Bus_No=in.nextInt();
        System.out.println("Enter the date format(dd-MM-yyyy)");
        String dateFormat=in.next();
        SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=d.parse(dateFormat);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    boolean isAvailable(ArrayList<Bus> buses,ArrayList<Booking> Book){
        int capacity=0;
        for(Bus bus : buses){
            if(bus.getBus_No()==Bus_No){
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for(Booking b : Book){
            if(b.Bus_No==Bus_No && b.date.equals(date)){
                booked++;
            }
        }
        return capacity > booked;
    }
}
