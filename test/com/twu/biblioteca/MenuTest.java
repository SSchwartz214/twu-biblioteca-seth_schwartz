package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MenuTest {

    @Test
    public void shouldValidateOptionsTest() {
        Menu menu = new Menu();
        String userOption1 = "1";
        String userOption2 = "2";
        String userOption3 = "3";
        String userOption4 = "4";
        String userOption5 = "5";

        boolean result1 = menu.validateOption(userOption1);

        assertThat(result1, is(true));


        boolean result2 = menu.validateOption(userOption2);

        assertThat(result2, is(true));//when


        boolean result3 = menu.validateOption(userOption3);

        assertThat(result3, is(true));


        boolean result4 = menu.validateOption(userOption4);

        assertThat(result4, is(true));

        boolean result5 = menu.validateOption(userOption5);

        assertThat(result5, is(false));
    }
}
