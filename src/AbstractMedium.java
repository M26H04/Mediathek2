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

    public String getTitel()
    {
        return _titel;
    }

    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }

    public String getKommentar()
    {
        return _kommentar;
    }

    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }

    public String getFormatiertenString()
    {
        return getMedienBezeichnung() + ":\n" + "    Titel: " + _titel + "\n"
                + "    Kommentar: " + _kommentar + "\n";
    }

    public abstract String getMedienBezeichnung();

    @Override
    public Geldbetrag berechneMietgebuehr(int mietTage)
    {
        assert mietTage > 0 : "Vorbedingung verletzt: mietTage > 0";
        return new Geldbetrag(mietTage * 300);
    }

}