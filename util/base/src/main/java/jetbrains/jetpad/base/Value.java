/*
 * Copyright 2012-2016 JetBrains s.r.o
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.jetpad.base;

import com.google.common.base.Supplier;

public final class Value<ValueT> implements Supplier<ValueT> {
  private ValueT myValue;

  public Value() {
    this(null);
  }

  public Value(ValueT value) {
    myValue = value;
  }

  public ValueT get() {
    return myValue;
  }

  public void set(ValueT value) {
    myValue = value;
  }

  @Override
  public String toString() {
    return "" + myValue;
  }
}