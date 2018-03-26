package com.company.RegionFinder;

import com.company.GameServer.IGameServer;
import com.company.Shared.EMap;
import com.company.Shared.ERegio;

/**
 * Bied gameservers de mogelijkheid zich te registreren bij de zoekmachine
 */
public interface IServerIndex {

    /**
     * Meld de gameserver aan bij de RegionFinder
     *
     * @param gameServer  de IGameServer om aan te melden
     * @param serverRegio de regio waar de server zich bevind
     */
    void meldAan(IGameServer gameServer, ERegio serverRegio);

    /**
     * Meld de gameserver af bij de RegionFinder
     *
     * @param gameServer de IGameServer om af te melden
     */
    void meldAf(IGameServer gameServer);

    /**
     * update de status van de gameserver
     *
     * @param mapNaam             de huidige mapnaam
     * @param spelersAantal       het huidige spelersaantal
     * @param verbindingsSnelheid de huidige verbindingssnelheid
     */
    void updateStatus(EMap mapNaam, int spelersAantal, double verbindingsSnelheid);
}
