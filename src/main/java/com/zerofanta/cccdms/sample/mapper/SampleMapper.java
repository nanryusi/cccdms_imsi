package com.zerofanta.cccdms.sample.mapper;

import com.zerofanta.cccdms.sample.domain.SampleVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ryusi    on 2021-01-19
 * 샘플매퍼
 */
@Repository
@Mapper
public interface SampleMapper {

    int selectListCnt(SampleVo sVo) throws Exception;

    List<SampleVo> selectList(SampleVo sVo) throws Exception;
}
