//the input type of the launch configuration does not exist라는 에러가 뜨는 건에 대하여
//원인: sbbApplicationTest를 진행할 때 JUnit test 진행시 위와 같은 메시지가 뜬다.

//문제의 코드
package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbAplicationTests{
	@Autowired
	private QuestionService questionService;
	
	@Test
	void testJPA() {
		for (int i=1; i<=300; i++) {
			String subject = String.format("[%03d]번째 테스트입니다.", i);
			String content = "냉무";
			this.questionService.create(subject, content, null);
		}
	}
}

//원인: 처음에 테스트를 SbbApplicationTests로 이름을 정했는데 어느 순간 SbbAplication으로 바뀌어져 있었디.
//이름이 바뀌어 있어도 이클립스 상에서는 오류가 뜨지 않아 철자의 오류라는 생각은 못했는데 바꾸고 테스트 진행해 보니 해결되어 있다.
