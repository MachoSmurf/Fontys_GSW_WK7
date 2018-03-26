package com.company.GameServer;

import com.company.Client.IConsole;

public interface IGameServer {

    /**
     * Endpoint voor console om te verbinden met de gameserver
     *
     * @param console De IConsole die verbinding maakt
     * @return boolean result
     */
    boolean joinGameServer(IConsole console);

    /**
     * Endpoint voor de console om de verbinding te verbreken
     *
     * @param console De IConsole die de verbinding verbreekt
     * @return boolean result
     */
    boolean leaveGameServer(IConsole console);

    /**
     * Data van de gameserver naa de IGameServer
     *
     * @param data data naar de gameserver
     */
    void dataNaarGameServer(byte[] data);
}
