import scopt.OptionParser

case class Config(args: Seq[String])

object ScoptMain {

  import Parsers._

  def main(args: Array[String]): Unit = {
    println(parse(args).args.mkString("args: [", ", ", "]"))
  }
}

object Parsers {
  val parserOO = new OptionParser[Config]("test-args") {
    head("Give me dem multiargs :(")
    arg[String]("[source_path...] <target_path>")
      .minOccurs(2)
      .unbounded()
      .action((u, c) => c.copy(args = c.args :+ u))
    help("help").text("prints this usage text")
  }

  def parse(args: Array[String]): Config = {
    parserOO.parse(args, Config(Seq.empty)) match {
      case Some(config) => config
      case None => throw new IllegalArgumentException("Whatever")
    }
  }

  /** Scopt 4 only */

//  def parseScopt4(args: Array[String]): Config = {
//    OParser.parse(parser, args, Config(Seq.empty)) match {
//    case Some(config) => config
//    case None => throw new IllegalArgumentException("Whatever")
//    }
//  }
//  val builder = OParser.builder[Config]
//
//  val parser = {
//    import builder._
//
//    OParser.sequence(
//      programName("test-args"),
//      head("Give me dem multiargs :("),
//      arg[String]("[source_path...] <target_path>")
//        .minOccurs(2)
//        .unbounded()
//        .action((u, c) => c.copy(args = c.args :+ u)),
//      help("help").text("prints this usage text"),
//    )
//  }
}
