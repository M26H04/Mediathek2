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

    @Override
    public String getTitel()
    {
        return _titel;
    }

    @Override
    public void setTitel(String titel)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        _titel = titel;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    @Override
    public void setKommentar(String kommentar)
    {
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        _kommentar = kommentar;
    }

    @Override
    public abstract String getFormatiertenString();

    @Override
    public abstract String getMedienBezeichnung();
}