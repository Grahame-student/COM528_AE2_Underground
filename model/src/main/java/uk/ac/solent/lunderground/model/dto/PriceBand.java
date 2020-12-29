package uk.ac.solent.lunderground.model.dto;

public class PriceBand
{
    /**
     * The minimum allowable hour value.
     */
    private static final int HOUR_MIN = 0;
    /**
     * The maximum allowable hour value.
     */
    private static final int HOUR_MAX = 23;

    /**
     * The minimum allowable minute value.
     */
    private static final int MINUTE_MIN = 0;
    /**
     * The maximum allowable minute value.
     */
    private static final int MINUTE_MAX = 59;

    /**
     * The number of minutes in an hour.
     */
    private static final int MINUTES_IN_HOUR = 60;

    /**
     * The hour that this pricing band ends.
     */
    private int hour = HOUR_MIN;
    /**
     * The minute that this pricing band ends.
     */
    private int minute = MINUTE_MIN;
    /**
     * The pricing band rate to apply.
     */
    private Rate pricingRate = Rate.OffPeak;

    /**
     * Get the hour that this pricing band ends at.
     * @return the hour that this pricing band ends at
     */
    public int getHour()
    {
        return hour;
    }

    /**
     * Set the hour that this pricing band ends at.
     * @param endHour the hour that this pricing band ends at
     */
    public void setHour(int endHour)
    {
        if (endHour < HOUR_MIN || endHour > HOUR_MAX)
        {
            String message = "endHour out of bounds: " + endHour
                           + "\nendHour must be between " + HOUR_MIN + " and " + HOUR_MAX + " inclusive";
            throw new IllegalArgumentException(message);
        }
        this.hour = endHour;
    }

    /**
     * Get the minutes that this pricing band ends at.
     * @return the minutes that this pricing band ends at
     */
    public int getMinute()
    {
        return minute;
    }

    /**
     * Set the minutes that this pricing band ends at.
     * @param endMinute the minutes that this pricing band ends at
     */
    public void setMinute(int endMinute)
    {
        if (minute < MINUTE_MIN || minute > MINUTE_MAX)
        {
            String message = "endMinute out of bounds: " + endMinute
                             + "\nendMinute must be between " + MINUTE_MIN + " and " + MINUTE_MAX + " inclusive";
            throw new IllegalArgumentException(message);
        }
        this.minute = endMinute;
    }

    /**
     * The pricing Rate to be applied to this band.
     * @return The Rate to apply to this band
     */
    public Rate getPricingRate()
    {
        return pricingRate;
    }

    /**
     * Set the Rate to be applied to this band.
     * @param pricingRate the Rate to apply to this band
     */
    public void setPricingRate(Rate pricingRate)
    {
        this.pricingRate = pricingRate;
    }

    /**
     * The total number of minutes since midnight.
     * @return the total number of minutes since midnight.
     */
    public int getTimeInMinutes()
    {
        return (hour * MINUTES_IN_HOUR) + minute;
    }

    @Override
    public String toString()
    {
        return "PriceBand{" + "hour=" + hour + ", minute=" + minute + ", pricingRate=" + pricingRate + "}";
    }
}