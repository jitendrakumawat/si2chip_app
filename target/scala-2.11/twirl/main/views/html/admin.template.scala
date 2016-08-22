
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
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

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="""),_display_(/*7.34*/routes/*7.40*/.Assets.versioned("stylesheets/common/view.css")),format.raw/*7.88*/(""">
    <link rel="stylesheet" href="""),_display_(/*8.34*/routes/*8.40*/.Assets.versioned("stylesheets/admin.css")),format.raw/*8.82*/(""">
    <link rel="stylesheet" href="""),_display_(/*9.34*/routes/*9.40*/.Assets.versioned("stylesheets/posts.css")),format.raw/*9.82*/(""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>
    <title>SI2Chip Admin</title>
</head>
<body ng-app="admin" ng-controller="adminCtrl">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">SI2Chip</a>
                <img src="/home/si2chip/si2chip.jpg" style="width:50px;height:50px;">
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="#"> Admin </a></li>
                <li><a href="#" ng-click="showPosts($event)"> Posts </a></li>
                <li><a href="#" ng-click="signOut($event)"><span class="glyphicon glyphicon-log-out"></span> Sign out </a></li>
            </ul>
        </div>
    </nav>

    <div class="container">
        <div class="row">
            <div class="col-sm-6 col-sm-offset-6">
                <div class="text-right">
                    <span class="who">"""),format.raw/*35.39*/("""{"""),format.raw/*35.40*/("""{"""),format.raw/*35.41*/("""loggedInUser()"""),format.raw/*35.55*/("""}"""),format.raw/*35.56*/("""}"""),format.raw/*35.57*/("""</span><span> Group: </span><span class="group">"""),format.raw/*35.105*/("""{"""),format.raw/*35.106*/("""{"""),format.raw/*35.107*/("""loggedInUserGroup()"""),format.raw/*35.126*/("""}"""),format.raw/*35.127*/("""}"""),format.raw/*35.128*/("""</span>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6 col-sm-offset-3">
                <div class="modal fade" id="conError" role="dialog">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <span>An error occurred transacting with the server.</span>
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                            </div>
                            <div class="modal-body">
                                """),format.raw/*49.33*/("""{"""),format.raw/*49.34*/("""{"""),format.raw/*49.35*/("""conerror"""),format.raw/*49.43*/("""}"""),format.raw/*49.44*/("""}"""),format.raw/*49.45*/("""
                            """),format.raw/*50.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-4">
                <div class="well well-lg">
                    <div class="text-center">
                        <h4 id="summarytitle">Active users <span class="badge">"""),format.raw/*60.80*/("""{"""),format.raw/*60.81*/("""{"""),format.raw/*60.82*/("""users.length"""),format.raw/*60.94*/("""}"""),format.raw/*60.95*/("""}"""),format.raw/*60.96*/("""</span></h4>
                        <a href="#" ng-click="loadUserSummary()" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-refresh"></span>
                        </a>
                    </div>
                    <ul class="list-group">
                        <li ng-repeat="x in users" class="list-group-item list-group-item-success" data-toggle="tooltip" data-placement="right" title=""""),format.raw/*66.152*/("""{"""),format.raw/*66.153*/("""{"""),format.raw/*66.154*/("""x.userId"""),format.raw/*66.162*/("""}"""),format.raw/*66.163*/("""}"""),format.raw/*66.164*/("""">
                            """),format.raw/*67.29*/("""{"""),format.raw/*67.30*/("""{"""),format.raw/*67.31*/("""x.userId"""),format.raw/*67.39*/("""}"""),format.raw/*67.40*/("""}"""),format.raw/*67.41*/("""<span class="badge">"""),format.raw/*67.61*/("""{"""),format.raw/*67.62*/("""{"""),format.raw/*67.63*/("""x.nSessions"""),format.raw/*67.74*/("""}"""),format.raw/*67.75*/("""}"""),format.raw/*67.76*/("""</span>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="well well-lg">
                    <table class="table">
                        <thead>
                            <tr>
                                <div class="text-center">
                                    <h4 id="adminmgmttitle">User management</h4>
                                </div>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>
                                    <div class="text-center">
                                        <a href="#" ng-click="toggleAddUserEditor($event)">Add user<span ng-show="!angular.isUndefined(bShowAUE)&& bShowAUE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowAUE) || !bShowAUE" class="glyphicon glyphicon-menu-down"></span>
                                        </a>
                                    </div>
                                    <div class="well well-sm" ng-show="!angular.isUndefined(bShowAUE) && bShowAUE">
                                        <form role="form" name="auf">
                                            <div class="form-group">
                                                <input type="email" class="form-control" maxlength="255" ng-model="nUserId" placeholder="Enter email id here" required name="userId">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control" ng-model="nPassword" placeholder="Enter password here" name="password">
                                            </div>
                                            <div class="text-center">
                                                <button type="submit" class="btn btn-default btn-sm" ng-click="addUser($event)">Add</button>
                                            </div>
                                        </form>
                                        <span ng-show="auf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                                        <span ng-show="auf.userId.$touched && auf.userId.$error.required" class="editmsgs">UserId required. Enter a valid email id</span><br>
                                        <span ng-if="!(auf.userId.$dirty || auf.password.$dirty)" ng-bind="adderror" class="error"></span>
                                        <span ng-if="!(auf.userId.$touched || auf.password.$touched) && addSuccess" class="success">User added successfully</span>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="text-center">
                                        <a href="#" ng-click="toggleDelUserEditor($event)">Delete user<span ng-show="!angular.isUndefined(bShowDUE)&& bShowDUE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowDUE) || !bShowDUE" class="glyphicon glyphicon-menu-down"></span>
                                        </a>
                                    </div>
                                    <div class="well well-sm" ng-show="!angular.isUndefined(bShowDUE) && bShowDUE">
                                        <form role="form" name="duf">
                                            <div class="form-group">
                                                <a href="#" ng-click="refreshDUsers($event)" class="btn btn-info btn-xs">
                                                    <span class="glyphicon glyphicon-refresh"></span> Refresh user list
                                                </a>
                                            </div>
                                            <div class="form-group">
                                                <select class="form-control" name="userId" ng-model="dUserId" required>
                                                    <option value="">Select User</option>
                                                    <option ng-repeat="usr in allDUsers track by usr.userId">"""),format.raw/*124.110*/("""{"""),format.raw/*124.111*/("""{"""),format.raw/*124.112*/("""usr.userId"""),format.raw/*124.122*/("""}"""),format.raw/*124.123*/("""}"""),format.raw/*124.124*/("""</option>
                                                </select>
                                            </div>
                                            <div class="text-center">
                                                <button type="submit" class="btn btn-default btn-sm" ng-click="deleteUser($event)">Delete</button>
                                            </div>
                                        </form>
                                        <span ng-show="allDUsers.length != 0 && duf.userId.$touched && duf.userId.$error.required" class="editmsgs">UserId required. Select a email id</span><br>
                                        <span ng-if="!duf.userId.$dirty" ng-bind="delerror" class="error"></span>
                                        <span ng-if="!duf.userId.$touched && delSuccess" class="success">User deleted successfully</span>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="text-center">
                                        <a href="#" ng-click="toggleUserEditor($event)">Reset password<span ng-show="!angular.isUndefined(bShowRPE)&& bShowRPE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowRPE) || !bShowRPE" class="glyphicon glyphicon-menu-down"></span>
                                        </a>
                                    </div>
                                    <div class="well well-sm" ng-show="!angular.isUndefined(bShowRPE) && bShowRPE">
                                        <form role="form" name="rpf">
                                            <div class="form-group">
                                                <a href="#" ng-click="refreshMUsers($event)" class="btn btn-info btn-xs">
                                                    <span class="glyphicon glyphicon-refresh"></span> Refresh user list
                                                </a>
                                            </div>
                                            <div class="form-group">
                                                <select class="form-control" name="userId" ng-model="mUserId" required>
                                                    <option value="">Select User</option>
                                                    <option ng-repeat="usr in allMUsers track by usr.userId">"""),format.raw/*153.110*/("""{"""),format.raw/*153.111*/("""{"""),format.raw/*153.112*/("""usr.userId"""),format.raw/*153.122*/("""}"""),format.raw/*153.123*/("""}"""),format.raw/*153.124*/("""</option>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control" ng-model="mPassword" placeholder="Enter password here" name="password">
                                            </div>
                                            <div class="text-center">
                                                <button type="submit" class="btn btn-default btn-sm" ng-click="modifyUser($event)">Reset</button>
                                            </div>
                                        </form>
                                        <span ng-show="allMUsers.length != 0 && rpf.userId.$touched && rpf.userId.$error.required" class="editmsgs">UserId required. Select a email id</span><br>
                                        <span ng-if="!rpf.userId.$dirty" ng-bind="moderror" class="error"></span>
                                        <span ng-if="!(rpf.userId.$touched || rpf.password.$touched) && modSuccess" class="success">Password changed</span>
                                    </div>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="well well-lg">
                    <div class="text-center">
                        <h4 id="adminmgmttitle">Broadcast post</h4>
                    </div>
                    <div class="text-center">
                        <a href="#" ng-click="togglePostsEditor($event)">My posts<span ng-show="!angular.isUndefined(bShowPosts) && bShowPosts" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowPosts) || !bShowPosts" class="glyphicon glyphicon-menu-down"></span>
                        </a>
                    </div>
                </div>
                <div class="well well-lg" ng-show="!angular.isUndefined(bShowPosts) && bShowPosts">
                    <h4 id="poststitle">Posts <span class="badge">"""),format.raw/*184.67*/("""{"""),format.raw/*184.68*/("""{"""),format.raw/*184.69*/("""postpage.numPosts"""),format.raw/*184.86*/("""}"""),format.raw/*184.87*/("""}"""),format.raw/*184.88*/("""</span></h4>
                    <form name="apf" role="form">
                        <div class="form-group">
                            <textarea name="post" ng-model="post" name="post" class="form-control" maxlength="500" required placeholder="Enter your post here"></textarea>
                        </div>
                        <div class="text-right">
                            <button type="submit" ng-click="addPost($event)" class="btn btn-primary btn-xs">Broadcast Post</button>
                        </div>
                    </form>
                    <div id="addError"></div>
                    <div ng-if="!apf.post.$touched && !angular.isUndefined(pbroadcaststatus)" ng-bind="pbroadcaststatus"></div>
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
                    <div class="well well-lg" ng-repeat="pst in postpage.arr track by pst.id">
                        <div class="text-right">
                            <h6 class="postedby"><span class="user">"""),format.raw/*208.69*/("""{"""),format.raw/*208.70*/("""{"""),format.raw/*208.71*/("""pst.userId"""),format.raw/*208.81*/("""}"""),format.raw/*208.82*/("""}"""),format.raw/*208.83*/("""</span> on """),format.raw/*208.94*/("""{"""),format.raw/*208.95*/("""{"""),format.raw/*208.96*/("""pst.postedOn"""),format.raw/*208.108*/("""}"""),format.raw/*208.109*/("""}"""),format.raw/*208.110*/("""</h6>
                        </div>
                        <div class="postmsg"><span>"""),format.raw/*210.52*/("""{"""),format.raw/*210.53*/("""{"""),format.raw/*210.54*/("""pst.post"""),format.raw/*210.62*/("""}"""),format.raw/*210.63*/("""}"""),format.raw/*210.64*/("""</span></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript">
        var app = angular.module('admin',  ["ngCookies"]);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*218.80*/("""{"""),format.raw/*218.81*/("""
            """),format.raw/*219.13*/("""$locationProvider.html5Mode("""),format.raw/*219.41*/("""{"""),format.raw/*219.42*/("""enabled: true, requireBase: false"""),format.raw/*219.75*/("""}"""),format.raw/*219.76*/(""").hashPrefix('*');
        """),format.raw/*220.9*/("""}"""),format.raw/*220.10*/("""]);

        app.controller('adminCtrl', function($scope, $http, $location, $window, $cookies) """),format.raw/*222.91*/("""{"""),format.raw/*222.92*/("""
            """),format.raw/*223.13*/("""// Initialize the view
            $scope.conerror = "";
            $scope.adderror= "";
            $scope.delerror = "";
            $scope.moderror = "";
            $scope.addSuccess = false;
            $scope.delSuccess = false;
            $scope.modSuccess = false;
            $scope.users=[];
            $scope.allMUsers=[];
            $scope.allDUsers=[];

            $scope.loggedInUser = function() """),format.raw/*235.46*/("""{"""),format.raw/*235.47*/("""
                """),format.raw/*236.17*/("""return $cookies.get("userId");
            """),format.raw/*237.13*/("""}"""),format.raw/*237.14*/(""";

            $scope.loggedInUserGroup = function() """),format.raw/*239.51*/("""{"""),format.raw/*239.52*/("""
                """),format.raw/*240.17*/("""return $cookies.get("groupId");
            """),format.raw/*241.13*/("""}"""),format.raw/*241.14*/(""";

            $scope.showPosts = function(event) """),format.raw/*243.48*/("""{"""),format.raw/*243.49*/("""
                """),format.raw/*244.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*245.34*/routes/*245.40*/.PostController.getPosts),format.raw/*245.64*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*247.13*/("""}"""),format.raw/*247.14*/(""";

            // logout and goto home page
            $scope.signOut = function(event) """),format.raw/*250.46*/("""{"""),format.raw/*250.47*/("""
                """),format.raw/*251.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*255.34*/routes/*255.40*/.HomeController.logout),format.raw/*255.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*257.13*/("""}"""),format.raw/*257.14*/(""";

            // add post event handler
            $scope.addPost = function(event) """),format.raw/*260.46*/("""{"""),format.raw/*260.47*/("""
                """),format.raw/*261.17*/("""event.preventDefault();

                $scope.pbroadcaststatus = "";
                $scope.apf.post.$touched = false;
                // validate the posts form
                if ($scope.apf.post.$error.required) """),format.raw/*266.54*/("""{"""),format.raw/*266.55*/("""
                    """),format.raw/*267.21*/("""return;
                """),format.raw/*268.17*/("""}"""),format.raw/*268.18*/("""

                """),format.raw/*270.17*/("""// post the message
                $scope.conerror = "";
                $scope.padderror = "";
                $scope.pbroadcaststatus = "Posting and broadcasting...";
                $("#addError").html("");
                $http("""),format.raw/*275.23*/("""{"""),format.raw/*275.24*/("""
                        """),format.raw/*276.25*/("""method : "POST",
                        url : """"),_display_(/*277.33*/routes/*277.39*/.PostController.addPostAndBroadcast),format.raw/*277.74*/("""",
                        data : """),format.raw/*278.32*/("""{"""),format.raw/*278.33*/(""""post" : $scope.post"""),format.raw/*278.53*/("""}"""),format.raw/*278.54*/(""",
                        headers : """),format.raw/*279.35*/("""{"""),format.raw/*279.36*/("""
                            """),format.raw/*280.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*281.25*/("""}"""),format.raw/*281.26*/("""
                    """),format.raw/*282.21*/("""}"""),format.raw/*282.22*/(""").then(function successCallback(response) """),format.raw/*282.64*/("""{"""),format.raw/*282.65*/("""
                        """),format.raw/*283.25*/("""$scope.pbroadcaststatus = "Done";
                        $scope.post = "";
                        $scope.loadFirstPage();
                    """),format.raw/*286.21*/("""}"""),format.raw/*286.22*/(""", function errorCallback(response) """),format.raw/*286.57*/("""{"""),format.raw/*286.58*/("""
                        """),format.raw/*287.25*/("""$scope.pbroadcaststatus = "Error occured while posting and broadcasting.";
                        if (response.status == 400) """),format.raw/*288.53*/("""{"""),format.raw/*288.54*/("""
                            """),format.raw/*289.29*/("""$scope.padderror = response.data.error;
                            $("#addError").html("<div id='aErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.padderror + "</div>");
                        """),format.raw/*291.25*/("""}"""),format.raw/*291.26*/(""" """),format.raw/*291.27*/("""else """),format.raw/*291.32*/("""{"""),format.raw/*291.33*/("""
                            """),format.raw/*292.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*294.34*/("""{"""),format.raw/*294.35*/("""
                                """),format.raw/*295.33*/("""$scope.conerror = "Error posting the message. Retry";
                                $('#conError').modal('show');
                            """),format.raw/*297.29*/("""}"""),format.raw/*297.30*/("""
                        """),format.raw/*298.25*/("""}"""),format.raw/*298.26*/("""
                    """),format.raw/*299.21*/("""}"""),format.raw/*299.22*/(""");
            """),format.raw/*300.13*/("""}"""),format.raw/*300.14*/(""";

            // post page loader
            $scope.loadPage = function(url) """),format.raw/*303.45*/("""{"""),format.raw/*303.46*/("""
                """),format.raw/*304.17*/("""$scope.conerror = "";
                $http("""),format.raw/*305.23*/("""{"""),format.raw/*305.24*/("""
                        """),format.raw/*306.25*/("""method : "GET",
                        url : url,
                        headers : """),format.raw/*308.35*/("""{"""),format.raw/*308.36*/("""
                            """),format.raw/*309.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*310.25*/("""}"""),format.raw/*310.26*/("""
                    """),format.raw/*311.21*/("""}"""),format.raw/*311.22*/(""").then(function successCallback(response) """),format.raw/*311.64*/("""{"""),format.raw/*311.65*/("""
                        """),format.raw/*312.25*/("""$scope.postpage = response.data;
                    """),format.raw/*313.21*/("""}"""),format.raw/*313.22*/(""", function errorCallback(response) """),format.raw/*313.57*/("""{"""),format.raw/*313.58*/("""
                         """),format.raw/*314.26*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                         else """),format.raw/*316.31*/("""{"""),format.raw/*316.32*/("""
                            """),format.raw/*317.29*/("""$scope.conerror = "Error retrieving the post page from the server. Retry.";
                            $('#conError').modal('show');
                         """),format.raw/*319.26*/("""}"""),format.raw/*319.27*/("""
                    """),format.raw/*320.21*/("""}"""),format.raw/*320.22*/(""");
            """),format.raw/*321.13*/("""}"""),format.raw/*321.14*/(""";

            // refreshes the current page
            $scope.refreshCurrentPage = function(event) """),format.raw/*324.57*/("""{"""),format.raw/*324.58*/("""
                """),format.raw/*325.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadPage("/posts/userbposts/refresh/" + $scope.postpage.endId);
            """),format.raw/*328.13*/("""}"""),format.raw/*328.14*/(""";

            // next page event handler
            $scope.loadNextPage = function(event) """),format.raw/*331.51*/("""{"""),format.raw/*331.52*/("""
                """),format.raw/*332.17*/("""event.preventDefault();
                $scope.loadPage("/posts/userbposts/after/" + $scope.postpage.beginId);
            """),format.raw/*334.13*/("""}"""),format.raw/*334.14*/(""";

            // previous page event handler
            $scope.loadPreviousPage = function(event) """),format.raw/*337.55*/("""{"""),format.raw/*337.56*/("""
                """),format.raw/*338.17*/("""event.preventDefault();
                $scope.loadPage("/posts/userbposts/before/" + $scope.postpage.endId);
            """),format.raw/*340.13*/("""}"""),format.raw/*340.14*/(""";

            // loads the first page
            $scope.loadFirstPage = function() """),format.raw/*343.47*/("""{"""),format.raw/*343.48*/("""
                """),format.raw/*344.17*/("""$scope.postpage.numPosts = "0";
                $scope.postpage.bLastPage = false;
                $scope.postpage.arr = [];
                $scope.postpage.beginId = "-1";
                $scope.postpage.endId = "-1";
                $scope.loadPage("/posts/userbposts/first");
            """),format.raw/*350.13*/("""}"""),format.raw/*350.14*/(""";

            // toggles the comment editor for a post
            $scope.togglePostsEditor = function(event) """),format.raw/*353.56*/("""{"""),format.raw/*353.57*/("""
                """),format.raw/*354.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowPosts)) """),format.raw/*355.60*/("""{"""),format.raw/*355.61*/("""
                    """),format.raw/*356.21*/("""$scope.bShowPosts = true;
                    $scope.padderror = "";
                    $scope.postpage = new Object();
                    $scope.loadFirstPage();
                """),format.raw/*360.17*/("""}"""),format.raw/*360.18*/(""" """),format.raw/*360.19*/("""else """),format.raw/*360.24*/("""{"""),format.raw/*360.25*/("""
                    """),format.raw/*361.21*/("""$scope.bShowPosts = !$scope.bShowPosts;
                """),format.raw/*362.17*/("""}"""),format.raw/*362.18*/("""
            """),format.raw/*363.13*/("""}"""),format.raw/*363.14*/(""";

            $scope.showForbiddenPage = function() """),format.raw/*365.51*/("""{"""),format.raw/*365.52*/("""
                """),format.raw/*366.17*/("""$cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*369.34*/routes/*369.40*/.AdminController.showForbiddenPage),format.raw/*369.74*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*371.13*/("""}"""),format.raw/*371.14*/(""";

           $scope.refreshMUsers = function(event)"""),format.raw/*373.50*/("""{"""),format.raw/*373.51*/("""
                """),format.raw/*374.17*/("""$scope.loadAllUsers(0, event);
                $scope.mUserId = "";
                $scope.moderror = "";
                $scope.rpf.userId.$touched = false;
                $scope.rpf.password.$touched = false;
                $scope.modSuccess = false;
            """),format.raw/*380.13*/("""}"""),format.raw/*380.14*/(""";

            $scope.modifyUser  = function(event) """),format.raw/*382.50*/("""{"""),format.raw/*382.51*/("""
                """),format.raw/*383.17*/("""event.preventDefault();

                // validate the modify user form
                if ($scope.rpf.userId.$error.required || !$scope.rpf.userId.$dirty) """),format.raw/*386.85*/("""{"""),format.raw/*386.86*/("""
                    """),format.raw/*387.21*/("""$scope.rpf.userId.$touched = true;
                    return;
                """),format.raw/*389.17*/("""}"""),format.raw/*389.18*/("""

                """),format.raw/*391.17*/("""$scope.conerror = "";
                $scope.moderror = "";
                $scope.modSuccess = false;
                $http("""),format.raw/*394.23*/("""{"""),format.raw/*394.24*/("""
                        """),format.raw/*395.25*/("""method : "PUT",
                        url : """"),_display_(/*396.33*/routes/*396.39*/.AdminController.modifyUser),format.raw/*396.66*/("""",
                        data : """),format.raw/*397.32*/("""{"""),format.raw/*397.33*/(""""userId" : $scope.mUserId, "password" : $scope.mPassword"""),format.raw/*397.89*/("""}"""),format.raw/*397.90*/(""",
                        headers : """),format.raw/*398.35*/("""{"""),format.raw/*398.36*/("""
                            """),format.raw/*399.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*400.25*/("""}"""),format.raw/*400.26*/("""
                    """),format.raw/*401.21*/("""}"""),format.raw/*401.22*/(""").then(function successCallback(response) """),format.raw/*401.64*/("""{"""),format.raw/*401.65*/("""
                        """),format.raw/*402.25*/("""$scope.mUserId = null;
                        $scope.mPassword = "";
                        $scope.rpf.userId.$touched = false;
                        $scope.rpf.password.$touched = false;
                        $scope.modSuccess = true;
                    """),format.raw/*407.21*/("""}"""),format.raw/*407.22*/(""", function errorCallback(response) """),format.raw/*407.57*/("""{"""),format.raw/*407.58*/("""
                        """),format.raw/*408.25*/("""if (response.status == 400) """),format.raw/*408.53*/("""{"""),format.raw/*408.54*/("""
                            """),format.raw/*409.29*/("""$scope.moderror = response.data.error;
                            $scope.rpf.$setPristine();
                        """),format.raw/*411.25*/("""}"""),format.raw/*411.26*/(""" """),format.raw/*411.27*/("""else """),format.raw/*411.32*/("""{"""),format.raw/*411.33*/("""
                            """),format.raw/*412.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*414.34*/("""{"""),format.raw/*414.35*/("""
                                """),format.raw/*415.33*/("""$scope.conerror = "Error trying to reset the password. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*417.29*/("""}"""),format.raw/*417.30*/("""
                        """),format.raw/*418.25*/("""}"""),format.raw/*418.26*/("""
                    """),format.raw/*419.21*/("""}"""),format.raw/*419.22*/(""");
            """),format.raw/*420.13*/("""}"""),format.raw/*420.14*/(""";

            $scope.toggleUserEditor = function(event) """),format.raw/*422.55*/("""{"""),format.raw/*422.56*/("""
                """),format.raw/*423.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowRPE)) """),format.raw/*424.58*/("""{"""),format.raw/*424.59*/("""
                    """),format.raw/*425.21*/("""$scope.bShowRPE = true;
                    $scope.loadAllUsers(0, null);
                """),format.raw/*427.17*/("""}"""),format.raw/*427.18*/(""" """),format.raw/*427.19*/("""else """),format.raw/*427.24*/("""{"""),format.raw/*427.25*/("""
                    """),format.raw/*428.21*/("""$scope.bShowRPE = !$scope.bShowRPE;
                """),format.raw/*429.17*/("""}"""),format.raw/*429.18*/("""
            """),format.raw/*430.13*/("""}"""),format.raw/*430.14*/(""";

            $scope.loadAllUsers = function(dorm, event) """),format.raw/*432.57*/("""{"""),format.raw/*432.58*/(""" """),format.raw/*432.59*/("""// todo: serialize calls
                if (event != null)
                    event.preventDefault();
                $scope.conerror = "";

                if(dorm == 0)
                    $scope.allMUsers = [];
                else
                    $scope.allDUsers = [];
                $http("""),format.raw/*441.23*/("""{"""),format.raw/*441.24*/("""
                        """),format.raw/*442.25*/("""method : "GET",
                        url : """"),_display_(/*443.33*/routes/*443.39*/.AdminController.getUsers),format.raw/*443.64*/("""",
                        headers : """),format.raw/*444.35*/("""{"""),format.raw/*444.36*/("""
                        """),format.raw/*445.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*446.25*/("""}"""),format.raw/*446.26*/("""
                    """),format.raw/*447.21*/("""}"""),format.raw/*447.22*/(""").then(function successCallback(response) """),format.raw/*447.64*/("""{"""),format.raw/*447.65*/("""
                        """),format.raw/*448.25*/("""if(dorm == 0)
                            $scope.allMUsers = response.data;
                        else
                            $scope.allDUsers = response.data;
                    """),format.raw/*452.21*/("""}"""),format.raw/*452.22*/(""", function errorCallback(response) """),format.raw/*452.57*/("""{"""),format.raw/*452.58*/("""
                        """),format.raw/*453.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*455.30*/("""{"""),format.raw/*455.31*/("""
                            """),format.raw/*456.29*/("""$scope.conerror = "Error refreshing the list of all users. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*458.25*/("""}"""),format.raw/*458.26*/("""
                    """),format.raw/*459.21*/("""}"""),format.raw/*459.22*/("""
                """),format.raw/*460.17*/(""");
            """),format.raw/*461.13*/("""}"""),format.raw/*461.14*/(""";

            $scope.refreshDUsers = function(event)"""),format.raw/*463.51*/("""{"""),format.raw/*463.52*/("""
                """),format.raw/*464.17*/("""$scope.loadAllUsers(1,event);
                $scope.dUserId = "";
                $scope.delerror = "";
                $scope.duf.userId.$touched = false;
                $scope.delSuccess = false;
            """),format.raw/*469.13*/("""}"""),format.raw/*469.14*/(""";

            $scope.deleteUser  = function(event) """),format.raw/*471.50*/("""{"""),format.raw/*471.51*/("""
                """),format.raw/*472.17*/("""event.preventDefault();

                // validate the delete user form
                if ($scope.duf.userId.$error.required || !$scope.duf.userId.$dirty) """),format.raw/*475.85*/("""{"""),format.raw/*475.86*/("""
                    """),format.raw/*476.21*/("""$scope.duf.userId.$touched = true;
                    return;
                """),format.raw/*478.17*/("""}"""),format.raw/*478.18*/("""

                """),format.raw/*480.17*/("""$scope.conerror = "";
                $scope.delerror = "";
                $scope.delSuccess = false;
                $http("""),format.raw/*483.23*/("""{"""),format.raw/*483.24*/("""
                        """),format.raw/*484.25*/("""method : "DELETE",
                        url : "user/" + $scope.dUserId,
                        headers : """),format.raw/*486.35*/("""{"""),format.raw/*486.36*/("""
                            """),format.raw/*487.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*488.25*/("""}"""),format.raw/*488.26*/("""
                    """),format.raw/*489.21*/("""}"""),format.raw/*489.22*/(""").then(function successCallback(response) """),format.raw/*489.64*/("""{"""),format.raw/*489.65*/("""
                        """),format.raw/*490.25*/("""$scope.dUserId = "";
                        $scope.duf.userId.$touched = false;
                        $scope.delSuccess = true;
                        $scope.loadAllUsers(1,null);
                    """),format.raw/*494.21*/("""}"""),format.raw/*494.22*/(""", function errorCallback(response) """),format.raw/*494.57*/("""{"""),format.raw/*494.58*/("""
                        """),format.raw/*495.25*/("""if (response.status == 400) """),format.raw/*495.53*/("""{"""),format.raw/*495.54*/("""
                            """),format.raw/*496.29*/("""$scope.delerror = response.data.error;
                            $scope.duf.$setPristine();
                        """),format.raw/*498.25*/("""}"""),format.raw/*498.26*/(""" """),format.raw/*498.27*/("""else """),format.raw/*498.32*/("""{"""),format.raw/*498.33*/("""
                            """),format.raw/*499.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*501.34*/("""{"""),format.raw/*501.35*/("""
                                """),format.raw/*502.33*/("""$scope.conerror = "Error trying to delete the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*504.29*/("""}"""),format.raw/*504.30*/("""
                        """),format.raw/*505.25*/("""}"""),format.raw/*505.26*/("""
                    """),format.raw/*506.21*/("""}"""),format.raw/*506.22*/(""");
            """),format.raw/*507.13*/("""}"""),format.raw/*507.14*/(""";

            $scope.toggleDelUserEditor = function(event) """),format.raw/*509.58*/("""{"""),format.raw/*509.59*/("""
                """),format.raw/*510.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowDUE)) """),format.raw/*511.58*/("""{"""),format.raw/*511.59*/("""
                    """),format.raw/*512.21*/("""$scope.bShowDUE = true;
                    $scope.loadAllUsers(1,null);
                """),format.raw/*514.17*/("""}"""),format.raw/*514.18*/(""" """),format.raw/*514.19*/("""else """),format.raw/*514.24*/("""{"""),format.raw/*514.25*/("""
                    """),format.raw/*515.21*/("""$scope.bShowDUE = !$scope.bShowDUE;
                """),format.raw/*516.17*/("""}"""),format.raw/*516.18*/("""
            """),format.raw/*517.13*/("""}"""),format.raw/*517.14*/(""";

            $scope.addUser  = function(event) """),format.raw/*519.47*/("""{"""),format.raw/*519.48*/("""
                """),format.raw/*520.17*/("""event.preventDefault();

                // validate the add user form
                if ($scope.auf.userId.$error.required || $scope.auf.userId.$error.email || !($scope.auf.userId.$dirty || $scope.auf.password.$dirty)) """),format.raw/*523.151*/("""{"""),format.raw/*523.152*/("""
                    """),format.raw/*524.21*/("""$scope.auf.userId.$touched = true;
                    return;
                """),format.raw/*526.17*/("""}"""),format.raw/*526.18*/("""

                """),format.raw/*528.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                $http("""),format.raw/*531.23*/("""{"""),format.raw/*531.24*/("""
                        """),format.raw/*532.25*/("""method : "POST",
                        url : """"),_display_(/*533.33*/routes/*533.39*/.AdminController.addUser),format.raw/*533.63*/("""",
                        data : """),format.raw/*534.32*/("""{"""),format.raw/*534.33*/(""""userId" : $scope.nUserId, "password" : $scope.nPassword"""),format.raw/*534.89*/("""}"""),format.raw/*534.90*/(""",
                        headers : """),format.raw/*535.35*/("""{"""),format.raw/*535.36*/("""
                            """),format.raw/*536.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*537.25*/("""}"""),format.raw/*537.26*/("""
                    """),format.raw/*538.21*/("""}"""),format.raw/*538.22*/(""").then(function successCallback(response) """),format.raw/*538.64*/("""{"""),format.raw/*538.65*/("""
                        """),format.raw/*539.25*/("""$scope.nUserId = "";
                        $scope.nPassword = "";
                        $scope.auf.userId.$touched = false;
                        $scope.auf.password.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*544.21*/("""}"""),format.raw/*544.22*/(""", function errorCallback(response) """),format.raw/*544.57*/("""{"""),format.raw/*544.58*/("""
                        """),format.raw/*545.25*/("""if (response.status == 400) """),format.raw/*545.53*/("""{"""),format.raw/*545.54*/("""
                            """),format.raw/*546.29*/("""$scope.adderror = response.data.error;
                            $scope.auf.$setPristine();
                        """),format.raw/*548.25*/("""}"""),format.raw/*548.26*/(""" """),format.raw/*548.27*/("""else """),format.raw/*548.32*/("""{"""),format.raw/*548.33*/("""
                            """),format.raw/*549.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*551.34*/("""{"""),format.raw/*551.35*/("""
                                """),format.raw/*552.33*/("""$scope.conerror = "Error trying to add the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*554.29*/("""}"""),format.raw/*554.30*/("""
                        """),format.raw/*555.25*/("""}"""),format.raw/*555.26*/("""
                    """),format.raw/*556.21*/("""}"""),format.raw/*556.22*/(""");
            """),format.raw/*557.13*/("""}"""),format.raw/*557.14*/(""";

            $scope.toggleAddUserEditor = function(event) """),format.raw/*559.58*/("""{"""),format.raw/*559.59*/("""
                """),format.raw/*560.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowAUE)) """),format.raw/*561.58*/("""{"""),format.raw/*561.59*/("""
                    """),format.raw/*562.21*/("""$scope.bShowAUE = true;
                    $scope.nUserId = "";
                    $scope.nPassword = "";
                """),format.raw/*565.17*/("""}"""),format.raw/*565.18*/(""" """),format.raw/*565.19*/("""else """),format.raw/*565.24*/("""{"""),format.raw/*565.25*/("""
                    """),format.raw/*566.21*/("""$scope.bShowAUE = !$scope.bShowAUE;
                """),format.raw/*567.17*/("""}"""),format.raw/*567.18*/("""
            """),format.raw/*568.13*/("""}"""),format.raw/*568.14*/(""";

            $scope.loadUserSummary = function() """),format.raw/*570.49*/("""{"""),format.raw/*570.50*/("""
                """),format.raw/*571.17*/("""$scope.conerror = "";
                $scope.users=[];
                $http("""),format.raw/*573.23*/("""{"""),format.raw/*573.24*/("""
                        """),format.raw/*574.25*/("""method : "GET",
                        url : """"),_display_(/*575.33*/routes/*575.39*/.HomeController.getUserSummary),format.raw/*575.69*/("""",
                        headers : """),format.raw/*576.35*/("""{"""),format.raw/*576.36*/("""
                        """),format.raw/*577.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*578.25*/("""}"""),format.raw/*578.26*/("""
                    """),format.raw/*579.21*/("""}"""),format.raw/*579.22*/(""").then(function successCallback(response) """),format.raw/*579.64*/("""{"""),format.raw/*579.65*/("""
                        """),format.raw/*580.25*/("""$scope.users = response.data;
                    """),format.raw/*581.21*/("""}"""),format.raw/*581.22*/(""", function errorCallback(response) """),format.raw/*581.57*/("""{"""),format.raw/*581.58*/("""
                        """),format.raw/*582.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*584.30*/("""{"""),format.raw/*584.31*/("""
                            """),format.raw/*585.29*/("""$scope.conerror = "Error refreshing the user summary. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*587.25*/("""}"""),format.raw/*587.26*/("""
                    """),format.raw/*588.21*/("""}"""),format.raw/*588.22*/("""
                """),format.raw/*589.17*/(""");
            """),format.raw/*590.13*/("""}"""),format.raw/*590.14*/(""";
            $scope.loadUserSummary();
        """),format.raw/*592.9*/("""}"""),format.raw/*592.10*/(""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object admin extends admin_Scope0.admin
              /*
                  -- GENERATED --
                  DATE: Thu Aug 18 11:22:56 IST 2016
                  SOURCE: /home/si2chip/web_app/msmp1.0.git/app/views/admin.scala.html
                  HASH: 57f1ac5270995c5f3afbd85b6dff5dcc5d8112c1
                  MATRIX: 827->0|1136->283|1150->289|1218->337|1280->373|1294->379|1356->421|1418->457|1432->463|1494->505|2864->1847|2893->1848|2922->1849|2964->1863|2993->1864|3022->1865|3099->1913|3129->1914|3159->1915|3207->1934|3237->1935|3267->1936|3992->2633|4021->2634|4050->2635|4086->2643|4115->2644|4144->2645|4202->2675|4591->3036|4620->3037|4649->3038|4689->3050|4718->3051|4747->3052|5218->3494|5248->3495|5278->3496|5315->3504|5345->3505|5375->3506|5435->3538|5464->3539|5493->3540|5529->3548|5558->3549|5587->3550|5635->3570|5664->3571|5693->3572|5732->3583|5761->3584|5790->3585|10295->8060|10326->8061|10357->8062|10397->8072|10428->8073|10459->8074|13031->10616|13062->10617|13093->10618|13133->10628|13164->10629|13195->10630|15462->12868|15492->12869|15522->12870|15568->12887|15598->12888|15628->12889|17393->14625|17423->14626|17453->14627|17492->14637|17522->14638|17552->14639|17592->14650|17622->14651|17652->14652|17694->14664|17725->14665|17756->14666|17875->14756|17905->14757|17935->14758|17972->14766|18002->14767|18032->14768|18352->15059|18382->15060|18425->15074|18482->15102|18512->15103|18574->15136|18604->15137|18660->15165|18690->15166|18816->15263|18846->15264|18889->15278|19346->15706|19376->15707|19423->15725|19496->15769|19526->15770|19610->15825|19640->15826|19687->15844|19761->15889|19791->15890|19872->15942|19902->15943|19949->15961|20035->16019|20051->16025|20097->16049|20214->16137|20244->16138|20365->16230|20395->16231|20442->16249|20663->16442|20679->16448|20723->16470|20840->16558|20870->16559|20988->16648|21018->16649|21065->16667|21316->16889|21346->16890|21397->16912|21451->16937|21481->16938|21530->16958|21797->17196|21827->17197|21882->17223|21960->17273|21976->17279|22033->17314|22097->17349|22127->17350|22176->17370|22206->17371|22272->17408|22302->17409|22361->17439|22451->17500|22481->17501|22532->17523|22562->17524|22633->17566|22663->17567|22718->17593|22894->17740|22924->17741|22988->17776|23018->17777|23073->17803|23230->17931|23260->17932|23319->17962|23588->18202|23618->18203|23648->18204|23682->18209|23712->18210|23771->18240|23923->18363|23953->18364|24016->18398|24191->18544|24221->18545|24276->18571|24306->18572|24357->18594|24387->18595|24432->18611|24462->18612|24573->18694|24603->18695|24650->18713|24724->18758|24754->18759|24809->18785|24925->18872|24955->18873|25014->18903|25104->18964|25134->18965|25185->18987|25215->18988|25286->19030|25316->19031|25371->19057|25454->19111|25484->19112|25548->19147|25578->19148|25634->19175|25779->19291|25809->19292|25868->19322|26058->19483|26088->19484|26139->19506|26169->19507|26214->19523|26244->19524|26377->19628|26407->19629|26454->19647|26648->19812|26678->19813|26802->19908|26832->19909|26879->19927|27033->20052|27063->20053|27195->20156|27225->20157|27272->20175|27425->20299|27455->20300|27572->20388|27602->20389|27649->20407|27975->20704|28005->20705|28148->20819|28178->20820|28225->20838|28338->20922|28368->20923|28419->20945|28633->21130|28663->21131|28693->21132|28727->21137|28757->21138|28808->21160|28894->21217|28924->21218|28967->21232|28997->21233|29081->21288|29111->21289|29158->21307|29338->21459|29354->21465|29410->21499|29527->21587|29557->21588|29640->21642|29670->21643|29717->21661|30019->21934|30049->21935|30132->21989|30162->21990|30209->22008|30399->22169|30429->22170|30480->22192|30590->22273|30620->22274|30669->22294|30826->22422|30856->22423|30911->22449|30988->22498|31004->22504|31053->22531|31117->22566|31147->22567|31232->22623|31262->22624|31328->22661|31358->22662|31417->22692|31507->22753|31537->22754|31588->22776|31618->22777|31689->22819|31719->22820|31774->22846|32070->23113|32100->23114|32164->23149|32194->23150|32249->23176|32306->23204|32336->23205|32395->23235|32544->23355|32574->23356|32604->23357|32638->23362|32668->23363|32727->23393|32879->23516|32909->23517|32972->23551|33157->23707|33187->23708|33242->23734|33272->23735|33323->23757|33353->23758|33398->23774|33428->23775|33516->23834|33546->23835|33593->23853|33704->23935|33734->23936|33785->23958|33906->24050|33936->24051|33966->24052|34000->24057|34030->24058|34081->24080|34163->24133|34193->24134|34236->24148|34266->24149|34356->24210|34386->24211|34416->24212|34756->24523|34786->24524|34841->24550|34918->24599|34934->24605|34981->24630|35048->24668|35078->24669|35133->24695|35223->24756|35253->24757|35304->24779|35334->24780|35405->24822|35435->24823|35490->24849|35710->25040|35740->25041|35804->25076|35834->25077|35889->25103|36033->25218|36063->25219|36122->25249|36303->25401|36333->25402|36384->25424|36414->25425|36461->25443|36506->25459|36536->25460|36620->25515|36650->25516|36697->25534|36943->25751|36973->25752|37056->25806|37086->25807|37133->25825|37323->25986|37353->25987|37404->26009|37514->26090|37544->26091|37593->26111|37750->26239|37780->26240|37835->26266|37975->26377|38005->26378|38064->26408|38154->26469|38184->26470|38235->26492|38265->26493|38336->26535|38366->26536|38421->26562|38658->26770|38688->26771|38752->26806|38782->26807|38837->26833|38894->26861|38924->26862|38983->26892|39132->27012|39162->27013|39192->27014|39226->27019|39256->27020|39315->27050|39467->27173|39497->27174|39560->27208|39742->27361|39772->27362|39827->27388|39857->27389|39908->27411|39938->27412|39983->27428|40013->27429|40104->27491|40134->27492|40181->27510|40292->27592|40322->27593|40373->27615|40493->27706|40523->27707|40553->27708|40587->27713|40617->27714|40668->27736|40750->27789|40780->27790|40823->27804|40853->27805|40933->27856|40963->27857|41010->27875|41264->28099|41295->28100|41346->28122|41456->28203|41486->28204|41535->28224|41692->28352|41722->28353|41777->28379|41855->28429|41871->28435|41917->28459|41981->28494|42011->28495|42096->28551|42126->28552|42192->28589|42222->28590|42281->28620|42371->28681|42401->28682|42452->28704|42482->28705|42553->28747|42583->28748|42638->28774|42932->29039|42962->29040|43026->29075|43056->29076|43111->29102|43168->29130|43198->29131|43257->29161|43406->29281|43436->29282|43466->29283|43500->29288|43530->29289|43589->29319|43741->29442|43771->29443|43834->29477|44013->29627|44043->29628|44098->29654|44128->29655|44179->29677|44209->29678|44254->29694|44284->29695|44375->29757|44405->29758|44452->29776|44563->29858|44593->29859|44644->29881|44800->30008|44830->30009|44860->30010|44894->30015|44924->30016|44975->30038|45057->30091|45087->30092|45130->30106|45160->30107|45242->30160|45272->30161|45319->30179|45427->30258|45457->30259|45512->30285|45589->30334|45605->30340|45657->30370|45724->30408|45754->30409|45809->30435|45899->30496|45929->30497|45980->30519|46010->30520|46081->30562|46111->30563|46166->30589|46246->30640|46276->30641|46340->30676|46370->30677|46425->30703|46569->30818|46599->30819|46658->30849|46834->30996|46864->30997|46915->31019|46945->31020|46992->31038|47037->31054|47067->31055|47145->31105|47175->31106
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|80->49|80->49|80->49|80->49|80->49|80->49|81->50|91->60|91->60|91->60|91->60|91->60|91->60|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|155->124|155->124|155->124|155->124|155->124|155->124|184->153|184->153|184->153|184->153|184->153|184->153|215->184|215->184|215->184|215->184|215->184|215->184|239->208|239->208|239->208|239->208|239->208|239->208|239->208|239->208|239->208|239->208|239->208|239->208|241->210|241->210|241->210|241->210|241->210|241->210|249->218|249->218|250->219|250->219|250->219|250->219|250->219|251->220|251->220|253->222|253->222|254->223|266->235|266->235|267->236|268->237|268->237|270->239|270->239|271->240|272->241|272->241|274->243|274->243|275->244|276->245|276->245|276->245|278->247|278->247|281->250|281->250|282->251|286->255|286->255|286->255|288->257|288->257|291->260|291->260|292->261|297->266|297->266|298->267|299->268|299->268|301->270|306->275|306->275|307->276|308->277|308->277|308->277|309->278|309->278|309->278|309->278|310->279|310->279|311->280|312->281|312->281|313->282|313->282|313->282|313->282|314->283|317->286|317->286|317->286|317->286|318->287|319->288|319->288|320->289|322->291|322->291|322->291|322->291|322->291|323->292|325->294|325->294|326->295|328->297|328->297|329->298|329->298|330->299|330->299|331->300|331->300|334->303|334->303|335->304|336->305|336->305|337->306|339->308|339->308|340->309|341->310|341->310|342->311|342->311|342->311|342->311|343->312|344->313|344->313|344->313|344->313|345->314|347->316|347->316|348->317|350->319|350->319|351->320|351->320|352->321|352->321|355->324|355->324|356->325|359->328|359->328|362->331|362->331|363->332|365->334|365->334|368->337|368->337|369->338|371->340|371->340|374->343|374->343|375->344|381->350|381->350|384->353|384->353|385->354|386->355|386->355|387->356|391->360|391->360|391->360|391->360|391->360|392->361|393->362|393->362|394->363|394->363|396->365|396->365|397->366|400->369|400->369|400->369|402->371|402->371|404->373|404->373|405->374|411->380|411->380|413->382|413->382|414->383|417->386|417->386|418->387|420->389|420->389|422->391|425->394|425->394|426->395|427->396|427->396|427->396|428->397|428->397|428->397|428->397|429->398|429->398|430->399|431->400|431->400|432->401|432->401|432->401|432->401|433->402|438->407|438->407|438->407|438->407|439->408|439->408|439->408|440->409|442->411|442->411|442->411|442->411|442->411|443->412|445->414|445->414|446->415|448->417|448->417|449->418|449->418|450->419|450->419|451->420|451->420|453->422|453->422|454->423|455->424|455->424|456->425|458->427|458->427|458->427|458->427|458->427|459->428|460->429|460->429|461->430|461->430|463->432|463->432|463->432|472->441|472->441|473->442|474->443|474->443|474->443|475->444|475->444|476->445|477->446|477->446|478->447|478->447|478->447|478->447|479->448|483->452|483->452|483->452|483->452|484->453|486->455|486->455|487->456|489->458|489->458|490->459|490->459|491->460|492->461|492->461|494->463|494->463|495->464|500->469|500->469|502->471|502->471|503->472|506->475|506->475|507->476|509->478|509->478|511->480|514->483|514->483|515->484|517->486|517->486|518->487|519->488|519->488|520->489|520->489|520->489|520->489|521->490|525->494|525->494|525->494|525->494|526->495|526->495|526->495|527->496|529->498|529->498|529->498|529->498|529->498|530->499|532->501|532->501|533->502|535->504|535->504|536->505|536->505|537->506|537->506|538->507|538->507|540->509|540->509|541->510|542->511|542->511|543->512|545->514|545->514|545->514|545->514|545->514|546->515|547->516|547->516|548->517|548->517|550->519|550->519|551->520|554->523|554->523|555->524|557->526|557->526|559->528|562->531|562->531|563->532|564->533|564->533|564->533|565->534|565->534|565->534|565->534|566->535|566->535|567->536|568->537|568->537|569->538|569->538|569->538|569->538|570->539|575->544|575->544|575->544|575->544|576->545|576->545|576->545|577->546|579->548|579->548|579->548|579->548|579->548|580->549|582->551|582->551|583->552|585->554|585->554|586->555|586->555|587->556|587->556|588->557|588->557|590->559|590->559|591->560|592->561|592->561|593->562|596->565|596->565|596->565|596->565|596->565|597->566|598->567|598->567|599->568|599->568|601->570|601->570|602->571|604->573|604->573|605->574|606->575|606->575|606->575|607->576|607->576|608->577|609->578|609->578|610->579|610->579|610->579|610->579|611->580|612->581|612->581|612->581|612->581|613->582|615->584|615->584|616->585|618->587|618->587|619->588|619->588|620->589|621->590|621->590|623->592|623->592
                  -- GENERATED --
              */
          