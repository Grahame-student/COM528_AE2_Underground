package uk.ac.solent.lunderground;

import uk.ac.solent.lunderground.model.dao.StationDao;
import uk.ac.solent.lunderground.model.dto.Station;
import uk.ac.solent.lunderground.model.service.LundergroundServiceFacade;

import java.util.List;

public final class LundergroundFacade implements LundergroundServiceFacade
{
    /**
     * StationDao instance used to access the database implementation.
     */
    private StationDao stationDao = null;

    /**
     * Set the StationDao instance to use for accessing the database layer.
     * @param newStationDao StationDao instance to set
     */
    public void setStationDao(final StationDao newStationDao)
    {
        this.stationDao = newStationDao;
    }

    /**
     * Get a list of all of the Stations in the London underground system.
     * @return List of Stations
     */
    @Override
    public List<Station> getAllStations()
    {
        return stationDao.retrieveAll();
    }
}
