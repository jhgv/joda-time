/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 24 23:36:55 GMT 2018
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractReadableInstantFieldProperty_ESTest extends AbstractReadableInstantFieldProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      System.setCurrentTimeMillis(1L);
      Instant instant0 = new Instant((Object) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = instant0.toDateTime(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      Interval interval0 = dateTime_Property0.toInterval();
      assertEquals(1000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(17, 17, 0, 17);
      LocalTime localTime1 = localTime0.withMillisOfSecond(0);
      LocalTime.Property localTime_Property0 = localTime1.secondOfMinute();
      long long0 = localTime_Property0.remainder();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) iSOChronology0);
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      DurationField durationField0 = localDate_Property0.getRangeDurationField();
      assertEquals("centuries", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.dayOfMonth();
      int int0 = localDate_Property0.getMinimumValue();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.monthOfYear();
      DateTimeField dateTimeField0 = mutableDateTime_Property0.getField();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      int int0 = mutableDateTime_Property0.getDifference(mutableDateTime0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) iSOChronology0);
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      GJChronology gJChronology0 = GJChronology.getInstance();
      Instant instant0 = gJChronology0.getGregorianCutover();
      int int0 = localDate_Property0.getDifference(instant0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MockDate mockDate0 = new MockDate();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(mockDate0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.hourOfDay();
      mutableDateTime0.addWeekyears(4);
      int int0 = localDateTime_Property0.getDifference(mutableDateTime0);
      assertEquals((-35112), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(27, 27, 27);
      LocalTime localTime0 = LocalTime.fromCalendarFields(mockGregorianCalendar0);
      LocalTime.Property localTime_Property0 = localTime0.secondOfMinute();
      int int0 = localTime_Property0.get();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MockDate mockDate0 = new MockDate();
      LocalDateTime localDateTime0 = LocalDateTime.fromDateFields(mockDate0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.millisOfSecond();
      mutableDateTime0.addWeekyears(4);
      // Undeclared exception!
      try { 
        localDateTime_Property0.getDifference(mutableDateTime0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Value cannot fit in an int: -126403200000
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) iSOChronology0);
      LocalDate.Property localDate_Property0 = localDate0.era();
      DateTimeFieldType dateTimeFieldType0 = localDate_Property0.getFieldType();
      assertEquals("era", dateTimeFieldType0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) iSOChronology0);
      LocalDate.Property localDate_Property0 = localDate0.era();
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ISO_DATE_TIME;
      Locale locale0 = dateTimeFormatter0.getLocale();
      String string0 = localDate_Property0.getAsText(locale0);
      assertEquals("AD", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.era();
      Locale locale0 = Locale.GERMAN;
      String string0 = localDate_Property0.getAsShortText(locale0);
      assertEquals("n. Chr.", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDateTime localDateTime0 = new LocalDateTime(0L);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.centuryOfEra();
      int int0 = localDateTime_Property0.get();
      assertEquals(19, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      boolean boolean0 = localDate_Property0.equals(dateTime0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LocalTime localTime0 = new LocalTime(17, 17, 17, 17);
      LocalTime localTime1 = localTime0.plusSeconds(17);
      LocalTime localTime2 = localTime1.withMillisOfSecond(10);
      Months months0 = Months.FIVE;
      LocalTime localTime3 = localTime2.minus(months0);
      LocalTime localTime4 = localTime3.plusMinutes(10);
      LocalTime.Property localTime_Property0 = localTime4.secondOfMinute();
      int int0 = localTime_Property0.compareTo((ReadablePartial) localTime0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) iSOChronology0);
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      int int0 = localDate_Property0.compareTo((ReadablePartial) localDate0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.monthOfYear();
      long long0 = mutableDateTime_Property0.getDifferenceAsLong(mutableDateTime0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Chronology chronology0 = dateTime0.getChronology();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.era();
      // Undeclared exception!
      try { 
        localDateTime_Property0.getDifference(dateTime0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // eras field is unsupported
         //
         verifyException("org.joda.time.field.UnsupportedDurationField", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime((Object) null, dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      int int0 = localTime_Property0.getMinimumValue();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) iSOChronology0);
      LocalDate.Property localDate_Property0 = localDate0.yearOfCentury();
      int int0 = localDate_Property0.getMaximumValue();
      assertEquals(99, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstance();
      LocalDate localDate0 = new LocalDate((Chronology) iSOChronology0);
      LocalDate.Property localDate_Property0 = localDate0.era();
      DurationField durationField0 = localDate_Property0.getRangeDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Chronology chronology0 = dateTime0.getChronology();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.era();
      long long0 = localDateTime_Property0.remainder();
      assertEquals(63527995281320L, long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = new LocalDate(0L);
      LocalDate.Property localDate_Property0 = localDate0.centuryOfEra();
      localDate_Property0.hashCode();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime((Chronology) null);
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfHour();
      DurationField durationField0 = mutableDateTime_Property0.getLeapDurationField();
      assertNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Instant instant0 = new Instant((Object) null);
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      DateTime dateTime0 = instant0.toDateTime(dateTimeZone0);
      DateTime.Property dateTime_Property0 = dateTime0.secondOfMinute();
      Interval interval0 = dateTime_Property0.toInterval();
      assertEquals(1392409281000L, interval0.getStartMillis());
      assertEquals(1392409282000L, interval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime((Object) null, dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      String string0 = localTime_Property0.toString();
      assertEquals("Property[halfdayOfDay]", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MutableDateTime mutableDateTime0 = MutableDateTime.now();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfHour();
      int int0 = mutableDateTime_Property0.getMaximumValueOverall();
      assertEquals(59, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      String string0 = mutableDateTime_Property0.getAsShortText();
      assertEquals("7", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LocalDate localDate0 = new LocalDate();
      LocalDate.Property localDate_Property0 = localDate0.dayOfMonth();
      Locale locale0 = Locale.FRANCE;
      int int0 = localDate_Property0.getMaximumShortTextLength(locale0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Chronology chronology0 = dateTime0.getChronology();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.era();
      String string0 = localDateTime_Property0.getAsText();
      assertEquals("AD", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime((Object) null, dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      int int0 = localTime_Property0.getMinimumValueOverall();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDate localDate0 = LocalDate.now();
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      DateTime dateTime0 = localDate0.toDateTimeAtStartOfDay(dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      DateTime.Property dateTime_Property0 = dateTime0.property(dateTimeFieldType0);
      DurationField durationField0 = dateTime_Property0.getDurationField();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.getDefault();
      LocalTime localTime0 = new LocalTime((Object) null, dateTimeZone0);
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.halfdayOfDay();
      LocalTime.Property localTime_Property0 = localTime0.property(dateTimeFieldType0);
      int int0 = localTime_Property0.getMaximumTextLength((Locale) null);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.minuteOfHour();
      int int0 = mutableDateTime_Property0.getLeapAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MutableDateTime mutableDateTime0 = new MutableDateTime();
      MutableDateTime.Property mutableDateTime_Property0 = mutableDateTime0.weekOfWeekyear();
      String string0 = mutableDateTime_Property0.getName();
      assertEquals("weekOfWeekyear", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DateTime dateTime0 = DateTime.now();
      Chronology chronology0 = dateTime0.getChronology();
      LocalDateTime localDateTime0 = LocalDateTime.now(chronology0);
      LocalDateTime.Property localDateTime_Property0 = localDateTime0.era();
      String string0 = localDateTime_Property0.getAsString();
      assertEquals("1", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-176), 25650000, 59);
      LocalDate localDate0 = LocalDate.fromCalendarFields(mockGregorianCalendar0);
      DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetMillis(25650000);
      LocalTime localTime0 = LocalTime.now(dateTimeZone0);
      DateTime dateTime0 = localDate0.toDateTime(localTime0);
      DateTime.Property dateTime_Property0 = dateTime0.yearOfCentury();
      boolean boolean0 = dateTime_Property0.isLeap();
      assertFalse(boolean0);
  }
}
