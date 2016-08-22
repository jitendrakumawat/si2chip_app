
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/si2chip/web_app/msmp1.0.git/conf/routes
// @DATE:Sun Aug 14 17:23:36 IST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:63
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:38
    def showAdminPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.showAdminPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:43
    def addAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:39
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:44
    def modifyAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.modifyAdmin",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:47
    def showForbiddenPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.showForbiddenPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "noadminaccess"})
        }
      """
    )
  
    // @LINE:45
    def getAdminUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getAdminUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admins"})
        }
      """
    )
  
    // @LINE:41
    def modifyUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.modifyUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:42
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteUser",
      """
        function(userId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userId", encodeURIComponent(userId0))})
        }
      """
    )
  
    // @LINE:46
    def showSetupPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.showSetupPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "setup"})
        }
      """
    )
  
  }

  // @LINE:58
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseGroupController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def addGroup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupController.addGroup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "group"})
        }
      """
    )
  
    // @LINE:14
    def addUserToGroup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupController.addUserToGroup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "groupuser"})
        }
      """
    )
  
    // @LINE:19
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "allusers"})
        }
      """
    )
  
    // @LINE:18
    def getGroupUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupController.getGroupUsers",
      """
        function(groupId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "groupusers/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("groupId", encodeURIComponent(groupId0))})
        }
      """
    )
  
    // @LINE:12
    def deleteGroup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupController.deleteGroup",
      """
        function(groupId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "group/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("groupId", encodeURIComponent(groupId0))})
        }
      """
    )
  
    // @LINE:17
    def showGroupsPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupController.showGroupsPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "groups"})
        }
      """
    )
  
    // @LINE:16
    def getOwnedGroups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupController.getOwnedGroups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ownedgroups"})
        }
      """
    )
  
    // @LINE:15
    def getMyGroups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupController.getMyGroups",
      """
        function(userId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mygroups/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userId", encodeURIComponent(userId0))})
        }
      """
    )
  
    // @LINE:13
    def deleteGroupUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GroupController.deleteGroupUser",
      """
        function(groupId0,userId1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "groupuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("groupId", encodeURIComponent(groupId0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userId", encodeURIComponent(userId1))})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getUserSummary: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getUserSummary",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "summary"})
        }
      """
    )
  
    // @LINE:8
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:6
    def showForbiddenPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.showForbiddenPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "noaccess"})
        }
      """
    )
  
    // @LINE:5
    def showHomePage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.showHomePage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReversePostController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def refreshPageUserBroadcast: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.refreshPageUserBroadcast",
      """
        function(endId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/userbposts/refresh/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("endId", encodeURIComponent(endId0))})
        }
      """
    )
  
    // @LINE:21
    def getPosts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getPosts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts"})
        }
      """
    )
  
    // @LINE:32
    def refreshPageUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.refreshPageUser",
      """
        function(endId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/user/refresh/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("endId", encodeURIComponent(endId0))})
        }
      """
    )
  
    // @LINE:30
    def getNextPageUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getNextPageUser",
      """
        function(lastId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/user/after/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lastId", encodeURIComponent(lastId0))})
        }
      """
    )
  
    // @LINE:22
    def addPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.addPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
        }
      """
    )
  
    // @LINE:27
    def getFirstPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getFirstPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/first"})
        }
      """
    )
  
    // @LINE:26
    def getNextPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getNextPage",
      """
        function(lastId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/after/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lastId", encodeURIComponent(lastId0))})
        }
      """
    )
  
    // @LINE:29
    def getPreviousPageUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getPreviousPageUser",
      """
        function(firstId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/user/before/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("firstId", encodeURIComponent(firstId0))})
        }
      """
    )
  
    // @LINE:34
    def getNextPageUserBroadcast: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getNextPageUserBroadcast",
      """
        function(lastId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/userbposts/after/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lastId", encodeURIComponent(lastId0))})
        }
      """
    )
  
    // @LINE:28
    def refreshPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.refreshPage",
      """
        function(endId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/refresh/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("endId", encodeURIComponent(endId0))})
        }
      """
    )
  
    // @LINE:33
    def getPreviousPageUserBroadcast: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getPreviousPageUserBroadcast",
      """
        function(firstId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/userbposts/before/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("firstId", encodeURIComponent(firstId0))})
        }
      """
    )
  
    // @LINE:24
    def deletePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.deletePost",
      """
        function(postId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "post/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("postId", encodeURIComponent(postId0))})
        }
      """
    )
  
    // @LINE:31
    def getFirstPageUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getFirstPageUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/user/first"})
        }
      """
    )
  
    // @LINE:25
    def getPreviousPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getPreviousPage",
      """
        function(firstId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/before/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("firstId", encodeURIComponent(firstId0))})
        }
      """
    )
  
    // @LINE:23
    def addPostAndBroadcast: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.addPostAndBroadcast",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postnotify"})
        }
      """
    )
  
    // @LINE:35
    def getFirstPageUserBroadcast: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getFirstPageUserBroadcast",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts/userbposts/first"})
        }
      """
    )
  
  }

  // @LINE:49
  class ReverseCommentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def getLastPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentController.getLastPage",
      """
        function(postId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments/last/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("postId", encodeURIComponent(postId0))})
        }
      """
    )
  
    // @LINE:53
    def getFirstPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentController.getFirstPage",
      """
        function(postId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments/first/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("postId", encodeURIComponent(postId0))})
        }
      """
    )
  
    // @LINE:49
    def addComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentController.addComment",
      """
        function(postId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("postId", encodeURIComponent(postId0))})
        }
      """
    )
  
    // @LINE:50
    def deleteComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentController.deleteComment",
      """
        function(postId0,commentId1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("postId", encodeURIComponent(postId0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("commentId", encodeURIComponent(commentId1))})
        }
      """
    )
  
    // @LINE:51
    def getPreviousPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentController.getPreviousPage",
      """
        function(postId0,firstId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments/before/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("postId", encodeURIComponent(postId0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("firstId", encodeURIComponent(firstId1))})
        }
      """
    )
  
    // @LINE:55
    def refreshPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentController.refreshPage",
      """
        function(postId0,beginId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments/refresh/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("postId", encodeURIComponent(postId0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("beginId", encodeURIComponent(beginId1))})
        }
      """
    )
  
    // @LINE:52
    def getNextPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CommentController.getNextPage",
      """
        function(postId0,lastId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments/after/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("postId", encodeURIComponent(postId0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lastId", encodeURIComponent(lastId1))})
        }
      """
    )
  
  }


}
