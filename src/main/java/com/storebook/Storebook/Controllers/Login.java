package com.storebook.Storebook.Controllers;

import com.storebook.Storebook.loggers.LoggerInterface;
import com.storebook.Storebook.models.User;
import org.springframework.web.bind.annotation.*;



@CrossOrigin
@RestController
public class Login implements LoggerInterface{

    @PostMapping("/login")
    public User auth(@RequestBody User user)  {
        LoggerInterface.getLogger("AuthorController").log(DIAG,"Auth @CrossOrigin" + user.toString());
        return user;
    }


}
