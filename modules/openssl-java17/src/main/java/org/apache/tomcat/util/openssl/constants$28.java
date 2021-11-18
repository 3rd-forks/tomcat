/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$28 {

    static final FunctionDescriptor OCSP_REQUEST_free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle OCSP_REQUEST_free$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "OCSP_REQUEST_free",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$28.OCSP_REQUEST_free$FUNC, false
    );
    static final FunctionDescriptor i2d_OCSP_REQUEST$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle i2d_OCSP_REQUEST$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "i2d_OCSP_REQUEST",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$28.i2d_OCSP_REQUEST$FUNC, false
    );
    static final MemorySegment OPENSSL_VERSION_TEXT$SEGMENT = CLinker.toCString("OpenSSL 1.1.1l  FIPS 24 Aug 2021", ResourceScope.newImplicitScope());
    static final MemorySegment SHLIB_VERSION_HISTORY$SEGMENT = CLinker.toCString("", ResourceScope.newImplicitScope());
    static final MemorySegment SHLIB_VERSION_NUMBER$SEGMENT = CLinker.toCString("1.1", ResourceScope.newImplicitScope());
    static final MemorySegment OPENSSL_FILE$SEGMENT = CLinker.toCString("/tmp/jextract$6761937692400069639.h", ResourceScope.newImplicitScope());
}

