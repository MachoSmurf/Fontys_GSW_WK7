package com.company.GlobalFinder;

import com.company.GameServer.IGameServer;
import com.company.Shared.IFilter;

public interface IGlobalFinder {

    /**
     * Zoek een IGameServer onafhankelijk van regio op basis van filter
     *
     * @param filter IFilter dat gebruikt moet worden om te zoeken
     * @return IGameServer
     */
    IGameServer zoekGameServer(IFilter filter);
}
