# spring-mvc
### 개발환경
> SpringBoot (v3.1.5)
> 
> Java 17
> 
> Thymeleaf
> 
> Lombok
> 
> Gradle
> 
> JPA
> 
> Spring Data JPA
> 
> QueryDSL
> 
> H2 Database

### 개요
> 기능 확장 및 공부한걸 활용하기에 게시판이 최적
> 
> 인기 커뮤니티 사이트인 디씨인사이드의 기능들을 클로닝하여 개발 계획
>
> MVC 패턴 및 스프링 기능 습득 및 활용이 목적이므로 디자인은 최대한 단순하게 사용 예정

### 기능 구현
> 게시글 목록, 조회, 작성, 수정 기능 개발(23/11/14)
> 
> 게시글 등록 시 사용자 IP 등록 처리 및 등록 IP와 불일치 시에만 조회수 증가 처리(23/11/15)
>
> 패스워드 길이 제한 및 게시글 수정 시 패스워드 체크 처리(23/11/18)
> 
> 추천/비추 기능 개발 작성자 IP와 체크 후 불일치 시에만 추천/비추 증가 처리(23/11/19)
> 
> Memory -> DB로 데이터 저장 처리 및 리팩토링하여 JPA 사용 처리(23/11/21)
> 
> JPA -> Spring Data JPA 변경하여 기능 반영(23/11/22)
> 
> QueryDSL 적용 및 검색 기능 구현(23/11/23)