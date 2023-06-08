package cloneWebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
//이 어노테이션이 있는 위치부터 설정을 읽어나가기 때문에, 이 클래스는 항상 프로젝트의 최상단에 위치해야만 한다.

@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //main 메소드에서 실행하는 SpringApplication.run 으로 인해 내장 WAS를 실행한다.
        //내장 WAS란 별도로 외부에 WAS를 두지 않고 애플리케이션을 실행할 때 내부에서 WAS를 실행하는 것을 이야기한다.
        SpringApplication.run(Application.class, args);
    }
}
