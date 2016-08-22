
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object posts_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class posts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.lang.Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isAdmin : java.lang.Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="""),_display_(/*9.34*/routes/*9.40*/.Assets.versioned("stylesheets/common/view.css")),format.raw/*9.88*/(""">
    <link rel="stylesheet" href="""),_display_(/*10.34*/routes/*10.40*/.Assets.versioned("stylesheets/posts.css")),format.raw/*10.82*/(""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>
    <title>SI2 Posts</title>
</head>
<body ng-app="posts" ng-controller="postsCtrl">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">SI2Chip</a>
                <img src="/home/si2chip/si2chip.jpg" style="width:50px;height:50px;">
            </div>

            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="#"> Posts </a></li>
                """),_display_(/*27.18*/if(isAdmin)/*27.29*/ {_display_(Seq[Any](format.raw/*27.31*/("""
                    """),format.raw/*28.21*/("""<li><a href="#" ng-click="showAdminPage($event)"><span class="glyphicon glyphicon-bishop"></span> Admin </a></li>
                """)))}),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""<li><a href="#" ng-click="showGroupsPage($event)"> Owned Groups </a></li>
                <li><a href="#" ng-click="signOut($event)"><span class="glyphicon glyphicon-log-out"></span> Sign out </a></li>
            </ul>
        </div>
    </nav>
    <div class="container">
        <div class="row">
            <div class="modal fade" id="conError" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <span>An error occurred transacting with the server.</span>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            """),format.raw/*45.29*/("""{"""),format.raw/*45.30*/("""{"""),format.raw/*45.31*/("""conerror"""),format.raw/*45.39*/("""}"""),format.raw/*45.40*/("""}"""),format.raw/*45.41*/("""
                        """),format.raw/*46.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-sm-offset-6">
                <div class="text-right">
                    <span class="who">"""),format.raw/*56.39*/("""{"""),format.raw/*56.40*/("""{"""),format.raw/*56.41*/("""loggedInUser()"""),format.raw/*56.55*/("""}"""),format.raw/*56.56*/("""}"""),format.raw/*56.57*/("""</span><span> Group: </span><span class="group">"""),format.raw/*56.105*/("""{"""),format.raw/*56.106*/("""{"""),format.raw/*56.107*/("""loggedInUserGroup()"""),format.raw/*56.126*/("""}"""),format.raw/*56.127*/("""}"""),format.raw/*56.128*/("""</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6 col-sm-offset-3">
                <div class="well well-lg">
                    <h4 id="poststitle">Posts <span class="badge">"""),format.raw/*63.67*/("""{"""),format.raw/*63.68*/("""{"""),format.raw/*63.69*/("""postpage.numPosts"""),format.raw/*63.86*/("""}"""),format.raw/*63.87*/("""}"""),format.raw/*63.88*/("""</span></h4>
                    <form name="apf" role="form">
                        <div class="form-group">
                            <textarea name="post" ng-model="post" class="form-control" maxlength="500" required placeholder="Enter your post here"></textarea>
                        </div>
                        <div class="text-right">
                            <button type="submit" ng-click="addPost($event)" class="btn btn-primary btn-xs">Post</button>
                        </div>
                    </form>
                    <div id="addError"></div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-sm-offset-3">
                <div class="well well-lg">
                    <div class="text-center">
                        <a href="#" ng-click="loadNextPage($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-circle-arrow-up"></span>
                        </a>
                        <a href="#" ng-if="postpage.endId != '-1'" ng-click="refreshCurrentPage($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-refresh"></span>
                        </a>
                        <a href="#" ng-if="!postpage.bLastPage" ng-click="loadPreviousPage($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-circle-arrow-down"></span>
                        </a>
                    </div>
                    <div id="delError"></div>
                    <div class="well well-lg" ng-repeat="pst in postpage.arr track by pst.id">
                        <div class="text-right">
                            <h6 class="postedby"><span class="user">"""),format.raw/*95.69*/("""{"""),format.raw/*95.70*/("""{"""),format.raw/*95.71*/("""pst.userId"""),format.raw/*95.81*/("""}"""),format.raw/*95.82*/("""}"""),format.raw/*95.83*/("""</span> on """),format.raw/*95.94*/("""{"""),format.raw/*95.95*/("""{"""),format.raw/*95.96*/("""pst.postedOn"""),format.raw/*95.108*/("""}"""),format.raw/*95.109*/("""}"""),format.raw/*95.110*/("""</h6>
                            <a href="#" ng-click="deletePost($event,pst.id)" class="btn btn-info btn-xs">
                                <span class="glyphicon glyphicon-remove"></span>
                            </a>
                        </div>
                        <div class="postmsg"><span>"""),format.raw/*100.52*/("""{"""),format.raw/*100.53*/("""{"""),format.raw/*100.54*/("""pst.post"""),format.raw/*100.62*/("""}"""),format.raw/*100.63*/("""}"""),format.raw/*100.64*/("""</span></div>
                        <div class="text-right">
                            <a href="#" ng-click="toggleCommentsEditor($event, $index)">Comments<span ng-show="!angular.isUndefined(postpage.arr[$index].bShow) && postpage.arr[$index].bShow" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(postpage.arr[$index].bShow) || !postpage.arr[$index].bShow" class="glyphicon glyphicon-menu-down"></span>
                            </a>
                        </div>
                        <div class="well well-sm" ng-show="!angular.isUndefined(postpage.arr[$index].bShow) && postpage.arr[$index].bShow">
                            <div class="modal fade" id=""""),format.raw/*106.57*/("""{"""),format.raw/*106.58*/("""{"""),format.raw/*106.59*/("""postpage.arr[$index].id"""),format.raw/*106.82*/("""}"""),format.raw/*106.83*/("""}"""),format.raw/*106.84*/("""" role="dialog">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <span>An error occurred transacting with the server.</span>
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        </div>
                                        <div class="modal-body">
                                            """),format.raw/*114.45*/("""{"""),format.raw/*114.46*/("""{"""),format.raw/*114.47*/("""postpage.arr[$index].cconerror"""),format.raw/*114.77*/("""}"""),format.raw/*114.78*/("""}"""),format.raw/*114.79*/("""
                                        """),format.raw/*115.41*/("""</div>
                                    </div>
                                </div>
                            </div>

                            <div id="delError"""),format.raw/*120.46*/("""{"""),format.raw/*120.47*/("""{"""),format.raw/*120.48*/("""postpage.arr[$index].id"""),format.raw/*120.71*/("""}"""),format.raw/*120.72*/("""}"""),format.raw/*120.73*/(""""></div>
                            <table class="table">
                                <thead>
                                <tr>
                                    <div class="text-center">
                                        <h4 id="commentstitle">Comments <span class="badge">"""),format.raw/*125.93*/("""{"""),format.raw/*125.94*/("""{"""),format.raw/*125.95*/("""postpage.arr[$index].commentpage.numComments"""),format.raw/*125.139*/("""}"""),format.raw/*125.140*/("""}"""),format.raw/*125.141*/("""</span></h4>
                                        <a href="#" ng-click="loadCommentNextPage($event, $index)" class="btn btn-success btn-xs">
                                            <span class="glyphicon glyphicon-circle-arrow-down"></span>
                                        </a>
                                        <a href="#" ng-if="postpage.arr[$index].commentpage.beginId != '-1'" ng-click="refreshCommentCurrentPage($event, $index)" class="btn btn-success btn-xs">
                                            <span class="glyphicon glyphicon-refresh"></span>
                                        </a>
                                        <a href="#" ng-if="!postpage.arr[$index].commentpage.bLastPage" ng-click="loadCommentPreviousPage($event, $index)" class="btn btn-success btn-xs">
                                            <span class="glyphicon glyphicon-circle-arrow-up"></span>
                                        </a>
                                    </div>
                                </tr>
                                </thead>
                                <tbody>
                                <tr ng-repeat="comment in postpage.arr[$index].commentpage.arr track by comment.id">
                                    <td>
                                        <div class="text-right">
                                            <h6 class="commentedby"><span class="user">"""),format.raw/*142.88*/("""{"""),format.raw/*142.89*/("""{"""),format.raw/*142.90*/("""comment.userId"""),format.raw/*142.104*/("""}"""),format.raw/*142.105*/("""}"""),format.raw/*142.106*/("""</span> on """),format.raw/*142.117*/("""{"""),format.raw/*142.118*/("""{"""),format.raw/*142.119*/("""comment.commentedOn"""),format.raw/*142.138*/("""}"""),format.raw/*142.139*/("""}"""),format.raw/*142.140*/("""</h6>
                                            <a href="#" ng-click="deleteComment($event,$parent.$index,comment.id)" class="btn btn-success btn-xs">
                                                <span class="glyphicon glyphicon-remove"></span>
                                            </a>
                                        </div>
                                        <div class="commentmsg">"""),format.raw/*147.65*/("""{"""),format.raw/*147.66*/("""{"""),format.raw/*147.67*/("""comment.comment"""),format.raw/*147.82*/("""}"""),format.raw/*147.83*/("""}"""),format.raw/*147.84*/("""</div>
                                    <td>
                                </tr>
                                </tbody>
                            </table>
                            <form role="form">
                                <div class="form-group">
                                    <textarea id="comment"""),format.raw/*154.58*/("""{"""),format.raw/*154.59*/("""{"""),format.raw/*154.60*/("""postpage.arr[$index].id"""),format.raw/*154.83*/("""}"""),format.raw/*154.84*/("""}"""),format.raw/*154.85*/("""" ng-model="postpage.arr[$index].comment" maxlength="500" class="form-control" required placeholder="Enter your comment here"></textarea>
                                </div>
                                <div class="text-right">
                                    <button type="submit" ng-click="addComment($event, $index)" class="btn btn-success btn-xs">Comment</button>
                                </div>
                            </form>
                            <div id="addError"""),format.raw/*160.46*/("""{"""),format.raw/*160.47*/("""{"""),format.raw/*160.48*/("""postpage.arr[$index].id"""),format.raw/*160.71*/("""}"""),format.raw/*160.72*/("""}"""),format.raw/*160.73*/(""""></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
<script type="text/javascript">
        //todo: progress indicator
        //todo: error message timing

        var app = angular.module('posts',  ["ngCookies"]);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*174.80*/("""{"""),format.raw/*174.81*/("""
            """),format.raw/*175.13*/("""$locationProvider.html5Mode("""),format.raw/*175.41*/("""{"""),format.raw/*175.42*/("""enabled: true, requireBase: false"""),format.raw/*175.75*/("""}"""),format.raw/*175.76*/(""").hashPrefix('*');
        """),format.raw/*176.9*/("""}"""),format.raw/*176.10*/("""]);

        app.controller('postsCtrl', function($scope, $http, $location, $cookies, $window) """),format.raw/*178.91*/("""{"""),format.raw/*178.92*/("""

            """),format.raw/*180.13*/("""$scope.loggedInUser = function() """),format.raw/*180.46*/("""{"""),format.raw/*180.47*/("""
                """),format.raw/*181.17*/("""return $cookies.get("userId");
            """),format.raw/*182.13*/("""}"""),format.raw/*182.14*/(""";

            $scope.loggedInUserGroup = function() """),format.raw/*184.51*/("""{"""),format.raw/*184.52*/("""
                """),format.raw/*185.17*/("""return $cookies.get("groupId");
            """),format.raw/*186.13*/("""}"""),format.raw/*186.14*/(""";

            $scope.showForbiddenPage = function() """),format.raw/*188.51*/("""{"""),format.raw/*188.52*/("""
                """),format.raw/*189.17*/("""$cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*192.34*/routes/*192.40*/.HomeController.showForbiddenPage),format.raw/*192.73*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*194.13*/("""}"""),format.raw/*194.14*/(""";

            $scope.signOut = function(event) """),format.raw/*196.46*/("""{"""),format.raw/*196.47*/("""
                """),format.raw/*197.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*201.34*/routes/*201.40*/.HomeController.logout),format.raw/*201.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*203.13*/("""}"""),format.raw/*203.14*/(""";

            $scope.showAdminPage = function(event) """),format.raw/*205.52*/("""{"""),format.raw/*205.53*/("""
                """),format.raw/*206.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*207.34*/routes/*207.40*/.AdminController.showAdminPage),format.raw/*207.70*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*209.13*/("""}"""),format.raw/*209.14*/(""";

            $scope.showGroupsPage = function(event) """),format.raw/*211.53*/("""{"""),format.raw/*211.54*/("""
                """),format.raw/*212.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*213.34*/routes/*213.40*/.GroupController.showGroupsPage),format.raw/*213.71*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*215.13*/("""}"""),format.raw/*215.14*/(""";

            // add post event handler
            $scope.addPost = function(event) """),format.raw/*218.46*/("""{"""),format.raw/*218.47*/("""
                """),format.raw/*219.17*/("""event.preventDefault();

                // validate the posts form
                if ($scope.apf.post.$error.required) """),format.raw/*222.54*/("""{"""),format.raw/*222.55*/("""
                    """),format.raw/*223.21*/("""return;
                """),format.raw/*224.17*/("""}"""),format.raw/*224.18*/("""

                """),format.raw/*226.17*/("""// post the message
                $scope.conerror = "";
                $scope.adderror = "";
                $("#addError").html("");
                $http("""),format.raw/*230.23*/("""{"""),format.raw/*230.24*/("""
                        """),format.raw/*231.25*/("""method : "POST",
                        url : """"),_display_(/*232.33*/routes/*232.39*/.PostController.addPost),format.raw/*232.62*/("""",
                        data : """),format.raw/*233.32*/("""{"""),format.raw/*233.33*/(""""post" : $scope.post"""),format.raw/*233.53*/("""}"""),format.raw/*233.54*/(""",
                        headers : """),format.raw/*234.35*/("""{"""),format.raw/*234.36*/("""
                            """),format.raw/*235.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*236.25*/("""}"""),format.raw/*236.26*/("""
                    """),format.raw/*237.21*/("""}"""),format.raw/*237.22*/(""").then(function successCallback(response) """),format.raw/*237.64*/("""{"""),format.raw/*237.65*/("""
                        """),format.raw/*238.25*/("""$scope.post = "";
                        $scope.loadFirstPage();
                    """),format.raw/*240.21*/("""}"""),format.raw/*240.22*/(""", function errorCallback(response) """),format.raw/*240.57*/("""{"""),format.raw/*240.58*/("""
                        """),format.raw/*241.25*/("""if (response.status == 400) """),format.raw/*241.53*/("""{"""),format.raw/*241.54*/("""
                            """),format.raw/*242.29*/("""$scope.adderror = response.data.error;
                            $("#addError").html("<div id='aErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.adderror + "</div>");
                        """),format.raw/*244.25*/("""}"""),format.raw/*244.26*/(""" """),format.raw/*244.27*/("""else """),format.raw/*244.32*/("""{"""),format.raw/*244.33*/("""
                            """),format.raw/*245.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*247.34*/("""{"""),format.raw/*247.35*/("""
                                """),format.raw/*248.33*/("""$scope.conerror = "Error posting the message. Retry";
                                $('#conError').modal('show');
                            """),format.raw/*250.29*/("""}"""),format.raw/*250.30*/("""
                        """),format.raw/*251.25*/("""}"""),format.raw/*251.26*/("""
                    """),format.raw/*252.21*/("""}"""),format.raw/*252.22*/(""");
            """),format.raw/*253.13*/("""}"""),format.raw/*253.14*/(""";

            // delete post event handler
            $scope.deletePost = function(event, postId) """),format.raw/*256.57*/("""{"""),format.raw/*256.58*/("""
                """),format.raw/*257.17*/("""event.preventDefault();

                // delete the post
                $scope.conerror = "";
                $scope.delerror = "";
                $("#delError").html("");
                $http("""),format.raw/*263.23*/("""{"""),format.raw/*263.24*/("""
                        """),format.raw/*264.25*/("""method : "DELETE",
                        url : "/post/" + postId,
                        headers : """),format.raw/*266.35*/("""{"""),format.raw/*266.36*/("""
                            """),format.raw/*267.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*268.25*/("""}"""),format.raw/*268.26*/("""
                    """),format.raw/*269.21*/("""}"""),format.raw/*269.22*/(""").then(function successCallback(response) """),format.raw/*269.64*/("""{"""),format.raw/*269.65*/("""
                        """),format.raw/*270.25*/("""$scope.refreshCurrentPage(null);
                    """),format.raw/*271.21*/("""}"""),format.raw/*271.22*/(""", function errorCallback(response) """),format.raw/*271.57*/("""{"""),format.raw/*271.58*/("""
                        """),format.raw/*272.25*/("""if (response.status == 400) """),format.raw/*272.53*/("""{"""),format.raw/*272.54*/("""
                            """),format.raw/*273.29*/("""$scope.delerror = response.data.error + ". Refresh the current page if post does not exist.";
                            $("#delError").html("<div id='dErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.delerror + "</div>");
                        """),format.raw/*275.25*/("""}"""),format.raw/*275.26*/(""" """),format.raw/*275.27*/("""else """),format.raw/*275.32*/("""{"""),format.raw/*275.33*/("""
                            """),format.raw/*276.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*278.34*/("""{"""),format.raw/*278.35*/("""
                                """),format.raw/*279.33*/("""$scope.conerror = "Error deleting the message. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*281.29*/("""}"""),format.raw/*281.30*/("""
                        """),format.raw/*282.25*/("""}"""),format.raw/*282.26*/("""
                    """),format.raw/*283.21*/("""}"""),format.raw/*283.22*/(""");
            """),format.raw/*284.13*/("""}"""),format.raw/*284.14*/(""";

            // page loader
            $scope.loadPage = function(url) """),format.raw/*287.45*/("""{"""),format.raw/*287.46*/("""
                """),format.raw/*288.17*/("""$scope.delerror = "";
                $("#delError").html("");
                $scope.conerror = "";
                $http("""),format.raw/*291.23*/("""{"""),format.raw/*291.24*/("""
                        """),format.raw/*292.25*/("""method : "GET",
                        url : url,
                        headers : """),format.raw/*294.35*/("""{"""),format.raw/*294.36*/("""
                            """),format.raw/*295.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*296.25*/("""}"""),format.raw/*296.26*/("""
                    """),format.raw/*297.21*/("""}"""),format.raw/*297.22*/(""").then(function successCallback(response) """),format.raw/*297.64*/("""{"""),format.raw/*297.65*/("""
                        """),format.raw/*298.25*/("""$scope.postpage = response.data;
                    """),format.raw/*299.21*/("""}"""),format.raw/*299.22*/(""", function errorCallback(response) """),format.raw/*299.57*/("""{"""),format.raw/*299.58*/("""
                         """),format.raw/*300.26*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                         else """),format.raw/*302.31*/("""{"""),format.raw/*302.32*/("""
                            """),format.raw/*303.29*/("""$scope.conerror = "Error retrieving the page from the server. Retry.";
                            $('#conError').modal('show');
                         """),format.raw/*305.26*/("""}"""),format.raw/*305.27*/("""
                    """),format.raw/*306.21*/("""}"""),format.raw/*306.22*/(""");
            """),format.raw/*307.13*/("""}"""),format.raw/*307.14*/(""";

            // refreshes the current page
            $scope.refreshCurrentPage = function(event) """),format.raw/*310.57*/("""{"""),format.raw/*310.58*/("""
                """),format.raw/*311.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadPage("/posts/refresh/" + $scope.postpage.endId);
            """),format.raw/*314.13*/("""}"""),format.raw/*314.14*/(""";

            // next page event handler
            $scope.loadNextPage = function(event) """),format.raw/*317.51*/("""{"""),format.raw/*317.52*/("""
                """),format.raw/*318.17*/("""event.preventDefault();
                $scope.loadPage("/posts/after/" + $scope.postpage.beginId);
            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/(""";

            // previous page event handler
            $scope.loadPreviousPage = function(event) """),format.raw/*323.55*/("""{"""),format.raw/*323.56*/("""
                """),format.raw/*324.17*/("""event.preventDefault();
                $scope.loadPage("/posts/before/" + $scope.postpage.endId);
            """),format.raw/*326.13*/("""}"""),format.raw/*326.14*/(""";

            // loads the first page
            $scope.loadFirstPage = function() """),format.raw/*329.47*/("""{"""),format.raw/*329.48*/("""
                """),format.raw/*330.17*/("""$scope.postpage.numPosts = "0";
                $scope.postpage.bLastPage = false;
                $scope.postpage.arr = [];
                $scope.postpage.beginId = "-1";
                $scope.postpage.endId = "-1";
                $scope.loadPage("/posts/first");
            """),format.raw/*336.13*/("""}"""),format.raw/*336.14*/(""";

            // add comment event handler
            $scope.addComment = function(event, index) """),format.raw/*339.56*/("""{"""),format.raw/*339.57*/("""
                """),format.raw/*340.17*/("""event.preventDefault();

                // validate the comments form
                if ($scope.postpage.arr[index].comment == "") """),format.raw/*343.63*/("""{"""),format.raw/*343.64*/("""
                    """),format.raw/*344.21*/("""return;
                """),format.raw/*345.17*/("""}"""),format.raw/*345.18*/("""

                """),format.raw/*347.17*/("""// add the comment
                $scope.postpage.arr[index].cconerror = "";
                $scope.postpage.arr[index].cadderror = "";
                $("#addError" + $scope.postpage.arr[index].id).html("");
                $http("""),format.raw/*351.23*/("""{"""),format.raw/*351.24*/("""
                        """),format.raw/*352.25*/("""method : "POST",
                        url : "/comment/" + $scope.postpage.arr[index].id,
                        data : """),format.raw/*354.32*/("""{"""),format.raw/*354.33*/(""""comment" : $scope.postpage.arr[index].comment"""),format.raw/*354.79*/("""}"""),format.raw/*354.80*/(""",
                        headers : """),format.raw/*355.35*/("""{"""),format.raw/*355.36*/("""
                            """),format.raw/*356.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*357.25*/("""}"""),format.raw/*357.26*/("""
                    """),format.raw/*358.21*/("""}"""),format.raw/*358.22*/(""").then(function successCallback(response) """),format.raw/*358.64*/("""{"""),format.raw/*358.65*/("""
                        """),format.raw/*359.25*/("""$scope.postpage.arr[index].comment = "";
                        $scope.loadCommentLastPage(null, index);
                    """),format.raw/*361.21*/("""}"""),format.raw/*361.22*/(""", function errorCallback(response) """),format.raw/*361.57*/("""{"""),format.raw/*361.58*/("""
                        """),format.raw/*362.25*/("""if (response.status == 400) """),format.raw/*362.53*/("""{"""),format.raw/*362.54*/("""
                            """),format.raw/*363.29*/("""$scope.postpage.arr[index].cadderror = response.data.error;
                            $("#addError" + $scope.postpage.arr[index].id).html("<div id='aErr" + $scope.postpage.arr[index].id + "' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.postpage.arr[index].cadderror + "</div>");
                        """),format.raw/*365.25*/("""}"""),format.raw/*365.26*/(""" """),format.raw/*365.27*/("""else """),format.raw/*365.32*/("""{"""),format.raw/*365.33*/("""
                            """),format.raw/*366.29*/("""if (response.status == 403)
                               $scope.showForbiddenPage();
                            else """),format.raw/*368.34*/("""{"""),format.raw/*368.35*/("""
                                """),format.raw/*369.33*/("""$scope.postpage.arr[index].cconerror = "Error posting the comment. Retry";
                                $('#' + $scope.postpage.arr[index].id).modal('show');
                            """),format.raw/*371.29*/("""}"""),format.raw/*371.30*/("""
                        """),format.raw/*372.25*/("""}"""),format.raw/*372.26*/("""
                    """),format.raw/*373.21*/("""}"""),format.raw/*373.22*/(""");
            """),format.raw/*374.13*/("""}"""),format.raw/*374.14*/(""";

            // delete comment event handler
            $scope.deleteComment = function(event, index, commentId) """),format.raw/*377.70*/("""{"""),format.raw/*377.71*/("""
                """),format.raw/*378.17*/("""event.preventDefault();

                // delete the comment
                $scope.postpage.arr[index].cconerror = "";
                $scope.postpage.arr[index].cdelerror = "";
                $("#delError" + $scope.postpage.arr[index].id).html("");
                $http("""),format.raw/*384.23*/("""{"""),format.raw/*384.24*/("""
                        """),format.raw/*385.25*/("""method : "DELETE",
                        url : "/comment/" + $scope.postpage.arr[index].id + "/" + commentId,
                        headers : """),format.raw/*387.35*/("""{"""),format.raw/*387.36*/("""
                            """),format.raw/*388.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*389.25*/("""}"""),format.raw/*389.26*/("""
                    """),format.raw/*390.21*/("""}"""),format.raw/*390.22*/(""").then(function successCallback(response) """),format.raw/*390.64*/("""{"""),format.raw/*390.65*/("""
                        """),format.raw/*391.25*/("""$scope.refreshCommentCurrentPage(null, index);
                    """),format.raw/*392.21*/("""}"""),format.raw/*392.22*/(""", function errorCallback(response) """),format.raw/*392.57*/("""{"""),format.raw/*392.58*/("""
                        """),format.raw/*393.25*/("""if (response.status == 400) """),format.raw/*393.53*/("""{"""),format.raw/*393.54*/("""
                            """),format.raw/*394.29*/("""$scope.postpage.arr[index].cdelerror = response.data.error + ". Refresh the current comment page if comment does not exist.";
                            $("#delError" + $scope.postpage.arr[index].id).html("<div id='dErr" + $scope.postpage.arr[index].id + "' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.postpage.arr[index].cdelerror + "</div>");
                        """),format.raw/*396.25*/("""}"""),format.raw/*396.26*/(""" """),format.raw/*396.27*/("""else """),format.raw/*396.32*/("""{"""),format.raw/*396.33*/("""
                             """),format.raw/*397.30*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                             else """),format.raw/*399.35*/("""{"""),format.raw/*399.36*/("""
                                """),format.raw/*400.33*/("""$scope.postpage.arr[index].cconerror = "Error deleting the comment. Retry.";
                                $('#' + $scope.postpage.arr[index].id).modal('show');
                             """),format.raw/*402.30*/("""}"""),format.raw/*402.31*/("""
                        """),format.raw/*403.25*/("""}"""),format.raw/*403.26*/("""
                    """),format.raw/*404.21*/("""}"""),format.raw/*404.22*/(""");
            """),format.raw/*405.13*/("""}"""),format.raw/*405.14*/(""";

            // comment page loader
            $scope.loadCommentPage = function(url, index) """),format.raw/*408.59*/("""{"""),format.raw/*408.60*/("""
                """),format.raw/*409.17*/("""$scope.postpage.arr[index].cdelerror = "";
                $("#delError" + $scope.postpage.arr[index].id).html("");
                $scope.postpage.arr[index].cconerror = "";
                $http("""),format.raw/*412.23*/("""{"""),format.raw/*412.24*/("""
                        """),format.raw/*413.25*/("""method : "GET",
                        url : url,
                        headers : """),format.raw/*415.35*/("""{"""),format.raw/*415.36*/("""
                            """),format.raw/*416.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*417.25*/("""}"""),format.raw/*417.26*/("""
                    """),format.raw/*418.21*/("""}"""),format.raw/*418.22*/(""").then(function successCallback(response) """),format.raw/*418.64*/("""{"""),format.raw/*418.65*/("""
                        """),format.raw/*419.25*/("""$scope.postpage.arr[index].commentpage = response.data;
                    """),format.raw/*420.21*/("""}"""),format.raw/*420.22*/(""", function errorCallback(response) """),format.raw/*420.57*/("""{"""),format.raw/*420.58*/("""
                        """),format.raw/*421.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*423.30*/("""{"""),format.raw/*423.31*/("""
                            """),format.raw/*424.29*/("""$scope.postpage.arr[index].cconerror = "Error retrieving the comment page from the server. Retry.";
                            $('#' + $scope.postpage.arr[index].id).modal('show');
                        """),format.raw/*426.25*/("""}"""),format.raw/*426.26*/("""
                    """),format.raw/*427.21*/("""}"""),format.raw/*427.22*/(""");
            """),format.raw/*428.13*/("""}"""),format.raw/*428.14*/(""";

            // refreshes the current comment page
            $scope.refreshCommentCurrentPage = function(event, index) """),format.raw/*431.71*/("""{"""),format.raw/*431.72*/("""
                """),format.raw/*432.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadCommentPage("/comments/refresh/" + $scope.postpage.arr[index].id + "/" + $scope.postpage.arr[index].commentpage.beginId, index);
            """),format.raw/*435.13*/("""}"""),format.raw/*435.14*/(""";

            // next comment page event handler
            $scope.loadCommentNextPage = function(event, index) """),format.raw/*438.65*/("""{"""),format.raw/*438.66*/("""
                """),format.raw/*439.17*/("""event.preventDefault();
                $scope.loadCommentPage("/comments/after/" + $scope.postpage.arr[index].id + "/" + $scope.postpage.arr[index].commentpage.endId, index);
            """),format.raw/*441.13*/("""}"""),format.raw/*441.14*/(""";

            // previous comment page event handler
            $scope.loadCommentPreviousPage = function(event, index) """),format.raw/*444.69*/("""{"""),format.raw/*444.70*/("""
                """),format.raw/*445.17*/("""event.preventDefault();
                $scope.loadCommentPage("/comments/before/" + $scope.postpage.arr[index].id + "/" + $scope.postpage.arr[index].commentpage.beginId, index);
            """),format.raw/*447.13*/("""}"""),format.raw/*447.14*/(""";

            $scope.loadCommentLastPage = function(event, index) """),format.raw/*449.65*/("""{"""),format.raw/*449.66*/("""
                """),format.raw/*450.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadCommentPage("/comments/last/" + $scope.postpage.arr[index].id, index);
            """),format.raw/*453.13*/("""}"""),format.raw/*453.14*/(""";


            // loads the first comment page
            $scope.loadCommentFirstPage = function(index) """),format.raw/*457.59*/("""{"""),format.raw/*457.60*/("""
                """),format.raw/*458.17*/("""$scope.postpage.arr[index].commentpage.numComments = "0";
                $scope.postpage.arr[index].commentpage.bLastPage = false;
                $scope.postpage.arr[index].commentpage.arr = [];
                $scope.postpage.arr[index].commentpage.beginId = "-1";
                $scope.postpage.arr[index].commentpage.endId = "-1";

                $scope.loadCommentPage("/comments/first/" + $scope.postpage.arr[index].id, index);
            """),format.raw/*465.13*/("""}"""),format.raw/*465.14*/(""";

            // toggles the comment editor for a post
            $scope.toggleCommentsEditor = function(event, index) """),format.raw/*468.66*/("""{"""),format.raw/*468.67*/("""
                """),format.raw/*469.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.postpage.arr[index].bShow)) """),format.raw/*470.75*/("""{"""),format.raw/*470.76*/("""
                    """),format.raw/*471.21*/("""$scope.postpage.arr[index].commentpage = new Object();

                    // initialize error state
                    $scope.postpage.arr[index].cdelerror = "";
                    $scope.postpage.arr[index].cconerror = "";
                    $scope.postpage.arr[index].cadderror = "";

                    $scope.postpage.arr[index].comment = "";
                    $scope.postpage.arr[index].bShow = true;
                    $scope.loadCommentFirstPage(index);
                """),format.raw/*481.17*/("""}"""),format.raw/*481.18*/(""" """),format.raw/*481.19*/("""else """),format.raw/*481.24*/("""{"""),format.raw/*481.25*/("""
                    """),format.raw/*482.21*/("""$scope.postpage.arr[index].bShow = !$scope.postpage.arr[index].bShow;
                """),format.raw/*483.17*/("""}"""),format.raw/*483.18*/("""
            """),format.raw/*484.13*/("""}"""),format.raw/*484.14*/(""";

            // Initialize the view
            $scope.adderror = "";
            $scope.delerror = "";
            $scope.conerror = "";
            $scope.postpage = new Object();
            $scope.loadFirstPage();
        """),format.raw/*492.9*/("""}"""),format.raw/*492.10*/(""");

</script>

</html>"""))
      }
    }
  }

  def render(isAdmin:java.lang.Boolean): play.twirl.api.HtmlFormat.Appendable = apply(isAdmin)

  def f:((java.lang.Boolean) => play.twirl.api.HtmlFormat.Appendable) = (isAdmin) => apply(isAdmin)

  def ref: this.type = this

}


}

/**/
object posts extends posts_Scope0.posts
              /*
                  -- GENERATED --
                  DATE: Thu Aug 18 11:22:56 IST 2016
                  SOURCE: /home/si2chip/web_app/msmp1.0.git/app/views/posts.scala.html
                  HASH: de26a0de34a66b9eb8fb39f4254bc3c7b8fc54bb
                  MATRIX: 756->1|880->30|910->34|1219->317|1233->323|1301->371|1364->407|1379->413|1442->455|2381->1367|2401->1378|2441->1380|2491->1402|2654->1534|2700->1552|3548->2372|3577->2373|3606->2374|3642->2382|3671->2383|3700->2384|3754->2410|4078->2706|4107->2707|4136->2708|4178->2722|4207->2723|4236->2724|4313->2772|4343->2773|4373->2774|4421->2793|4451->2794|4481->2795|4767->3053|4796->3054|4825->3055|4870->3072|4899->3073|4928->3074|6812->4930|6841->4931|6870->4932|6908->4942|6937->4943|6966->4944|7005->4955|7034->4956|7063->4957|7104->4969|7134->4970|7164->4971|7506->5284|7536->5285|7566->5286|7603->5294|7633->5295|7663->5296|8396->6000|8426->6001|8456->6002|8508->6025|8538->6026|8568->6027|9190->6620|9220->6621|9250->6622|9309->6652|9339->6653|9369->6654|9440->6696|9644->6871|9674->6872|9704->6873|9756->6896|9786->6897|9816->6898|10140->7193|10170->7194|10200->7195|10274->7239|10305->7240|10336->7241|11814->8690|11844->8691|11874->8692|11918->8706|11949->8707|11980->8708|12021->8719|12052->8720|12083->8721|12132->8740|12163->8741|12194->8742|12638->9157|12668->9158|12698->9159|12742->9174|12772->9175|12802->9176|13163->9508|13193->9509|13223->9510|13275->9533|13305->9534|13335->9535|13868->10039|13898->10040|13928->10041|13980->10064|14010->10065|14040->10066|14470->10467|14500->10468|14543->10482|14600->10510|14630->10511|14692->10544|14722->10545|14778->10573|14808->10574|14934->10671|14964->10672|15009->10688|15071->10721|15101->10722|15148->10740|15221->10784|15251->10785|15335->10840|15365->10841|15412->10859|15486->10904|15516->10905|15600->10960|15630->10961|15677->10979|15857->11131|15873->11137|15928->11170|16045->11258|16075->11259|16154->11309|16184->11310|16231->11328|16452->11521|16468->11527|16512->11549|16629->11637|16659->11638|16744->11694|16774->11695|16821->11713|16907->11771|16923->11777|16975->11807|17092->11895|17122->11896|17208->11953|17238->11954|17285->11972|17371->12030|17387->12036|17440->12067|17557->12155|17587->12156|17705->12245|17735->12246|17782->12264|17935->12388|17965->12389|18016->12411|18070->12436|18100->12437|18149->12457|18341->12620|18371->12621|18426->12647|18504->12697|18520->12703|18565->12726|18629->12761|18659->12762|18708->12782|18738->12783|18804->12820|18834->12821|18893->12851|18983->12912|19013->12913|19064->12935|19094->12936|19165->12978|19195->12979|19250->13005|19367->13093|19397->13094|19461->13129|19491->13130|19546->13156|19603->13184|19633->13185|19692->13215|19959->13453|19989->13454|20019->13455|20053->13460|20083->13461|20142->13491|20294->13614|20324->13615|20387->13649|20562->13795|20592->13796|20647->13822|20677->13823|20728->13845|20758->13846|20803->13862|20833->13863|20965->13966|20995->13967|21042->13985|21276->14190|21306->14191|21361->14217|21494->14321|21524->14322|21583->14352|21673->14413|21703->14414|21754->14436|21784->14437|21855->14479|21885->14480|21940->14506|22023->14560|22053->14561|22117->14596|22147->14597|22202->14623|22259->14651|22289->14652|22348->14682|22670->14975|22700->14976|22730->14977|22764->14982|22794->14983|22853->15013|23005->15136|23035->15137|23098->15171|23275->15319|23305->15320|23360->15346|23390->15347|23441->15369|23471->15370|23516->15386|23546->15387|23652->15464|23682->15465|23729->15483|23884->15609|23914->15610|23969->15636|24085->15723|24115->15724|24174->15754|24264->15815|24294->15816|24345->15838|24375->15839|24446->15881|24476->15882|24531->15908|24614->15962|24644->15963|24708->15998|24738->15999|24794->16026|24939->16142|24969->16143|25028->16173|25213->16329|25243->16330|25294->16352|25324->16353|25369->16369|25399->16370|25532->16474|25562->16475|25609->16493|25792->16647|25822->16648|25946->16743|25976->16744|26023->16762|26166->16876|26196->16877|26328->16980|26358->16981|26405->16999|26547->17112|26577->17113|26694->17201|26724->17202|26771->17220|27086->17506|27116->17507|27247->17609|27277->17610|27324->17628|27489->17764|27519->17765|27570->17787|27624->17812|27654->17813|27703->17833|27968->18069|27998->18070|28053->18096|28207->18221|28237->18222|28312->18268|28342->18269|28408->18306|28438->18307|28497->18337|28587->18398|28617->18399|28668->18421|28698->18422|28769->18464|28799->18465|28854->18491|29011->18619|29041->18620|29105->18655|29135->18656|29190->18682|29247->18710|29277->18711|29336->18741|29714->19090|29744->19091|29774->19092|29808->19097|29838->19098|29897->19128|30048->19250|30078->19251|30141->19285|30361->19476|30391->19477|30446->19503|30476->19504|30527->19526|30557->19527|30602->19543|30632->19544|30780->19663|30810->19664|30857->19682|31168->19964|31198->19965|31253->19991|31430->20139|31460->20140|31519->20170|31609->20231|31639->20232|31690->20254|31720->20255|31791->20297|31821->20298|31876->20324|31973->20392|32003->20393|32067->20428|32097->20429|32152->20455|32209->20483|32239->20484|32298->20514|32742->20929|32772->20930|32802->20931|32836->20936|32866->20937|32926->20968|33079->21092|33109->21093|33172->21127|33395->21321|33425->21322|33480->21348|33510->21349|33561->21371|33591->21372|33636->21388|33666->21389|33794->21488|33824->21489|33871->21507|34100->21707|34130->21708|34185->21734|34301->21821|34331->21822|34390->21852|34480->21913|34510->21914|34561->21936|34591->21937|34662->21979|34692->21980|34747->22006|34853->22083|34883->22084|34947->22119|34977->22120|35032->22146|35176->22261|35206->22262|35265->22292|35502->22500|35532->22501|35583->22523|35613->22524|35658->22540|35688->22541|35843->22667|35873->22668|35920->22686|36183->22920|36213->22921|36359->23038|36389->23039|36436->23057|36655->23247|36685->23248|36839->23373|36869->23374|36916->23392|37138->23585|37168->23586|37266->23655|37296->23656|37343->23674|37548->23850|37578->23851|37717->23961|37747->23962|37794->23980|38279->24436|38309->24437|38462->24561|38492->24562|38539->24580|38667->24679|38697->24680|38748->24702|39273->25198|39303->25199|39333->25200|39367->25205|39397->25206|39448->25228|39564->25315|39594->25316|39637->25330|39667->25331|39931->25567|39961->25568
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|58->27|58->27|58->27|59->28|60->29|61->30|76->45|76->45|76->45|76->45|76->45|76->45|77->46|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|87->56|94->63|94->63|94->63|94->63|94->63|94->63|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|131->100|131->100|131->100|131->100|131->100|131->100|137->106|137->106|137->106|137->106|137->106|137->106|145->114|145->114|145->114|145->114|145->114|145->114|146->115|151->120|151->120|151->120|151->120|151->120|151->120|156->125|156->125|156->125|156->125|156->125|156->125|173->142|173->142|173->142|173->142|173->142|173->142|173->142|173->142|173->142|173->142|173->142|173->142|178->147|178->147|178->147|178->147|178->147|178->147|185->154|185->154|185->154|185->154|185->154|185->154|191->160|191->160|191->160|191->160|191->160|191->160|205->174|205->174|206->175|206->175|206->175|206->175|206->175|207->176|207->176|209->178|209->178|211->180|211->180|211->180|212->181|213->182|213->182|215->184|215->184|216->185|217->186|217->186|219->188|219->188|220->189|223->192|223->192|223->192|225->194|225->194|227->196|227->196|228->197|232->201|232->201|232->201|234->203|234->203|236->205|236->205|237->206|238->207|238->207|238->207|240->209|240->209|242->211|242->211|243->212|244->213|244->213|244->213|246->215|246->215|249->218|249->218|250->219|253->222|253->222|254->223|255->224|255->224|257->226|261->230|261->230|262->231|263->232|263->232|263->232|264->233|264->233|264->233|264->233|265->234|265->234|266->235|267->236|267->236|268->237|268->237|268->237|268->237|269->238|271->240|271->240|271->240|271->240|272->241|272->241|272->241|273->242|275->244|275->244|275->244|275->244|275->244|276->245|278->247|278->247|279->248|281->250|281->250|282->251|282->251|283->252|283->252|284->253|284->253|287->256|287->256|288->257|294->263|294->263|295->264|297->266|297->266|298->267|299->268|299->268|300->269|300->269|300->269|300->269|301->270|302->271|302->271|302->271|302->271|303->272|303->272|303->272|304->273|306->275|306->275|306->275|306->275|306->275|307->276|309->278|309->278|310->279|312->281|312->281|313->282|313->282|314->283|314->283|315->284|315->284|318->287|318->287|319->288|322->291|322->291|323->292|325->294|325->294|326->295|327->296|327->296|328->297|328->297|328->297|328->297|329->298|330->299|330->299|330->299|330->299|331->300|333->302|333->302|334->303|336->305|336->305|337->306|337->306|338->307|338->307|341->310|341->310|342->311|345->314|345->314|348->317|348->317|349->318|351->320|351->320|354->323|354->323|355->324|357->326|357->326|360->329|360->329|361->330|367->336|367->336|370->339|370->339|371->340|374->343|374->343|375->344|376->345|376->345|378->347|382->351|382->351|383->352|385->354|385->354|385->354|385->354|386->355|386->355|387->356|388->357|388->357|389->358|389->358|389->358|389->358|390->359|392->361|392->361|392->361|392->361|393->362|393->362|393->362|394->363|396->365|396->365|396->365|396->365|396->365|397->366|399->368|399->368|400->369|402->371|402->371|403->372|403->372|404->373|404->373|405->374|405->374|408->377|408->377|409->378|415->384|415->384|416->385|418->387|418->387|419->388|420->389|420->389|421->390|421->390|421->390|421->390|422->391|423->392|423->392|423->392|423->392|424->393|424->393|424->393|425->394|427->396|427->396|427->396|427->396|427->396|428->397|430->399|430->399|431->400|433->402|433->402|434->403|434->403|435->404|435->404|436->405|436->405|439->408|439->408|440->409|443->412|443->412|444->413|446->415|446->415|447->416|448->417|448->417|449->418|449->418|449->418|449->418|450->419|451->420|451->420|451->420|451->420|452->421|454->423|454->423|455->424|457->426|457->426|458->427|458->427|459->428|459->428|462->431|462->431|463->432|466->435|466->435|469->438|469->438|470->439|472->441|472->441|475->444|475->444|476->445|478->447|478->447|480->449|480->449|481->450|484->453|484->453|488->457|488->457|489->458|496->465|496->465|499->468|499->468|500->469|501->470|501->470|502->471|512->481|512->481|512->481|512->481|512->481|513->482|514->483|514->483|515->484|515->484|523->492|523->492
                  -- GENERATED --
              */
          