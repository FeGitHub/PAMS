<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>树形结构</title>
   <link href="${BASE_PATH}/css/zTreeStyle/zTreeStyle.css" type="text/css" rel="stylesheet">
    <script src="${BASE_PATH}/js/jquery-1.4.4.min.js" type="application/javascript"></script>
    <script src="${BASE_PATH}/js/jquery.ztree.all.min.js"></script>
</head>
<body>
	预警名称:<input><br>
	预警类型:<select>
  <option >数量预警</option>
  <option >总价预警</option>
  <option >单价预警</option>
</select><br>
	波动范围:<input size="7">-<input size="7"><br><br>
	预警处理人:<input type="checkbox"><br>
	<input type="checkbox">向文红&nbsp;<input type="checkbox">谢天顺&nbsp;<input type="checkbox">陈东山
    <ul id="tree" class="ztree" style="width:230px; overflow:auto;"></ul>
    <ul id="tree1" class="ztree" style="width:230px; overflow:auto;"></ul>
    <hr>
    
   
    
</body>
<script>
$(function(){
    var setting={
        check: {
            enable: true,
            chkStyle: "radio",//显示 checkbox 选择框，默认checkbox可选择值radio
            radioType: "level"
        }
    };
var zTreeNodes=[
{"name":"文具","open":true,children:[
    {"name":"笔","open":true,children:[
			{"name":"铅笔"},
			{"name":"圆珠笔"}
          ]},
    {"name":"A4打印纸"},
    {"name":"本册","open":true,children:[
                          			{"name":"16k记事本"},
                          			{"name":"8k记事本"},
                          			{"name":"A5商务本"}
                                    ]}
]}
];
var  earlyWarning= $.fn.zTree.init($("#tree"), setting, zTreeNodes);   
var  copy = $.fn.zTree.init($("#tree1"), setting, zTreeNodes); 
//第一个参数为zTree的DOM容器，第二个为zTree设置详情可见官网api,第三个为zTree的节点数据 
});

</script>
</html>