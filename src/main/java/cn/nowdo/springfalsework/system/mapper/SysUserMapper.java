package cn.nowdo.springfalsework.system.mapper;

import cn.nowdo.springfalsework.system.entity.SysUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author atang
 * @since 2018-10-19
 */
@Mapper
@Service
public interface SysUserMapper extends BaseMapper<SysUser> {

}
