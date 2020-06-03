import java.util.ArrayList;

public class Airport {
  private int maxFlights;
  private ArrayList<Flight> flights = new ArrayList<Flight>();

  public Airport(int maxFlights) {
    this.maxFlights = maxFlights;
  }

  void addNewFlight(Flight flight) {
    if (this.flights.size() == this.maxFlights) {
      throw new Error("Max number of flights reached");
    }

    for (Flight f : this.flights) {
      if (f.flightNumber == flight.flightNumber) {
        throw new Error("The flight with number " + flight.flightNumber + " cannot be added twice!");
      }
    }

    this.flights.add(flight);
  }

  void removeFlight(int flightNumber) {
    ArrayList<Integer> flightNumbers = new ArrayList<Integer>();
    for (Flight f : this.flights) {
      flightNumbers.add(f.flightNumber);
    }

    int index = flightNumbers.indexOf(flightNumber);
    if (index >= 0) {
      this.flights.remove(index);
    }
  }

  void listDeparturesOnScreen() {
    for (Flight f : this.flights) {
      if (!f.inOut) {
        System.err.println("Flight number: " + f.flightNumber + " (departure time: " + f.time + ", gate: " + f.gate
            + ", destination: " + f.location + ")");
      }
    }
  }

  void listArrivalsOnScreen() {
    for (Flight f : this.flights) {
      if (f.inOut) {
        System.err.println("Flight number: " + f.flightNumber + " (arrival time: " + f.time + ", gate: " + f.gate
            + ", location: " + f.location + ")");
      }
    }
  }
}