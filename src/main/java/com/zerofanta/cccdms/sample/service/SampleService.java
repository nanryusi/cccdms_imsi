package com.zerofanta.cccdms.sample.service;

import com.zerofanta.cccdms.sample.domain.SampleVo;

import java.util.List;

/**
 * Created by ryusi    on 2021-01-19
 * 샘플서비스
 */
public interface SampleService {

    int searchListCnt(SampleVo sVo) throws Exception;

    List<SampleVo> searchList(SampleVo sVo) throws Exception;

}
