abstract class AbstractMedium implements Medium
{
    private String _titel;
    private String _kommentar;

    public AbstractMedium(String titel, String kommentar)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _titel = titel;
        _kommentar = kommentar;
    }

    /*
     * @return titel ist ein Titel
     * 
     */
    public String getTitel() // titelv2
    {
        return _titel;
    }
    
    /*
     * @param titel ist ein Titel
     * @require titel != null
     * 
     */
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }
    
    /*
     * @return kommentar ist ein Kommentar
     * 
     */
    public String getKommentar()
    {
        return _kommentar;
    }
    
    /*
     * @param kommentar schreibe ein Kommentar
     * @require kommentar != null
     * 
     */
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }

    /*
     * @return gibt Info über Medium als String aus
     * 
     */
    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + "    Titel: " + _titel + "\n"
                + "    Kommentar: " + _kommentar + "\n";
    }

    /*
     * @return Medienbezeichnung
     * 
     */
    public abstract String getMedienBezeichnung();

    /*
     * @require  mietTage > 0 
     * @return Geldbetrag geld
     * @param mietTage tage
     * 
     */
    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
        assert mietTage > 0 : "Vorbedingung verletzt: mietTage > 0";
        return new Geldbetrag(mietTage * 300);
    }

}