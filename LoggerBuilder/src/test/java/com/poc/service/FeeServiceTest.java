package com.poc.service;

import com.poc.domain.Fee;
import com.poc.domain.StateEnum;
import com.poc.domain.TaxSystem;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(MockitoJUnitRunner.class)
class FeeServiceTest {

    @InjectMocks
    ProductService productService;

    @Spy
    FeeService feeService = new FeeService();

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    void insertShouldBeSuccess() {
        Fee result = feeService.insert(StateEnum.SP.name(), 2020, 909.0d);

        assertEquals(StateEnum.SP, result.getStateEnum());
        assertEquals(2020, result.getYear());
        assertEquals(909.0d, result.getValue());

        assertThat(TaxSystem.FEE_LIST, hasItem(result));
    }

    @Test
    void removeShouldBeSuccess() {
        Fee feeToRemove = Fee.builder()
                .value(20d)
                .year(2050)
                .stateEnum(StateEnum.RJ)
                .build();
        TaxSystem.FEE_LIST.addAll(DataTest.gimmeFeeList(20));
        TaxSystem.FEE_LIST.add(feeToRemove);
        assertThat(TaxSystem.FEE_LIST, hasItem(feeToRemove));
        //  feeService.remove(StateEnum.RJ.name(),2050);
        //   assertThat(TaxSystem.FEE_LIST, not(hasItem(feeToRemove)));
    }
  
    @Test
    void getFeeByStateAndYear() {

        Calendar cal  = Calendar.getInstance();
        cal.set(2014, 0, 25);
        Date dueDate = cal.getTime();

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DATE);
        calendar.set(2014, 0, 25, 0, 0, 0);

        Date dueDate2 =  calendar.getTime();

        LocalDate date = dueDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate date2 = dueDate2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

//        System.out.println(date.isBefore(date2));


//        System.out.println(dueDate.toInstant());


        GregorianCalendar cal2 = new GregorianCalendar();
        cal2.setTime(dueDate2);
        System.out.println(cal2.getTime());


        Calendar calendar1  = Calendar.getInstance();
        calendar1.setTime( cal2.getTime() );
        System.out.println(calendar1.getTime());




    }
}