package io.nology.latviaspringcicd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MathControllerTest {
  
  @Autowired
  private MathController controller;
  
  @Test
  public void rectanglePerimeterShouldReturnCorrectPerimeter() {
    Integer height = 100;
    Integer width = 200;
    
    Integer result = controller.rectanglePerimeter(height, width);
    Integer expected = 600;
    
    assertEquals(expected, result);
  }
  
  @Test
  public void rectanglePerimeterShouldThrowWhenArgNull() {
    
    Integer height = 100;
    Integer width = null;
    
    assertThrows(NullPointerException.class, () -> {
      controller.rectanglePerimeter(height, width);
    });
    
  }
  
  @Test
  public void circleAreaShouldReturnCorrectArea() {
    Double r = 2d;
    
    Double result = controller.circleArea(r);
    
    assertEquals(12.56, result);
  }
  
}
