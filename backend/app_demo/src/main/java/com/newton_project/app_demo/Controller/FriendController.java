package com.newton_project.app_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.newton_project.app_demo.Model.*;

@RestController
@RequestMapping("/api/twitter")
public class FriendController {
    
    private List<Friend> friends;

    public FriendController() {
        friends = new ArrayList<>();
        
        friends.add(new Friend("noobde", "Ed Boon"));
        friends.add(new Friend("realDonaldTrump", "Donald J. Trump"));
        friends.add(new Friend("MKBHD", "Marques Brownlee"));
        friends.add(new Friend("theMrMobile", "Michael Fisher"));
        friends.add(new Friend("jordanbpeterson", "Dr Jordan B Peterson"));
    }

    @GetMapping()
    public List<Friend> allFriends(){
        return friends;
    }

    @GetMapping("/{id}")
    public Friend getById(@PathVariable String id){
        return friends.stream().filter(friend -> id.equals(friend.getId()) ).findAny().orElse(null); //Class to search through an arraylist


    }

}