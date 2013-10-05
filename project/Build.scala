import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "rhinofly-global-test"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    //"nl.rhinofly" %% "play-s3" % "3.3.0",
    "com.typesafe" %% "scalalogging-slf4j" % "1.0.1"  
  )


  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "Rhinofly Internal Repository" at "http://maven-repository.rhinofly.net:8081/artifactory/libs-release-local"
  )

}
