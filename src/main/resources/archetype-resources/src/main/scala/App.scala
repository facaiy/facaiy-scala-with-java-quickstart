package ${package}

/**
 * @author ${user.name}
 */
object App {

  def foo(x: Array[String]): String = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {
    print("Hello World!\n")
    print("concat arguments = " + foo(args) + "\n")
  }

}
