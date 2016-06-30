# sbt-vs-idea
If you remove `% "provided"` from spark dependency in build.sbt, you can run `SbtVsIdea` from IntelliJ using one of its built-in Run configurations, but `sbt assembly` won't work.

If you keep it in there, `sbt assembly` will work, but IntelliJ won't be able to run the class.

test
