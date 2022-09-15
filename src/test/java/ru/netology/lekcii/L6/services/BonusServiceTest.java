package ru.netology.lekcii.L6.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.lekcii.L6.services.BonusService; // Когдамы в этом классе будем писать BonusService, мы будем иметь ввиду располагающийся именно  по этому пути класс

public class BonusServiceTest {

@Test
    public void testRegisteredUnderLimit(){
   //можно здесь указать пакет целиком, перед объектом//
    BonusService service = new BonusService();

    int expected = 150;
    int actual = service.calcBonus(5000, true);

    Assertions.assertEquals(expected, actual);


}
}

