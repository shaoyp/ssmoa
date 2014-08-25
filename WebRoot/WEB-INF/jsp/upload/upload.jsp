<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<style type="text/css" media="screen">
.my-uploadify-button {
	background:none;
	border: none;
	text-shadow: none;
	border-radius:0;
}

.uploadify:hover .my-uploadify-button {
	background:none;
	border: none;
}

.fileQueue {
	width: 400px;
	height: 150px;
	overflow: auto;
	border: 1px solid #E5E5E5;
	margin-bottom: 10px;
}
</style>

<div class="pageContent" style="margin: 0 10px" layoutH="50">
	<input id="testFileInput" type="file" name="image" 
		uploaderOption="{
			swf:'js/dwz/uploadify/scripts/uploadify.swf',
			uploader:'upload_upload.action',
			formData:{},
			buttonText:'选择文件',
			fileSizeLimit:'200KB',
			fileTypeDesc:'*.jpg;*.jpeg;*.gif;*.png;',
			fileTypeExts:'*.jpg;*.jpeg;*.gif;*.png;',
			auto:true,
			multi:true,
			onUploadSuccess:uploadifySuccess,
			onQueueComplete:uploadifyQueueComplete
		}"
	/>

	<div class="divider"></div>

	
	<div id="fileQueue" class="fileQueue"></div>
	
	<input type="image" src="js/dwz/uploadify/img/upload.jpg" onclick="$('#testFileInput2').uploadify('upload', '*');"/>
	<input type="image" src="js/dwz/uploadify/img/cancel.jpg" onclick="$('#testFileInput2').uploadify('cancel', '*');"/>


	<div class="divider"></div>
	


</div>