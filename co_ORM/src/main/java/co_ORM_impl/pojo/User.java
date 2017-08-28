package co_ORM_impl.pojo;

import lombok.Data;
import java.util.Calendar;

@Data
public class User {

    private  int id;
    private String login;
    private String password;
    private String name;
    private Calendar birthday;


}


