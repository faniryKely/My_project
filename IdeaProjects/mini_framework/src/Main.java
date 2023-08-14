import java.util.List;

public class Main {

    public static void main(String[] args) {
        Route r1 = new Route("/users",Route.HttpVerb.GET, new UserHandler());
        Router router = new Router();
        router.addRoute(r1);



        router.handleRequest("/users",Route.HttpVerb.GET);
    }

}