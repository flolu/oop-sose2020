public class Main {
  public static void main(String[] args) {
    System.out.println("test");

    Airport airport = new Airport(2);

    Flight f1 = new Flight();
    f1.flightNumber = 1;

    Flight f2 = new Flight();
    f2.flightNumber = 2;

    airport.addNewFlight(f1);
    airport.addNewFlight(f2);

    airport.listDeparturesOnScreen();
    airport.listArrivalsOnScreen();
  }
}