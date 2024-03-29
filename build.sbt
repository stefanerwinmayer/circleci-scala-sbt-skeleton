import Dependencies._

ThisBuild / scalaVersion := "2.12.9"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "CircleCi Scala Sbt Skeleton",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

import sbtsonar.SonarPlugin.autoImport.sonarProperties

sonarProperties ++= Map(
  "sonar.projectKey" -> "stefanerwinmayer_circleci_scala_sbt_skeleton",
  "sonar.organization" -> "stefanerwinmayer-github",
  "sonar.sources" -> "src/main/scala",
  "sonar.tests" -> "src/test/scala",
  "sonar.host.url" -> "https://sonarcloud.io",
  "sonar.scala.coverage.reportPaths" -> "target/scala-2.12/scoverage-report/scoverage.xml",
  "sonar.scala.scapegoat.reportPaths" -> "target/scala-2.12/scapegoat-report/scapegoat-scalastyle.xml",
  "sonar.scala.scalastyle.reportPaths" -> "target/scalastyle-result.xml"
)

scapegoatVersion in ThisBuild := "1.3.8"

coverageEnabled := true

wartremoverWarnings ++= Warts.all
