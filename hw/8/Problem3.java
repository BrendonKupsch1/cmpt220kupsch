//Brendon Kupsch
//CMPT_220L_202
//Prof. Arias
//HW 8 Problem 3
import java.util.GregorianCalendar;

public static void main(String[] args) {
    List<Flight> flights = new ArrayList<>();
    flights.add(new Flight("US230",
    new GregorianCalendar(2014, 4, 5, 5, 5, 0),
    new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
    flights.add(new Flight("US235",
    new GregorianCalendar(2014, 4, 5, 6, 55, 0),
    new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
    flights.add(new Flight("US237",
    new GregorianCalendar(2014, 4, 5, 9, 35, 0),
    new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
    Itinerary itinerary = new Itinerary(flights);
    System.out.println(itinerary.getTotalTime());
    System.out.println(itinerary.getTotalFlightTime());
    }
    class Flight{

        private String flightNo;
        private GregorianCalendar departureTime;
        private GregorianCalendar arrivalTime;


        //Constructor
        Flight(String SpecNo,GregorianCalendar SpecDtime ,GregorianCalendar SpecAtime ){
            this.flightNo = SpecNo;
            this.departureTime = SpecDtime;
            this.arrivalTime = SpecAtime;
        }
        //Getters
        public String GetFlightNo() {
            return flightNo;
        }
        public GregorianCalendar GetDtime() {
            return departureTime;
        }
        public GregorianCalendar GetAtime() {
            return arrivalTime;
        }

        //setters
        // If we don't use setter the could would still work because we are getting input in constructor with parameters
        public void SetFlightNo(String Number) {
            flightNo = Number;
        }
        public void SetDtime(GregorianCalendar Dtime) {
            departureTime = Dtime;
        }
        public void SetAtime(GregorianCalendar Atime) {
            arrivalTime = Atime;
        }

        public long getTimeinMillis() {
                return (arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis());
                }
                // getFlightTime method
                public long getFlightTime() {
                return getTimeinMillis() / (60 * 1000);
                }
            }