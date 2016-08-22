
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/si2chip/web_app/msmp1.0.git/conf/routes
// @DATE:Sun Aug 14 17:23:36 IST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
