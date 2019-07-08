/* Copyright 2019 Norconex Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.norconex.collector.http.web.recovery;

import com.norconex.collector.core.data.store.ICrawlDataStoreFactory;
import com.norconex.collector.http.data.store.impl.jdbc.JDBCCrawlDataStoreFactory;

/**
 * Test that the right amount of docs are crawled after crashing the JVM
 * and resuming the collector.  Using Derby as crawl store.
 * @author Pascal Essiembre
 */
public class ResumeAfterJvmCrashDerby extends AbstractTestJvmCrash {
  //TODO keep?

    @Override
    protected boolean isResuming() {
        return true;
    }
    @Override
    protected ICrawlDataStoreFactory createCrawlDataStore() {
        return new JDBCCrawlDataStoreFactory();
    }
}
