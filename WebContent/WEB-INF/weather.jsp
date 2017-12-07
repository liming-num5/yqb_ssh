<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/yqb_ssh/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/yqb_ssh/jquery/jquery-1.11.1.min.js"></script>
<style>
  .weather_box{
     border:1px solid red;
     height:200px;
     padding:0;
     margin:0;
     overflow:hidden;
  }
  .weather_box>div{
     border-right:1px solid black;
     padding:10px ; 
     min-height:200px;
  }
  .weather_box img:first-child{
     width:100%;
  }
</style>
<script>
   $(function(){
	   setWeather("2350");
   })

   
   function setWeather(code){
	   $.ajax({
		   url:"/yqb_ssh/weather/getWeather",
		   data:{
			   code:code
		   },
		   type:"get",
		   success:function(data){
			   console.log(data);
			   $("#city_box img").attr("src","/yqb_ssh/img/city_photo/1/"+data[2]+".jpg");
			   $("#city_box h5").text(data[1]);
			   $("#today_box").append("<h4>"+data[7]+"</h4>");
			   $("#today_box").append("<img src='/yqb_ssh/img/weather/a_"+data[10]+"' >&nbsp;&nbsp;&nbsp;<img src='/yqb_ssh/img/weather/a_"+data[11]+"' >");
			   $("#today_box").append("<p>"+data[8]+"</p>");
			   $("#today_box").append("<p>"+data[9]+"</p>");
			   $("#today_box").append("<p>"+data[4].split("；")[1]+"</p>");
		   }
	   });
   }
   
</script>
</head>
<body>
   <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Brand</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
   
   <div class="container_fluid">
      <div class="row weather_box">
          <div class="col-sm-2"  id="city_box">
             <img src="/yqb_ssh/img/city_photo/1/1002.jpg">
             <h5 class="text-center">广州</h5>
          </div>
          <div class="col-sm-2" id="today_box">
               
          </div>
          <div class="col-sm-2">
             <img src="/yqb_ssh/img/city_photo/1/1002.jpg">
             <h5 class="text-center">广州</h5>
          </div>
          <div class="col-sm-2">
             <img src="/yqb_ssh/img/city_photo/1/1002.jpg">
             <h5 class="text-center">广州</h5>
          </div>
          <div class="col-sm-2">
             <img src="/yqb_ssh/img/city_photo/1/1002.jpg">
             <h5 class="text-center">广州</h5>
          </div>
          <div class="col-sm-2">
             <img src="/yqb_ssh/img/city_photo/1/1002.jpg">
             <h5 class="text-center">广州</h5>
          </div>
      </div>
   </div>

</body>
</html>