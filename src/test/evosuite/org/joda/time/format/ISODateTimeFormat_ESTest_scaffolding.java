/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jun 25 13:21:07 GMT 2018
 */

package org.joda.time.format;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ISODateTimeFormat_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.format.ISODateTimeFormat"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/_x/tfjywptd7r50k3bqzfvdz4pc0000gn/T/"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/Users/jhveras/Documents/tcc/joda-time"); 
    java.lang.System.setProperty("user.home", "/Users/jhveras"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "jhveras"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ISODateTimeFormat_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.DateTimeZone",
      "org.joda.time.format.DateTimeParser",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.DateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.ReadableInstant",
      "org.joda.time.IllegalInstantException",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.tz.Provider",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.DurationFieldType",
      "org.joda.time.format.DateTimePrinter",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.ReadWritableInstant",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.LocalTime",
      "org.joda.time.format.InternalPrinter",
      "org.joda.time.format.DateTimePrinterInternalPrinter",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.Chronology",
      "org.joda.time.DateTime",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.LocalDateTime",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.MutableDateTime",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.format.DateTimeParserInternalParser",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.LocalDate",
      "org.joda.time.ReadableDateTime",
      "org.joda.time.ReadWritableDateTime",
      "org.joda.time.format.InternalParserDateTimeParser",
      "org.joda.time.format.InternalParser",
      "org.joda.time.ReadablePartial",
      "org.joda.time.DurationFieldType$StandardDurationFieldType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ISODateTimeFormat_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.format.InternalParserDateTimeParser",
      "org.joda.time.format.DateTimeParserInternalParser",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.format.DateTimePrinterInternalPrinter",
      "org.joda.time.UTCDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.format.ISODateTimeFormat$Constants",
      "org.joda.time.Chronology"
    );
  }
}
