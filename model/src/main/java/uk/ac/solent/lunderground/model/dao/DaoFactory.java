package uk.ac.solent.lunderground.model.dao;

public interface DaoFactory
{
    /**
     * Get a reference to a StationDao instance.
     *
     * @return return a concrete instance of a StationDao
     */
    StationDao getStationDao();

    /**
     * Get a reference to a ZoneDao instance.
     *
     * @return return a concrete instance of a ZoneDao
     */
    ZoneDao getZoneDao();

    /**
     * Get a refeernece to a TicketMachineDao instance
     *
     * @return return a concrete instance of a TicketMachineDao
     */
    TicketMachineDao getTicketMachineDao();

    /**
     * Shutdown the DAO Factory safely
     */
    void shutDown();
}
