/**
 * @Company fangyi
 * @Author fangyi
 * @Time 2022年5月5日
 */
package com.hontosec.cloud.vm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hontosec.cloud.common.utils.PageUtils;
import com.hontosec.cloud.common.utils.Result;
import com.hontosec.cloud.vm.entity.DTO.VmTemplateEntityDTO;
import com.hontosec.cloud.vm.entity.VmTemplateEntity;

import java.util.Map;

/**
 * 虚拟机接口层
 * @author fangyi
 *
 */
public interface VmTemplateService extends IService<VmTemplateEntity>{

    /**
     * 添加虚拟机模板
     * @param vmTemplateEntityDTO
     * @return
     */
    void addVmTemplate(VmTemplateEntityDTO vmTemplateEntityDTO) throws Exception;

    /**
     * 修改虚拟机模板
     * @param vmTemplateEntity
     * @return
     */
    void updateVmTemplate(VmTemplateEntity vmTemplateEntity) throws Exception;

    /**
     * 删除虚拟机模板
     * @param vmTemplateId
     * @return
     */
    Result deleteVmTemplateId(Long[] vmTemplateId) throws Exception;

    /**
     * 查询虚拟机模板
     * @param params
     * @return
     */
    PageUtils queryVmTemplate(Map<String, Object> params) throws Exception;


}
