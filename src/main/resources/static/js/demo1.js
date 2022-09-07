
function popAlert1() {
    x = document.getElementById("AlertButton")        // 找到元素
    alert("大哥问你话呢，看到我了没？");
}

function popAlert2() {
    x = document.getElementById("AlertButton")        // 找到元素
    alert("这是我大哥");
}

/* 返回主页 玩不明白 已废弃改用<a>了 */
// function back2home(){
//     x=document.getElementsByClassName("home")
//     window.open("");
// }

// function changeImg2RunningChicken() {
//     elements= document.getElementsByClassName("changableImg");
//     for(i=0;i<elements.length;i++){
//         elements[i].src = "../static/img/runningChicken.gif";
//     } 
// }

function changeImg2RunningChicken() {
    element = document.getElementById("changeable1");
    element = document.getElementById("changeable2");
    element = document.getElementById("changeable3");
    element.src = "img/runningChicken.gif";

    //这里能不能不写四个函数来实现：“点哪个图片就只有那个图片会变化”呢？
}

function myf() {
    xx = {sites:[{ "name": "runoob" }, { "alexa": 10000 }, { "site": "www.runoob.com" }]};
    // var obj = JSON.parse('{ "name":"runoob", "alexa":10000, "site":"www.runoob.com" }');
    var obj = JSON.parse(xx);
    document.getElementById("demo").innerHTML = xx.sites;  //parse()如何解析大的JSON？？？
}

function changeHTML_way1(){
    x = document.getElementsByClassName("changeablewords");
    x[0].innerHTML = "点了还不如不点。";
}

function changeHTML_way2() {
    x = document.getElementsByClassName("changeablewords");
    x[0].innerHTML = "想偷东西是吧？";
}