//package com.soap.flink.connector
//
//import org.apache.flink.api.java.utils.ParameterTool
//import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
//
//import java.io.File
//import org.apache.flink.api.scala._
//
//
//
///**
// * @author yangfuzhao on 2021/11/11.
// */
//object FlinkCDC {
//
//  def main(args: Array[String]): Unit = {
//    val env: StreamExecutionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment
//
//    var params: ParameterTool = ParameterTool.fromArgs(args)
//    val checkPointDirPath = params.get("checkpoint-dir")
//    // 获取最后一个checkpoint文件夹
//    val checkpointDirs = new io.Directory(new File(checkPointDirPath)).list
//    if (checkpointDirs.nonEmpty) {
//      val lastCheckpointDir = checkpointDirs.maxBy(_.lastModified)
//      val checkpoints = new Directory(lastCheckpointDir.jfile).list.filter(_.name.startsWith("chk-"))
//      if (checkpoints.nonEmpty) {
//        val lastCheckpoint = checkpoints.maxBy(_.lastModified).path
//        val newArgs = Array("--last-checkpoint", "file://" + lastCheckpoint)
//        // 重新载入配置
//        params = ParameterTool.fromArgs(args ++ newArgs)
//      }
//    }
//    env.getConfig.setGlobalJobParameters(params)
//
//    // ################################省略代码……
//
//    // 设置状态后端：MemoryStateBackend、FsStateBackend、RocksDBStateBackend，这里设置基于文件的状态后端
//    env.setStateBackend(new FsStateBackend("file://"+checkPointDirPath))
//
//  }
//}
