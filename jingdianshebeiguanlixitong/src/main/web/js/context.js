var shebei = document.getElementById('shebei');
shebei.onfocus = function () {
    $('#shebeiguanli').show();
    $('#context').hide();
    $('#shebeizengjia1').hide();
}
var shebeizengjia = document.getElementById('shebeizengjia');
var shebeizengjia2 = document.getElementById('shebeizengjia2');
function sbzj(){
    $('#shebeizengjia1').show();
    $('#shebeiguanli').hide();
}
shebeizengjia.onfocus = function (){sbzj();}
shebeizengjia2.onfocus = function (){sbzj();}