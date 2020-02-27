package test;
import softwareEng.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import softwareEng.Calculator;

class CalculatorTest {

	@Test
	void test() {
		//fail("Not yet implemented");
         int a=10;
         int b=20;
         Calculator calc=new Calculator();
         int result=calc.sum(a,b);
         Assert.assertTrue(result>0);
	}

}
