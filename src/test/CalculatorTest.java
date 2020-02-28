package test;
import softwareEng.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import softwareEng.Calculator;

public class CalculatorTest {

	@Test
	 public void test() {
		//fail("Not yet implemented");
         int a=10;
         int b=20;
         Calculator calc=new Calculator();
         int result=calc.sum(a,b);
         Assert.assertTrue(result>0);
	}
	public void aa() {
		int a=5;
		int b=3;
		Calculator calc=new Calculator();
		int result=calc.sub(a,b);
		Assert.assertTrue(result>0);
	}

}
