/*
 * This file was automatically generated by EvoSuite
 * Sun Jun 24 23:39:56 GMT 2018
 */

package org.joda.time.field;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.field.ScaledDurationField;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScaledDurationField_ESTest extends ScaledDurationField_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScaledDurationField scaledDurationField0 = null;
      try {
        scaledDurationField0 = new ScaledDurationField((DurationField) null, (DurationFieldType) null, (-598));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The type must not be null
         //
         verifyException("org.joda.time.field.BaseDurationField", e);
      }
  }
}
