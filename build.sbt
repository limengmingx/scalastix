
name := "scalastix"

version := (version in ThisBuild).value

organization := "com.github.workingDog"

scalaVersion := "2.12.2"

crossScalaVersions := Seq("2.11.11", "2.12.2")

val circeVersion = "0.8.0"

// for scala.js .... see also plugins.sbt
//enablePlugins(ScalaJSPlugin)
//
// skip in packageJSDependencies := false
//
//scalaJSStage in Global := FastOptStage  // FullOptStage //
//
//jsDependencies += RuntimeDOM
//
//libraryDependencies ++= Seq(
//  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
//  "io.circe" %%% "circe-core" % circeVersion,
//  "io.circe" %%% "circe-generic" % circeVersion,
//  "io.circe" %%% "circe-parser" % circeVersion,
//  "io.circe"  %%% "circe-generic-extras" % circeVersion
//)

// for scala
fork := true
javaOptions in compile += "-Xmx8G"
javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xmx8G")

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "io.circe" %% "circe-generic-extras" % circeVersion
)

scalacOptions ++= Seq(
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-feature", // Emit warning and location for usages of features that should be imported explicitly.
  "-unchecked", // Enable additional warnings where generated code depends on assumptions.
  "-Xlint" // Enable recommended additional warnings.
)

homepage := Some(url("https://github.com/workingDog/scalastix"))

licenses := Seq("Apache 2" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

resolvers += Resolver.sonatypeRepo("releases")

mainClass in assembly := Some("com.kodekutters.Example2")

assemblyJarName in assembly := "scalastix_2.12-1.0-SNAPSHOT.jar"
