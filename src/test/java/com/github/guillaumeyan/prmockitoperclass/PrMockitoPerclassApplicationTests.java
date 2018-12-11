package com.github.guillaumeyan.prmockitoperclass;

import com.github.guillaumeyan.prmockitoperclass.service.ServiceA;
import com.github.guillaumeyan.prmockitoperclass.service.ServiceB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // If this is remove, all is ok
public class PrMockitoPerclassApplicationTests {

	@InjectMocks
	private ServiceA target;

	@Mock
	private ServiceB serviceB;

	@Test
	public void testCount() {
		Mockito.when(serviceB.testB()).thenReturn(1D);
		Double result = target.testA();
		Assertions.assertEquals(2D, result.doubleValue());
	}

	@Test
	public void testCount2() {
		Mockito.when(serviceB.testB()).thenReturn(10D);
		Double result = target.testA();
		Assertions.assertEquals(11D, result.doubleValue());
	}
}
