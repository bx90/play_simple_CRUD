name := """warehouse_Eclipse"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
	javaCore,
  cache,
  javaWs,
	javaJpa
)


fork in run := true