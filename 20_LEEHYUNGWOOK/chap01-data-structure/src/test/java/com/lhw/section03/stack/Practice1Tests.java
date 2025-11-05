package com.lhw.section03.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

/* 괄호 - 백준(9012)*/
class Practice1Tests {

    Practice1 practice1;
    /*테스트 마다 새롭게 객체 생성해서 테스트 하기*/
    @BeforeEach //테스트 시켜줄 때마다 선행해줄 것
    void setUp() {
        practice1 = new Practice1();
    }

    static Stream<Arguments> provideTestCases(){
        return Stream.of(
                Arguments.arguments("(())())", "NO"),
                Arguments.arguments("(((()())()", "NO"),
                Arguments.arguments("(()())((()))", "YES"),
                Arguments.arguments("((()()(()))(((())))()", "NO"),
                Arguments.arguments("()()()()(()()())()", "YES"),
                Arguments.arguments("(()((())()(", "NO")
        );
    }

    @DisplayName("올바른 괄호 문자열 테스트")
    @ParameterizedTest // 인자가 들어오는 테스트 어노테이션
    @MethodSource("provideTestCases") //테스트 할 때 가져올 인자의 이름과 매치해야됨
    void testParentesisString(String input, String expected) {
        String result = practice1.solution(input);
        Assertions.assertEquals(expected, result);
    }

    @DisplayName("올바른 괄호 문자열 테스트")
    @ParameterizedTest // 인자가 들어오는 테스트 어노테이션
    @MethodSource("provideTestCases") //테스트 할 때 가져올 인자의 이름과 매치해야됨
    void testParentesisStringQ(String input, String expected) {
        String result = practice1.mysol(input);
        Assertions.assertEquals(expected, result);
    }
}
