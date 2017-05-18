package ${package}

import org.scalatest.FunSuite

class ListSuite extends FunSuite {

  test("foo") {
    val args = Array("Hello", ",", " ", "world", "!")

    assert(App.foo(args) === "Hello, world!")
  }

}
