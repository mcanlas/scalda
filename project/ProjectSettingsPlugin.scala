import sbt.Keys._
import sbt._

object ProjectSettingsPlugin extends AutoPlugin {
  override def trigger = allRequirements

  override val projectSettings =
    Seq(
      scalaVersion := "2.13.5"
    )
}
