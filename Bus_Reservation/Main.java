package Bus_Reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bus> buses=new ArrayList<>();
        ArrayList<Booking> book=new ArrayList<>();
        buses.add(new Bus(1,true,45));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,80));
        for(Bus b : buses){
            b.display();
        }
        Scanner in=new Scanner(System.in);
        boolean choose=true;
        while (choose){
            System.out.println("Enter True to Book and False to exit");
            choose=in.nextBoolean();
            if(choose){
                Booking booking=new Booking();
                if(booking.isAvailable(buses,book)){
                    book.add(booking);
                    System.out.println("Booking is conformed...");
                }
                else{
                    System.out.println("Sorry Bus is full try another Bus or date..");
                }
            }
        }
    }
}
