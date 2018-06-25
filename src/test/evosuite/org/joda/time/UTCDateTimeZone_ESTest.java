/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 25 13:52:33 GMT 2018
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.UTCDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UTCDateTimeZone_ESTest extends UTCDateTimeZone_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      long long0 = uTCDateTimeZone0.previousTransition(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      long long0 = uTCDateTimeZone0.previousTransition(1172L);
      assertEquals(1172L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      long long0 = uTCDateTimeZone0.nextTransition(1L);
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      long long0 = uTCDateTimeZone0.nextTransition((-1637L));
      assertEquals((-1637L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      boolean boolean0 = uTCDateTimeZone0.equals(uTCDateTimeZone0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      int int0 = uTCDateTimeZone0.getOffset(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)UTCDateTimeZone.INSTANCE;
      int int0 = uTCDateTimeZone0.getStandardOffset((-950L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      String string0 = uTCDateTimeZone0.getNameKey(0L);
      assertEquals("UTC", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      long long0 = uTCDateTimeZone0.previousTransition((-1463L));
      assertEquals((-1463L), long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      long long0 = uTCDateTimeZone0.nextTransition(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      int int0 = uTCDateTimeZone0.getOffsetFromLocal((-1463L));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      boolean boolean0 = uTCDateTimeZone0.isFixed();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      TimeZone timeZone0 = uTCDateTimeZone0.toTimeZone();
      uTCDateTimeZone0.equals(timeZone0);
      assertEquals(0, timeZone0.getRawOffset());
      assertEquals("java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", timeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = new UTCDateTimeZone();
      uTCDateTimeZone0.hashCode();
  }
}
