package cashregister;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.assertj.core.internal.bytebuddy.asm.Advice.Return;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given
    	Printer printer=mock(Printer.class);
    	Purchase purchase=mock(Purchase.class);
    	CashRegister cashRegister=new CashRegister(printer);
    	when(purchase.asString())
    	.thenReturn("the message which should be print.");
        //when
    	cashRegister.process(purchase);
        //then
    	verify(printer).print("the message which should be print.");
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given
    	Printer printer=mock(Printer.class);
    	Purchase purchase=mock(Purchase.class);
    	CashRegister cashRegister=new CashRegister(printer);
    	when(purchase.asString())
    	.thenReturn("the message which should be print.");
        //when
    	cashRegister.process(purchase);
        //then
    	verify(printer).print("the message which should be print.");
    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
    	//given
    	Printer printer=mock(Printer.class);
    	Purchase purchase=mock(Purchase.class);
    	CashRegister cashRegister=new CashRegister(printer);
    	when(purchase.asString())
    	.thenReturn("the message which should be print.");
        //when
    	cashRegister.process(purchase);
        //then
    	verify(printer).print("the message which should be print.");
    }

}
