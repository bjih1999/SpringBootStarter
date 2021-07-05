package me.jihyun.springinit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.time.Duration;

@Component
@ConfigurationProperties("jihyun")
@Validated
public class JihyunProperties {

    /*
    @NotEmpty
    값이 비어있을 경우 아래와 같은 에러 메세지 출력

    Description:

    Binding to target org.springframework.boot.context.properties.bind.BindException: Failed to bind properties under 'jihyun' to me.jihyun.springinit.JihyunProperties failed:

        Property: jihyun.name
        Value:
        Origin: class path resource [application.properties] - 2:0
        Reason: 비어 있을 수 없습니다
     */
    @NotEmpty
    private String name;

    private int age;

    private String fullName;

    private Duration sessionTimeout = Duration.ofSeconds(30);

    public Duration getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Duration sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
