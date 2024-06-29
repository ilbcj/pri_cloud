/**
 * @Company fangyi
 * @Author fangyi
 * @Time 2022年5月5日
 */

package com.hontosec.cloud.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hontosec.cloud.common.utils.Result;
import com.hontosec.cloud.sys.entity.SysUserTokenEntity;

/**
 * 用户Token
 *
 * @author fangyi
 */
public interface SysUserTokenService extends IService<SysUserTokenEntity> {

	/**
	 * 生成token
	 * @param userId  用户ID
	 */
	Result createToken(long userId);

	/**
	 * 退出，修改token值
	 * @param userId  用户ID
	 */
	void logout(long userId);

}
