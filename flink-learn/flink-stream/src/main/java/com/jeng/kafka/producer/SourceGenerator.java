/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jeng.kafka.producer;

import java.io.*;

public class SourceGenerator {

    private static final long SPEED = 1000; // 每秒1000条
    private static final String LOG_DATA_FILE = "user_behavior.data";

    public static void main(String[] args) {
        long speed = SPEED;
        String logDataFile = LOG_DATA_FILE;
        if (args.length > 0) {
            speed = Long.valueOf(args[0]);
            logDataFile = args[1];
        }
        long delay = 1000_000 / speed; // 每条耗时多少毫秒

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(logDataFile)))) {
            long start = System.nanoTime();
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);

                long end = System.nanoTime();
                long diff = end - start;
                while (diff < (delay*1000)) {
                    Thread.sleep(1);
                    end = System.nanoTime();
                    diff = end - start;
                }
                start = end;
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
