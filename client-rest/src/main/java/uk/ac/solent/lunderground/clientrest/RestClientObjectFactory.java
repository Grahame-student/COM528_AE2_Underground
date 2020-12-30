package uk.ac.solent.lunderground.clientrest;

import uk.ac.solent.lunderground.model.service.DeveloperFacade;
import uk.ac.solent.lunderground.model.service.LundergroundServiceFacade;
import uk.ac.solent.lunderground.model.service.ServiceObjectFactory;
import uk.ac.solent.lunderground.model.service.TicketMachineFacade;

public class RestClientObjectFactory implements ServiceObjectFactory
{
    @Override
    public LundergroundServiceFacade getLundergroundFacade()
    {
        return null;
    }

    @Override
    public DeveloperFacade getDeveloperFacade()
    {
        return null;
    }

    @Override
    public TicketMachineFacade getTicketMachineFacade()
    {
        return new RestServiceFacade();
    }
}
