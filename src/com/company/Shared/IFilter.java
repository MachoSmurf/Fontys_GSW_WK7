package com.company.Shared;

public interface IFilter {

    /**
     * Naam van de map die gezocht wordt
     *
     * @return EMap map enum
     */
    EMap getMapNaam();

    /**
     * Maximaal aantal spelers dat in de server mag zitten
     *
     * @return interger met aantal spelers
     */
    int getMaxSpelers();

    /**
     * Maximale snelheid die server heeft
     *
     * @return double snelheid van de server
     */
    double getMaxSnelheid();
}
