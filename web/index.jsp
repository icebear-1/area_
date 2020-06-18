<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/18 0018
  Time: 下午 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
  </head>
  <script>
    window.onload=function (ev) {
        $.ajax({
            url:"/province",
            type:"get",
            data:"",
            dataType:"json",
            success:function (data) {
                var html='<option value="-1">请选择</option>'
                for (var i = 0; i <data.length ; i++) {
                    html+='<option value="'+data[i].id+'">'+data[i].name+'</option>'
                }
                $("#province").append(html);
            }
        });
    }
    function setCity() {
        $("city").empty();
        var p_id;
        var children=$("#province").children();
        for (var i = 0; i < children.length; i++) {
            if ($(children[i]).prop("selected")) {
                p_id = $(children[i]).attr("value");
            }
        }
        if(p_id==-1){
            return;
        }
        $ajax({
            url:"/city",
            type:"get",
            data:{"id":p_id},
            dataType:"json",
            success:function (data) {
                var html = '<option value="-1">请选择</option>';
                for (var i = 0; i < data.length; i++) {
                    html += '<option value="' + data[i].id + '">' + data[i].name + '</option>';
                }
                $("#city").append(html);
            }
        })
    }
  </script>
  <body>
  选择省：
  <select id="province" onchange="setCity()">

  </select><br><br>
  选择市：
  <select id="city"></select>


  </body>
</html>
