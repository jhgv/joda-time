/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 25 13:40:59 GMT 2018
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractPeriod_ESTest extends AbstractPeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
      
      Period period1 = period0.plusMinutes((-1818));
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      
      period1.hashCode();
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Period period0 = Period.millis(17);
      assertNotNull(period0);
      
      Period period1 = period0.minusWeeks((-1840));
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      
      boolean boolean0 = period0.equals(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
      
      int int0 = period0.size();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Period period0 = Period.days((-16));
      assertNotNull(period0);
      
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      
      DurationFieldType durationFieldType0 = mutablePeriod0.getFieldType(0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      boolean boolean0 = period0.isSupported(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
      
      int int0 = period0.indexOf((DurationFieldType) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Period period0 = new Period(1647, 1647, 17, 17);
      assertNotNull(period0);
      
      DurationFieldType durationFieldType0 = period0.getFieldType(3);
      assertEquals("days", durationFieldType0.getName());
      assertEquals("days", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Period period0 = Period.years(1);
      assertNotNull(period0);
      
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      
      DurationFieldType durationFieldType0 = mutablePeriod0.getFieldType(0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertNotNull(durationFieldType0);
      
      int int0 = period0.get(durationFieldType0);
      assertEquals("years", durationFieldType0.toString());
      assertEquals("years", durationFieldType0.getName());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
      
      boolean boolean0 = period0.equals(period0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((-2264), (-2264), (-1005), 2);
      assertNotNull(mutablePeriod0);
      
      Period period0 = mutablePeriod0.toPeriod();
      assertNotNull(period0);
      
      // Undeclared exception!
      try { 
        period0.getFieldType((-2713));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2713
         //
         verifyException("org.joda.time.PeriodType", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
      
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      assertNotNull(mutablePeriod0);
      
      DurationFieldType durationFieldType0 = mutablePeriod0.getFieldType(0);
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertNotNull(durationFieldType0);
      
      int int0 = period0.get(durationFieldType0);
      assertEquals("years", durationFieldType0.getName());
      assertEquals("years", durationFieldType0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MutablePeriod mutablePeriod0 = new MutablePeriod((Object) null);
      assertNotNull(mutablePeriod0);
      
      int[] intArray0 = mutablePeriod0.getValues();
      assertEquals(8, intArray0.length);
      assertNotNull(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
      
      String string0 = period0.toString();
      assertEquals("PT0S", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Period period0 = new Period(1647, 1647, 17, 17);
      assertNotNull(period0);
      
      Period period1 = period0.withHours(1647);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertTrue(period1.equals((Object)period0));
      assertNotNull(period1);
      
      boolean boolean0 = period0.equals(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertTrue(period0.equals((Object)period1));
      assertTrue(period1.equals((Object)period0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Period period0 = new Period(1647, 1647, 17, 17);
      assertNotNull(period0);
      
      Days days0 = period0.toStandardDays();
      assertEquals(69, days0.getDays());
      assertEquals(1, days0.size());
      assertNotNull(days0);
      
      boolean boolean0 = period0.equals(days0);
      assertEquals(69, days0.getDays());
      assertEquals(1, days0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Period period0 = new Period((-372), (-372), 17, 17);
      assertNotNull(period0);
      
      boolean boolean0 = period0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
      
      Period period1 = period0.plusMinutes((-1818));
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertFalse(period1.equals((Object)period0));
      assertNotNull(period1);
      
      boolean boolean0 = period0.equals(period1);
      assertNotSame(period0, period1);
      assertNotSame(period1, period0);
      assertFalse(period0.equals((Object)period1));
      assertFalse(period1.equals((Object)period0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
      
      DurationFieldType[] durationFieldTypeArray0 = period0.getFieldTypes();
      assertEquals(8, durationFieldTypeArray0.length);
      assertNotNull(durationFieldTypeArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Period period0 = Period.millis(0);
      assertNotNull(period0);
      
      boolean boolean0 = period0.isSupported((DurationFieldType) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Period period0 = new Period(1659, 1659, 17, 17);
      assertNotNull(period0);
      
      String string0 = period0.toString((PeriodFormatter) null);
      assertEquals("PT1659H1659M17.017S", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Period period0 = Period.millis(0);
      MutablePeriod mutablePeriod0 = period0.toMutablePeriod();
      DurationFieldType durationFieldType0 = mutablePeriod0.getFieldType(0);
      int int0 = period0.indexOf(durationFieldType0);
      assertEquals(0, int0);
  }
}
