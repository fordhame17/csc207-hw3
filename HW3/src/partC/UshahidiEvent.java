package partC;

public class UshahidiEvent
{
  private UshahidiUser eventCreator;
  public String eventTitle;
  public String locationName;
  public String eventDescription;
  public Date timeOfEvent;
  public Date respondByDate;
  public int category;
  public int priority;
  public URLString newsSourceLink;
  public URLString ExternalVideoLink;
  
  /**
   * Get the title of the event
   */
  public String getEventTitle()
  {
    return null;
  } // getEventTitle()
  
  
  
  /**
   * Get the name of the location
   */
  public String getLocationName()
  {
    return null;
  } // getLocationName()
  
  /**
   * Get the description of the event
   */
  public String getDescription()
  {
    return null;
  } // getDescription()
  
  /**
   * Get the date and time of the event
   */
  public Date getDateAndTimeOfEvent()
  {
    return null;
  } // getDateAndTimeOfEvent()
  
  /**
   * Get the desired respond by date
   */
  public Date getRespondByDate()
  {
    return null;
  } // getRespondByDate()
  
  /**
   * Get the category of the event
   */
  public Int getCategory()
  {
    return null;
  } // getCategory()
  
  /**
   * Get the priority of the event
   */
  public Int getPriority()
  {
    return null;
  } // getPriority()
  
  /**
   * Get the soruce link for news
   */
  public URLString getNewsSourceLink()
  {
    return null;
  } // getNewsSourceLink()
  
  /**
   * Get the link for a video
   */
  public URLString getExternalVideoLink()
  {
    return null;
  } // getExternalVideoLink()
}

/**
 * Get the user name/info
 */
public class UshahidiUser
{
  private String UserName;
  private Date UserJoinDate;
  
  /**
   * Get the owner of this resource.
   */
  public UshahidiUser getOwner()
  {
    return null;
  } // getOwner()
  
  /**
   * Get the name of the owner of this resource.
   */
  public String getOwnerName()
  {
    return "Ryan Smith";
  } // getOwnerName()
}

/**
 * This class holds a geographical location
 */
public class Coordinate
{
  private int Latitude[];
  private int Longitude[];
  /**
   * Get the latitude
   */
  public int getLatitude()
  {
    return null;
  } // getCoordinate()
  /**
   * Get the longitude
   */
  public int getLongitude()
  {
    return null;
  } // getCoordinate()
}