package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다.")
    @Test
    void validPasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("serverWizard")). //12자
                doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다. 2")
    @Test
    void validPasswordTest2(){
        assertThatCode(()-> PasswordValidator.validate("Terarosa")).doesNotThrowAnyException();
    }


    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IlleagalExpressionException 예외가 발생한다.")
    @Test
    void validatePasswordTest2(){
        assertThatCode(()->PasswordValidator.validate("aabb"))
                .isInstanceOf(IllegalArgumentException.class).hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }

}