package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MenuTest {

    @Test
    public void shouldValidateOptionsTest() {
        //Given
        Menu menu = new Menu();
        String userOption1 = "1";
        String userOption2 = "2";

        //When
        boolean result1 = menu.validateOption(userOption1);

        //Then
        assertThat(result1, is(true));

        //when
        boolean result2 = menu.validateOption(userOption2);

        //then
        assertThat(result2, is(false));
    }
}
