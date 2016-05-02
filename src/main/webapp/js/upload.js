/**
 * Created by gch on 16-4-28.
 */
var totalFileLength,totalUploaded,fileCount,filesUploaded;

function  debug(s){
    var debug = document.getElementById('debug');
    if(debug){
        debug.innerHTML = debug.innerHTML+'<br/>'+s;
    }
}

function  onUploadComplete(e){
    totalUploaded +=document.getElementById('files').files[filesUploaded].size;
    filesUploaded++;
    debug('complete'+filesUploaded+"of"+fileCount);
    debug('totalUploaded:'+totalUploaded);
    if(filesUploaded<fileCount){
        uploadNext();
    }else{
        var bar = document.getElementById('bar');
        bar.style.width='100%';
        bar.innerHTML='100% complete';
        alert('FInished uploading file(s)');
    }
}

function onFileSelect(e){
    var files = e.target.files;
    var output = [];
    fileCount = files.length;
    totalFileLength = 0;
    for(var i=0;i<fileCount;i++){
        var file = files[i];
        output.push(file.name,'(',file.size,'bytes,',file.lastModifiedDate.toLocaleDateString(),')');
        output.push('<br/>');
        debug('add '+file.size);
        totalFileLength+=file.size;
    }
    document.getElementById('selectedFiles').innerHTML = output.join('');
    debug('totalFileLength:  '+totalFileLength);
}

function onUploadProgress(e){
    if(e.lengthComputable){
        var percentComplete = parseInt((e.loaded+totalUploaded)*100/totalFileLength);
        var bar = document.getElementById('bar');
        bar.style.width = percentComplete+'%';
        bar.innerHTML = percentComplete+' % complete';
    }else{
        debug('unable to compute');
    }
}

function onUploadFailed(e){
    alert("Error uploading file");
}

function uploadNext(){
    if(window.ActiveXObject){ //如果是IE浏览器
        xhr= new ActiveXObject("Microsoft.XMLHTTP");
    }else if(window.XMLHttpRequest){ //非IE浏览器
        xhr= new XMLHttpRequest();
    }
    var fd = new FormData();
    var file = document.getElementById('files').files[filesUploaded];
    fd.append("multipartFile",file);
    xhr.upload.addEventListener("progress",onUploadProgress,false);
    xhr.addEventListener("load",onUploadComplete,false);
    xhr.addEventListener("error",onUploadFailed,false);
    xhr.open("POST","/file_upload.do");
    debug('uploading  '+file.name);
    xhr.send(fd);
}


function startUpload(){
    totalUploaded = filesUploaded = 0;
    uploadNext();
}

window.onload = function(){
    document.getElementById('files').addEventListener('change',onFileSelect,false);
    document.getElementById('uploadBUtton').addEventListener('click',startUpload,false);
}