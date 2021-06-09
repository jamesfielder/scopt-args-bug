class MultiArgsSuite extends munit.FunSuite {
  test("multiargs") {
    val args = Array("1", "2")

    assertEquals(Parsers.parse(args), Config(Seq("1", "2")))
  }
}
