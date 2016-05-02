<%--
  Created by IntelliJ IDEA.
  User: gch
  Date: 16-4-28
  Time: 下午7:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
ffff
   <div id="progressBar" style="height: 20px;border: 2px solid green">
       <div id="bar" style="height: 100%;background-color: #33dd33;width: 0%">
       </div>
   </div>
   <form>
       <input type="file" id="files" multiple/>
       <br/>
       <output id="selectedFiles"></output>
       <input id="uploadBUtton" type="button" value="Upload"/>
   </form>
   <div id="debug" style="height: 400px;border: 2px solid green;overflow: auto"></div>
</body>
<script src="../js/upload.js" type="text/javascript"></script>
</html>
