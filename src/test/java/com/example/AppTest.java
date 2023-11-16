package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void AppMainTest() {
        App app= new App();
        app.main();
        assert(true);
    }
}
