/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 24 23:18:06 GMT 2018
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ISODateTimeFormat_ESTest extends ISODateTimeFormat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonthDay();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        ISODateTimeFormat.forFields((Collection<DateTimeFieldType>) null, false, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The fields must not be null or empty
         //
         verifyException("org.joda.time.format.ISODateTimeFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISODateTimeFormat.Constants iSODateTimeFormat_Constants0 = new ISODateTimeFormat.Constants();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeekDay();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyear();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.yearMonth();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateElementParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeNoMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.year();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateOptionalTimeParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinute();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeParser();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localTimeParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTime();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDate();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDateTimeNoMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekyearWeek();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hour();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecond();
      assertNull(dateTimeFormatter0.getPivotYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicDateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ISODateTimeFormat iSODateTimeFormat0 = new ISODateTimeFormat();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateOptionalTimeParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.time();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicOrdinalDate();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDate();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeElementParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecondMillis();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinute();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTime();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDate();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHourMinuteSecondFraction();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecondFraction();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.tTimeNoMillis();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.date();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicWeekDate();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTime();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateParser();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.ordinalDateTimeNoMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTimeNoMillis();
      assertFalse(dateTimeFormatter0.isOffsetParsed());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateTimeNoMillis();
      assertEquals(2000, dateTimeFormatter0.getDefaultYear());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.weekDateTime();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.dateHour();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.hourMinuteSecond();
      assertTrue(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.timeParser();
      assertFalse(dateTimeFormatter0.isPrinter());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.localDateParser();
      assertTrue(dateTimeFormatter0.isParser());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DateTimeFormatter dateTimeFormatter0 = ISODateTimeFormat.basicTime();
      assertTrue(dateTimeFormatter0.isPrinter());
  }
}
