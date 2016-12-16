package hasancanzubaroglu.firebasedemo;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Belal on 2/23/2016.
 */
@IgnoreExtraProperties
public class User
{
    //name and address string
    private String name;
    private String surname;

    public User() {
      /*Blank default constructor essential for Firebase*/
    }
    //Getters and setters


    public User(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }
}