/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 25 13:48:02 GMT 2018
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.convert.ReadableIntervalConverter;
import org.joda.time.format.DateTimeFormatter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ReadableIntervalConverter_ESTest extends ReadableIntervalConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      readableIntervalConverter0.isReadableInterval((Object) null, (Chronology) null);
      // Undeclared exception!
      try { 
        readableIntervalConverter0.setInto((ReadWritableInterval) null, (Object) "", (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.joda.time.ReadableInterval
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.setInto((ReadWritablePeriod) null, (Object) null, (Chronology) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class org.joda.time.chrono.ISOChronology
         //
         verifyException("org.joda.time.DateTimeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      // Undeclared exception!
      try { 
        readableIntervalConverter0.setInto((ReadWritablePeriod) null, (Object) "", (Chronology) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.joda.time.ReadableInterval
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      Class<?> class0 = readableIntervalConverter0.getSupportedType();
      Chronology chronology0 = null;
      readableIntervalConverter0.isReadableInterval(class0, (Chronology) null);
      // Undeclared exception!
      try { 
        readableIntervalConverter0.getDurationMillis(class0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Class cannot be cast to org.joda.time.ReadableInterval
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      readableIntervalConverter0.getSupportedType();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.getDurationMillis((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      // Undeclared exception!
      try { 
        readableIntervalConverter0.setInto((ReadWritableInterval) null, (Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = ReadableIntervalConverter.INSTANCE;
      String string0 = "";
      Chronology chronology0 = null;
      readableIntervalConverter0.isReadableInterval("", (Chronology) null);
      readableIntervalConverter0.getSupportedType();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.getDurationMillis("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.joda.time.ReadableInterval
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      String string0 = "";
      // Undeclared exception!
      try { 
        readableIntervalConverter0.getDurationMillis("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.joda.time.ReadableInterval
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.getDurationMillis("");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.joda.time.ReadableInterval
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ReadableIntervalConverter readableIntervalConverter0 = new ReadableIntervalConverter();
      // Undeclared exception!
      try { 
        readableIntervalConverter0.setInto((ReadWritableInterval) null, (Object) null, (Chronology) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.joda.time.convert.ReadableIntervalConverter", e);
      }
  }
}
