package com.soap.flink.source;

import org.apache.flink.api.connector.source.*;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.connector.base.source.reader.RecordEmitter;
import org.apache.flink.connector.base.source.reader.RecordsWithSplitIds;
import org.apache.flink.connector.base.source.reader.SourceReaderBase;
import org.apache.flink.connector.base.source.reader.fetcher.SplitFetcherManager;
import org.apache.flink.connector.base.source.reader.splitreader.SplitReader;
import org.apache.flink.connector.base.source.reader.synchronization.FutureCompletingBlockingQueue;
import org.apache.flink.connector.base.source.reader.synchronization.FutureNotifier;
import org.apache.flink.core.io.InputStatus;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;

/**
 * @author yangfuzhao on 2021/5/21.
 */
public class SourceAPI {
    public static void main(String[] args) {
//        KafkaConsumer
    }
}

/**
 *
 */
class MySplitEnumerator implements SplitEnumerator {
    @Override
    public void start() {

    }

    @Override
    public void handleSourceEvent(int subtaskId, SourceEvent sourceEvent) {

    }

    @Override
    public void addSplitsBack(List splits, int subtaskId) {

    }

    @Override
    public void addReader(int subtaskId) {

    }

    @Override
    public Object snapshotState() throws Exception {
        return null;
    }

    @Override
    public void close() throws IOException {

    }
}


/**
 * 同步拉取
 * 1、handleSplitsChanges 非阻塞处理 split的变更；
 * 2、wakeUp 唤醒 抓取操作
 * 3、fetch 同步抓取
 */
class MySplitReader implements SplitReader {

    @Override
    public RecordsWithSplitIds fetch() throws InterruptedException {
        return null;
    }

    @Override
    public void wakeUp() {

    }

    @Override
    public void handleSplitsChanges(Queue queue) {

    }
}

/**
 * SourceReader 异步实现
 */
class MySourceReader implements SourceReader {
    @Override
    public void start() {

    }

    @Override
    public InputStatus pollNext(ReaderOutput output) throws Exception {
        return null;
    }

    @Override
    public List snapshotState() {
        return null;
    }

    @Override
    public CompletableFuture<Void> isAvailable() {
        return null;
    }

    @Override
    public void addSplits(List splits) {

    }

    @Override
    public void handleSourceEvents(SourceEvent sourceEvent) {

    }

    @Override
    public void close() throws Exception {

    }
}



class MySourceReaderBase extends SourceReaderBase {

    public MySourceReaderBase(FutureNotifier futureNotifier, FutureCompletingBlockingQueue elementsQueue, SplitFetcherManager splitFetcherManager, RecordEmitter recordEmitter, Configuration config, SourceReaderContext context) {
        super(futureNotifier, elementsQueue, splitFetcherManager, recordEmitter, config, context);
    }

    @Override
    protected void onSplitFinished(Collection collection) {

    }

    @Override
    protected Object initializedState(SourceSplit sourceSplit) {
        return null;
    }

    @Override
    protected SourceSplit toSplitType(String s, Object o) {
        return null;
    }
}
