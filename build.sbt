lazy val scalda = project
  .in(file("."))
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "3.3.12")
  .settings(libraryDependencies += "com.github.pathikrit" %% "better-files" % "3.9.1")
  .settings(libraryDependencies += "org.tpolecat" %% "atto-core" % "0.9.5")
