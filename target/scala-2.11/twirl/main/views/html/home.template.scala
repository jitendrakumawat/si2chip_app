
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>

    <title>SI2Chip Home</title>
</head>
<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">SI2Chip</a>
                <img src="/home/si2chip/si2chip.jpg" alt=""  style="width:50px;height:50px;">

            </div>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#" class="active"><span class="glyphicon glyphicon-home"></span> Home </a></li>
            </ul>
        </div>
    </nav>

    <div class="container" ng-app="login" ng-controller="loginCtrl">
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
                                """),format.raw/*42.33*/("""{"""),format.raw/*42.34*/("""{"""),format.raw/*42.35*/("""conerror"""),format.raw/*42.43*/("""}"""),format.raw/*42.44*/("""}"""),format.raw/*42.45*/("""
                            """),format.raw/*43.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-4">
                <div class="well well-lg">
                    <div class="text-center">
                        <h4 id="summarytitle">Active users <span class="badge">"""),format.raw/*53.80*/("""{"""),format.raw/*53.81*/("""{"""),format.raw/*53.82*/("""users.length"""),format.raw/*53.94*/("""}"""),format.raw/*53.95*/("""}"""),format.raw/*53.96*/("""</span></h4>
                        <a href="#" ng-click="loadUserSummary()" class="btn btn-info btn-xs">
                        <span class="glyphicon glyphicon-refresh"></span>
                    </a>
                    </div>
                    <ul class="list-group">
                        <li ng-repeat="x in users" class="list-group-item list-group-item-success" data-toggle="tooltip" data-placement="right" title=""""),format.raw/*59.152*/("""{"""),format.raw/*59.153*/("""{"""),format.raw/*59.154*/("""x.userId"""),format.raw/*59.162*/("""}"""),format.raw/*59.163*/("""}"""),format.raw/*59.164*/("""">
                           """),format.raw/*60.28*/("""{"""),format.raw/*60.29*/("""{"""),format.raw/*60.30*/("""x.userId"""),format.raw/*60.38*/("""}"""),format.raw/*60.39*/("""}"""),format.raw/*60.40*/("""<span class="badge">"""),format.raw/*60.60*/("""{"""),format.raw/*60.61*/("""{"""),format.raw/*60.62*/("""x.nSessions"""),format.raw/*60.73*/("""}"""),format.raw/*60.74*/("""}"""),format.raw/*60.75*/("""</span>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="well well-lg">
                    <div class="text-center">
                        <h4 id="logintitle">Login</h4>
                    </div>
                    <form role="form" name="lf">
                        <div class="form-group">
                            <input type="email" class="form-control" ng-change="loadUserGroups($event)" maxlength="255" ng-model="userId" placeholder="Enter your email id here" required name="userId">
                        </div>
                        <div class="form-group">
                            <input type="password" class="form-control" ng-model="password" placeholder="Enter your password here" name="password">
                        </div>
                        <div class="form-group">
                            <select class="form-control" name="groupId"  ng-model="groupId">
                                <option value="">Select group</option>
                                <option ng-repeat="grp in allUserGroups track by grp.groupId">"""),format.raw/*80.95*/("""{"""),format.raw/*80.96*/("""{"""),format.raw/*80.97*/("""grp.groupId"""),format.raw/*80.108*/("""}"""),format.raw/*80.109*/("""}"""),format.raw/*80.110*/("""</option>
                            </select>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-default btn-sm" ng-click="submit($event)">Login</button>
                        </div>
                    </form>
                    <span ng-show="lf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                    <span ng-show="lf.userId.$touched && lf.userId.$error.required" class="editmsgs">UserId required. Enter a valid email id</span><br>
                    <span ng-if="!(lf.userId.$dirty || lf.password.$dirty)" ng-bind="error" class="error"></span>
                </div>
            </div>
        </div>
    </div>
    <script>
        //todo: progress indicator

        var app = angular.module('login',  ['ngCookies']);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*98.80*/("""{"""),format.raw/*98.81*/("""
            """),format.raw/*99.13*/("""$locationProvider.html5Mode("""),format.raw/*99.41*/("""{"""),format.raw/*99.42*/("""enabled: true, requireBase: false"""),format.raw/*99.75*/("""}"""),format.raw/*99.76*/(""").hashPrefix('*');
        """),format.raw/*100.9*/("""}"""),format.raw/*100.10*/("""]);

        app.service("GroupSvc", function ($http, $q) """),format.raw/*102.54*/("""{"""),format.raw/*102.55*/("""
            """),format.raw/*103.13*/("""var deferred;
            this.getMyGroups = function (uId) """),format.raw/*104.47*/("""{"""),format.raw/*104.48*/("""
                """),format.raw/*105.17*/("""deferred = $q.defer();
                return $http("""),format.raw/*106.30*/("""{"""),format.raw/*106.31*/("""
                        """),format.raw/*107.25*/("""method : "GET",
                        url : "/mygroups/" + uId,
                        headers : """),format.raw/*109.35*/("""{"""),format.raw/*109.36*/("""
                        """),format.raw/*110.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*111.25*/("""}"""),format.raw/*111.26*/("""
                    """),format.raw/*112.21*/("""}"""),format.raw/*112.22*/(""")
                    .then(function (response) """),format.raw/*113.47*/("""{"""),format.raw/*113.48*/("""
                        """),format.raw/*114.25*/("""deferred.resolve(response);
                        return deferred.promise;
                    """),format.raw/*116.21*/("""}"""),format.raw/*116.22*/(""", function (response) """),format.raw/*116.44*/("""{"""),format.raw/*116.45*/("""
                        """),format.raw/*117.25*/("""deferred.reject(response);
                        return deferred.promise;
                    """),format.raw/*119.21*/("""}"""),format.raw/*119.22*/(""");
            """),format.raw/*120.13*/("""}"""),format.raw/*120.14*/(""";
        """),format.raw/*121.9*/("""}"""),format.raw/*121.10*/(""");

        app.controller('loginCtrl', function($scope, $http, $location, $window, $cookies, GroupSvc) """),format.raw/*123.101*/("""{"""),format.raw/*123.102*/("""
            """),format.raw/*124.13*/("""// Initialize the view
            $scope.error="";
            $scope.conerror = "";
            $scope.bConerror = false;
            $scope.users=[];
            $scope.allUserGroups = [];
            $scope.groupId = "";
            $scope.userId = "";

            $scope.loadUserSummary = function() """),format.raw/*133.49*/("""{"""),format.raw/*133.50*/("""
                """),format.raw/*134.17*/("""$scope.conerror = "";
                $scope.bConerror = false;
                $scope.users=[];
                $http("""),format.raw/*137.23*/("""{"""),format.raw/*137.24*/("""
                        """),format.raw/*138.25*/("""method : "GET",
                        url : """"),_display_(/*139.33*/routes/*139.39*/.HomeController.getUserSummary),format.raw/*139.69*/("""",
                        headers : """),format.raw/*140.35*/("""{"""),format.raw/*140.36*/("""
                            """),format.raw/*141.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*142.25*/("""}"""),format.raw/*142.26*/("""
                    """),format.raw/*143.21*/("""}"""),format.raw/*143.22*/(""").then(function successCallback(response) """),format.raw/*143.64*/("""{"""),format.raw/*143.65*/("""
                        """),format.raw/*144.25*/("""$scope.users = response.data;
                    """),format.raw/*145.21*/("""}"""),format.raw/*145.22*/(""", function errorCallback(response) """),format.raw/*145.57*/("""{"""),format.raw/*145.58*/("""
                        """),format.raw/*146.25*/("""$scope.bConerror = true;
                        $scope.conerror = "Error refreshing the user summary. Retry.";
                        $('#conError').modal('show');
                    """),format.raw/*149.21*/("""}"""),format.raw/*149.22*/(""");
            """),format.raw/*150.13*/("""}"""),format.raw/*150.14*/(""";
            $scope.loadUserSummary();

            // loads all the groups in which this user is a member
            $scope.loadUserGroups = function(event) """),format.raw/*154.53*/("""{"""),format.raw/*154.54*/("""
                """),format.raw/*155.17*/("""//if (lf.userId.$error.required || lf.userId.$error.email)
                   // return;

                $scope.conerror = "";
                $scope.allUserGroups = [];
                GroupSvc.getMyGroups($scope.userId).then(function successCallback(response) """),format.raw/*160.93*/("""{"""),format.raw/*160.94*/("""
                        """),format.raw/*161.25*/("""$scope.allUserGroups = response.data;
                    """),format.raw/*162.21*/("""}"""),format.raw/*162.22*/(""", function errorCallback(response) """),format.raw/*162.57*/("""{"""),format.raw/*162.58*/("""
                        """),format.raw/*163.25*/("""if (response.status == 400) """),format.raw/*163.53*/("""{"""),format.raw/*163.54*/("""
                            """),format.raw/*164.29*/("""//do nothing
                        """),format.raw/*165.25*/("""}"""),format.raw/*165.26*/(""" """),format.raw/*165.27*/("""else if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*167.30*/("""{"""),format.raw/*167.31*/("""
                            """),format.raw/*168.29*/("""$scope.conerror = "Error refreshing the list of groups in which the user is a member. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*170.25*/("""}"""),format.raw/*170.26*/("""
                    """),format.raw/*171.21*/("""}"""),format.raw/*171.22*/("""
                """),format.raw/*172.17*/(""");
            """),format.raw/*173.13*/("""}"""),format.raw/*173.14*/(""";

            $scope.submit  = function(event) """),format.raw/*175.46*/("""{"""),format.raw/*175.47*/("""
                """),format.raw/*176.17*/("""var gId = "None";
                event.preventDefault();

                // validate the login form
                if ($scope.lf.userId.$error.required || $scope.lf.userId.$error.email || !($scope.lf.userId.$dirty || $scope.lf.password.$dirty)) """),format.raw/*180.147*/("""{"""),format.raw/*180.148*/("""
                    """),format.raw/*181.21*/("""$scope.lf.userId.$touched = true;
                    return;
                """),format.raw/*183.17*/("""}"""),format.raw/*183.18*/("""
                """),format.raw/*184.17*/("""// set user cookies
                $cookies.put("tzoffset", new Date().getTimezoneOffset().toString());
                $cookies.put("userId", $scope.userId);
                if ($scope.groupId != "")
                    gId = $scope.groupId;
                $cookies.put("groupId", gId);

                $scope.conerror = "";
                $scope.bConerror = false;
                $http("""),format.raw/*193.23*/("""{"""),format.raw/*193.24*/("""
                        """),format.raw/*194.25*/("""method : "POST",
                        url : """"),_display_(/*195.33*/routes/*195.39*/.HomeController.login),format.raw/*195.60*/("""",
                        data : """),format.raw/*196.32*/("""{"""),format.raw/*196.33*/(""""userId" : $scope.userId, "groupId" : $scope.groupId, "password" : $scope.password"""),format.raw/*196.115*/("""}"""),format.raw/*196.116*/(""",
                        headers : """),format.raw/*197.35*/("""{"""),format.raw/*197.36*/("""
                            """),format.raw/*198.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*199.25*/("""}"""),format.raw/*199.26*/("""
                    """),format.raw/*200.21*/("""}"""),format.raw/*200.22*/(""").then(function successCallback(response) """),format.raw/*200.64*/("""{"""),format.raw/*200.65*/("""
                        """),format.raw/*201.25*/("""$location.path(""""),_display_(/*201.42*/routes/*201.48*/.PostController.getPosts),format.raw/*201.72*/("""").replace();
                        $window.location.href = $location.absUrl();
                    """),format.raw/*203.21*/("""}"""),format.raw/*203.22*/(""", function errorCallback(response) """),format.raw/*203.57*/("""{"""),format.raw/*203.58*/("""
                        """),format.raw/*204.25*/("""$cookies.remove("userId");
                        $cookies.remove("groupId");
                        $cookies.remove("tzoffset");
                        if (response.status == 400) """),format.raw/*207.53*/("""{"""),format.raw/*207.54*/("""
                            """),format.raw/*208.29*/("""$scope.error = response.data.error;
                            $scope.lf.$setPristine();
                        """),format.raw/*210.25*/("""}"""),format.raw/*210.26*/(""" """),format.raw/*210.27*/("""else """),format.raw/*210.32*/("""{"""),format.raw/*210.33*/("""
                            """),format.raw/*211.29*/("""$scope.bConerror = true;
                            $scope.conerror = "Error trying to login. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*214.25*/("""}"""),format.raw/*214.26*/("""
                    """),format.raw/*215.21*/("""}"""),format.raw/*215.22*/(""");
            """),format.raw/*216.13*/("""}"""),format.raw/*216.14*/(""";
        """),format.raw/*217.9*/("""}"""),format.raw/*217.10*/(""");
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
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Mon Aug 22 10:21:30 IST 2016
                  SOURCE: /home/si2chip/web_app/msmp1.0.git/app/views/home.scala.html
                  HASH: 1b5c3ae1d1b016d2eaecc4edea58e294c32619d7
                  MATRIX: 825->2|1134->285|1148->291|1216->339|1278->375|1292->381|1353->422|3039->2080|3068->2081|3097->2082|3133->2090|3162->2091|3191->2092|3249->2122|3638->2483|3667->2484|3696->2485|3736->2497|3765->2498|3794->2499|4257->2933|4287->2934|4317->2935|4354->2943|4384->2944|4414->2945|4473->2976|4502->2977|4531->2978|4567->2986|4596->2987|4625->2988|4673->3008|4702->3009|4731->3010|4770->3021|4799->3022|4828->3023|6053->4220|6082->4221|6111->4222|6151->4233|6181->4234|6211->4235|7202->5198|7231->5199|7273->5213|7329->5241|7358->5242|7419->5275|7448->5276|7504->5304|7534->5305|7623->5365|7653->5366|7696->5380|7786->5441|7816->5442|7863->5460|7945->5513|7975->5514|8030->5540|8161->5642|8191->5643|8246->5669|8336->5730|8366->5731|8417->5753|8447->5754|8525->5803|8555->5804|8610->5830|8738->5929|8768->5930|8819->5952|8849->5953|8904->5979|9031->6077|9061->6078|9106->6094|9136->6095|9175->6106|9205->6107|9341->6213|9372->6214|9415->6228|9759->6543|9789->6544|9836->6562|9987->6684|10017->6685|10072->6711|10149->6760|10165->6766|10217->6796|10284->6834|10314->6835|10373->6865|10463->6926|10493->6927|10544->6949|10574->6950|10645->6992|10675->6993|10730->7019|10810->7070|10840->7071|10904->7106|10934->7107|10989->7133|11207->7322|11237->7323|11282->7339|11312->7340|11505->7504|11535->7505|11582->7523|11879->7791|11909->7792|11964->7818|12052->7877|12082->7878|12146->7913|12176->7914|12231->7940|12288->7968|12318->7969|12377->7999|12444->8037|12474->8038|12504->8039|12653->8159|12683->8160|12742->8190|12950->8369|12980->8370|13031->8392|13061->8393|13108->8411|13153->8427|13183->8428|13262->8478|13292->8479|13339->8497|13621->8749|13652->8750|13703->8772|13812->8852|13842->8853|13889->8871|14320->9273|14350->9274|14405->9300|14483->9350|14499->9356|14542->9377|14606->9412|14636->9413|14748->9495|14779->9496|14845->9533|14875->9534|14934->9564|15024->9625|15054->9626|15105->9648|15135->9649|15206->9691|15236->9692|15291->9718|15336->9735|15352->9741|15398->9765|15531->9869|15561->9870|15625->9905|15655->9906|15710->9932|15926->10119|15956->10120|16015->10150|16160->10266|16190->10267|16220->10268|16254->10273|16284->10274|16343->10304|16561->10493|16591->10494|16642->10516|16672->10517|16717->10533|16747->10534|16786->10545|16816->10546
                  LINES: 32->2|38->8|38->8|38->8|39->9|39->9|39->9|72->42|72->42|72->42|72->42|72->42|72->42|73->43|83->53|83->53|83->53|83->53|83->53|83->53|89->59|89->59|89->59|89->59|89->59|89->59|90->60|90->60|90->60|90->60|90->60|90->60|90->60|90->60|90->60|90->60|90->60|90->60|110->80|110->80|110->80|110->80|110->80|110->80|128->98|128->98|129->99|129->99|129->99|129->99|129->99|130->100|130->100|132->102|132->102|133->103|134->104|134->104|135->105|136->106|136->106|137->107|139->109|139->109|140->110|141->111|141->111|142->112|142->112|143->113|143->113|144->114|146->116|146->116|146->116|146->116|147->117|149->119|149->119|150->120|150->120|151->121|151->121|153->123|153->123|154->124|163->133|163->133|164->134|167->137|167->137|168->138|169->139|169->139|169->139|170->140|170->140|171->141|172->142|172->142|173->143|173->143|173->143|173->143|174->144|175->145|175->145|175->145|175->145|176->146|179->149|179->149|180->150|180->150|184->154|184->154|185->155|190->160|190->160|191->161|192->162|192->162|192->162|192->162|193->163|193->163|193->163|194->164|195->165|195->165|195->165|197->167|197->167|198->168|200->170|200->170|201->171|201->171|202->172|203->173|203->173|205->175|205->175|206->176|210->180|210->180|211->181|213->183|213->183|214->184|223->193|223->193|224->194|225->195|225->195|225->195|226->196|226->196|226->196|226->196|227->197|227->197|228->198|229->199|229->199|230->200|230->200|230->200|230->200|231->201|231->201|231->201|231->201|233->203|233->203|233->203|233->203|234->204|237->207|237->207|238->208|240->210|240->210|240->210|240->210|240->210|241->211|244->214|244->214|245->215|245->215|246->216|246->216|247->217|247->217
                  -- GENERATED --
              */
          