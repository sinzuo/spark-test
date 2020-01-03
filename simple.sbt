name := "Simple Project"
version := "1.0"
scalaVersion := "2.11.7"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.0.2" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.2" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.2" % "provided"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka-0-10_2.11" % "2.0.2"   //注意版本

