import scala.io.Source

// leaves the file open
for (line <- io.Source.fromFile("example.txt").getLines) {
  println(line)
}

// also leaves the file open
val contents = io.Source.fromFile("example.txt").mkString
