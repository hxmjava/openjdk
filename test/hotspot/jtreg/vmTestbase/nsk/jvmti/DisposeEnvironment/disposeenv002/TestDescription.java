/*
 * Copyright (c) 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 *
 * @summary converted from VM Testbase nsk/jvmti/DisposeEnvironment/disposeenv002.
 * VM Testbase keywords: [quick, jpda, jvmti, noras]
 * VM Testbase readme:
 * DESCRIPTION
 *     This JVMTI test exercises JVMTI thread function DisposeEnvironment().
 *     This test checks that DisposeEnvironment() invoked in VM_DEATH callback
 *     does not return any error. No other cheks are performed.
 *     The test sets and enables VM_DEATH event callback in JVM_OnLoad() and
 *     disables VM_DEATH event in its callback before invoking DisposeEnvironment().
 *     If DisposeEnvironment() returns any error in VM_DEATH callback,
 *     the test calls C-language function exit() to exit with status 97.
 *     On success the VM runs debuggee class and exits with status 95.
 * COMMENTS
 *
 * @library /vmTestbase
 *          /test/lib
 * @run driver jdk.test.lib.FileInstaller . .
 * @run main/othervm/native
 *      -agentlib:disposeenv002=-waittime=5
 *      nsk.jvmti.DisposeEnvironment.disposeenv002
 */

