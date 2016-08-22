
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object groups_Scope0 {
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

class groups extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="""),_display_(/*8.34*/routes/*8.40*/.Assets.versioned("stylesheets/common/view.css")),format.raw/*8.88*/(""">
    <link rel="stylesheet" href="""),_display_(/*9.34*/routes/*9.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.81*/(""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>
    <title>SI2Chip Groups</title>
</head>
<body ng-app="groups" ng-controller="groupsCtrl">
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">SI2Chip</a>
            <img src="/home/si2chip/si2chip.png" style="width:50px;height:50px;">
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="#"> Owned groups </a></li>
            <li><a href="#" ng-click="showPosts($event)"> Posts </a></li>
            <li><a href="#" ng-click="signOut($event)"><span class="glyphicon glyphicon-log-out"></span> Sign out </a></li>
        </ul>
    </div>
</nav>
<div class="container">
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
                            """),format.raw/*41.29*/("""{"""),format.raw/*41.30*/("""{"""),format.raw/*41.31*/("""conerror"""),format.raw/*41.39*/("""}"""),format.raw/*41.40*/("""}"""),format.raw/*41.41*/("""
                        """),format.raw/*42.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6 col-sm-offset-6">
            <div class="text-right">
                <span class="who">"""),format.raw/*51.35*/("""{"""),format.raw/*51.36*/("""{"""),format.raw/*51.37*/("""loggedInUser()"""),format.raw/*51.51*/("""}"""),format.raw/*51.52*/("""}"""),format.raw/*51.53*/("""</span><span> Group: </span><span class="group">"""),format.raw/*51.101*/("""{"""),format.raw/*51.102*/("""{"""),format.raw/*51.103*/("""loggedInUserGroup()"""),format.raw/*51.122*/("""}"""),format.raw/*51.123*/("""}"""),format.raw/*51.124*/("""</span>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-3">
            <div class="well well-lg">
                <table class="table">
                    <thead>
                    <tr>
                        <th>
                            <div class="text-center">
                                <h4 id="groupsmgmttitle">Manage Owned Groups</h4>
                            </div>
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            <div class="text-center """),format.raw/*71.53*/("""{"""),format.raw/*71.54*/("""{"""),format.raw/*71.55*/("""setActive(1)"""),format.raw/*71.67*/("""}"""),format.raw/*71.68*/("""}"""),format.raw/*71.69*/("""">
                                <a href="#"  ng-click="toggleAddGroupEditor($event)"> Add group </a>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="text-center """),format.raw/*78.53*/("""{"""),format.raw/*78.54*/("""{"""),format.raw/*78.55*/("""setActive(2)"""),format.raw/*78.67*/("""}"""),format.raw/*78.68*/("""}"""),format.raw/*78.69*/("""">
                                <a href="#" ng-click="toggleGroupEditor($event)"> Modify group </a>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="text-center """),format.raw/*85.53*/("""{"""),format.raw/*85.54*/("""{"""),format.raw/*85.55*/("""setActive(3)"""),format.raw/*85.67*/("""}"""),format.raw/*85.68*/("""}"""),format.raw/*85.69*/("""">
                                <a href="#" ng-click="toggleDelGroupEditor($event)"> Delete group </a>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="well well-lg" ng-show="!angular.isUndefined(nEditor) && nEditor == 1">
                <form role="form" name="agf">
                    <div class="form-group">
                        <input type="text" class="form-control" maxlength="255" ng-model="nGroupId" placeholder="Enter group id here" required name="groupId">
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-default btn-sm" ng-click="addGroup($event)">Add Group</button>
                    </div>
                </form>
                <span ng-show="agf.groupId.$touched && agf.groupId.$error.required" class="editmsgs">Group id required</span><br>
                <span ng-if="!agf.groupId.$dirty" ng-bind="adderror" class="error"></span>
                <span ng-if="!agf.groupId.$touched && addSuccess" class="success">Group added successfully</span>
            </div>
            <div class="well well-lg" ng-show="!angular.isUndefined(nEditor) && nEditor == 2">
                <form role="form" name="mgf">
                    <div class="form-group">
                        <a href="#" ng-click="refreshMGroups($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-refresh"></span> Refresh group list
                        </a>
                    </div>
                    <div class="form-group">
                        <select class="form-control" name="groupId"  ng-change="resetModifyGroupUsersEditor()" ng-model="mGroupId" required>
                            <option value="">Select group</option>
                            <option ng-repeat="grp in allMUserGroups track by grp.groupId">"""),format.raw/*118.92*/("""{"""),format.raw/*118.93*/("""{"""),format.raw/*118.94*/("""grp.groupId"""),format.raw/*118.105*/("""}"""),format.raw/*118.106*/("""}"""),format.raw/*118.107*/("""</option>
                        </select>
                    </div>
                </form>
                <div class="well well-lg" ng-show="!mgf.groupId.$error.required">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>
                                <div class="text-center">
                                    <h5 id="groupusersmgmttitle">Manage users</h5>
                                </div>
                            </th>
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
                                            <a href="#" ng-click="refreshMAUsers($event)" class="btn btn-info btn-xs">
                                                <span class="glyphicon glyphicon-refresh"></span> Refresh user list
                                            </a>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control" name="userId" ng-model="nUserId" required>
                                                <option value="">Select User</option>
                                                <option ng-repeat="usr in allMAUsers track by usr.userId">"""),format.raw/*150.107*/("""{"""),format.raw/*150.108*/("""{"""),format.raw/*150.109*/("""usr.userId"""),format.raw/*150.119*/("""}"""),format.raw/*150.120*/("""}"""),format.raw/*150.121*/("""</option>
                                            </select>
                                        </div>
                                        <div class="text-center">
                                            <button type="submit" class="btn btn-default btn-sm" ng-click="addUser($event)">Add</button>
                                        </div>
                                    </form>
                                    <span ng-show="auf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                                    <span ng-show="allMAUsers.length != 0 && auf.userId.$touched && auf.userId.$error.required" class="editmsgs">UserId required. Select an email id</span><br>
                                    <span ng-if="!auf.userId.$dirty" ng-bind="addusererror" class="error"></span>
                                    <span ng-if="!auf.userId.$touched && addUserSuccess" class="success">User added successfully</span>
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
                                            <a href="#" ng-click="refreshMDUsers($event)" class="btn btn-info btn-xs">
                                                <span class="glyphicon glyphicon-refresh"></span> Refresh group user list
                                            </a>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control" name="userId" ng-model="dUserId" required>
                                                <option value="">Select User</option>
                                                <option ng-repeat="usr in allMDUsers track by usr.userId">"""),format.raw/*180.107*/("""{"""),format.raw/*180.108*/("""{"""),format.raw/*180.109*/("""usr.userId"""),format.raw/*180.119*/("""}"""),format.raw/*180.120*/("""}"""),format.raw/*180.121*/("""</option>
                                            </select>
                                        </div>
                                        <div class="text-center">
                                            <button type="submit" class="btn btn-default btn-sm" ng-click="deleteUser($event)">Delete</button>
                                        </div>
                                    </form>
                                    <span ng-show="allMDUsers.length != 0 && duf.userId.$touched && duf.userId.$error.required" class="editmsgs">UserId required. Select an email id</span><br>
                                    <span ng-if="!duf.userId.$dirty" ng-bind="delusererror" class="error"></span>
                                    <span ng-if="!duf.userId.$touched && delUserSuccess" class="success">User deleted successfully</span>
                                </div>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
             </div>
            <div class="well well-lg" ng-show="!angular.isUndefined(nEditor) && nEditor == 3">
                <form role="form" name="dgf">
                    <div class="form-group">
                        <a href="#" ng-click="refreshDGroups($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-refresh"></span> Refresh group list
                        </a>
                    </div>
                    <div class="form-group">
                        <select class="form-control" name="groupId" ng-model="dGroupId" required>
                            <option value="">Select group</option>
                            <option ng-repeat="grp in allDUserGroups track by grp.groupId">"""),format.raw/*207.92*/("""{"""),format.raw/*207.93*/("""{"""),format.raw/*207.94*/("""grp.groupId"""),format.raw/*207.105*/("""}"""),format.raw/*207.106*/("""}"""),format.raw/*207.107*/("""</option>
                        </select>
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-default btn-sm" ng-click="deleteGroup($event)">Delete Group</button>
                    </div>
                </form>
                <span ng-show="allDUserGroups.length != 0 && dgf.groupId.$touched && dgf.groupId.$error.required" class="editmsgs">GroupId required. Select a group id</span><br>
                <span ng-if="!dgf.groupId.$dirty" ng-bind="delerror" class="error"></span>
                <span ng-if="!dgf.groupId.$touched && delSuccess" class="success">Group deleted successfully</span>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
        var app = angular.module('groups',  ["ngCookies"]);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*223.80*/("""{"""),format.raw/*223.81*/("""
            """),format.raw/*224.13*/("""$locationProvider.html5Mode("""),format.raw/*224.41*/("""{"""),format.raw/*224.42*/("""enabled: true, requireBase: false"""),format.raw/*224.75*/("""}"""),format.raw/*224.76*/(""").hashPrefix('*');
        """),format.raw/*225.9*/("""}"""),format.raw/*225.10*/("""]);

        app.service("GroupSvc", function ($http, $q) """),format.raw/*227.54*/("""{"""),format.raw/*227.55*/("""
            """),format.raw/*228.13*/("""var deferred;
            this.getGroups = function () """),format.raw/*229.42*/("""{"""),format.raw/*229.43*/("""
                """),format.raw/*230.17*/("""deferred = $q.defer();
                return $http("""),format.raw/*231.30*/("""{"""),format.raw/*231.31*/("""
                        """),format.raw/*232.25*/("""method : "GET",
                        url : """"),_display_(/*233.33*/routes/*233.39*/.GroupController.getOwnedGroups),format.raw/*233.70*/("""",
                        headers : """),format.raw/*234.35*/("""{"""),format.raw/*234.36*/("""
                        """),format.raw/*235.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*236.25*/("""}"""),format.raw/*236.26*/("""
                    """),format.raw/*237.21*/("""}"""),format.raw/*237.22*/(""")
                    .then(function (response) """),format.raw/*238.47*/("""{"""),format.raw/*238.48*/("""
                        """),format.raw/*239.25*/("""deferred.resolve(response);
                        return deferred.promise;
                    """),format.raw/*241.21*/("""}"""),format.raw/*241.22*/(""", function (response) """),format.raw/*241.44*/("""{"""),format.raw/*241.45*/("""
                        """),format.raw/*242.25*/("""deferred.reject(response);
                        return deferred.promise;
                    """),format.raw/*244.21*/("""}"""),format.raw/*244.22*/(""");
            """),format.raw/*245.13*/("""}"""),format.raw/*245.14*/(""";
        """),format.raw/*246.9*/("""}"""),format.raw/*246.10*/(""");

        app.controller('groupsCtrl', function($scope, $http, $location, $window, $cookies, GroupSvc) """),format.raw/*248.102*/("""{"""),format.raw/*248.103*/("""
            """),format.raw/*249.13*/("""// initialize the view
            $scope.adderror="";
            $scope.delerror="";
            $scope.conerror = "";
            $scope.addSuccess = false;
            $scope.delSuccess = false;
            $scope.allDUserGroups = [];
            $scope.allMUserGroups = [];
            $scope.nEditor = 0; // no editor

            $scope.loggedInUser = function() """),format.raw/*259.46*/("""{"""),format.raw/*259.47*/("""
                """),format.raw/*260.17*/("""return $cookies.get("userId");
            """),format.raw/*261.13*/("""}"""),format.raw/*261.14*/(""";

            $scope.loggedInUserGroup = function() """),format.raw/*263.51*/("""{"""),format.raw/*263.52*/("""
                """),format.raw/*264.17*/("""return $cookies.get("groupId");
            """),format.raw/*265.13*/("""}"""),format.raw/*265.14*/(""";

            // shows the forbidden page
            $scope.showForbiddenPage = function() """),format.raw/*268.51*/("""{"""),format.raw/*268.52*/("""
                """),format.raw/*269.17*/("""$cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*272.34*/routes/*272.40*/.HomeController.showForbiddenPage),format.raw/*272.73*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*274.13*/("""}"""),format.raw/*274.14*/(""";

            // goto posts page
            $scope.showPosts = function(event) """),format.raw/*277.48*/("""{"""),format.raw/*277.49*/("""
                """),format.raw/*278.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*279.34*/routes/*279.40*/.PostController.getPosts),format.raw/*279.64*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*281.13*/("""}"""),format.raw/*281.14*/(""";

            // logout and goto home page
            $scope.signOut = function(event) """),format.raw/*284.46*/("""{"""),format.raw/*284.47*/("""
                """),format.raw/*285.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*289.34*/routes/*289.40*/.HomeController.logout),format.raw/*289.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*291.13*/("""}"""),format.raw/*291.14*/(""";

            // highlight the selected group action
            $scope.setActive = function(nE) """),format.raw/*294.45*/("""{"""),format.raw/*294.46*/("""
                """),format.raw/*295.17*/("""if (nE == $scope.nEditor)
                    return "selectedaction"; // css class to highlight the selected action
                else
                    return "";
            """),format.raw/*299.13*/("""}"""),format.raw/*299.14*/(""";


            // adds a group
            $scope.addGroup  = function(event) """),format.raw/*303.48*/("""{"""),format.raw/*303.49*/("""
                """),format.raw/*304.17*/("""event.preventDefault();

                // validate the add group form
                if ($scope.agf.groupId.$error.required || !$scope.agf.groupId.$dirty) """),format.raw/*307.87*/("""{"""),format.raw/*307.88*/("""
                    """),format.raw/*308.21*/("""$scope.agf.groupId.$touched = true;
                    return;
                """),format.raw/*310.17*/("""}"""),format.raw/*310.18*/("""

                """),format.raw/*312.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                $http("""),format.raw/*315.23*/("""{"""),format.raw/*315.24*/("""
                        """),format.raw/*316.25*/("""method : "POST",
                        url : """"),_display_(/*317.33*/routes/*317.39*/.GroupController.addGroup),format.raw/*317.64*/("""",
                        data : """),format.raw/*318.32*/("""{"""),format.raw/*318.33*/(""""groupId" : $scope.nGroupId"""),format.raw/*318.60*/("""}"""),format.raw/*318.61*/(""",
                        headers : """),format.raw/*319.35*/("""{"""),format.raw/*319.36*/("""
                            """),format.raw/*320.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*321.25*/("""}"""),format.raw/*321.26*/("""
                    """),format.raw/*322.21*/("""}"""),format.raw/*322.22*/(""").then(function successCallback(response) """),format.raw/*322.64*/("""{"""),format.raw/*322.65*/("""
                        """),format.raw/*323.25*/("""$scope.nGroupId = "";
                        $scope.agf.groupId.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*326.21*/("""}"""),format.raw/*326.22*/(""", function errorCallback(response) """),format.raw/*326.57*/("""{"""),format.raw/*326.58*/("""
                        """),format.raw/*327.25*/("""if (response.status == 400) """),format.raw/*327.53*/("""{"""),format.raw/*327.54*/("""
                            """),format.raw/*328.29*/("""$scope.adderror = response.data.error;
                            $scope.agf.$setPristine();
                        """),format.raw/*330.25*/("""}"""),format.raw/*330.26*/(""" """),format.raw/*330.27*/("""else """),format.raw/*330.32*/("""{"""),format.raw/*330.33*/("""
                            """),format.raw/*331.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*333.34*/("""{"""),format.raw/*333.35*/("""
                                """),format.raw/*334.33*/("""$scope.conerror = "Error trying to add the group. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*336.29*/("""}"""),format.raw/*336.30*/("""
                        """),format.raw/*337.25*/("""}"""),format.raw/*337.26*/("""
                    """),format.raw/*338.21*/("""}"""),format.raw/*338.22*/(""");
            """),format.raw/*339.13*/("""}"""),format.raw/*339.14*/(""";

            // toggles the add group editor
            $scope.toggleAddGroupEditor = function(event) """),format.raw/*342.59*/("""{"""),format.raw/*342.60*/("""
                """),format.raw/*343.17*/("""event.preventDefault();
                if($scope.nEditor != 1)
                    $scope.nEditor = 1;
                else
                    $scope.nEditor = 0;
            """),format.raw/*348.13*/("""}"""),format.raw/*348.14*/(""";

            // refreshes the groups to delete
            $scope.refreshDGroups = function(event)"""),format.raw/*351.52*/("""{"""),format.raw/*351.53*/("""
                """),format.raw/*352.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadAllUserGroups(2);
                $scope.dGroupId = "";
                $scope.delerror = "";
                $scope.dgf.groupId.$touched = false;
                $scope.delSuccess = false;
            """),format.raw/*359.13*/("""}"""),format.raw/*359.14*/(""";

             // toggles the delete group editor
            $scope.toggleDelGroupEditor = function(event) """),format.raw/*362.59*/("""{"""),format.raw/*362.60*/("""
                """),format.raw/*363.17*/("""event.preventDefault();
                if($scope.nEditor != 3) """),format.raw/*364.41*/("""{"""),format.raw/*364.42*/("""
                    """),format.raw/*365.21*/("""$scope.nEditor = 3;
                    if (angular.isUndefined($scope.dGroupId))"""),format.raw/*366.62*/("""{"""),format.raw/*366.63*/("""
                        """),format.raw/*367.25*/("""$scope.dGroupId = "";
                        $scope.loadAllUserGroups(2);
                    """),format.raw/*369.21*/("""}"""),format.raw/*369.22*/("""
                """),format.raw/*370.17*/("""}"""),format.raw/*370.18*/("""
                """),format.raw/*371.17*/("""else
                    $scope.nEditor = 0;
            """),format.raw/*373.13*/("""}"""),format.raw/*373.14*/(""";

            // deletes a group
            $scope.deleteGroup  = function(event) """),format.raw/*376.51*/("""{"""),format.raw/*376.52*/("""
                """),format.raw/*377.17*/("""event.preventDefault();

                // validate the delete group form
                if ($scope.dgf.groupId.$error.required || !$scope.dgf.groupId.$dirty) """),format.raw/*380.87*/("""{"""),format.raw/*380.88*/("""
                    """),format.raw/*381.21*/("""$scope.dgf.groupId.$touched = true;
                    return;
                """),format.raw/*383.17*/("""}"""),format.raw/*383.18*/("""

                """),format.raw/*385.17*/("""$scope.conerror = "";
                $scope.delerror = "";
                $scope.delSuccess = false;
                $http("""),format.raw/*388.23*/("""{"""),format.raw/*388.24*/("""
                        """),format.raw/*389.25*/("""method : "DELETE",
                        url : "/group/" + $scope.dGroupId,
                        headers : """),format.raw/*391.35*/("""{"""),format.raw/*391.36*/("""
                            """),format.raw/*392.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*393.25*/("""}"""),format.raw/*393.26*/("""
                    """),format.raw/*394.21*/("""}"""),format.raw/*394.22*/(""").then(function successCallback(response) """),format.raw/*394.64*/("""{"""),format.raw/*394.65*/("""
                        """),format.raw/*395.25*/("""$scope.dGroupId = "";
                        $scope.dgf.groupId.$touched = false;
                        $scope.delSuccess = true;
                        $scope.loadAllUserGroups(2);
                    """),format.raw/*399.21*/("""}"""),format.raw/*399.22*/(""", function errorCallback(response) """),format.raw/*399.57*/("""{"""),format.raw/*399.58*/("""
                        """),format.raw/*400.25*/("""if (response.status == 400) """),format.raw/*400.53*/("""{"""),format.raw/*400.54*/("""
                            """),format.raw/*401.29*/("""$scope.delerror = response.data.error;
                            $scope.dgf.$setPristine();
                        """),format.raw/*403.25*/("""}"""),format.raw/*403.26*/(""" """),format.raw/*403.27*/("""else """),format.raw/*403.32*/("""{"""),format.raw/*403.33*/("""
                            """),format.raw/*404.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*406.34*/("""{"""),format.raw/*406.35*/("""
                                """),format.raw/*407.33*/("""$scope.conerror = "Error trying to delete the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*409.29*/("""}"""),format.raw/*409.30*/("""
                        """),format.raw/*410.25*/("""}"""),format.raw/*410.26*/("""
                    """),format.raw/*411.21*/("""}"""),format.raw/*411.22*/(""");
            """),format.raw/*412.13*/("""}"""),format.raw/*412.14*/(""";

            // loads all the groups which is created by this user
            $scope.loadAllUserGroups = function(dorm) """),format.raw/*415.55*/("""{"""),format.raw/*415.56*/("""
                """),format.raw/*416.17*/("""$scope.conerror = "";
                if (dorm == 1)
                    $scope.allMUserGroups = [];
                else
                    $scope.allDUserGroups = [];

                GroupSvc.getGroups().then(function successCallback(response) """),format.raw/*422.78*/("""{"""),format.raw/*422.79*/("""
                        """),format.raw/*423.25*/("""if (dorm == 1)
                            $scope.allMUserGroups = response.data;
                        else
                            $scope.allDUserGroups = response.data;
                    """),format.raw/*427.21*/("""}"""),format.raw/*427.22*/(""", function errorCallback(response) """),format.raw/*427.57*/("""{"""),format.raw/*427.58*/("""
                        """),format.raw/*428.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*430.30*/("""{"""),format.raw/*430.31*/("""
                            """),format.raw/*431.29*/("""$scope.conerror = "Error refreshing the list of owned groups. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*433.25*/("""}"""),format.raw/*433.26*/("""
                    """),format.raw/*434.21*/("""}"""),format.raw/*434.22*/("""
                """),format.raw/*435.17*/(""");
            """),format.raw/*436.13*/("""}"""),format.raw/*436.14*/(""";

            // adds the user to the modified group
            $scope.addUser  = function(event) """),format.raw/*439.47*/("""{"""),format.raw/*439.48*/("""
                """),format.raw/*440.17*/("""event.preventDefault();

                // validate the add user form
                if ($scope.auf.userId.$error.required || $scope.auf.userId.$error.email || !$scope.auf.userId.$dirty) """),format.raw/*443.119*/("""{"""),format.raw/*443.120*/("""
                    """),format.raw/*444.21*/("""$scope.auf.userId.$touched = true;
                    return;
                """),format.raw/*446.17*/("""}"""),format.raw/*446.18*/("""

                """),format.raw/*448.17*/("""$scope.conerror = "";
                $scope.addusererror = "";
                $scope.addUserSuccess = false;
                $http("""),format.raw/*451.23*/("""{"""),format.raw/*451.24*/("""
                        """),format.raw/*452.25*/("""method : "POST",
                        url : """"),_display_(/*453.33*/routes/*453.39*/.GroupController.addUserToGroup),format.raw/*453.70*/("""",
                        data : """),format.raw/*454.32*/("""{"""),format.raw/*454.33*/(""""userId" : $scope.nUserId, "groupId" : $scope.mGroupId"""),format.raw/*454.87*/("""}"""),format.raw/*454.88*/(""",
                        headers : """),format.raw/*455.35*/("""{"""),format.raw/*455.36*/("""
                            """),format.raw/*456.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*457.25*/("""}"""),format.raw/*457.26*/("""
                    """),format.raw/*458.21*/("""}"""),format.raw/*458.22*/(""").then(function successCallback(response) """),format.raw/*458.64*/("""{"""),format.raw/*458.65*/("""
                        """),format.raw/*459.25*/("""$scope.nUserId = "";
                        $scope.auf.userId.$touched = false;
                        $scope.addUserSuccess = true;
                    """),format.raw/*462.21*/("""}"""),format.raw/*462.22*/(""", function errorCallback(response) """),format.raw/*462.57*/("""{"""),format.raw/*462.58*/("""
                        """),format.raw/*463.25*/("""if (response.status == 400) """),format.raw/*463.53*/("""{"""),format.raw/*463.54*/("""
                            """),format.raw/*464.29*/("""$scope.addusererror = response.data.error;
                            $scope.auf.$setPristine();
                        """),format.raw/*466.25*/("""}"""),format.raw/*466.26*/(""" """),format.raw/*466.27*/("""else """),format.raw/*466.32*/("""{"""),format.raw/*466.33*/("""
                            """),format.raw/*467.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*469.34*/("""{"""),format.raw/*469.35*/("""
                                """),format.raw/*470.33*/("""$scope.conerror = "Error trying to add the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*472.29*/("""}"""),format.raw/*472.30*/("""
                        """),format.raw/*473.25*/("""}"""),format.raw/*473.26*/("""
                    """),format.raw/*474.21*/("""}"""),format.raw/*474.22*/(""");
            """),format.raw/*475.13*/("""}"""),format.raw/*475.14*/(""";

            $scope.loadAllUsers = function() """),format.raw/*477.46*/("""{"""),format.raw/*477.47*/("""
                """),format.raw/*478.17*/("""$scope.conerror = "";
                $scope.allMAUsers = [];
                $http("""),format.raw/*480.23*/("""{"""),format.raw/*480.24*/("""
                        """),format.raw/*481.25*/("""method : "GET",
                        url : """"),_display_(/*482.33*/routes/*482.39*/.GroupController.getUsers),format.raw/*482.64*/("""",
                        headers : """),format.raw/*483.35*/("""{"""),format.raw/*483.36*/("""
                        """),format.raw/*484.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*485.25*/("""}"""),format.raw/*485.26*/("""
                    """),format.raw/*486.21*/("""}"""),format.raw/*486.22*/(""").then(function successCallback(response) """),format.raw/*486.64*/("""{"""),format.raw/*486.65*/("""
                            """),format.raw/*487.29*/("""$scope.allMAUsers = response.data;
                    """),format.raw/*488.21*/("""}"""),format.raw/*488.22*/(""", function errorCallback(response) """),format.raw/*488.57*/("""{"""),format.raw/*488.58*/("""
                        """),format.raw/*489.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*491.30*/("""{"""),format.raw/*491.31*/("""
                            """),format.raw/*492.29*/("""$scope.conerror = "Error refreshing the list of all users. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*494.25*/("""}"""),format.raw/*494.26*/("""
                    """),format.raw/*495.21*/("""}"""),format.raw/*495.22*/("""
                """),format.raw/*496.17*/(""");
            """),format.raw/*497.13*/("""}"""),format.raw/*497.14*/(""";

            $scope.refreshMAUsers = function(event) """),format.raw/*499.53*/("""{"""),format.raw/*499.54*/("""
                """),format.raw/*500.17*/("""if (event != null)
                    event.preventDefault();
                if (!angular.isUndefined($scope.mGroupId) && $scope.mGroupId != "")
                    $scope.loadAllUsers();
                else
                    $scope.allMAUsers = [];
                $scope.nUserId = "";
                $scope.addusererror = "";
                $scope.auf.userId.$touched = false;
                $scope.addUserSuccess = false;
            """),format.raw/*510.13*/("""}"""),format.raw/*510.14*/(""";

            $scope.toggleAddUserEditor = function(event) """),format.raw/*512.58*/("""{"""),format.raw/*512.59*/("""
                """),format.raw/*513.17*/("""event.preventDefault();
                $scope.bShowAUE = !$scope.bShowAUE;
            """),format.raw/*515.13*/("""}"""),format.raw/*515.14*/(""";

            $scope.hideAddUserEditor = function() """),format.raw/*517.51*/("""{"""),format.raw/*517.52*/("""
                """),format.raw/*518.17*/("""$scope.bShowAUE = false;
                $scope.refreshMAUsers();
            """),format.raw/*520.13*/("""}"""),format.raw/*520.14*/(""";

            $scope.deleteUser  = function(event) """),format.raw/*522.50*/("""{"""),format.raw/*522.51*/("""
                """),format.raw/*523.17*/("""event.preventDefault();

                // validate the delete user form
                if ($scope.duf.userId.$error.required || !$scope.duf.userId.$dirty) """),format.raw/*526.85*/("""{"""),format.raw/*526.86*/("""
                    """),format.raw/*527.21*/("""$scope.duf.userId.$touched = true;
                    return;
                """),format.raw/*529.17*/("""}"""),format.raw/*529.18*/("""

                """),format.raw/*531.17*/("""$scope.conerror = "";
                $scope.delusererror = "";
                $scope.delUserSuccess = false;
                $http("""),format.raw/*534.23*/("""{"""),format.raw/*534.24*/("""
                        """),format.raw/*535.25*/("""method : "DELETE",
                        url : "groupuser/" + $scope.mGroupId + "/" + $scope.dUserId,
                        headers : """),format.raw/*537.35*/("""{"""),format.raw/*537.36*/("""
                            """),format.raw/*538.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*539.25*/("""}"""),format.raw/*539.26*/("""
                    """),format.raw/*540.21*/("""}"""),format.raw/*540.22*/(""").then(function successCallback(response) """),format.raw/*540.64*/("""{"""),format.raw/*540.65*/("""
                        """),format.raw/*541.25*/("""$scope.dUserId = "";
                        $scope.duf.userId.$touched = false;
                        $scope.delUserSuccess = true;
                        $scope.loadAllGroupUsers();
                    """),format.raw/*545.21*/("""}"""),format.raw/*545.22*/(""", function errorCallback(response) """),format.raw/*545.57*/("""{"""),format.raw/*545.58*/("""
                        """),format.raw/*546.25*/("""if (response.status == 400) """),format.raw/*546.53*/("""{"""),format.raw/*546.54*/("""
                            """),format.raw/*547.29*/("""$scope.delusererror = response.data.error;
                            $scope.duf.$setPristine();
                        """),format.raw/*549.25*/("""}"""),format.raw/*549.26*/(""" """),format.raw/*549.27*/("""else """),format.raw/*549.32*/("""{"""),format.raw/*549.33*/("""
                            """),format.raw/*550.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*552.34*/("""{"""),format.raw/*552.35*/("""
                                """),format.raw/*553.33*/("""$scope.conerror = "Error trying to delete the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*555.29*/("""}"""),format.raw/*555.30*/("""
                        """),format.raw/*556.25*/("""}"""),format.raw/*556.26*/("""
                    """),format.raw/*557.21*/("""}"""),format.raw/*557.22*/(""");
            """),format.raw/*558.13*/("""}"""),format.raw/*558.14*/(""";

            $scope.loadAllGroupUsers = function() """),format.raw/*560.51*/("""{"""),format.raw/*560.52*/("""
                """),format.raw/*561.17*/("""$scope.conerror = "";
                $scope.allMDUsers = [];
                $http("""),format.raw/*563.23*/("""{"""),format.raw/*563.24*/("""
                        """),format.raw/*564.25*/("""method : "GET",
                        url : "/groupusers" + "/" + $scope.mGroupId,
                        headers : """),format.raw/*566.35*/("""{"""),format.raw/*566.36*/("""
                        """),format.raw/*567.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*568.25*/("""}"""),format.raw/*568.26*/("""
                    """),format.raw/*569.21*/("""}"""),format.raw/*569.22*/(""").then(function successCallback(response) """),format.raw/*569.64*/("""{"""),format.raw/*569.65*/("""
                            """),format.raw/*570.29*/("""$scope.allMDUsers = response.data;
                    """),format.raw/*571.21*/("""}"""),format.raw/*571.22*/(""", function errorCallback(response) """),format.raw/*571.57*/("""{"""),format.raw/*571.58*/("""
                        """),format.raw/*572.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*574.30*/("""{"""),format.raw/*574.31*/("""
                            """),format.raw/*575.29*/("""if (response.status == 400)
                                $scope.conerror = response.data.error;
                            else
                                $scope.conerror = "Error refreshing the list of all group users. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*580.25*/("""}"""),format.raw/*580.26*/("""
                    """),format.raw/*581.21*/("""}"""),format.raw/*581.22*/("""
                """),format.raw/*582.17*/(""");
            """),format.raw/*583.13*/("""}"""),format.raw/*583.14*/(""";

            $scope.refreshMDUsers = function(event) """),format.raw/*585.53*/("""{"""),format.raw/*585.54*/("""
                """),format.raw/*586.17*/("""if (event != null)
                    event.preventDefault();
                if (!angular.isUndefined($scope.mGroupId) && $scope.mGroupId != "")
                    $scope.loadAllGroupUsers();
                else
                    $scope.allMDUsers = [];
                $scope.dUserId = "";
                $scope.delusererror = "";
                $scope.duf.userId.$touched = false;
                $scope.delUserSuccess = false;
            """),format.raw/*596.13*/("""}"""),format.raw/*596.14*/(""";

            $scope.toggleDelUserEditor = function(event) """),format.raw/*598.58*/("""{"""),format.raw/*598.59*/("""
                """),format.raw/*599.17*/("""event.preventDefault();
                $scope.bShowDUE = !$scope.bShowDUE;
            """),format.raw/*601.13*/("""}"""),format.raw/*601.14*/(""";

            $scope.hideDelUserEditor = function() """),format.raw/*603.51*/("""{"""),format.raw/*603.52*/("""
                """),format.raw/*604.17*/("""$scope.bShowDUE = false;
                $scope.refreshMDUsers(null);
            """),format.raw/*606.13*/("""}"""),format.raw/*606.14*/(""";

            // resets the group user modification editor
            $scope.resetModifyGroupUsersEditor = function() """),format.raw/*609.61*/("""{"""),format.raw/*609.62*/("""
                """),format.raw/*610.17*/("""$scope.hideAddUserEditor();
                $scope.hideDelUserEditor();
            """),format.raw/*612.13*/("""}"""),format.raw/*612.14*/(""";

            // refreshes the groups to modify
            $scope.refreshMGroups = function(event)"""),format.raw/*615.52*/("""{"""),format.raw/*615.53*/("""
                """),format.raw/*616.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadAllUserGroups(1);
                $scope.mGroupId = "";
                $scope.mgf.groupId.$touched = false;
            """),format.raw/*621.13*/("""}"""),format.raw/*621.14*/(""";

            // toggles the delete group editor
            $scope.toggleGroupEditor = function(event) """),format.raw/*624.56*/("""{"""),format.raw/*624.57*/("""
                """),format.raw/*625.17*/("""event.preventDefault();
                if($scope.nEditor != 2) """),format.raw/*626.41*/("""{"""),format.raw/*626.42*/("""
                    """),format.raw/*627.21*/("""$scope.nEditor = 2;
                    if(angular.isUndefined($scope.mGroupId)) """),format.raw/*628.62*/("""{"""),format.raw/*628.63*/("""
                        """),format.raw/*629.25*/("""$scope.mGroupId = "";
                        $scope.loadAllUserGroups(1);
                    """),format.raw/*631.21*/("""}"""),format.raw/*631.22*/("""
                """),format.raw/*632.17*/("""}"""),format.raw/*632.18*/("""
                """),format.raw/*633.17*/("""else
                    $scope.nEditor = 0;
            """),format.raw/*635.13*/("""}"""),format.raw/*635.14*/(""";

        """),format.raw/*637.9*/("""}"""),format.raw/*637.10*/(""");
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
object groups extends groups_Scope0.groups
              /*
                  -- GENERATED --
                  DATE: Thu Aug 18 11:13:55 IST 2016
                  SOURCE: /home/si2chip/web_app/msmp1.0.git/app/views/groups.scala.html
                  HASH: ddcdcedb20bd7b4d694eb50b59d5aa9e1cf16ed2
                  MATRIX: 829->2|1138->285|1152->291|1220->339|1282->375|1296->381|1357->422|3104->2141|3133->2142|3162->2143|3198->2151|3227->2152|3256->2153|3310->2179|3589->2430|3618->2431|3647->2432|3689->2446|3718->2447|3747->2448|3824->2496|3854->2497|3884->2498|3932->2517|3962->2518|3992->2519|4695->3194|4724->3195|4753->3196|4793->3208|4822->3209|4851->3210|5187->3518|5216->3519|5245->3520|5285->3532|5314->3533|5343->3534|5678->3841|5707->3842|5736->3843|5776->3855|5805->3856|5834->3857|7941->5935|7971->5936|8001->5937|8042->5948|8073->5949|8104->5950|10236->8052|10267->8053|10298->8054|10338->8064|10369->8065|10400->8066|12998->10634|13029->10635|13060->10636|13100->10646|13131->10647|13162->10648|15020->12477|15050->12478|15080->12479|15121->12490|15152->12491|15183->12492|16134->13414|16164->13415|16207->13429|16264->13457|16294->13458|16356->13491|16386->13492|16442->13520|16472->13521|16561->13581|16591->13582|16634->13596|16719->13652|16749->13653|16796->13671|16878->13724|16908->13725|16963->13751|17040->13800|17056->13806|17109->13837|17176->13875|17206->13876|17261->13902|17351->13963|17381->13964|17432->13986|17462->13987|17540->14036|17570->14037|17625->14063|17753->14162|17783->14163|17834->14185|17864->14186|17919->14212|18046->14310|18076->14311|18121->14327|18151->14328|18190->14339|18220->14340|18357->14447|18388->14448|18431->14462|18840->14842|18870->14843|18917->14861|18990->14905|19020->14906|19104->14961|19134->14962|19181->14980|19255->15025|19285->15026|19410->15122|19440->15123|19487->15141|19667->15293|19683->15299|19738->15332|19855->15420|19885->15421|19998->15505|20028->15506|20075->15524|20161->15582|20177->15588|20223->15612|20340->15700|20370->15701|20491->15793|20521->15794|20568->15812|20789->16005|20805->16011|20849->16033|20966->16121|20996->16122|21126->16223|21156->16224|21203->16242|21417->16427|21447->16428|21559->16511|21589->16512|21636->16530|21826->16691|21856->16692|21907->16714|22018->16796|22048->16797|22097->16817|22254->16945|22284->16946|22339->16972|22417->17022|22433->17028|22480->17053|22544->17088|22574->17089|22630->17116|22660->17117|22726->17154|22756->17155|22815->17185|22905->17246|22935->17247|22986->17269|23016->17270|23087->17312|23117->17313|23172->17339|23357->17495|23387->17496|23451->17531|23481->17532|23536->17558|23593->17586|23623->17587|23682->17617|23831->17737|23861->17738|23891->17739|23925->17744|23955->17745|24014->17775|24166->17898|24196->17899|24259->17933|24439->18084|24469->18085|24524->18111|24554->18112|24605->18134|24635->18135|24680->18151|24710->18152|24847->18260|24877->18261|24924->18279|25135->18461|25165->18462|25297->18565|25327->18566|25374->18584|25702->18883|25732->18884|25873->18996|25903->18997|25950->19015|26044->19080|26074->19081|26125->19103|26236->19185|26266->19186|26321->19212|26447->19309|26477->19310|26524->19328|26554->19329|26601->19347|26689->19406|26719->19407|26835->19494|26865->19495|26912->19513|27105->19677|27135->19678|27186->19700|27297->19782|27327->19783|27376->19803|27533->19931|27563->19932|27618->19958|27761->20072|27791->20073|27850->20103|27940->20164|27970->20165|28021->20187|28051->20188|28122->20230|28152->20231|28207->20257|28446->20467|28476->20468|28540->20503|28570->20504|28625->20530|28682->20558|28712->20559|28771->20589|28920->20709|28950->20710|28980->20711|29014->20716|29044->20717|29103->20747|29255->20870|29285->20871|29348->20905|29530->21058|29560->21059|29615->21085|29645->21086|29696->21108|29726->21109|29771->21125|29801->21126|29956->21252|29986->21253|30033->21271|30316->21525|30346->21526|30401->21552|30632->21754|30662->21755|30726->21790|30756->21791|30811->21817|30955->21932|30985->21933|31044->21963|31228->22118|31258->22119|31309->22141|31339->22142|31386->22160|31431->22176|31461->22177|31593->22280|31623->22281|31670->22299|31892->22491|31923->22492|31974->22514|32084->22595|32114->22596|32163->22616|32328->22752|32358->22753|32413->22779|32491->22829|32507->22835|32560->22866|32624->22901|32654->22902|32737->22956|32767->22957|32833->22994|32863->22995|32922->23025|33012->23086|33042->23087|33093->23109|33123->23110|33194->23152|33224->23153|33279->23179|33466->23337|33496->23338|33560->23373|33590->23374|33645->23400|33702->23428|33732->23429|33791->23459|33944->23583|33974->23584|34004->23585|34038->23590|34068->23591|34127->23621|34279->23744|34309->23745|34372->23779|34551->23929|34581->23930|34636->23956|34666->23957|34717->23979|34747->23980|34792->23996|34822->23997|34901->24047|34931->24048|34978->24066|35093->24152|35123->24153|35178->24179|35255->24228|35271->24234|35318->24259|35385->24297|35415->24298|35470->24324|35560->24385|35590->24386|35641->24408|35671->24409|35742->24451|35772->24452|35831->24482|35916->24538|35946->24539|36010->24574|36040->24575|36095->24601|36239->24716|36269->24717|36328->24747|36509->24899|36539->24900|36590->24922|36620->24923|36667->24941|36712->24957|36742->24958|36828->25015|36858->25016|36905->25034|37389->25489|37419->25490|37510->25552|37540->25553|37587->25571|37706->25661|37736->25662|37820->25717|37850->25718|37897->25736|38006->25816|38036->25817|38119->25871|38149->25872|38196->25890|38386->26051|38416->26052|38467->26074|38577->26155|38607->26156|38656->26176|38821->26312|38851->26313|38906->26339|39075->26479|39105->26480|39164->26510|39254->26571|39284->26572|39335->26594|39365->26595|39436->26637|39466->26638|39521->26664|39761->26875|39791->26876|39855->26911|39885->26912|39940->26938|39997->26966|40027->26967|40086->26997|40239->27121|40269->27122|40299->27123|40333->27128|40363->27129|40422->27159|40574->27282|40604->27283|40667->27317|40849->27470|40879->27471|40934->27497|40964->27498|41015->27520|41045->27521|41090->27537|41120->27538|41204->27593|41234->27594|41281->27612|41396->27698|41426->27699|41481->27725|41631->27846|41661->27847|41716->27873|41806->27934|41836->27935|41887->27957|41917->27958|41988->28000|42018->28001|42077->28031|42162->28087|42192->28088|42256->28123|42286->28124|42341->28150|42485->28265|42515->28266|42574->28296|42928->28621|42958->28622|43009->28644|43039->28645|43086->28663|43131->28679|43161->28680|43247->28737|43277->28738|43324->28756|43813->29216|43843->29217|43934->29279|43964->29280|44011->29298|44130->29388|44160->29389|44244->29444|44274->29445|44321->29463|44434->29547|44464->29548|44616->29671|44646->29672|44693->29690|44808->29776|44838->29777|44970->29880|45000->29881|45047->29899|45292->30115|45322->30116|45459->30224|45489->30225|45536->30243|45630->30308|45660->30309|45711->30331|45822->30413|45852->30414|45907->30440|46033->30537|46063->30538|46110->30556|46140->30557|46187->30575|46275->30634|46305->30635|46346->30648|46376->30649
                  LINES: 32->2|38->8|38->8|38->8|39->9|39->9|39->9|71->41|71->41|71->41|71->41|71->41|71->41|72->42|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|101->71|101->71|101->71|101->71|101->71|101->71|108->78|108->78|108->78|108->78|108->78|108->78|115->85|115->85|115->85|115->85|115->85|115->85|148->118|148->118|148->118|148->118|148->118|148->118|180->150|180->150|180->150|180->150|180->150|180->150|210->180|210->180|210->180|210->180|210->180|210->180|237->207|237->207|237->207|237->207|237->207|237->207|253->223|253->223|254->224|254->224|254->224|254->224|254->224|255->225|255->225|257->227|257->227|258->228|259->229|259->229|260->230|261->231|261->231|262->232|263->233|263->233|263->233|264->234|264->234|265->235|266->236|266->236|267->237|267->237|268->238|268->238|269->239|271->241|271->241|271->241|271->241|272->242|274->244|274->244|275->245|275->245|276->246|276->246|278->248|278->248|279->249|289->259|289->259|290->260|291->261|291->261|293->263|293->263|294->264|295->265|295->265|298->268|298->268|299->269|302->272|302->272|302->272|304->274|304->274|307->277|307->277|308->278|309->279|309->279|309->279|311->281|311->281|314->284|314->284|315->285|319->289|319->289|319->289|321->291|321->291|324->294|324->294|325->295|329->299|329->299|333->303|333->303|334->304|337->307|337->307|338->308|340->310|340->310|342->312|345->315|345->315|346->316|347->317|347->317|347->317|348->318|348->318|348->318|348->318|349->319|349->319|350->320|351->321|351->321|352->322|352->322|352->322|352->322|353->323|356->326|356->326|356->326|356->326|357->327|357->327|357->327|358->328|360->330|360->330|360->330|360->330|360->330|361->331|363->333|363->333|364->334|366->336|366->336|367->337|367->337|368->338|368->338|369->339|369->339|372->342|372->342|373->343|378->348|378->348|381->351|381->351|382->352|389->359|389->359|392->362|392->362|393->363|394->364|394->364|395->365|396->366|396->366|397->367|399->369|399->369|400->370|400->370|401->371|403->373|403->373|406->376|406->376|407->377|410->380|410->380|411->381|413->383|413->383|415->385|418->388|418->388|419->389|421->391|421->391|422->392|423->393|423->393|424->394|424->394|424->394|424->394|425->395|429->399|429->399|429->399|429->399|430->400|430->400|430->400|431->401|433->403|433->403|433->403|433->403|433->403|434->404|436->406|436->406|437->407|439->409|439->409|440->410|440->410|441->411|441->411|442->412|442->412|445->415|445->415|446->416|452->422|452->422|453->423|457->427|457->427|457->427|457->427|458->428|460->430|460->430|461->431|463->433|463->433|464->434|464->434|465->435|466->436|466->436|469->439|469->439|470->440|473->443|473->443|474->444|476->446|476->446|478->448|481->451|481->451|482->452|483->453|483->453|483->453|484->454|484->454|484->454|484->454|485->455|485->455|486->456|487->457|487->457|488->458|488->458|488->458|488->458|489->459|492->462|492->462|492->462|492->462|493->463|493->463|493->463|494->464|496->466|496->466|496->466|496->466|496->466|497->467|499->469|499->469|500->470|502->472|502->472|503->473|503->473|504->474|504->474|505->475|505->475|507->477|507->477|508->478|510->480|510->480|511->481|512->482|512->482|512->482|513->483|513->483|514->484|515->485|515->485|516->486|516->486|516->486|516->486|517->487|518->488|518->488|518->488|518->488|519->489|521->491|521->491|522->492|524->494|524->494|525->495|525->495|526->496|527->497|527->497|529->499|529->499|530->500|540->510|540->510|542->512|542->512|543->513|545->515|545->515|547->517|547->517|548->518|550->520|550->520|552->522|552->522|553->523|556->526|556->526|557->527|559->529|559->529|561->531|564->534|564->534|565->535|567->537|567->537|568->538|569->539|569->539|570->540|570->540|570->540|570->540|571->541|575->545|575->545|575->545|575->545|576->546|576->546|576->546|577->547|579->549|579->549|579->549|579->549|579->549|580->550|582->552|582->552|583->553|585->555|585->555|586->556|586->556|587->557|587->557|588->558|588->558|590->560|590->560|591->561|593->563|593->563|594->564|596->566|596->566|597->567|598->568|598->568|599->569|599->569|599->569|599->569|600->570|601->571|601->571|601->571|601->571|602->572|604->574|604->574|605->575|610->580|610->580|611->581|611->581|612->582|613->583|613->583|615->585|615->585|616->586|626->596|626->596|628->598|628->598|629->599|631->601|631->601|633->603|633->603|634->604|636->606|636->606|639->609|639->609|640->610|642->612|642->612|645->615|645->615|646->616|651->621|651->621|654->624|654->624|655->625|656->626|656->626|657->627|658->628|658->628|659->629|661->631|661->631|662->632|662->632|663->633|665->635|665->635|667->637|667->637
                  -- GENERATED --
              */
          