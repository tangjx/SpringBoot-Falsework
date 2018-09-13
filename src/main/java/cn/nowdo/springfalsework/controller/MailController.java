package cn.nowdo.springfalsework.controller;

import cn.nowdo.springfalsework.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("mail/")
public class MailController {
    @Autowired
    MailService mailService;
    @RequestMapping("send")
    @ResponseBody
    public String sendMail(@RequestParam String sendto, @RequestParam String content) {
        System.out.println("send mail, sendto:" + sendto + ",content:" + content);
        mailService.sendSimpleMail();
        return "ok";
    }
}
