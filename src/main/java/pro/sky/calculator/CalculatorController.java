package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final HelloService helloService;
    private final CalculatorService calculatorService;

    public CalculatorController(HelloService helloService, CalculatorService calculatorService) {
        this.helloService = helloService;
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/plus")
    public String calculatorPlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {

        return calculatorService.calculatorPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculatorMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.calculatorMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculatorDivide(@RequestParam(required = false) Integer num1,
                                   @RequestParam(required = false) Integer num2) {
        String answer;
        if (num1 == null || num2 == null) {
            answer = "Параметр(ы) на заданы";
        } else if (num2 == 0) {
            answer = "Не правильно задан параметр, на '0' делить нельзя";
        } else {
            answer = calculatorService.calculatorDivide(num1, num2);
        }
        return answer;
    }
}