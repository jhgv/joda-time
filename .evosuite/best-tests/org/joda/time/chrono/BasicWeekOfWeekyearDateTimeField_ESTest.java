/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 25 13:45:24 GMT 2018
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BasicChronology;
import org.joda.time.chrono.BasicMonthOfYearDateTimeField;
import org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJMonthOfYearDateTimeField;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.field.MillisDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicWeekOfWeekyearDateTimeField_ESTest extends BasicWeekOfWeekyearDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.minutes();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, durationField0);
      basicWeekOfWeekyearDateTimeField0.roundFloor(1627L);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(15);
      CopticChronology copticChronology0 = CopticChronology.getInstance(dateTimeZone0);
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(copticChronology0, millisDurationField0);
      basicWeekOfWeekyearDateTimeField0.roundFloor((-1809L));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(julianChronology0, millisDurationField0);
      basicWeekOfWeekyearDateTimeField0.roundCeiling(0L);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.seconds();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, durationField0);
      basicWeekOfWeekyearDateTimeField0.roundCeiling(2904L);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.minutes();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, durationField0);
      basicWeekOfWeekyearDateTimeField0.remainder(1627L);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.seconds();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, durationField0);
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.minutes();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, durationField0);
      // Undeclared exception!
      try { 
        basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = null;
      try {
        basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, (DurationField) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.eras();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = null;
      try {
        basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField((BasicChronology) null, durationField0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The unit milliseconds must be at least 1
         //
         verifyException("org.joda.time.field.PreciseDurationDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, millisDurationField0);
      basicWeekOfWeekyearDateTimeField0.getRangeDurationField();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      GJMonthOfYearDateTimeField gJMonthOfYearDateTimeField0 = new GJMonthOfYearDateTimeField(ethiopicChronology0);
      DurationField durationField0 = gJMonthOfYearDateTimeField0.getLeapDurationField();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, durationField0);
      basicWeekOfWeekyearDateTimeField0.getMaximumValueForSet(1006L, 53);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.seconds();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, durationField0);
      basicWeekOfWeekyearDateTimeField0.getMaximumValueForSet((-110L), 0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField0 = new BasicMonthOfYearDateTimeField(islamicChronology0, 1);
      DurationField durationField0 = basicMonthOfYearDateTimeField0.getLeapDurationField();
      LocalTime localTime0 = new LocalTime((long) 1, (Chronology) islamicChronology0);
      int[] intArray0 = new int[9];
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(islamicChronology0, durationField0);
      basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) localTime0, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, millisDurationField0);
      LocalDate localDate0 = new LocalDate(538L, (Chronology) ethiopicChronology0);
      basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) localDate0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(julianChronology0, millisDurationField0);
      YearMonth yearMonth0 = new YearMonth(0L, (Chronology) julianChronology0);
      basicWeekOfWeekyearDateTimeField0.getMaximumValue((ReadablePartial) yearMonth0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, millisDurationField0);
      basicWeekOfWeekyearDateTimeField0.get(1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DurationField durationField0 = copticChronology0.seconds();
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, durationField0);
      basicWeekOfWeekyearDateTimeField0.getMaximumValue();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(ethiopicChronology0, millisDurationField0);
      basicWeekOfWeekyearDateTimeField0.getMaximumValue((long) 1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(julianChronology0, millisDurationField0);
      basicWeekOfWeekyearDateTimeField0.getMinimumValue();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(julianChronology0, millisDurationField0);
      basicWeekOfWeekyearDateTimeField0.roundCeiling((-492L));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(julianChronology0, millisDurationField0);
      basicWeekOfWeekyearDateTimeField0.roundFloor(1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      MillisDurationField millisDurationField0 = (MillisDurationField)MillisDurationField.INSTANCE;
      BasicWeekOfWeekyearDateTimeField basicWeekOfWeekyearDateTimeField0 = new BasicWeekOfWeekyearDateTimeField(julianChronology0, millisDurationField0);
      basicWeekOfWeekyearDateTimeField0.remainder((-3521L));
  }
}
