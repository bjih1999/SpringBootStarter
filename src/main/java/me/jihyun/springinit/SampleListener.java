package me.jihyun.springinit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*
ApplicationStartingEvent
    - 어플리케이션 컨텍스트가 생성되기 전에 발생하는 이벤트
    - 따라서, 리스너를 Bean으로 설정해놓은 경우 실행이 되지 않음
    - 이럴 경우 메인 어플리케이션에 직접 동록을 해주어야함
 */

/*
@Component // Bean으로 등록하는게 의미가 없음
public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {
    
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("======================");
        System.out.println("Application is stating");
        System.out.println("======================");
    }
}
 */




/*
ApplicationStartedEvent
    - 애플리케이션 컨텍스트가 생성된 후 발생하는 이벤트
    - Bean으로 등록해두면 알아서 실행됨
 */

/*
@Component
public class SampleListener implements  ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("=================");
        System.out.println("Started");
        System.out.println("=================");
    }
}
 */




/*
메인 애플리케이션의 인자를 확인

    p.s Bean으로 등록된 클래스의 생성자의 인자가 Bean일 경우 자동으로 주입시켜 줌
 */

/* @Component
public class SampleListener{
    public SampleListener(ApplicationArguments arguments){
        System.out.println("foo: " + arguments.containsOption("foo"));
        System.out.println("bar: " + arguments.containsOption("bar"));
    }
}
 */


/*
ApplicationRunner
    - 애플리케이션을 실행한 뒤 뭔가 실행하고 싶을 때
    - ApplicationRunner를 implements한 뒤, run을 오버라이딩
    - 순서를 지정해주고 싶은 경우 order 지정 가능
 */
/*
public class SampleListener implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("foo: " + args.containsOption("foo"));
        System.out.println("bar: " + args.containsOption("bar"));
    }
}
 */

/*
CommandlineRunner
    - 커맨드의 인자를 가져오고 싶을 경우 사용하는 인터페이스
 */
///*public class SampleListener implements CommandLineRunner {
//    @Override
//    public void run(String... args) throws Exception {
//        Arrays.stream(args).forEach(System.out::println);
//    }
//}
//
// */


