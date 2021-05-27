lazy val scalda = project
  .in(file("."))
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "3.1.1")
  .settings(libraryDependencies += "com.github.pathikrit" %% "better-files" % "3.9.1")
