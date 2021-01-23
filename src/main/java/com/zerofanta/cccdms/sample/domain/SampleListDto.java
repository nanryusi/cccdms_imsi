package com.zerofanta.cccdms.sample.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by ryusi    on 2021-01-23
 * 샘플 리스트 Dto
 */
@Getter
@Setter
public class SampleListDto {
  private int cnt = 0;
  private List<SampleVo> smpList;
}
