import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Provide a simple demonstration of the AddressBook class.
 * Sample data is added to the address book,
 * and a text interface is provided.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class AddressBookDemo
{
    private AddressBook book;
    private AddressBookTextInterface interaction;
    ContactDetails[] sampleDetails=new ContactDetails[100];
    int i=0;
    /**
     * Setup an AddressBook with sample data.
     * The address book is passed to a GUI to provide
     * a view of the data.
     */
    public AddressBookDemo()throws FileNotFoundException
    {
        Scanner sc =new Scanner(new File("C:\\Users\\user\\workspace\\HW8\\list.txt"));
        while(sc.hasNextLine()){
        	String s=sc.nextLine();
        	String[] cmds =s.split(",");
        	sampleDetails[i]=new ContactDetails(cmds[0],cmds[1],cmds[2]);
        	i++;
        }
    }

    /**
     * Allow the user to interact with the address book.
     */
    public void showInterface()
    {
        interaction.run();
    }

    /**
     * @return The sample address book.
     */
    public AddressBook getBook()
    {
        return book;
    }
}
