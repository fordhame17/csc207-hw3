package partC;



/*
 * The UshahidiEvent class holds information about an event. By utilizing the
 * UshahidiEvent class, external programs can easily create, upload and
 * download events to the Ushahidi website
 */
public class UshahidiEvent
{
  private int eventID;
  public UshahidiUser eventCreator;
  public String eventTitle;
  public String locationName;
  public String eventDescription;
  public Date timeOfEvent;
  public Date respondByDate;
  public int category;
  public int priority;
  public URLString newsSourceLink;
  public URLString externalVideoLink;
  
  //Creates a UshahidiEvent object with an eventCreator
  public UshahidiEvent(UshahidiUser eventCreator)
  {
  }
  
  //Creates a UshahidiEvent object with an eventCreator and a title
  public UshahidiEvent(UshahidiUser eventCreator, String eventTitle)
  {
  }
  
  /*
   * Tries to connect with the server and get a unique user
   * ID assigned to the UshahidiUser object. Returns eventID on
   * success, false otherwise
   */
  public boolean SetEventID(URLString connectionString)
  {
    return 0;
  }
  
  
  /*
   * Returns the current UshahidiEvent's EventID, returns the UshahidiEvent's
   * eventID on success, 0 otherwise
   */
  public int GetEventID()
  {
    return 0;
  }
  
  
  /*
   * Uploads the event in question to Ushahidi, returns true if success,
   * false otherwise. The eventID must be assigned for the method to return true
   */
  public Boolean UploadEvent(URLString connectionString)
  {
    return false;
  }
  
  
  /*
   * Fills the current UshahidiEvent object with information downloaded, 
   * returns true on success
   */
  public Boolean DownloadEvent(URLString connectionString,UshahidiUser eventCreator,String eventTitle)
  {
    return false;
  }
  
  
  /*
   * We return a short summary of the UshahidiEvent Object
   */
  public String toString()
  {
    return "No summary yet";
  }
  
  
  /*
   * We return an array of all UshahidiEvents on  the website created
   * by the same eventCreator as the creator of this object
   */
  public UshahidiEvent[] FindEventsBySameCreator(URLString connectionString)
  {
    return null;
  }
  
}

/*
 * UshahidiUser represents information about a member on Ushahidi 
 */
public class UshahidiUser
{
  private int userID;
  public String userName;
  public Date userJoinDate;
  
  
  /*
   * Creates an empty UshahidiUser object
   */
  public UshahidiUser()
  {
  }
  
  /*
   * Creates a UshahidiUser object with the given data
   */
  public UshahidiUser(String UserName,Date UserJoinDate)
  {
  }
  
  
  /*
   * Tries to connect with the server and get a unique user
   * ID assigned to the UshahidiUser object. Returns the
   * userID on success, 0 otherwise
   * success, false otherwise
   */
  public boolean SetUserID(URLString connectionString)
  {
    return false;
  }
  
  /*
   * Returns the current UshahidiUser's userID, 0 if the user
   * does not have one assigned
   */
  public int GetUserID()
  {
    return 0;
  }
  
  /*
   *Returns users first name 
   */
  public String GetFirstName()
  {
    return "John";
  } // getOwner()
  
  /*
   * Returns users last name
   */
  public String GetLastName()
  {
    return "Doe";
  } // getOwnerName()
}

/*
 * This class holds a geographical location
 */
public class Coordinate
{
  public int Latitude[];
  public int Longitude[];
  
  //Constructs a Coordinate Object
  public Coordinate(int[] Latitude, int[] Longitude)
  {
  }
  
  /*
   * Returns a string representation of the Coordinate object
   */
  public int getString()
  {
    return "A place far far away";
  } // getCoordinate()

}