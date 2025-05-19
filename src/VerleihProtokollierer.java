public class VerleihProtokollierer
{
	public static final String AUSLEIHE = "AUSLEIHE";
	public static final String RUECKGABE = "RUECKGABE";
	
	/*
	 * @param ereignis Das Ereignis
	 * @param verleihkarte die betroffene Verliehkarte
	 * 
	 * @require ereignis != null
	 * @require verleihkarte != null
	 * 
	 */
	
	public static void protokolliere(String ereignis, Verleihkarte verleikarte)
	{
		assert ereignis != null : "Vorbedingung verletzt: ereignis != null";
		assert verleikarte != null : "Vorbedingung verletzt: verleihkarte != null";
		
		 System.out.println("Neuer Protokolleintrag (" + ereignis + "):");
	        System.out.println(verleikarte.getFormatiertenString());
	        System.out.println();

	}
}
