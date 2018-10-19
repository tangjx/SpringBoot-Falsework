package cn.nowdo.springfalsework.system.web;


import cn.nowdo.springfalsework.system.entity.SysUser;
import cn.nowdo.springfalsework.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author atang
 * @since 2018-10-19
 */
@Controller
@RequestMapping("/sys_user")
public class SysUserController {
    @Autowired
    ISysUserService sysUserService;

    @RequestMapping("test")
    public String test() {
        SysUser user = new SysUser();
//        user.setId(1);
        user.setLogin_id("admin");
        user.setPassword("123456");
        user.setNick_name("admin");
        sysUserService.insert(user);
        return "index";
    }
}
