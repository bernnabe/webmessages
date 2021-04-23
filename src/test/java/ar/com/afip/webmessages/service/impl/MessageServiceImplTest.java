package ar.com.afip.webmessages.service.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.util.ReflectionTestUtils;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
class MessageServiceImplTest {

    @InjectMocks
    MessageServiceImpl messageService;

    @BeforeEach
    public void beforeAll() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void when_post_a_message() {

    }

    @Test
    public void when_get_all_messages() {

    }

    @Test
    public void when_get_messages_from_a_specific_recipient() {

    }
}