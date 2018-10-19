package cn.nowdo.springfalsework.system.service.impl;

import cn.nowdo.springfalsework.system.entity.SysUser;
import cn.nowdo.springfalsework.system.mapper.SysUserMapper;
import cn.nowdo.springfalsework.system.service.ISysUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author atang
 * @since 2018-10-19
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
