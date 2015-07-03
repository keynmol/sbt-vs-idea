name := "sbt-vs-idea"

version := "0.1"

scalaVersion := "2.10.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.3.1" % "provided"

libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.2.10"

libraryDependencies += "com.github.rholder" % "snowball-stemmer" % "1.3.0.581.1"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.2.4" % "test"

libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % "3.2" % "test"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.3.0"

libraryDependencies += "net.debasishg" %% "redisclient" % "3.0"

resolvers += Resolver.sonatypeRepo("public")

mainClass in assembly := Some("org.idio.wikipedia.ner.stats.WikiStats")

assemblyJarName in assembly := name.value.toLowerCase + "-" + version.value + "-with-dependencies.jar"

fork := true

test in assembly := {}
