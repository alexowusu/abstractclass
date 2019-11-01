package io.test;

import io.sub.abstractclass.Level;
import io.sub.abstractclass.Nameable;
import io.sub.abstractclass.Register;
import io.sub.abstractclass.Students;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void getRegister() {
        List<Nameable> nameables = Arrays.asList(
           new Students("Yaa",Level.First,Arrays.asList(1.3,2.3)),
           new Students("Yaw",Level.Second, Arrays.asList(3.3,4.5))
        );
        Register register = new Register(nameables);
        assertEquals(Arrays.asList("Yaa"),register.getRegisterByLevel(Level.First));
    }
    @Test
    void getReport(){
        List<Nameable> nameables = Arrays.asList(
                new Students("Yaa",Level.First,Arrays.asList(1.3,2.3)),
                new Students("Yaw",Level.Second, Arrays.asList(3.3,4.5))
        );
        Register register = new Register(nameables);
        assertEquals("Yaa Yaw", register.PrintReport());

    }
}