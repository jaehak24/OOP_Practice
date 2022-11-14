# Checked Exception

발생한 예외를 잡아서 체크한 후에 해당 예외를 복구|| 회피 처리
ex>classNotFoundException

# Unchecked Exception
발생한 예외를 잡아서 해당 예외에 대한 처리를 할 필요가 없게끔 처리
eX> NullpotinException, Arrayindexoutofbounds

# 개발자가 의도적으로 예외를 던지는(throw) 상황

1. 시스템 내부에서 조회하려는 리소스가 없는 경우
2. etc

#예외를 던지고(throws) 받기(catch)
서버에서 발생한 리소스 부족문제를 클라리언트에거 throw하게 되고 이를 
통해 메서드 바깥으로 즉, 해당 메서드를 호출한 지접으로 전달되게 됩니다.
보통 이를 Controller의 핸들러 메서드에서 throw를 하게 된다.

# @ExceptionHandler의 단점
1. 각각의 controller 클래스에서 @ExceptionHandler 애너테이션을 사용하여 Requested Body에 대한 유효성 검증 실패에 대한 에러 처리를 해야되므로 
    각 Controller 클래스마드 코드 중복이 이루어지게 됩니다.
    
2. Controller에서 처리해야 되는 예외가 유효성 검증 실패에 대한 예외만 있는 것이 아니기 때문에 하나의 Controller 클래스 내에서 @ExceptionHandler를 추가한
에러 처리 핸들러 메서드가 늘어납니다. 


# @RestContollerAdviec를 사용한 예외 처리 공통화

특정 클래스에 @RestControllAdvice 애너테이션을 추가하면 여러개의 Contoller 클래스에서 
@ExceptionHandler, @InitBinder 또는 @ModelAttribute가 추가된 데서드를 공유해서 사용할 수 있다.
-->예외 처리를 공통화 할 수 있다.
