import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Kerly Titus
 */
public class comp346pa1driver {

    /** 
     * main class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	 /*******************************************************************************************************************************************
    	  * TODO : implement all the operations of main class   																					*
    	  ******************************************************************************************************************************************/
    	
    	PrintStream out = System.out;
		try {
			out = new PrintStream(new FileOutputStream("output.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.setOut(out);
    	
    	
    	Network objNetwork = new Network("network");            /* Activate the network */
        objNetwork.start();
        Server objServer = new Server();                        /* Start the server */ 
        objServer.start();
        Client objClient1 = new Client("sending");              /* Start the sending client */
        objClient1.start();
        Client objClient2 = new Client("receiving");            /* Start the receiving client */
        objClient2.start();
    }
}
