object main {

  def main(args: Array[String]) {

    val urlArray = Array( "HTTPS://GOLANG.ORG",
                          "HTTPS://SCALA-LANG.ORG",
                          "HTTPS://JAVA.COM",
                          "HTTPS://PYTHON.ORG",
                          "HTTPS://ISOCPP.ORG" )

    // Function literal
    val funcLit = (url: String) => url.toLowerCase()

    // Array traversing technique
    val newUrlArray = urlArray.map(funcLit)

    println(newUrlArray.toList)
  }
}