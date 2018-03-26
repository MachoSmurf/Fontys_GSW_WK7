package com.company.RegionFinder;

import com.company.GameServer.IGameServer;
import com.company.Shared.EMap;
import com.company.Shared.IFilter;

public interface IServerFinder {
    /**
     * Zoek een gameserver op basis van mapnaam
     *
     * @param mapNaam naam van de map
     * @return IGameServer die gevonden is
     */
    IGameServer zoekGameServerNaam(EMap mapNaam);

    /**
     * Zoek een gameserver op basis van filter
     *
     * @param filter Filter object
     * @return IGameServer die gevonden is
     */
    IGameServer zoekGameServerFilter(IFilter filter);
}
