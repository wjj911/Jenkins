package com.dj.wj.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName : UserPageController  //类名
 * @Author : WJ  //作者
 * @Date: 2020-11-03 22:52  //时间
 */
@RequestMapping("/user/")
@Controller
public class UserPageController {

    @RequestMapping("toTest")
    public String toTest()throws Exception{
        return "test/test";
    }
}
