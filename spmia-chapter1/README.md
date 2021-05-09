## MSA basic

### 스프링 부트의 마이크로 서비스 흐름
1. 경로 매핑 - 스프링 부트는 HTTP 요처을 파싱하고 HTTP 동사(verb)와 URL, URL에 정의된 매개변수를 기반으로 경로를 매핑, 경로는 스프링 RestController클래스의 메서드에 매핑
2. 매개변수 분해 - 스프링 부트가 경로를 인식하면 경로 내부에 정의된 매개변수를 작업 수행할 자바 메서드에 매핑
3. JSON -> 자바 객체 매핑 - HTTP PUT이나 POST는 HTTP body에서 전달된 JSON을 자바 클래스에 매핑
4. 비즈니스 로직 실행 - 모든 데이터가 매핑되면 스프링 부트는 비즈니스 로직 실행
5. 자바 -> JSON 객체 매핑 - 비즈니스 로직이 실행되면 스프링 부트는 자바 객체를 JSON으로 변환



