package Hotel_Reservation_System;

import org.junit.Assert;
import org.junit.Test;

public class HotelTest {

    @Test
    public void givenHotelNameAndTheirRate_ShouldReturnTrue() {
        Hotel hotel1=new Hotel("Lakewood", 110,90,80,80,3);
        
        Hotel hotel2=new Hotel("Bridgewood",160,50,110,50,4);
        
        Hotel hotel3=new Hotel("Ridgewood",220,150,100,40,5);
        
        boolean result = (hotel1.getWeekdayRateForRegular() == 110) && (hotel1.getWeekendRateForRegular() == 90)
                && (hotel1.getWeekdayRateForReward() == 80) && (hotel1.getWeekendRateForReward() == 80)
                && (hotel1.getRating() == 3);
        Assert.assertTrue(result);
    
        boolean result1 = (hotel2.getWeekdayRateForRegular() == 160) && (hotel2.getWeekendRateForRegular() == 50)
                && (hotel2.getWeekdayRateForReward() == 110) && (hotel2.getWeekendRateForReward() == 50)
                && (hotel2.getRating() == 4);
        Assert.assertTrue(result1);
    
        boolean result2 = (hotel3.getWeekdayRateForRegular() == 220) && (hotel3.getWeekendRateForRegular() == 150)
                && (hotel3.getWeekdayRateForReward() == 100) && (hotel3.getWeekendRateForReward() == 40)
                && (hotel3.getRating() == 5);
        Assert.assertTrue(result2);
    

      }
}
