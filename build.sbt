lazy val scalda = project
  .in(file("."))
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "3.4.6")
  .settings(libraryDependencies += ("com.github.pathikrit" %% "better-files" % "3.9.1").cross(CrossVersion.for3Use2_13))
  .settings(libraryDependencies += "org.tpolecat" %% "atto-core" % "0.9.5")
