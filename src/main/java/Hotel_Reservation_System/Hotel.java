package Hotel_Reservation_System;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Hotel {
	
    private String hotelName;
    private int weekdayRateForRegular;
    private int weekendRateForRegular;
    private int weekdayRateForReward;
    private int weekendRateForReward;
    private int rating;

    public Hotel(String hotelName, int weekdayRateForRegular, int weekendRateForRegular, int weekdayRateForReward, int weekendRateForReward, int rating) {
        this.hotelName = hotelName;
        this.weekdayRateForReward = weekdayRateForReward;
        this.weekendRateForReward = weekendRateForReward;
      
        this.weekdayRateForRegular = weekdayRateForRegular;
        this.weekendRateForRegular = weekendRateForRegular;
        
        this.rating = rating;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getWeekdayRateForRegular() {
        return weekdayRateForRegular;
    }

    public int getWeekendRateForRegular() {
        return weekendRateForRegular;
    }

    public int getWeekdayRateForReward() {
        return weekdayRateForReward;
    }

    public int getWeekendRateForReward() {
        return weekendRateForReward;
    }

    public int getRating() {
        return rating;
    }
	 	}

