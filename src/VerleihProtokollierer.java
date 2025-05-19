import java.io.FileWriter;
import java.io.IOException;

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
		
		 //System.out.println("Neuer Protokolleintrag (" + ereignis + "):");
	        //System.out.println(verleikarte.getFormatiertenString());
	      //  System.out.println();
		
		//FileWriter writer = new FileWriter("verleihprotokoll.txt", true);
       // writer.write(">>> Protokolleintrag (" + ereignis + "):\n");
       // writer.write(verleikarte.getFormatiertenString() + "\n\n");
       // writer.close();
		
		 try
	        {
	            FileWriter writer = new FileWriter("Protokolle/verleihprotokoll.txt", true);
	            writer.write(">>> Protokolleintrag (" + ereignis + "):\n");
	            writer.write(verleikarte.getFormatiertenString() + "\n\n");
	            writer.close();
	        }
	        catch (IOException e)
	        {
	            System.err.println("Fehler:" + e.getMessage());
	        }
	    }

	
}
