package com.zerofanta.cccdms.sample.service;

import com.zerofanta.cccdms.sample.domain.SampleVo;
import com.zerofanta.cccdms.sample.mapper.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ryusi    on 2021-01-19
 * 샘플서비스 구현체
 */
@Service
@Transactional
public class SampleServiceImpl implements SampleService{

    @Autowired
    private SampleMapper sampleMapper;

    @Override
    public int searchListCnt(SampleVo sVo) throws Exception {
        return sampleMapper.selectListCnt(sVo);
    }

    @Override
    public List<SampleVo> searchList(SampleVo sVo) throws Exception {
        return sampleMapper.selectList(sVo);
    }
}
