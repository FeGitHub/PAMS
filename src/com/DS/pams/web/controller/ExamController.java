package com.DS.pams.web.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import com.DS.common.model.User;
import com.DS.pams.service.FileService;
import com.DS.pams.service.NotificationService;
import com.DS.pams.service.TaskService;
import com.DS.pams.service.impl.FileServiceImpl;
import com.DS.pams.service.impl.NotificationServiceImpl;
import com.DS.pams.service.impl.TaskServiceImpl;
import com.DS.pams.web.base.BaseController;
import com.jfinal.aop.Clear;
import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.SqlPara;
/*****
 * 
 * @author jeff
 * 试题控制器
 */
public class ExamController extends BaseController {
	
	
	/***
	 * 获取随机试题
	 */
	public void getExam(){		
   		try {
      		SqlPara getJson=Db.getSqlPara("exam.getExam");
      		Record record=Db.findFirst(getJson);
      		if(record==null){
      			throw new Exception("无数据");
      		} 
      		String question=record.getStr("question");
      		renderJson(ajaxDoneSuccess(question)); 
   		  }catch(Exception e) {
   			e.printStackTrace();
   			renderJson(ajaxDoneError(e.getMessage()));
   		}  		   		  		  		   				  		
   	}
	
	public void addData(){
		String examData=getPara("examData");
		Record record=new Record();
		record.set("question", examData);			
		try {
			if(Db.update("exam", record)){
				renderJson(ajaxDoneSuccess());
			}else{
				renderJson(ajaxDoneError());
			}
		}catch(Exception e) {
   			e.printStackTrace();
   			renderJson(ajaxDoneError(e.getMessage()));
   		}  	
	    
	}
	
	
	
	
	 public void goExam(){
	   	  render("exam.jsp");
	     }
}