name := "scopt-test"

version := "0.1"

scalaVersion := "2.12.14"

// works
//libraryDependencies += "com.github.scopt" %% "scopt" % "3.7.0"

// does not work
libraryDependencies += "com.github.scopt" %% "scopt" % "3.7.1"
//libraryDependencies += "com.github.scopt" %% "scopt" % "4.0.1"

libraryDependencies += "org.scalameta" %% "munit" % "0.7.26" % Test

mainClass := Some("ScoptMain")