package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
}
