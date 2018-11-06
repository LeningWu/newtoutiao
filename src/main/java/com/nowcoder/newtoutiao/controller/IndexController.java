package com.nowcoder.newtoutiao.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    //实现首页的函数
    @RequestMapping(path = {"/","/index"})  //给定url
    @ResponseBody
    public String index(){
        return "hello nowercode";
    }

    //用户个人信息
    @RequestMapping(value = {"/profile/{groupId}/{userId}"}) //path和value一样，都是在url中体现
    @ResponseBody
    public String profile(@PathVariable("groupId") String groupId, //path中的变量
                          @PathVariable("userId") int userId,
                          @RequestParam(value = "type",defaultValue = "1")int type,
                          @RequestParam(value = "key",defaultValue = "nowcoder")String key){
        return String.format("GID{%s},UID{%d},TYPE{%d},KEY{%s}",groupId,userId,type,key);
    }

    @RequestMapping(value ={"/vm"})
    public String news(){
        return "news";
    }
}
