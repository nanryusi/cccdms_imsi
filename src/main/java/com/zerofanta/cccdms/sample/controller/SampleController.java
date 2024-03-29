package com.zerofanta.cccdms.sample.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zerofanta.cccdms.sample.domain.SampleListDto;
import com.zerofanta.cccdms.sample.domain.SampleVo;
import com.zerofanta.cccdms.sample.domain.SearchDto;
import com.zerofanta.cccdms.sample.service.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by ryusi    on 2021-01-19
 * 샘플컨트롤러
 */
@Controller
@RequestMapping("/sample")
public class SampleController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private SampleService sampleService;

  @RequestMapping("list")
  public ModelAndView list(HttpServletRequest request, SampleVo sVo) throws Exception {
    ModelAndView mv = new ModelAndView();

    //로그 테스트
    logger.debug("디버그");
    logger.info("인포");
    logger.warn("경고");

    //샘플데이터
    sVo.setData01("내용");

    //갯수
    int totCnt = this.sampleService.searchListCnt(sVo);

    //리스트
    List<SampleVo> list = null;
    if (totCnt > 0) {
      list = this.sampleService.searchList(sVo);
    }

    mv.addObject("totCnt", totCnt);
    mv.addObject("list", list);
    mv.addObject("SampleVo", sVo);

    return mv;
  }

  @ResponseBody
  @RequestMapping("/search")
  public SampleListDto search(@RequestBody String jsonStr) throws Exception{
    SampleListDto smpListDto = new SampleListDto();

    ObjectMapper oMapper = new ObjectMapper();
    SearchDto sVo = oMapper.readValue(jsonStr, SearchDto.class);

    logger.debug("str 내용 : "+ jsonStr);
    logger.debug("검색조건 : "+sVo.getSearch_str01());

    SampleVo smpVo = new SampleVo();
    smpVo.setData01(sVo.getSearch_str01());

    //갯수
    smpListDto.setCnt(this.sampleService.searchListCnt(smpVo));

    //리스트
    if (smpListDto.getCnt() > 0) {
      smpListDto.setSmpList(this.sampleService.searchList(smpVo));
    }

    return smpListDto;
  }

}
