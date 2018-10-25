package com.DS.Controller;
import com.jfinal.aop.Clear;
import com.jfinal.core.Controller;
public class PageController extends Controller{
	 public void goMenu(){
	 	   render("main.jsp");
	 }
	 @Clear
	 public void goHello(){
	 	   render("hello.jsp");
	 }
	 public void goData(){
	 	   render("data.html");
	 }
	 public void goVue(){
	 	   render("vueDemo.jsp");
	 }
	 @Clear
	 public void goTree(){
		   render("tree.jsp");
	 }
	 @Clear
	 public void goDynamicTable(){
		   render("DynamicTable.jsp");
	 }
	 @Clear
	 public void goPopup(){
		   render("popup.jsp");
	 }
	 @Clear
	 public void goValidate(){
		   render("validationEngine.jsp");
	 }
	 
}

