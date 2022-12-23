# Record

    Java V16에서 정식 스펙으로 당당히 오른 녀석


## Record 등장 배경
    DTO를 구현하기 위해서는 getter, setter, equal 등등의 데이터 처리 혹은 특정 연산을 수행하기 위해 
    오버라이드된 메소드를 반복해서 작상하게 됩니다.
 
>예제> 
> 
    public class Address {
    private String city;
    private String street;
    private String zipCode;

    public Address() {
    }
    
    public Address(String city, String street, String zipCode) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipCode);
    }

### 분석
    예제에서 보이는 것과 같이 여러 보일러 플레이트 코드가 사용되는 것을 알 수 있다.
>보일러 플레이트 코드
> >최소한의 변경으로 여러 곳에서 재상요 되면 반복적으로 비슷한 형태를 가지는 코드 
> >대표적으로 getter, setter
> > equals 등이 있다.

    Record는 이러한 비대해진 보일러 플레이트 코드를 줄이는 주인공으로 작용할 수 있다.


## Record의 목표

* 객체 지향의 사상에 맞게 데이터를 간결하게 표현하기 위한 방법을 제공
* 개발자가 동작을 확장하는 것보다 불변 데이터를 모델링하는데 집중하도록 함
* 데이터 지향 메소드를 자동으로 구현
* 단, java beans를 대체하기 위한 기술은 아님 & 어노테이션 지향적인 코드를 생성하기 위한 기능도 아니다!


## record의 특징

### record의 구조
    public record address(String name, String mainAd, String subAd) {}

다음 코드를 보면 기존에 사용하던 class 대신에 record가 들어간 것을 확인할 수 있다. 컴파일러는 헤더를 통해 내부 필드를 
추론하는데, 이 때 String 타입의 name, mainAd, subAd가 있다는 것을 인식, 이후 코드에 명시적으로 접근자와 생성자, toString,
equals를 선언하지 ㅇ낳아도 이에 대한 구현을 자동으로 제공

## record는 Entitiy로 사용할 수 없다!

## record를 DTO로 사용하자!!