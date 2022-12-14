package Airport;

import java.util.Arrays;
import java.util.Objects;

public class Airport {

        private String airportName;
        private int maxFlights;
        private Flight.Flight[] flightsArray;


public Airport(String airportName, int maxFlights) {
            this.airportName = airportName;
            this.maxFlights = maxFlights;
            this.flightsArray = new Flight.Flight[maxFlights];
        }
        public void addFlight(Flight.Flight newFlight){
            for (int i=0; i<this.maxFlights; i++){
                if (this.flightsArray[i]==null){
                    this.flightsArray[i] = newFlight;
                    break;
                }
            }
        }

      public Flight.Flight[] getFlightsArray() {
                  return flightsArray;
              }

              public void setFlightsArray(Flight.Flight[] flightsArray) {
                  this.flightsArray = flightsArray;
              }

              @Override
              public String toString() {
                  return "Airport{" +
                          "airportName='" + airportName + '\'' +
                          ", maxFlights=" + maxFlights +
                          ", flightsArray=" + Arrays.toString(flightsArray) +
                          '}';
              }

             @Override
                 public boolean equals(Object o) {
                     if (this == o) return true;
                     if (o == null || getClass() != o.getClass()) return false;
                     Airport airport = (Airport) o;
                     return maxFlights == airport.maxFlights && Objects.equals(airportName, airport.airportName) &&
                             Arrays.equals(flightsArray, airport.flightsArray);
                 }

                 @Override
                 public int hashCode() {
                     int result = Objects.hash(airportName, maxFlights);
                     result = 31 * result + Arrays.hashCode(flightsArray);
                     return result;
                 }
                }
                }