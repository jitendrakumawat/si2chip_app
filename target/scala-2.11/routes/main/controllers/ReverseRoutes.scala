
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/si2chip/web_app/msmp1.0.git/conf/routes
// @DATE:Sun Aug 14 17:23:36 IST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:63
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:38
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def addUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:38
    def showAdminPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:43
    def addAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:39
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:44
    def modifyAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:47
    def showForbiddenPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noadminaccess")
    }
  
    // @LINE:45
    def getAdminUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admins")
    }
  
    // @LINE:41
    def modifyUser(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:42
    def deleteUser(userId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("userId", dynamicString(userId)))
    }
  
    // @LINE:46
    def showSetupPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "setup")
    }
  
  }

  // @LINE:58
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:11
  class ReverseGroupController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def addGroup(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "group")
    }
  
    // @LINE:14
    def addUserToGroup(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "groupuser")
    }
  
    // @LINE:19
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "allusers")
    }
  
    // @LINE:18
    def getGroupUsers(groupId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "groupusers/" + implicitly[PathBindable[String]].unbind("groupId", dynamicString(groupId)))
    }
  
    // @LINE:12
    def deleteGroup(groupId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "group/" + implicitly[PathBindable[String]].unbind("groupId", dynamicString(groupId)))
    }
  
    // @LINE:17
    def showGroupsPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "groups")
    }
  
    // @LINE:16
    def getOwnedGroups(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ownedgroups")
    }
  
    // @LINE:15
    def getMyGroups(userId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mygroups/" + implicitly[PathBindable[String]].unbind("userId", dynamicString(userId)))
    }
  
    // @LINE:13
    def deleteGroupUser(groupId:String, userId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "groupuser/" + implicitly[PathBindable[String]].unbind("groupId", dynamicString(groupId)) + "/" + implicitly[PathBindable[String]].unbind("userId", dynamicString(userId)))
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getUserSummary(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "summary")
    }
  
    // @LINE:8
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:6
    def showForbiddenPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noaccess")
    }
  
    // @LINE:5
    def showHomePage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:60
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:21
  class ReversePostController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def refreshPageUserBroadcast(endId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/userbposts/refresh/" + implicitly[PathBindable[String]].unbind("endId", dynamicString(endId)))
    }
  
    // @LINE:21
    def getPosts(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts")
    }
  
    // @LINE:32
    def refreshPageUser(endId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/user/refresh/" + implicitly[PathBindable[String]].unbind("endId", dynamicString(endId)))
    }
  
    // @LINE:30
    def getNextPageUser(lastId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/user/after/" + implicitly[PathBindable[String]].unbind("lastId", dynamicString(lastId)))
    }
  
    // @LINE:22
    def addPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "post")
    }
  
    // @LINE:27
    def getFirstPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/first")
    }
  
    // @LINE:26
    def getNextPage(lastId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/after/" + implicitly[PathBindable[String]].unbind("lastId", dynamicString(lastId)))
    }
  
    // @LINE:29
    def getPreviousPageUser(firstId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/user/before/" + implicitly[PathBindable[String]].unbind("firstId", dynamicString(firstId)))
    }
  
    // @LINE:34
    def getNextPageUserBroadcast(lastId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/userbposts/after/" + implicitly[PathBindable[String]].unbind("lastId", dynamicString(lastId)))
    }
  
    // @LINE:28
    def refreshPage(endId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/refresh/" + implicitly[PathBindable[String]].unbind("endId", dynamicString(endId)))
    }
  
    // @LINE:33
    def getPreviousPageUserBroadcast(firstId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/userbposts/before/" + implicitly[PathBindable[String]].unbind("firstId", dynamicString(firstId)))
    }
  
    // @LINE:24
    def deletePost(postId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "post/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)))
    }
  
    // @LINE:31
    def getFirstPageUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/user/first")
    }
  
    // @LINE:25
    def getPreviousPage(firstId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/before/" + implicitly[PathBindable[String]].unbind("firstId", dynamicString(firstId)))
    }
  
    // @LINE:23
    def addPostAndBroadcast(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "postnotify")
    }
  
    // @LINE:35
    def getFirstPageUserBroadcast(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/userbposts/first")
    }
  
  }

  // @LINE:49
  class ReverseCommentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def getLastPage(postId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/last/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)))
    }
  
    // @LINE:53
    def getFirstPage(postId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/first/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)))
    }
  
    // @LINE:49
    def addComment(postId:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "comment/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)))
    }
  
    // @LINE:50
    def deleteComment(postId:String, commentId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "comment/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)) + "/" + implicitly[PathBindable[String]].unbind("commentId", dynamicString(commentId)))
    }
  
    // @LINE:51
    def getPreviousPage(postId:String, firstId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/before/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)) + "/" + implicitly[PathBindable[String]].unbind("firstId", dynamicString(firstId)))
    }
  
    // @LINE:55
    def refreshPage(postId:String, beginId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/refresh/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)) + "/" + implicitly[PathBindable[String]].unbind("beginId", dynamicString(beginId)))
    }
  
    // @LINE:52
    def getNextPage(postId:String, lastId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/after/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)) + "/" + implicitly[PathBindable[String]].unbind("lastId", dynamicString(lastId)))
    }
  
  }


}
