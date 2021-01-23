/**
 *  샘플 리스트 화면 관련 js
 **/

/** 공통변수 선언 start **/
//검색 오브젝트
let SearchDto = {search_str01: "", search_str02: ""};
//샘플 인덱스
let vSmp_idx = -1;
//샘플 리스트 카운트
let vSmp_list_cnt = -1;


/** 공통변수 선언 end **/

const fn_smp_list = {

  //온클릭 이벤트
  ev_onclick(){
    switch (this.id){
      case 'search' :
              fn_search()
        break;

      default : break;
    }
  }


}



/** 이벤트 **/
function fn_event(){
  /**이벤트 발생 객체 선언**/
  let vSearch = document.getElementById("search");

  /** 이벤트 리스너 **/
  //검색버튼 클릭
  vSearch.addEventListener('click', fn_smp_list.ev_onclick);
}


/** 검색 이벤트 ajax 통신 **/
async function fn_search() {
  //검색설정
  let searchTxt = document.getElementsByName("s_con");
  SearchDto.search_str01 = searchTxt[0].value;

  //통신설정
  let url = //document.location.href+"/search";  //todo 처음화면이 list라서 생긴 문제 나중에 list를 수정해야 함
      "http://localhost:8080/sample/search";
  let options = {
    method: 'POST'
    , mode: 'cors'
    , header: {
       'Accept': 'application/json'
      ,'Content-Type': 'application/json;charset=UTF-8'
    }
    , body: JSON.stringify(SearchDto)
  };
  let response = await fetch(url, options);
  let responseOK = response && response.ok;
  if (responseOK) {
    let data = await response.json();
    document.getElementsByName("result_cnt")[0].value = data.cnt;

  }
}


//onload
window.addEventListener('load', function(){
  fn_event();
});