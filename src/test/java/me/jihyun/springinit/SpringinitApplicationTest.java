package me.jihyun.springinit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
class SpringinitApplicationTest {

    @Autowired
    Environment environment;

    /*
    test의 application.properties가 메인 애플리케이션의 application.properties를 오버라이딩하여
    메인 애플리케이션에서 사용되는 속성이 없어진 경우 에러가 발생할 수 있음
        -> test의 applicatin.properties의 이름을 변경하여 @TestPropertiySource(locations=classpath:/파일명)으로 지정
     */
    @Test
    public void ContextLoads() {
        Assertions.assertEquals("jih Byun", environment.getProperty("Jihyun.fullName"));
    }
}