/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.streams.core;

import org.joda.time.DateTime;

import java.math.BigInteger;
import java.util.Queue;

/**
 * Created by sblackmon on 12/13/13.
 */
public interface StreamsProvider {

    void start();
    void stop();

    public Queue<StreamsDatum> getProviderQueue();

    public StreamsResultSet readCurrent();
    public StreamsResultSet readNew(BigInteger sequence);
    public StreamsResultSet readRange(DateTime start, DateTime end);

}
