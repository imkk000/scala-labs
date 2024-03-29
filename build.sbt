import sbt.Path

name := "ScalaLabs"

organization := "Xebia B.V."

version := "1.0"

scalaVersion := "2.13.1"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers ++= Seq("Local Maven Repository" at "file:///"+Path.userHome+"/.m2/repository",
        "Signpost releases" at "https://oss.sonatype.org/content/repositories/signpost-releases/")

// You should be able to use the following to read all dependencies from the pom.xml file, but somehow those aren't picked up.
// see: https://github.com/harrah/xsbt/wiki/Library-Management
// externalPom()

libraryDependencies ++= Seq("joda-time" % "joda-time" % "2.10.5",
        "org.scala-lang.modules" %% "scala-parallel-collections" % "0.2.0",
        "org.scalatestplus" %% "scalatestplus-junit" % "1.0.0-M2",
        "org.scalatest" %% "scalatest" % "3.2.0-M1" % "test",
        "org.specs2" %% "specs2-core" % "4.8.0" % "test",
        "org.specs2" %% "specs2-junit" % "4.8.0" % "test",
        "org.scala-lang.modules" %% "scala-xml" % "1.2.0",
        "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
        "org.json4s" %% "json4s-native" % "3.6.7",
        "junit" % "junit" % "4.7" % "test",
        "hsqldb" % "hsqldb" % "1.8.0.1" % "test",
        "org.slf4j" % "slf4j-simple" % "1.4.2")



