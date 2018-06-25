/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 24 23:33:51 GMT 2018
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BaseChronology_ESTest extends BaseChronology_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      EthiopicChronology ethiopicChronology0 = new EthiopicChronology(buddhistChronology0, "Q$IW@", 1);
      DurationField durationField0 = ethiopicChronology0.years();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = ethiopicChronology0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = julianChronology0.yearOfEra();
      assertEquals("yearOfEra", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.yearOfCentury();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = islamicChronology0.year();
      assertEquals("year", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      Chronology chronology0 = islamicChronology0.withZone(dateTimeZone0);
      assertSame(chronology0, islamicChronology0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      Chronology chronology0 = buddhistChronology0.withUTC();
      assertFalse(chronology0.equals((Object)buddhistChronology0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance();
      DurationField durationField0 = ethiopicChronology0.weekyears();
      assertTrue(durationField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      DateTimeField dateTimeField0 = islamicChronology0.weekyearOfCentury();
      assertEquals("weekyearOfCentury", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance();
      DateTimeField dateTimeField0 = gregorianChronology0.weekyear();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.weeks();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = gJChronology0.weekOfWeekyear();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      String string0 = copticChronology0.toString();
      assertEquals("CopticChronology[UTC]", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.seconds();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstance();
      DateTimeField dateTimeField0 = copticChronology0.secondOfMinute();
      assertEquals("secondOfMinute", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      JulianChronology julianChronology0 = JulianChronology.getInstance(dateTimeZone0, 1);
      DateTimeField dateTimeField0 = julianChronology0.secondOfDay();
      assertEquals("secondOfDay", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.months();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = gregorianChronology0.monthOfYear();
      assertEquals("monthOfYear", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DurationField durationField0 = buddhistChronology0.minutes();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstance();
      DateTimeField dateTimeField0 = julianChronology0.minuteOfDay();
      assertEquals("minuteOfDay", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.millisOfSecond();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = copticChronology0.millisOfDay();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      DurationField durationField0 = islamicChronology0.millis();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstanceUTC();
      DurationField durationField0 = gregorianChronology0.hours();
      assertEquals(3600000L, durationField0.getUnitMillis());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = gregorianChronology0.hourOfHalfday();
      assertEquals("hourOfHalfday", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeField dateTimeField0 = gJChronology0.hourOfDay();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DurationField durationField0 = buddhistChronology0.halfdays();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_INDIAN;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance((DateTimeZone) null, islamicChronology_LeapYearPatternType0);
      DateTimeField dateTimeField0 = islamicChronology0.halfdayOfDay();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.getDateTimeMillis((-1130L), 1, 1, 1, 752);
      assertEquals((-71938248L), long0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GregorianChronology gregorianChronology0 = GregorianChronology.getInstance(dateTimeZone0);
      long long0 = gregorianChronology0.getDateTimeMillis(1, 1, 1, 0);
      assertEquals((-62135588424000L), long0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_16_BASED;
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0, islamicChronology_LeapYearPatternType0);
      DurationField durationField0 = islamicChronology0.eras();
      assertTrue(durationField0.isPrecise());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeField dateTimeField0 = buddhistChronology0.era();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance(dateTimeZone0);
      DurationField durationField0 = islamicChronology0.days();
      assertNotNull(durationField0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.dayOfYear();
      assertEquals("dayOfYear", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = julianChronology0.dayOfWeek();
      assertEquals("dayOfWeek", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      EthiopicChronology ethiopicChronology0 = EthiopicChronology.getInstance(dateTimeZone0);
      DateTimeField dateTimeField0 = ethiopicChronology0.dayOfMonth();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.clockhourOfHalfday();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstance();
      JulianChronology julianChronology0 = new JulianChronology(islamicChronology0, "clockhourOfDay", 1);
      DateTimeField dateTimeField0 = julianChronology0.clockhourOfDay();
      assertTrue(dateTimeField0.isSupported());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeField dateTimeField0 = buddhistChronology0.centuryOfEra();
      assertNotNull(dateTimeField0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, 120L, 1);
      DurationField durationField0 = gJChronology0.centuries();
      assertEquals("centuries", durationField0.getName());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ISOChronology iSOChronology0 = ISOChronology.getInstance(dateTimeZone0);
      long long0 = iSOChronology0.add((ReadablePeriod) null, (-4842L), 1);
      assertEquals((-4842L), long0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.add((-535L), (-535L), (-1));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      StrictChronology strictChronology0 = StrictChronology.getInstance(gJChronology0);
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        strictChronology0.validate((ReadablePartial) null, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CopticChronology copticChronology0 = CopticChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        copticChronology0.set((ReadablePartial) null, (-2613L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ISOChronology iSOChronology0 = ISOChronology.getInstanceUTC();
      try { 
        iSOChronology0.getDateTimeMillis((-1L), (-328), (-328), (-328), (-556));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -328 for hourOfDay must be in the range [0,23]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      IslamicChronology islamicChronology0 = IslamicChronology.getInstanceUTC();
      try { 
        islamicChronology0.getDateTimeMillis(0, (-4899), 0, 0, 0, 1, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -4899 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      try { 
        buddhistChronology0.getDateTimeMillis(1, 1828, (-2380), (-2380));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value 1828 for monthOfYear must be in the range [1,12]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      // Undeclared exception!
      try { 
        buddhistChronology0.get((ReadablePeriod) null, 0L, (-499L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        buddhistChronology0.get((ReadablePeriod) null, (long) 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      JulianChronology julianChronology0 = JulianChronology.getInstanceUTC();
      // Undeclared exception!
      try { 
        julianChronology0.get((ReadablePartial) null, (long) 12);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.chrono.BaseChronology", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      long long0 = buddhistChronology0.add(1879L, 1879L, 0);
      assertEquals(1879L, long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.add((-802L), (-802L), 783);
      assertEquals((-628768L), long0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      GJChronology gJChronology0 = GJChronology.getInstance();
      DateTimeZone dateTimeZone0 = gJChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      long long0 = zonedChronology0.add((-2591L), 0L, 1934);
      assertEquals((-2591L), long0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.add((ReadablePeriod) null, 0L, (-2103));
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.add((ReadablePeriod) null, 1227L, 0);
      assertEquals(1227L, long0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(buddhistChronology0, dateTimeZone0);
      try { 
        zonedChronology0.getDateTimeMillis((-799), 1, 1, (-2103));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -2103 for millisOfDay must be in the range [0,86399999]
         //
         verifyException("org.joda.time.field.FieldUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      DateTimeZone dateTimeZone0 = buddhistChronology0.getZone();
      GJChronology gJChronology0 = GJChronology.getInstance(dateTimeZone0, 120L, 1);
      ZonedChronology zonedChronology0 = ZonedChronology.getInstance(gJChronology0, dateTimeZone0);
      DateTimeField dateTimeField0 = zonedChronology0.minuteOfHour();
      assertEquals("minuteOfHour", dateTimeField0.getName());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstanceUTC();
      long long0 = buddhistChronology0.getDateTimeMillis(1, 1, 1, 1, 1, 1, 1);
      assertEquals((-79271564338999L), long0);
  }
}
