ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3-RC1-bin-20220410-220b753-NIGHTLY"

lazy val root = (project in file("."))
  .settings(
    name := "dotty-i14907"
  )
