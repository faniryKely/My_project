package cug.hotelxpress.mg.API;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import cug.hotelxpress.mg.manageReservation.Reservation;
import cug.hotelxpress.mg.structure.Hotel;
import cug.hotelxpress.mg.structure.MainDao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public  class Router implements HttpHandler {
    private List<Route> routes;

    public Router() {
        this.routes = new ArrayList<Route>();
    }

    public void addRoute(Route route) {
        this.routes.add(route);
    }

    public void handleRequest(String url, Route.HttpVerb httpVerb) {
        for (Route route : routes) {
            if (route.getPath().equals(url) && route.getHttpMethod().equals(httpVerb)) {
                route.getRouterHandler().handle(route);
            }
        }
    }

    /**
     * Handle the given request and generate an appropriate response.
     * See {@link HttpExchange} for a description of the steps
     * involved in handling an exchange.
     *
     * @param exchange the exchange containing the request from the
     *                 client and used to send the response
     * @throws NullPointerException if exchange is {@code null}
     * @throws IOException          if an I/O error occurs
     */
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        Gson gson = new Gson();
        List<Reservation> reservations = MainDao.showReservation();
        List<Hotel> hotelList = MainDao.showAllHotel();
        if (exchange.equals("/Reservation")) {
            for (Reservation reservation : reservations) {
                System.out.println(gson.toJson(reservation));
            }
        } else if (exchange.equals("/Hotel"))
            for (Hotel hotel : hotelList) {
                System.out.println(gson.toJson(hotel));
            }
        else if (exchange.equals("/Hello")) {
            MainDao.Hello();
        }

    }
}