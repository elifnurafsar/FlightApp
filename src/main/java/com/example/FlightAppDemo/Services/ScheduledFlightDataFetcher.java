package com.example.FlightAppDemo.Services;

import com.example.FlightAppDemo.DTO.FlightDTO;
import com.example.FlightAppDemo.Repositories.FlightsRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Service
public class ScheduledFlightDataFetcher {
    private final FlightsRepository flightRepository;

    // These values are necessary for our FetchFlightData function that simulates fetching data from an API by generating mock data
    private Set<String> generatedFlightNumbers = new HashSet<>();
    private String[] cities = {
            "Abu Dhabi", "Algiers", "AlUla", "Amsterdam", "Antananarivo", "Astana", "Athens", "Bangalore", "Bangkok", "Barcelona",
            "Beijing", "Berlin", "Bern", "Bogota", "Brussels", "Bucharest", "Budapest", "Buenos Aires", "Cairo", "Cape Town", "Caracas",
            "Casablanca", "Chicago", "Copenhagen", "Dakar", "Delhi", "Doha", "Dubai", "Dublin", "Frankfurt", "Geneva", "Guangzhou", "Hanoi",
            "Helsinki", "Ho Chi Minh City", "Hong Kong", "Houston", "Istanbul", "Jakarta", "Johannesburg", "Karachi",
            "Kiev", "Kolkata", "Kuala Lumpur", "Kuwait City", "Lagos", "Lahore", "Lima", "Lisbon", "London", "Los Angeles", "Luxembourg",
            "Lyon", "Madrid", "Manama", "Manila", "Medinah", "Melbourne", "Mexico City", "Miami", "Milan", "Monaco", "Montreal",
            "Moscow", "Mumbai", "Munich", "Ankara", "Nagoya", "Nairobi", "New York City", "Osaka", "Oslo", "Panama City", "Paris",
            "Prague", "Quito", "Rio de Janeiro", "Riyadh", "Rome", "Saint Petersburg", "San Francisco", "Santiago", "Sao Paulo", "Seoul",
            "Shanghai", "Shenzhen", "Singapore", "Stockholm", "Port Moresby", "Sydney", "Taipei", "Tehran", "Tel Aviv", "Tianjin", "Tokyo",
            "Toronto", "Manchester", "Vancouver", "Venice", "Vienna", "Las Vegas", "Warsaw", "Irkutsk", "Windhoek", "Zurich"
    };


    public ScheduledFlightDataFetcher(FlightsRepository _flightRepository) {
        this.flightRepository = _flightRepository;
    }

    // This funct runs every day at midnight
    @Scheduled(cron = "0 0 0 * * *")
    //@Scheduled(fixedRate = 120000, initialDelay = 30000)
    public void StoreFlightData() throws InterruptedException {
        List<FlightDTO> flights = FetchFlightData();

        for (FlightDTO flight : flights) {
            //TimeUnit.SECONDS.sleep(5);
            flightRepository.insertFlight(flight);
            TimeUnit.SECONDS.sleep(5);
        }
    }

    // Example Mock API that creates 5 flight object daily.
    private List<FlightDTO> FetchFlightData() {
        List<FlightDTO> flights = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            List<Integer> selectedCities = GenerateCities();
            String departure = cities[selectedCities.get(0)];
            String destination = cities[selectedCities.get(1)];

            Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());

            Timestamp departureTimestamp = addRandomHours(currentTimestamp, 36, 58);
            Timestamp arrivalTimestamp = addRandomHours(departureTimestamp, 1, 36);

            double minPrice = 500.00;
            double maxPrice = 2000.00;
            double randomPrice = minPrice + Math.random() * (maxPrice - minPrice);
            randomPrice = BigDecimal.valueOf(randomPrice)
                    .setScale(2, RoundingMode.HALF_UP)
                    .doubleValue();
            String flightNumber;
            do {
                flightNumber = GenerateFlightNumber();
            } while (generatedFlightNumbers.contains(flightNumber));

            generatedFlightNumbers.add(flightNumber);

            FlightDTO flight = new FlightDTO();
            flight.setFlight_number(flightNumber);
            flight.setPlace_of_departure(departure);
            flight.setDestination(destination);
            flight.setDeparture_time(departureTimestamp);
            flight.setArrival_time(arrivalTimestamp);
            flight.setPrice(randomPrice);
            flights.add(flight);
        }

        return flights;
    }

    private String GenerateFlightNumber(){
        Random random = new Random();
        char letter1 = (char) ('A' + random.nextInt(26));
        char letter2 = (char) ('A' + random.nextInt(26));
        int number = 1 + random.nextInt(9999);
        return "" + letter1 + letter2 + number;
    }

    private List<Integer> GenerateCities(){
        List<Integer> selectedCities = new ArrayList<>();
        Random random = new Random();
        int firstIndex = random.nextInt(cities.length);
        int secondIndex = random.nextInt(cities.length);
        while (firstIndex == secondIndex) {
            secondIndex = random.nextInt(cities.length);
        }
        selectedCities.add(firstIndex);
        selectedCities.add(secondIndex);
        return selectedCities;
    }

    private static Timestamp addRandomHours(Timestamp timestamp, int min, int max) {
        Instant instant = timestamp.toInstant();

        long randomHours = ThreadLocalRandom.current().nextLong(min, max + 1);
        long randomDuration = randomHours * 3600;

        Instant newInstant = instant.plus(randomDuration, ChronoUnit.SECONDS);
        return Timestamp.from(newInstant);
    }
}
