Scopt 3.7.0 -> 3.7.1 bug
========================

Parsing multiple `args` no longer works as expected between scopt 3.7.0 and 3.7.1. In particular the 
`minOccurs` method does not seem to work in the same way.

If you invoke `test` with `libraryDependencies += "com.github.scopt" %% "scopt" % "3.7.0"` in build.sbt then
the test will pass, however if you set the version to `3.7.1` and run test then it will fail with the error

```
MultiArgsSuite:
Error: Argument [source_path...] <target_path>' must be given 2 times
Try --help for more information.
```