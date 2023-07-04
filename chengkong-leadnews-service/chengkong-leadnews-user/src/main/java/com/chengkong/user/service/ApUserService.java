package com.chengkong.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chengkong.model.common.dtos.ResponseResult;
import com.chengkong.model.user.dtos.LoginDto;
import com.chengkong.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
