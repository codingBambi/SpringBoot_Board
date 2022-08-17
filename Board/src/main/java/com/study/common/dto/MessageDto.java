package com.study.common.dto;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor		//전체 멤버 변수를 필요로 하는 생성자 생성
public class MessageDto {
	
	private String message;				//사용자에게 전달할 메시지
	private String redirectUri;			//리다이렉트 URI
	private RequestMethod method;		//HTTP 요청 메서드		
	//RequestMethod는 spring-web 라이브러리에 포함되어 있는 enum 클래스
	private Map<String, Object> data;	//화면(View)으로 전달할 데이터(파라미터)

}
