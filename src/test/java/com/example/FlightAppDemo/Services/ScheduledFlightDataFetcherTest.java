package com.example.FlightAppDemo.Services;

import com.example.FlightAppDemo.DTO.FlightDTO;
import com.example.FlightAppDemo.Repositories.FlightsRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
class ScheduledFlightDataFetcherTest {

    @InjectMocks
    ScheduledFlightDataFetcher service;

    @Mock
    private FlightsRepository flightRepository;

    @Test
    void storeFlightData() throws InterruptedException {
        Thread.sleep(100000);
        service.StoreFlightData();
        verify(flightRepository, atLeast(5)).insertFlight(any(FlightDTO.class));

    }

}