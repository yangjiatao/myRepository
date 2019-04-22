
var  highlightcolor='#c1ebff';
//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
	return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

<!-- JavaScript全选(全消)，动态全选全消 -->

 function checkAll()//此方法用来全选和全消复选框  
 {  
 var items=document.getElementsByName("checkbox16");  
 var itemall=document.getElementById("all");  
 for(var i=0;i<items.length;i++){  
 items[i].checked=itemall.checked;  
 }  
 }  
 function resAll(){  
 var items=document.getElementsByName("checkbox16");  
 var itemall=document.getElementById("all");  
 var ite=0; //此变量用来记录当前选中的checkbox的个数  
 for(var i=0;i<items.length;i++){  
 //获得当前选中的checkbox的数量  
 if(items[i].checked){  
 ite++;  
 }  
 }  
 //如果当前选中的数量为有一个没有选中，并且全选框是选中状态  
 //则将全选框的状态变为不选择  
 if(ite==items.length-1&&itemall.checked){  
 itemall.checked=false;  
 }  
 /*---  
 //这个适用于你想把子选项完全去掉才将全选的效果去掉  
 if(ite==0&&itemall.checked){  
 itemall.checked=false;  
 }  
 ---*/  
 //如果当前选中的数量为零并且全选框是未选中状态  
 //则将全选框的状态变为选择  
 if(ite==items.length&&!itemall.checked){  
 itemall.checked=true;  
 }  
 }  



<!-- 文本框如果不满足输入条件自动回退 -->


	function checkEdit()
	{
		if(document.getElementById("textfield").value.length==1)
		{
			document.getElementById("textfield").value=document.getElementById("textfield").value.replace(/[^1-9]/g,'')
		}
		else
		{
			document.getElementById("textfield").value=document.getElementById("textfield").value.replace(/\D/g,'')
		}
		
		return true;
	}
	
	function checkEdit2()
	{
		if(document.getElementById("textfield").value.length==1)
		{
			document.getElementById("textfield").value.value=document.getElementById("textfield").value.replace(/[^1-9]/g,'')
		}
		else
		{
			ddocument.getElementById("textfield").value.value=document.getElementById("textfield").value.replace(/\D/g,'')
		}
		
		return true;
	}
	