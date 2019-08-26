package cashregister;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    	verify(purchase).asString();
    }
    @Test
    public void should_return_item_name_and_price_when_as_string_given_mock_items() {
//        //given
//    	Item items=mock(Item.class);
//    	Item[] items=new Item[] {
//    			new Item("1", 1),
//    			new Item("2",2)
//    	};
//    	Printer printer=new Printer();
//    	Purchase purchase=new Purchase(items);
//    	CashRegister cashRegister=new CashRegister(printer);
//    	when(purchase.asString())
//    	.thenReturn("the message which should be print.");
//        //when
//    	String resultString=purchase.asString(purchase);
//        //then
//  		assertEqu als();
    	Item[] items=new Item[2];
    	items[0] =mock(Item.class);
    	items[1] =mock(Item.class);
    	
    	Purchase purchase=new Purchase(items);
    	when(items[0].getName()).thenReturn("v8");
    	when(items[0].getPrice()).thenReturn(10000.0);
    	when(items[1].getName()).thenReturn("bose");
    	when(items[1].getPrice()).thenReturn(10000.0);
    	
        //when
    	String resultString=purchase.asString();
        //then
    	assertEquals("v8\t10000.0\nbose\t10000.0", resultString);
    }
    
    @Test
    public void should_return_item_name_and_price_when_as_given_mock_items() {
        //given
    	//Item[] =mock(Item.class);
    	Item[] items=new Item[2];
    	items[0] =mock(Item.class);
    	items[1] =mock(Item.class);
    	
    	Purchase purchase=new Purchase(items);
    	when(items[0].getName()).thenReturn("v8");
    	when(items[0].getPrice()).thenReturn(10000.0);
    	when(items[1].getName()).thenReturn("bose");
    	when(items[1].getPrice()).thenReturn(10000.0);
    	
        //when
    	purchase.asString();
        //then
    	verify(items[0]).getName();
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
