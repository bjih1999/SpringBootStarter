package me.jihyun.springinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringinitApplication {

    public static void main(String[] args) {
        /*
        아래의 코드와
        SpringApplication.run(SpringinitApplication, args) 는 동일하게 동작하지만
        위의 코드는 스프링 부트가 제공하는 커스터마이징 기능을 사용하기 어려움
        따라서, 아래의 예시처럼 사용하는 것이 "best practice"
         */

        /*
        SpringApplicationBuilder로 빌더 패턴 사용 가능
        new SpringApplicationBuilder()
            .sources(SpringinitApplication.class)
            .run(args);
         */
        SpringApplication app = new SpringApplication(SpringinitApplication.class);
//        app.addListeners(new SampleListener());

        app.run(args);



        /*
        Failure Analyzer
        어플리케이션 실행에 실패하였을 때, 에러 메세지를 정돈해서 보여주는 기능으로,
        스프링부트에서 제공하는 몇가지가 있기 때문에 필요하면 등록해서 사용하면 됨됨
        */

        /*
        Banner
        어플리케이션을 실행하였을 때 출력되는 배너를 커스터마이징 가능
        class path 경로에 banner.txt를 생성하여 지정해 줄 수 있으며,
        스프링 부트 버전 명(${spring-boot.version}) 등의 변수를 가져다가 사용할 수 있다.
        banner.txt 파일의 경로는 application.properties에서 재정의 해줄 수 있다.

        또한, banner.txt를 코딩으로 구현하고 싶은 경우 메인 어플리케이션 클래스의 setBanner 메소드를 사용하면 됨
        */
    }
}
