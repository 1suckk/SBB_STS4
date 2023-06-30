#H2 DATABASE 설정을 위한 application.properties
---
#DATABASE
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.datasource.url=jdbc:h2:~/local
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
---
#이렇게 정하고, localhost:8080/h2-console로 진입한다
#그리고 h2 db로 진입 시 오류 나면서 막히는 경우가 발생한다
#1. 그럴 때는 C:\Users\{사용자명} 의 디렉토리에 새로 만들기 후 메모장 하나를 만든다
#2. 그 다음에는, 다른 이름으로 저장하고 local.mv.db로 확장자 변경하기
#3. 그 이후 위의 양시에 맞춰서 로그인 창에 입력하면 들어갈 수 있다.
#!!간혹, 로그인 창에서 org.h2.driver로 적혀있는 경우가 있는데, 대문자 D로 써야 한다.
