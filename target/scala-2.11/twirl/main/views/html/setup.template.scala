
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object setup_Scope0 {
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

class setup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <link rel="stylesheet" href="""),_display_(/*9.34*/routes/*9.40*/.Assets.versioned("stylesheets/admin.css")),format.raw/*9.82*/(""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <title>SI2Chip Setup</title>
</head>
<body ng-app="admin" ng-controller="adminCtrl">
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">SI2Chip</a>
            <img src="/home/si2chip/si2chip.jpg" style="width:50px;height:50px;">

        </div>
        <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="#"> Setup </a></li>
            <li><a href="#" ng-click="showHome($event)"><span class="glyphicon glyphicon-home"></span> Home </a></li>
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
                            """),format.raw/*40.29*/("""{"""),format.raw/*40.30*/("""{"""),format.raw/*40.31*/("""conerror"""),format.raw/*40.39*/("""}"""),format.raw/*40.40*/("""}"""),format.raw/*40.41*/("""
                        """),format.raw/*41.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-6">
            <div class="well well-lg">
                <table class="table">
                    <thead>
                    <tr>
                        <th>
                            <div class="text-center">
                                <h4 id="adminmgmttitle">Admin Setup</h4>
                            </div>
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            <a href="#" ng-click="toggleAddAdminEditor($event)">Add admin<span ng-show="!angular.isUndefined(bShowAUE)&& bShowAUE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowAUE) || !bShowAUE" class="glyphicon glyphicon-menu-down"></span>
                            </a>
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
                                <span ng-if="!(auf.userId.$touched || auf.password.$touched) && addSuccess" class="success">Admin added successfully</span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <a href="#" ng-click="toggleAdminEditor($event)">Reset password<span ng-show="!angular.isUndefined(bShowRPE)&& bShowRPE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowRPE) || !bShowRPE" class="glyphicon glyphicon-menu-down"></span>
                            </a>
                            <div class="well well-sm" ng-show="!angular.isUndefined(bShowRPE) && bShowRPE">
                                <form role="form" name="rpf">
                                    <div class="form-group">
                                        <a href="#" ng-click="refreshAdminUsers($event)" class="btn btn-info btn-xs">
                                            <span class="glyphicon glyphicon-refresh"></span> Refresh admin list
                                        </a>
                                    </div>
                                    <div class="form-group">
                                        <select class="form-control" ng-options="usr.userId for usr in allAdmins" name="userId" ng-model="mUser" required>
                                            <option value="">Select Admin</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" ng-model="mPassword" placeholder="Enter password here" name="password">
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-default btn-sm" ng-click="modifyAdmin($event)">Reset</button>
                                    </div>
                                </form>
                                <span ng-show="allAdmins.length != 0 && rpf.userId.$touched && rpf.userId.$error.required" class="editmsgs">UserId required. Select a email id</span><br>
                                <span ng-if="!rpf.userId.$dirty" ng-bind="moderror" class="error"></span>
                                <span ng-if="!(rpf.userId.$touched || rpf.password.$touched) && modSuccess" class="success">Password changed</span>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
        var app = angular.module('admin',  []);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*121.80*/("""{"""),format.raw/*121.81*/("""
            """),format.raw/*122.13*/("""$locationProvider.html5Mode("""),format.raw/*122.41*/("""{"""),format.raw/*122.42*/("""enabled: true, requireBase: false"""),format.raw/*122.75*/("""}"""),format.raw/*122.76*/(""").hashPrefix('*');
        """),format.raw/*123.9*/("""}"""),format.raw/*123.10*/("""]);

        app.service("AdminSvc", function ($http, $q) """),format.raw/*125.54*/("""{"""),format.raw/*125.55*/("""
            """),format.raw/*126.13*/("""var deferred;
            this.getAdmins = function () """),format.raw/*127.42*/("""{"""),format.raw/*127.43*/("""
                """),format.raw/*128.17*/("""deferred = $q.defer();
                return $http("""),format.raw/*129.30*/("""{"""),format.raw/*129.31*/("""
                        """),format.raw/*130.25*/("""method : "GET",
                        url : """"),_display_(/*131.33*/routes/*131.39*/.AdminController.getAdminUsers),format.raw/*131.69*/("""",
                        headers : """),format.raw/*132.35*/("""{"""),format.raw/*132.36*/("""
                        """),format.raw/*133.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*134.25*/("""}"""),format.raw/*134.26*/("""
                    """),format.raw/*135.21*/("""}"""),format.raw/*135.22*/(""")
                    .then(function (response) """),format.raw/*136.47*/("""{"""),format.raw/*136.48*/("""
                        """),format.raw/*137.25*/("""deferred.resolve(response);
                        return deferred.promise;
                    """),format.raw/*139.21*/("""}"""),format.raw/*139.22*/(""", function (response) """),format.raw/*139.44*/("""{"""),format.raw/*139.45*/("""
                        """),format.raw/*140.25*/("""deferred.reject(response);
                        return deferred.promise;
                    """),format.raw/*142.21*/("""}"""),format.raw/*142.22*/(""");
            """),format.raw/*143.13*/("""}"""),format.raw/*143.14*/(""";
        """),format.raw/*144.9*/("""}"""),format.raw/*144.10*/(""");

        app.controller('adminCtrl', function($scope, $http, $location, $window, AdminSvc) """),format.raw/*146.91*/("""{"""),format.raw/*146.92*/("""
            """),format.raw/*147.13*/("""// Initialize the view
            $scope.adderror="";
            $scope.moderror="";
            $scope.conerror = "";
            $scope.allAdmins=[];
            $scope.nPassword = "";
            $scope.mPassword = "";
            $scope.addSuccess = false;
            $scope.modSuccess = false;

            $scope.showHome = function(event) """),format.raw/*157.47*/("""{"""),format.raw/*157.48*/("""
                """),format.raw/*158.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*159.34*/routes/*159.40*/.HomeController.showHomePage),format.raw/*159.68*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*161.13*/("""}"""),format.raw/*161.14*/(""";

            $scope.addUser  = function(event) """),format.raw/*163.47*/("""{"""),format.raw/*163.48*/("""
                """),format.raw/*164.17*/("""event.preventDefault();

                // validate the add user form
                if ($scope.auf.userId.$error.required || $scope.auf.userId.$error.email || !($scope.auf.userId.$dirty || $scope.auf.password.$dirty)) """),format.raw/*167.151*/("""{"""),format.raw/*167.152*/("""
                    """),format.raw/*168.21*/("""$scope.auf.userId.$touched = true;
                    return;
                """),format.raw/*170.17*/("""}"""),format.raw/*170.18*/("""

                """),format.raw/*172.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                $http("""),format.raw/*175.23*/("""{"""),format.raw/*175.24*/("""
                        """),format.raw/*176.25*/("""method : "POST",
                        url : """"),_display_(/*177.33*/routes/*177.39*/.AdminController.addAdmin),format.raw/*177.64*/("""",
                        data : """),format.raw/*178.32*/("""{"""),format.raw/*178.33*/(""""userId" : $scope.nUserId, "password" : $scope.nPassword"""),format.raw/*178.89*/("""}"""),format.raw/*178.90*/(""",
                        headers : """),format.raw/*179.35*/("""{"""),format.raw/*179.36*/("""
                            """),format.raw/*180.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*181.25*/("""}"""),format.raw/*181.26*/("""
                    """),format.raw/*182.21*/("""}"""),format.raw/*182.22*/(""").then(function successCallback(response) """),format.raw/*182.64*/("""{"""),format.raw/*182.65*/("""
                        """),format.raw/*183.25*/("""$scope.nUserId = "";
                        $scope.nPassword = "";
                        $scope.auf.userId.$touched = false;
                        $scope.auf.password.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*188.21*/("""}"""),format.raw/*188.22*/(""", function errorCallback(response) """),format.raw/*188.57*/("""{"""),format.raw/*188.58*/("""
                        """),format.raw/*189.25*/("""if (response.status == 400) """),format.raw/*189.53*/("""{"""),format.raw/*189.54*/("""
                            """),format.raw/*190.29*/("""$scope.adderror = response.data.error;
                            $scope.auf.$setPristine();
                        """),format.raw/*192.25*/("""}"""),format.raw/*192.26*/(""" """),format.raw/*192.27*/("""else """),format.raw/*192.32*/("""{"""),format.raw/*192.33*/("""
                            """),format.raw/*193.29*/("""$scope.conerror = "Error trying to add the admin user. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*195.25*/("""}"""),format.raw/*195.26*/("""
                    """),format.raw/*196.21*/("""}"""),format.raw/*196.22*/(""");
            """),format.raw/*197.13*/("""}"""),format.raw/*197.14*/(""";

            $scope.toggleAddAdminEditor = function(event) """),format.raw/*199.59*/("""{"""),format.raw/*199.60*/("""
                """),format.raw/*200.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowAUE)) """),format.raw/*201.58*/("""{"""),format.raw/*201.59*/("""
                    """),format.raw/*202.21*/("""$scope.bShowAUE = true;
                    $scope.nUserId = "";
                    $scope.nPassword = "";
                """),format.raw/*205.17*/("""}"""),format.raw/*205.18*/(""" """),format.raw/*205.19*/("""else """),format.raw/*205.24*/("""{"""),format.raw/*205.25*/("""
                    """),format.raw/*206.21*/("""$scope.bShowAUE = !$scope.bShowAUE;
                """),format.raw/*207.17*/("""}"""),format.raw/*207.18*/("""
            """),format.raw/*208.13*/("""}"""),format.raw/*208.14*/(""";

            $scope.refreshAdminUsers = function(event)"""),format.raw/*210.55*/("""{"""),format.raw/*210.56*/("""
                """),format.raw/*211.17*/("""$scope.loadAllAdmins(event);
                $scope.rpf.userId.$touched = false;
                $scope.rpf.password.$touched = false;
                $scope.moderror = "";
                $scope.modSuccess = false;
            """),format.raw/*216.13*/("""}"""),format.raw/*216.14*/(""";

            $scope.loadAllAdmins = function(event) """),format.raw/*218.52*/("""{"""),format.raw/*218.53*/("""
                """),format.raw/*219.17*/("""if (event != null)
                    event.preventDefault();
                $scope.conerror = "";
                $scope.allAdmins=[];
                AdminSvc.getAdmins().then(function successCallback(response) """),format.raw/*223.78*/("""{"""),format.raw/*223.79*/("""
                        """),format.raw/*224.25*/("""$scope.allAdmins = response.data;
                    """),format.raw/*225.21*/("""}"""),format.raw/*225.22*/(""", function errorCallback(response) """),format.raw/*225.57*/("""{"""),format.raw/*225.58*/("""
                        """),format.raw/*226.25*/("""$scope.conerror = "Error refreshing the list of all admin users. Retry.";
                        $('#conError').modal('show');
                    """),format.raw/*228.21*/("""}"""),format.raw/*228.22*/("""
                """),format.raw/*229.17*/(""");
            """),format.raw/*230.13*/("""}"""),format.raw/*230.14*/(""";

            $scope.modifyAdmin  = function(event) """),format.raw/*232.51*/("""{"""),format.raw/*232.52*/("""
                """),format.raw/*233.17*/("""event.preventDefault();

                // validate the modify user form
                if ($scope.rpf.userId.$error.required || !$scope.rpf.userId.$dirty) """),format.raw/*236.85*/("""{"""),format.raw/*236.86*/("""
                    """),format.raw/*237.21*/("""$scope.rpf.userId.$touched = true;
                    return;
                """),format.raw/*239.17*/("""}"""),format.raw/*239.18*/("""

                """),format.raw/*241.17*/("""$scope.conerror = "";
                $scope.moderror = "";
                $scope.modSuccess = false;
                $http("""),format.raw/*244.23*/("""{"""),format.raw/*244.24*/("""
                        """),format.raw/*245.25*/("""method : "PUT",
                        url : """"),_display_(/*246.33*/routes/*246.39*/.AdminController.modifyAdmin),format.raw/*246.67*/("""",
                        data : """),format.raw/*247.32*/("""{"""),format.raw/*247.33*/(""""userId" : $scope.mUser.userId, "password" : $scope.mPassword"""),format.raw/*247.94*/("""}"""),format.raw/*247.95*/(""",
                        headers : """),format.raw/*248.35*/("""{"""),format.raw/*248.36*/("""
                            """),format.raw/*249.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*250.25*/("""}"""),format.raw/*250.26*/("""
                    """),format.raw/*251.21*/("""}"""),format.raw/*251.22*/(""").then(function successCallback(response) """),format.raw/*251.64*/("""{"""),format.raw/*251.65*/("""
                        """),format.raw/*252.25*/("""$scope.mUser = null;
                        $scope.mPassword = "";
                        $scope.rpf.userId.$touched = false;
                        $scope.rpf.password.$touched = false;
                        $scope.modSuccess = true;
                    """),format.raw/*257.21*/("""}"""),format.raw/*257.22*/(""", function errorCallback(response) """),format.raw/*257.57*/("""{"""),format.raw/*257.58*/("""
                        """),format.raw/*258.25*/("""if (response.status == 400) """),format.raw/*258.53*/("""{"""),format.raw/*258.54*/("""
                            """),format.raw/*259.29*/("""$scope.moderror = response.data.error;
                            $scope.rpf.$setPristine();
                        """),format.raw/*261.25*/("""}"""),format.raw/*261.26*/(""" """),format.raw/*261.27*/("""else """),format.raw/*261.32*/("""{"""),format.raw/*261.33*/("""
                            """),format.raw/*262.29*/("""$scope.conerror = "Error trying to reset the password. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*264.25*/("""}"""),format.raw/*264.26*/("""
                    """),format.raw/*265.21*/("""}"""),format.raw/*265.22*/(""");
            """),format.raw/*266.13*/("""}"""),format.raw/*266.14*/(""";

            $scope.toggleAdminEditor = function(event) """),format.raw/*268.56*/("""{"""),format.raw/*268.57*/("""
                """),format.raw/*269.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowRPE)) """),format.raw/*270.58*/("""{"""),format.raw/*270.59*/("""
                    """),format.raw/*271.21*/("""$scope.bShowRPE = true;
                    $scope.loadAllAdmins(null);
                """),format.raw/*273.17*/("""}"""),format.raw/*273.18*/(""" """),format.raw/*273.19*/("""else """),format.raw/*273.24*/("""{"""),format.raw/*273.25*/("""
                    """),format.raw/*274.21*/("""$scope.bShowRPE = !$scope.bShowRPE;
                """),format.raw/*275.17*/("""}"""),format.raw/*275.18*/("""
            """),format.raw/*276.13*/("""}"""),format.raw/*276.14*/(""";
        """),format.raw/*277.9*/("""}"""),format.raw/*277.10*/(""");
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
object setup extends setup_Scope0.setup
              /*
                  -- GENERATED --
                  DATE: Thu Aug 18 11:22:55 IST 2016
                  SOURCE: /home/si2chip/web_app/msmp1.0.git/app/views/setup.scala.html
                  HASH: b5c2359880ca2dac95a6d0041a057fc36c710418
                  MATRIX: 827->2|1136->285|1150->291|1218->339|1280->375|1294->381|1356->423|2909->1948|2938->1949|2967->1950|3003->1958|3032->1959|3061->1960|3115->1986|8518->7360|8548->7361|8591->7375|8648->7403|8678->7404|8740->7437|8770->7438|8826->7466|8856->7467|8945->7527|8975->7528|9018->7542|9103->7598|9133->7599|9180->7617|9262->7670|9292->7671|9347->7697|9424->7746|9440->7752|9492->7782|9559->7820|9589->7821|9644->7847|9734->7908|9764->7909|9815->7931|9845->7932|9923->7981|9953->7982|10008->8008|10136->8107|10166->8108|10217->8130|10247->8131|10302->8157|10429->8255|10459->8256|10504->8272|10534->8273|10573->8284|10603->8285|10728->8381|10758->8382|10801->8396|11189->8755|11219->8756|11266->8774|11352->8832|11368->8838|11418->8866|11535->8954|11565->8955|11645->9006|11675->9007|11722->9025|11976->9249|12007->9250|12058->9272|12168->9353|12198->9354|12247->9374|12404->9502|12434->9503|12489->9529|12567->9579|12583->9585|12630->9610|12694->9645|12724->9646|12809->9702|12839->9703|12905->9740|12935->9741|12994->9771|13084->9832|13114->9833|13165->9855|13195->9856|13266->9898|13296->9899|13351->9925|13645->10190|13675->10191|13739->10226|13769->10227|13824->10253|13881->10281|13911->10282|13970->10312|14119->10432|14149->10433|14179->10434|14213->10439|14243->10440|14302->10470|14479->10618|14509->10619|14560->10641|14590->10642|14635->10658|14665->10659|14757->10722|14787->10723|14834->10741|14945->10823|14975->10824|15026->10846|15182->10973|15212->10974|15242->10975|15276->10980|15306->10981|15357->11003|15439->11056|15469->11057|15512->11071|15542->11072|15630->11131|15660->11132|15707->11150|15969->11383|15999->11384|16084->11440|16114->11441|16161->11459|16409->11678|16439->11679|16494->11705|16578->11760|16608->11761|16672->11796|16702->11797|16757->11823|16936->11973|16966->11974|17013->11992|17058->12008|17088->12009|17172->12064|17202->12065|17249->12083|17439->12244|17469->12245|17520->12267|17630->12348|17660->12349|17709->12369|17866->12497|17896->12498|17951->12524|18028->12573|18044->12579|18094->12607|18158->12642|18188->12643|18278->12704|18308->12705|18374->12742|18404->12743|18463->12773|18553->12834|18583->12835|18634->12857|18664->12858|18735->12900|18765->12901|18820->12927|19114->13192|19144->13193|19208->13228|19238->13229|19293->13255|19350->13283|19380->13284|19439->13314|19588->13434|19618->13435|19648->13436|19682->13441|19712->13442|19771->13472|19948->13620|19978->13621|20029->13643|20059->13644|20104->13660|20134->13661|20223->13721|20253->13722|20300->13740|20411->13822|20441->13823|20492->13845|20611->13935|20641->13936|20671->13937|20705->13942|20735->13943|20786->13965|20868->14018|20898->14019|20941->14033|20971->14034|21010->14045|21040->14046
                  LINES: 32->2|38->8|38->8|38->8|39->9|39->9|39->9|70->40|70->40|70->40|70->40|70->40|70->40|71->41|151->121|151->121|152->122|152->122|152->122|152->122|152->122|153->123|153->123|155->125|155->125|156->126|157->127|157->127|158->128|159->129|159->129|160->130|161->131|161->131|161->131|162->132|162->132|163->133|164->134|164->134|165->135|165->135|166->136|166->136|167->137|169->139|169->139|169->139|169->139|170->140|172->142|172->142|173->143|173->143|174->144|174->144|176->146|176->146|177->147|187->157|187->157|188->158|189->159|189->159|189->159|191->161|191->161|193->163|193->163|194->164|197->167|197->167|198->168|200->170|200->170|202->172|205->175|205->175|206->176|207->177|207->177|207->177|208->178|208->178|208->178|208->178|209->179|209->179|210->180|211->181|211->181|212->182|212->182|212->182|212->182|213->183|218->188|218->188|218->188|218->188|219->189|219->189|219->189|220->190|222->192|222->192|222->192|222->192|222->192|223->193|225->195|225->195|226->196|226->196|227->197|227->197|229->199|229->199|230->200|231->201|231->201|232->202|235->205|235->205|235->205|235->205|235->205|236->206|237->207|237->207|238->208|238->208|240->210|240->210|241->211|246->216|246->216|248->218|248->218|249->219|253->223|253->223|254->224|255->225|255->225|255->225|255->225|256->226|258->228|258->228|259->229|260->230|260->230|262->232|262->232|263->233|266->236|266->236|267->237|269->239|269->239|271->241|274->244|274->244|275->245|276->246|276->246|276->246|277->247|277->247|277->247|277->247|278->248|278->248|279->249|280->250|280->250|281->251|281->251|281->251|281->251|282->252|287->257|287->257|287->257|287->257|288->258|288->258|288->258|289->259|291->261|291->261|291->261|291->261|291->261|292->262|294->264|294->264|295->265|295->265|296->266|296->266|298->268|298->268|299->269|300->270|300->270|301->271|303->273|303->273|303->273|303->273|303->273|304->274|305->275|305->275|306->276|306->276|307->277|307->277
                  -- GENERATED --
              */
          