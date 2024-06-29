/**
 * @Company fangyi
 * @Author fangyi
 * @Time 2022年5月5日
 */
package com.hontosec.cloud.alarm.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hontosec.cloud.alarm.entity.AlarmEntity;
/**
 * 告警dao
 * @author fangyi
 *
 */
@Mapper
public interface AlarmDao extends BaseMapper<AlarmEntity>{

}
