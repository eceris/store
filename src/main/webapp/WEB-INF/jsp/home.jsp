<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <meta name="description" content="">
	    <meta name="author" content="">
	    <link rel="shortcut icon" href="../../resources/image/DO_favicon.ico">
	      
	    <title>Daou Tech</title>
	      
	    <!-- Bootstrap core CSS -->
		<link href="../../resources/libs/bootstrap/css/bootstrap.css" rel="stylesheet">      
		<link href="../../resources/libs/bootstrap/css/custom.css" rel="stylesheet">
		<link rel='stylesheet' href='//cdnjs.cloudflare.com/ajax/libs/angular-loading-bar/0.7.1/loading-bar.min.css' type='text/css' media='all' />
 
	</head>
   
   <body ng-app="distributeApp">
   <!-- Fixed navbar -->
    <div class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/home">Daou Tech</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
          	<li><a href="/#upload">업로드</a></li>
            <li>
                <a href="" class="dropdown-toggle" data-toggle="dropdown">다운로드<b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="/#download/site">고객사-프로젝트</a></li>
                    <li><a href="/#download/core">패키지</a></li>
                </ul>
            </li>
            <li><a href="/#project">프로젝트</a></li>
            <li class="dropdown">
                <a href="" class="dropdown-toggle" data-toggle="dropdown">히스토리<b class="caret"></b></a>
            	<ul class="dropdown-menu">
            		<li><a href="/#historyDownload">다운로드</a></li>
            		<li><a href="/#historyUpgrade">업그레이드</a></li>
            	</ul>
            </li>
            <li style="display: none;"><a href="/#apprform/download">추천양식</a></li>
          	<li style="display: none;"><a href="/#apprform/mix">양식조합</a></li>
			<li style="display: none;"><a href="/#apprform/history">양식다운로드 이력</a></li>
			<li style="display: none;"><a href="/#apprform/manage">양식관리</a></li>
            <li style="display: none;" class="dropdown" style="display:none">
            	<a href="" class="dropdown-toggle" data-toggle="dropdown">양식스토어<b class="caret"></b></a>
            	<ul class="dropdown-menu">
            		<li><a href="/#apprform/download">추천양식</a></li>
            		<li><a href="/#apprform/mix">양식조합</a></li>
					<li><a href="/#apprform/history">다운로드 이력</a></li>
					<li><a href="/#apprform/manage">양식관리</a></li>
            	</ul>
            </li>          
          </ul>
          <ul class="nav navbar-nav navbar-right">
          	<li><a href="/#customer">고객사관리</a></li>
            <li><a href="/#user">계정관리</a></li>
            <li><a href="/logout">로그아웃</a></li>            
          </ul>
        </div><!--/.nav-collapse -->
      </div>
      <div class="navBiz">
	  	<div class="btnBox">
			<span class="heading"></span>
		</div>
	  </div>
    </div>    
    <div class="container wrapContainer" ng-view></div>
    <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <script src="../../resources/libs/jquery/jquery-2.1.3.min.js"></script>
    <script src="../../resources/libs/bootstrap/js/bootstrap.js"></script>
    <script src="../../resources/libs/angular/angular.js"></script>
    <script src="../../resources/libs/angular/angular-routes.js"></script>
    <script src="../../resources/libs/angular/angular-file-upload.js"></script>
    <script src="../../resources/libs/bootstrap/js/ui-bootstrap-tpls-0.12.0.js"></script>
    <script src="../../resources/libs/smart-table/smart-table.min.js"></script>    
    <script src="../../resources/js/app.js"></script>
    <script src="../../resources/js/services/services.js"></script>
    <script src="../../resources/js/controllers/controllers.js"></script>
    <script src="../../resources/js/directives/directives.js"></script>
    
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/angular-loading-bar/0.7.1/loading-bar.min.js"></script>
 
</body>
   
   <!-- ---------------------------------------------------------------
   <body ng-app="myApp">
      <ul class="menu">
         <li><a href="#/view1">view1</a></li>
         <li><a href="#/view2">view2</a></li>
      </ul>
      <div ng-view></div>
      <div>Angular seed app: v<span app-version></span></div>
      <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.0.4/angular.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/app.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/services.js"></script> 
      <script src="${pageContext.request.contextPath}/resources/js/controllers.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/filters.js"></script>
      <script src="${pageContext.request.contextPath}/resources/js/directives.js"></script>
   </body>
  ------------------------------------------------------------ -->
</html>