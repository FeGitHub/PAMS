<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>上传和下载</title>
</head>
<body>
       <%--  <div class="tile">
	    	<form action="${BASE_PATH}/file/uploadFileToProject" enctype="multipart/form-data" method="post"> 
	    	  <input type="file" name="file"/> 
	    	  <input type="submit"/> 
	    	</form> 
	    	<a href="${BASE_PATH}/file/downfile">test.xls下载</a> 
	    </div>    --%>
	    
	    <div class="tile">
	         <h4>上传文件到服务器(项目路径)</h4>
	    	  <input type="file" name="file" id="fileid"/> 
	    	  <button type="button" id="submitBtn">上传</button>
	    
	    	<a href="${BASE_PATH}/file/downfile">test.xls下载</a> 
	    </div>
	    
	     <div class="tile">	   
	       <h4>上传文件到服务器(任意路径)</h4> 
	    	  <input type="file" name="file" id="testId"/> 
	    	  <button type="button" id="testBtn">测试</button>    
	    </div>
	    
	     <div class="tile">	   
	      <h4>读取excel文件信息</h4>  
	    	  <input type="file" name="file" id="execlId"/> 
	    	  <button type="button" id="exceltBtn">测试</button>    
	    </div>
	     <script src="${BASE_PATH}/js/pagejs/demojs/downUpLoad.js"></script>     
</body>
</html>