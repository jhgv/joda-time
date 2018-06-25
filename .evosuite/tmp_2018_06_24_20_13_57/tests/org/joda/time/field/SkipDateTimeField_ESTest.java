/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 24 23:41:21 GMT 2018
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import org.joda.time.MonthDay;
import org.joda.time.Months;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Seconds;
import org.joda.time.Weeks;
import org.joda.time.YearMonth;
import org.joda.time.Years;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.ZonedChronology;
import org.joda.time.field.OffsetDateTimeField;
import org.joda.time.field.SkipDateTimeField;
import org.joda.time.field.SkipUndoDateTimeField;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SkipDateTimeField_ESTest extends SkipDateTimeField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = islamicChronology0.withZone(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.hourOfHalfday();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.halfdays();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      SkipDateTimeField skipDateTimeField0 = null;
      try {
        skipDateTimeField0 = new SkipDateTimeField(chronology0, unsupportedDateTimeField0, 1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // hourOfHalfday field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      uTCProvider0.getZone("x");
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(julianChronology0, dateTimeField0, 1);
      // Undeclared exception!
      try { 
        skipDateTimeField0.set(0L, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for year is not supported
         //
         verifyException("org.joda.time.field.SkipDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      EthiopicChronology.getInstance(dateTimeZone0);
      DateTimeZone.setDefault(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      DateTimeZone.getNameProvider();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, dateTimeField0, 2700);
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.getMinimumValue(0L);
      ethiopicChronology0.add(0L, 0L, 2163);
      skipDateTimeField0.get(0);
      dateTimeZone0.isStandardOffset(1);
      skipDateTimeField0.get(11);
      skipDateTimeField0.get((-1L));
      // Undeclared exception!
      try { 
        skipDateTimeField0.set((long) 1, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1 for yearOfCentury must be in the range [0,100]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(islamicChronology0, dateTimeField0);
      skipDateTimeField0.get(3600000L);
      skipDateTimeField0.getMinimumValue();
      long long0 = 15308640144L;
      int int0 = (-1);
      YearMonth yearMonth0 = null;
      try {
        yearMonth0 = new YearMonth(3973, 3973);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 3973 for monthOfYear must not be larger than 12
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(1, 1);
      julianChronology0.withZone(dateTimeZone0);
      DateTimeZone dateTimeZone1 = DateTimeZone.forOffsetMillis(1);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone1);
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(julianChronology0, dateTimeField0, 1);
      skipDateTimeField0.get(1);
      skipDateTimeField0.get(1);
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.get(0L);
      skipDateTimeField0.getMinimumValue();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfDay();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) null, dateTimeField0, 1);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      skipDateTimeField0.getAsShortText((-2326), locale0);
      skipDateTimeField0.get(2113L);
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.get((-1));
      skipDateTimeField0.get((-2942L));
      skipDateTimeField0.getMinimumValue();
      // Undeclared exception!
      try { 
        skipDateTimeField0.get((-9223372036854775808L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The instant is below the supported minimum of 0001-01-01T00:00:00.000-02:19:36 (BuddhistChronology[America/Recife])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      Chronology chronology0 = zonedChronology0.withZone(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.secondOfDay();
      BuddhistChronology buddhistChronology1 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology1.millis();
      UnsupportedDateTimeField unsupportedDateTimeField0 = UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField0);
      SkipDateTimeField skipDateTimeField0 = null;
      try {
        skipDateTimeField0 = new SkipDateTimeField(chronology0, unsupportedDateTimeField0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // secondOfDay field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LocalTime localTime0 = new LocalTime((DateTimeZone) null);
      Partial partial0 = new Partial(localTime0);
      localTime0.toDateTimeToday((DateTimeZone) null);
      Chronology chronology0 = partial0.getChronology();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(chronology0, dateTimeField0, 5605);
      Days days0 = Days.TWO;
      buddhistChronology0.get((ReadablePeriod) days0, (-1L));
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.set((long) (-2922686), 4489);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      TimeZone timeZone0 = TimeZone.getDefault();
      DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone(timeZone0);
      TimeZone.setDefault(timeZone0);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfDay();
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.clockhourOfHalfday();
      OffsetDateTimeField offsetDateTimeField0 = new OffsetDateTimeField(dateTimeField0, dateTimeFieldType0, 1);
      dateTimeFieldType0.isSupported(buddhistChronology0);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, offsetDateTimeField0);
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.set((long) 1, 1);
      skipDateTimeField0.get((-1171L));
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.get(0L);
      // Undeclared exception!
      try { 
        skipDateTimeField0.set(0L, (-389));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -389 for clockhourOfHalfday must be in the range [1,86400000]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.monthOfYear();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) null, dateTimeField0, 1);
      SkipDateTimeField skipDateTimeField1 = new SkipDateTimeField((Chronology) null, skipDateTimeField0, 1);
      long long0 = (-381L);
      LocalDate localDate0 = new LocalDate();
      Locale locale0 = Locale.UK;
      // Undeclared exception!
      try { 
        skipDateTimeField1.set((ReadablePartial) localDate0, 2148, (int[]) null, (String) null, locale0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value null for monthOfYear is not supported
         //
         verifyException("org.joda.time.field.BaseDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = islamicChronology0.getLeapYearPatternType();
      IslamicChronology islamicChronology1 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      SkipDateTimeField skipDateTimeField0 = null;
      try {
        skipDateTimeField0 = new SkipDateTimeField(islamicChronology1, (DateTimeField) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DelegatedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Chronology chronology0 = buddhistChronology0.withUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(chronology0, dateTimeField0, 1);
      skipDateTimeField0.get(1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) null, dateTimeField0);
      skipDateTimeField0.isSupported();
      skipDateTimeField0.getMinimumValue();
      skipDateTimeField0.get(1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      Chronology chronology0 = buddhistChronology0.withZone(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.dayOfWeek();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(chronology0, dateTimeField0);
      SkipDateTimeField skipDateTimeField1 = new SkipDateTimeField(chronology0, skipDateTimeField0, 1);
      // Undeclared exception!
      try { 
        skipDateTimeField1.set((long) 1, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1 for dayOfWeek must be in the range [2,7]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      int int0 = 1;
      SkipDateTimeField skipDateTimeField0 = null;
      try {
        skipDateTimeField0 = new SkipDateTimeField(ethiopicChronology0, (DateTimeField) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The field must not be null
         //
         verifyException("org.joda.time.field.DelegatedDateTimeField", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfCentury();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) null, dateTimeField0);
      skipDateTimeField0.get(1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      JulianChronology.getInstance(dateTimeZone0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      System.setCurrentTimeMillis(1563);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.yearOfEra();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      dateTimeZone0.nextTransition(182L);
      dateTimeZone0.getOffsetFromLocal(1);
      buddhistChronology0.withZone(dateTimeZone0);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField((Chronology) null, dateTimeField0, 1);
      long long0 = 2185L;
      skipDateTimeField0.get(2185L);
      Seconds seconds0 = Seconds.MIN_VALUE;
      seconds0.toStandardHours();
      LocalDate localDate0 = LocalDate.now((Chronology) buddhistChronology0);
      Days days0 = Days.daysBetween((ReadablePartial) localDate0, (ReadablePartial) localDate0);
      Days days1 = days0.minus((-10800000));
      // Undeclared exception!
      try { 
        days1.toStandardMinutes();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Multiplication overflows an int: 10800000 * 1440
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(ethiopicChronology0, dateTimeZone0);
      Chronology chronology0 = zonedChronology0.withUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = buddhistChronology0.minuteOfHour();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(chronology0, dateTimeField0);
      skipDateTimeField0.getAsShortText((-1L));
      // Undeclared exception!
      try { 
        skipDateTimeField0.set((long) 1, (-1137));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1137 for minuteOfHour must be in the range [1,59]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance((DateTimeZone) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      Years years0 = Years.ZERO;
      julianChronology0.get((ReadablePeriod) years0, (long) 1);
      DateTimeField dateTimeField0 = buddhistChronology0.weekOfWeekyear();
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(julianChronology0, dateTimeField0);
      // Undeclared exception!
      try { 
        skipDateTimeField0.set(0L, 1900);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1900 for weekOfWeekyear must be in the range [1,53]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.year();
      iSOChronology0.toString();
      SkipUndoDateTimeField skipUndoDateTimeField0 = new SkipUndoDateTimeField(iSOChronology0, dateTimeField0, 1);
      SkipDateTimeField skipDateTimeField0 = new SkipDateTimeField(iSOChronology0, skipUndoDateTimeField0);
      skipDateTimeField0.set(0L, 2000);
      skipDateTimeField0.set((long) 1, 2000);
      skipDateTimeField0.set(1122L, 2000);
      skipDateTimeField0.getMinimumValue();
      // Undeclared exception!
      try { 
        skipDateTimeField0.set(1122L, (-1552));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000-02:19:36 (BuddhistChronology[America/Recife])
         //
         verifyException("org.joda.time.chrono.LimitChronology", e);
      }
  }
}
