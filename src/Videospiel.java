/**
 * {@link Videospiel} ist ein {@link Medium} mit einer zusätzlichen
 * Informationen zum kompatiblen System.
 * 
 * @author SE2-Team
 * @version SoSe 2021
 */
class Videospiel extends AbstractMedium
{
    /**
     * Das System, auf dem das Spiel lauffähig ist
     */
    private String _system;

    /**
     * Initialisiert ein neues Videospiel.
     * 
     * @param titel Der Titel des Spiels
     * @param kommentar Ein Kommentar zum Spiel
     * @param system Die Bezeichnung des Systems
     * 
     * @require titel != null
     * @require kommentar != null
     * @require system != null
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getSystem() == system
     */
    public Videospiel(String titel, String kommentar, String system)
    {
        super(titel, kommentar);
        assert system != null : "Vorbedingung verletzt: system != null";
        _system = system;
    }

    /**
     * Gibt das System zurück, auf dem das Spiel lauffähig ist.
     * 
     * @return Das System, auf dem das Spiel ausgeführt werden kann.
     * 
     * @ensure result != null
     */
    public String getSystem()
    {
        return _system;
    }

    /**
     * Setzt das System neu.
     * 
     * @param system Das neue System
     * 
     * @require system != null
     * @ensure getSystem() == system
     */
    public void setSystem(String system)
    {
        assert system != null : "Vorbedingung verletzt: system != null";
        _system = system;
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "Videospiel";
    }

    @Override
    public String getFormatiertenString()
    {
    	 return super.getFormatiertenString()
    		        + "    System: " + _system + "\n";
    }
    
    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
    	assert mietTage > 0 : "Vorbedingung verletzt : mietTage > 0";
    	return new Geldbetrag(200);
    }
    
}
