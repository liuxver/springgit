package com.liuxv.twoshou.controller;

import com.liuxv.twoshou.po.Talks;
import com.liuxv.twoshou.po.User;
import com.liuxv.twoshou.service.TalksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

/**
 * created by liuxv on 2018/5/28
 * email:liuxver444@gmail.com
 * qq:1369058574
 */

@Controller
@RequestMapping("/talks")
public class TalksController {

    static int num=188;
    @Autowired
    private TalksService talksService;

    @RequestMapping("/showTalks")
    public String showTalks(Model model){
        List<Talks> talksList=talksService.getAllTalks();
        model.addAttribute( "talksList",talksList );
        return "talks/showTalks";
    }


    @RequestMapping("/showTalksUser")
    public String showTalksUser(String uname, Model model){
        List<Talks> talksList=talksService.getAllTalks();
        for(int i=0;i<talksList.size();i++){
            System.out.println( talksList.get( i ).getId()+" "+talksList.get( i ).getWords() );
        }
        model.addAttribute( "talksList",talksList );
        model.addAttribute( "uname",uname );
        return "talks/showTalksUser";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("id") Integer id,Model model){
        talksService.deleteTalks( id );
        List<Talks> talksList=talksService.getAllTalks();
        for(int i=0;i<talksList.size();i++){
            System.out.println( talksList.get( i ).getId()+" "+talksList.get( i ).getWords() );
        }
        model.addAttribute( "talksList",talksList );
        //model.addAttribute( "uname",uname );
        return "talks/showTalks";
    }


    @RequestMapping("/addTalks")
    public String addTalks(@RequestParam("uname") String uname,Talks talks,Model model){
        Date date=new Date(  );
        num++;
        String s=date.toString();
        talks.setId( num );
        talks.setDate( s );
        System.out.println( s );
        System.out.println( uname );
        talks.setTalkerName( uname);
        //Talks talks=new Talks(num,user.getName(),s,words);
        talksService.insert( talks );
        List<Talks> talksList=talksService.getAllTalks();
        for(int i=0;i<talksList.size();i++){
            System.out.println( talksList.get( i ).getId()+" "+talksList.get( i ).getWords() );
        }
        model.addAttribute( "talksList",talksList );
        model.addAttribute( "uname",uname );
        return "talks/showTalksUser";
    }


}
