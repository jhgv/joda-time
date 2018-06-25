/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 25 13:43:19 GMT 2018
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeFieldType;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.DateTimePrinterInternalPrinter;
import org.joda.time.format.InternalPrinterDateTimePrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DateTimePrinterInternalPrinter_ESTest extends DateTimePrinterInternalPrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeFormatterBuilder.StringLiteral dateTimeFormatterBuilder_StringLiteral0 = new DateTimeFormatterBuilder.StringLiteral("");
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_StringLiteral0);
      DateTimePrinterInternalPrinter.of(dateTimePrinter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimePrinterInternalPrinter.of((DateTimePrinter) null);
      DateTimePrinterInternalPrinter.of((DateTimePrinter) null);
      DateTimePrinterInternalPrinter.of((DateTimePrinter) null);
      DateTimePrinterInternalPrinter.of((DateTimePrinter) null);
      DateTimePrinterInternalPrinter.of((DateTimePrinter) null);
      DateTimePrinterInternalPrinter.of((DateTimePrinter) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeFormatterBuilder.TimeZoneId dateTimeFormatterBuilder_TimeZoneId0 = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_TimeZoneId0);
      DateTimePrinterInternalPrinter.of(dateTimePrinter0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateTimeFieldType dateTimeFieldType0 = DateTimeFieldType.weekyearOfCentury();
      DateTimeFormatterBuilder.FixedNumber dateTimeFormatterBuilder_FixedNumber0 = new DateTimeFormatterBuilder.FixedNumber(dateTimeFieldType0, (-1857), true);
      DateTimePrinter dateTimePrinter0 = InternalPrinterDateTimePrinter.of(dateTimeFormatterBuilder_FixedNumber0);
      DateTimePrinterInternalPrinter.of(dateTimePrinter0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateTimeFieldType[] dateTimeFieldTypeArray0 = new DateTimeFieldType[0];
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      DateTimeFormatterBuilder.Composite dateTimeFormatterBuilder_Composite0 = new DateTimeFormatterBuilder.Composite(linkedList0);
      DateTimeFormatter dateTimeFormatter0 = new DateTimeFormatter(dateTimeFormatterBuilder_Composite0, dateTimeFormatterBuilder_Composite0);
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter0 = (InternalPrinterDateTimePrinter)dateTimeFormatter0.getPrinter();
      InternalPrinterDateTimePrinter internalPrinterDateTimePrinter1 = (InternalPrinterDateTimePrinter)InternalPrinterDateTimePrinter.of(internalPrinterDateTimePrinter0);
      DateTimePrinterInternalPrinter.of(internalPrinterDateTimePrinter1);
      DateTimePrinterInternalPrinter.of(internalPrinterDateTimePrinter1);
  }
}
