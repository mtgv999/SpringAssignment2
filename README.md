# 예약 앱

### 상세정보
1. 소비자 - 계정을 만들고, 정보를 가져올 수 있고, 수정할 수 있고, 삭제할 수 있고,
소비자의 ID, PW를 집어 넣음으로써 로그인 가능한 지의 여부를 확인할 수 있음. 
예약을 할 수도 있고, 사용 여부 역시 바꿀 수 있고, 
2. 리뷰를 사용할 수 있고, 리뷰를 바꾸거나 삭제할 수도 있음.

2. 점장(판매자) - 계정을 만들고, 정보를 가져올 수 있고, 수정할 수 있고, 삭제할 수 있고,
점장의 ID, PW를 집어 넣음으로써 로그인 가능한 지의 여부를 확인할 수 있음.

3. 상점 - 계정을 만들고, 정보를 가져올 수 있고, 수정할 수 있고, 삭제할 수 있다.
점장의 ID, PW를 집어 넣음으로써 로그인 가능한 지의 여부를 확인할 수 있음.

4. 예약 - 예약을 만들고, 정보를 가져올 수 있고, 수정할 수 있고, 
삭제할 수 있음 (오류 때문에 작동이 안 됨)
소비자의 ID, PW를 집어 넣음으로써 로그인 가능한 지의 여부를 확인할 수 있음.

5. 리뷰 - 리뷰를 만들고, 정보를 가져올 수 있고, 수정할 수 있고, 삭제할 수 있음.
소비자의 ID, PW를 집어 넣음으로써 로그인 가능한 지의 여부를 확인할 수 있음.
점장의 ID, PW를 집어 넣음으로써 로그인 가능한 지의 여부를 확인할 수 있음.

### build.gradle
Spring Web, Spring Data JPA, H2 Database, Lombok, Validation
### 기술 스택
Java, Spring, H2 Database
### ERD
[3] <img width="850" alt="스크린샷 2024-05-06 오후 9 05 59" src="https://github.com/mtgv999/SpringAssignment2/assets/149506393/8ab314b6-e318-415a-ab10-b3bfa2a334c7">
### 출처
[1] 미상, 제로베이스 - Part3._예제를 통해 학습하는 스프링(Java)_Chapter 01.사전 준비.pdf, “의존성”, 미상, 미상
[2] 계란, 티스토리, “Chapter8. Account(게좌) 시스템 개발”, https://oranthy.tistory.com/270, 2022.8.2([4]의 Consu mer 클래스의 Controller, Domain, dto, repository, service 등)
[3]  mgcztech576(mtgv999(본인)와 동일인물), github, “ecommercemain”, https://github.com/mgcztech576/ecommercemain, 2023.9.26
[4] 미상, 제로베이스, zerobase-account-main, 미상, 미상(Consu mer 클래스의 Controller, Domain, dto, repository, service 등)

[5] 미상, “예약하다.” 한영사전, “예약하다”, 미상
[6] ChatGPT에서 생성된 텍스트, 2024년 5월 5일, OpenAI,
https://chatgpt.com/c/86793549-af41-4e72-88f5-ed5ff847acaf 시간 부분 (LocalDateTime 입력 방식)
[7] kimdh-hi, sungjin0757, kimewnseong, Github, reserve-web-app, https://github.com/kimdh-hi/reserve-web-app, 2021-08-20
[8] yyy9942, binaryyoung, GitHub, food-delivery, https://github.com/f-lab-edu/food-delivery, 2023-04-23
다른 언어도 하기, JPA, 자바+스프링 프레임워크, AOP, 스프링 코드 살핌, 코드: 순열
[9] 본인, DBeaver, CREATE TABLE MEMBER2( General - Connections- localhost:3306 - Databases - testdb2-Tables- <localhost> Script-20, 미상, 미상(2024년 3월~4월 추정) (테이블 제작 형식)