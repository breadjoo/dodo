<%@ page contentType="text/html; charset=utf-8" %>

<html>
<head>
<style>
    #container {
      width:400px;
      margin : 10px auto;
    }
  </style>
<title>Directives Tag</title>
</head>
<body>
	<h3>헤더 페이지 영역입니다.</h3>

  <div id = "container">
    <img src="img/img5.png" id="anko">
  </div>
  <script>
    let cover = document.getElementById("anko");
    cover.addEventListener("mouseover", function(){
      cover.src = "img/img4.jpg";
    });
    cover.addEventListener("mouseout",function(){
      cover.src = "img/img5.png";
    });

  </script>
</body>
</html>