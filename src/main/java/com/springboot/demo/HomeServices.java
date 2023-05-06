package com.springboot.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class HomeServices {

    private List<Home> basicDetail = new ArrayList<Home>(

            Arrays.asList(

                    new Home("Java","Spring boot","All Spring boot"),
                    new Home("React","React JS","All React JS")

                    )
    );

    public List<Home> getList(){
        return basicDetail;
    }


    public Home getDataById(String id){
        Home mylist = null;
        mylist = basicDetail.stream().filter(ob ->ob.getId().equals(id)).findFirst().get();
        return mylist;
    }




}
