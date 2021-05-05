<%--
  Created by IntelliJ IDEA.
  User: lizuopeng
  Date: 2021/5/3
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String basePath = request.getScheme() + "://" +
          request.getServerName() + ":" + request.getServerPort() +
          request.getContextPath() + "/";
%>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>$Title$</title>
    <script  src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
      $(function () {
        $("#but").click(function () {
          $.ajax({
            url:"servlet01.do",
            type:"get",
            datatype:"json",
            success:function (data) {
              $("#div1").html(data)
              $("#div2").html(data.id)
            }
          })
        })
      })
$(function () {
  $.ajax({
    url:"servlet01.do",
    type:"get",
    datatype:"json",
    success:function (data) {
      alert("nkk")
    }
  })
})
    </script>
  </head>
  <body>
  <input type="button" id="but" value="提交">
  <div id="div1"></div>
  <div id="div2"></div>
  </body>
</html>
