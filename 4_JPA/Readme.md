# JPA(Java Persistence API)

## ORM(Object Relational Mapping)
애플리케이션의 클래스와 RDB(관계형 대이터베이스)의 테이블을 매핑한다는 뜻

    1. JPA란 자바 진영에서 ORM을 사용할 때 사용하는 인터페이스들의 모음을 예기한다.
    2. 자바 어플리케이션에서 관계형 데이터베이스를 사용하는 방식을 정의한 인터페이스
    3. Persistance에 주목되어야 한다. 해당 DB는 휘발성이 아니라 영속성을 가진 데이터다.

### JPA 설정(application.yml)

![img.png](img.png)

     ddl-auto: create 
        JPA에서 사용하는 엔티티 클래스를 정의하고 애플리케이션 실행 시,
        이 엔티티와 매핑되는 테이블을 자동으로 생성
    




