package cug.hotelxpress.mg.API;

import com.google.gson.Gson;
import cug.hotelxpress.mg.manageReservation.Reservation;
import cug.hotelxpress.mg.structure.Hotel;
import cug.hotelxpress.mg.structure.MainDao;

import java.util.List;

public class GetHandler implements RouterHandler {
    @Override
    public void handle(Route route) {
        Gson gson = new Gson();
        List<Reservation> reservations = MainDao.showReservation();
        List<Hotel> hotelList = MainDao.showAllHotel();
        if(route.equals("/Reservation")) {
            for (Reservation reservation : reservations) {
                System.out.println(gson.toJson(reservation));
            }
        } else if(route.equals("/Hotel"))
        for (Hotel hotel : hotelList) {
            System.out.println(gson.toJson(hotel));
        }
        else if (route.equals("/Hello")) {
            MainDao.Hello();
        }

    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
