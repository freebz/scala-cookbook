import scala.io.Source

val bufferedSource = Source.fromFile("example.txt")
for (line <- bufferedSource.getLines) {
  println(line.toUpperCase)
}
bufferedSource.close
